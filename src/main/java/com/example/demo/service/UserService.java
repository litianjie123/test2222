package com.example.demo.service;

import com.example.demo.commonvo.Parameter;
import com.example.demo.dao.entity.ForTest;
import com.example.demo.dao.entity.OperatorLog;
import com.example.demo.dao.entity.User;
import com.example.demo.mapper.ForTestMapper;
import com.example.demo.mapper.OperatorLogMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.utils.JsonUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    @Resource
    private OperatorLogMapper operatorLogMapper;

    @Resource
    private ForTestMapper forTestMapper;

    public void test() {
    }

    public void forTestData() {
        Map<String, String> map = new HashMap<>();
        List<Parameter> list1 = new ArrayList<>();
        Parameter p1 = new Parameter();
        p1.setParameterName("duration");
        p1.setParameterDesc("单bag包长度（秒）");
        p1.setParameterValue("300");
        p1.setParameterInputType("输入框1");
        Parameter p11 = new Parameter();
        p11.setParameterName("duration1");
        p11.setParameterDesc("单bag包长度（秒）1");
        p11.setParameterValue("300");
        p11.setParameterInputType("输入框1");
        list1.add(p1);
        list1.add(p11);
        List<Parameter> list2 = new ArrayList<>();
        Parameter p2 = new Parameter();
        p2.setParameterName("overlap");
        p2.setParameterDesc("重叠长度（秒）");
        p2.setParameterValue("5");
        p2.setParameterInputType("输入框");
        Parameter p22 = new Parameter();
        p22.setParameterName("overlap22");
        p22.setParameterDesc("重叠长度（秒）2");
        p22.setParameterValue("3");
        p22.setParameterInputType("输入框11");
        list2.add(p2);
        list2.add(p22);
        List<Parameter> list3 = new ArrayList<>();
        Parameter p3 = new Parameter();
        p3.setParameterName("disk_space");
        p3.setParameterDesc(" 最小剩余容量（GB）");
        p3.setParameterValue("122");
        p3.setParameterInputType("输入框");
        Parameter p33 = new Parameter();
        p33.setParameterName("disk_space33");
        p33.setParameterDesc(" 最小剩余容量（GB）3");
        p33.setParameterValue("1233");
        p33.setParameterInputType("输入框");
        list3.add(p3);
        list3.add(p33);
        List<Parameter> list4 = new ArrayList<>();
        Parameter p4 = new Parameter();
        p4.setParameterName("record_path");
        p4.setParameterDesc("bag包存储路径");
        p4.setParameterValue("/mnt/sdcard");
        p4.setParameterInputType("输入框");
        Parameter p44 = new Parameter();
        p44.setParameterName("record_path44");
        p44.setParameterDesc("bag包存储路径44");
        p44.setParameterValue("/mnt/sdcard44");
        p44.setParameterInputType("输入框44");
        list4.add(p44);
        map.put("感知类", JsonUtil.toJSonString(list1));
        map.put("归控类", JsonUtil.toJSonString(list2));
        map.put("地图定位类", JsonUtil.toJSonString(list3));
        map.put("工具类", JsonUtil.toJSonString(list4));
        ForTest forTest1 = new ForTest();
        String test1 = JsonUtil.toJSonString(map);
        forTest1.setCurrent(test1);
        forTest1.setLogin(test1);
        forTestMapper.insert(forTest1);
    }


}