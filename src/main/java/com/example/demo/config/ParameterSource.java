package com.example.demo.config;

import com.example.demo.commonvo.Parameter;
import com.example.demo.service.ParameterService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ParameterSource {
    @Resource
    public static Map<String, List<Parameter>> initParameters;

    @Resource
    public static Map<String, List<Parameter>> currentParameters;

    public static List<Parameter> getParameters(String parameterType) {
        for (String key : currentParameters.keySet()) {
            if (key.equals(parameterType)) {
                return currentParameters.get(key);
            }
        }
        return new ArrayList<>();
    }


}