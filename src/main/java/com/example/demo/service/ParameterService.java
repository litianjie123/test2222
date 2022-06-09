package com.example.demo.service;

import com.example.demo.commonvo.Parameter;
import com.example.demo.config.ParameterSource;
import com.example.demo.dao.entity.ForTest;
import com.example.demo.mapper.ForTestMapper;
import com.example.demo.utils.JsonUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ParameterService {
    @Resource
    private ForTestMapper forTestMapper;

    public void init(){
        if (CollectionUtils.isEmpty(ParameterSource.initParameters)) {
            // 根据数据引擎获取数据
            ParameterSource.initParameters = this.getLoginParameters();
        }
        ParameterSource.currentParameters = this.getCurParameters();

    }


    public Map<String, List<Parameter>> getCurParameters() {
        Map<String, List<Parameter>> reMap = new HashMap<>();
        ForTest forTest = forTestMapper.selectById(3);
        String test = forTest.getCurrent();
        Map<String, Object> map =  JsonUtil.readValue(test, Map.class);
        if (map == null) {
            return new HashMap<>();
        }
        for (String key : map.keySet()) {
            String s = map.get(key).toString();
            Parameter [] parameters =  JsonUtil.readValue(s, Parameter [].class);
            if (parameters != null && parameters.length > 0 ) {
                List<Parameter> list = Arrays.asList(parameters);
                reMap.put(key, list);
            }
        }
        return reMap;
    }

    public Map<String, List<Parameter>> getLoginParameters() {
        Map<String, List<Parameter>> reMap = new HashMap<>();
        ForTest forTest = forTestMapper.selectById(3);
        String test = forTest.getLogin();
        Map<String, Object> map =  JsonUtil.readValue(test, Map.class);
        if (map == null) {
            return new HashMap<>();
        }
        for (String key : map.keySet()) {
            String s = map.get(key).toString();
            Parameter [] parameters =  JsonUtil.readValue(s, Parameter [].class);
            if (parameters != null && parameters.length > 0 ) {
                List<Parameter> list = Arrays.asList(parameters);
                reMap.put(key, list);
            }
        }
        return reMap;
    }

}