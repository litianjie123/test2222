package com.example.demo.controller;

import com.example.demo.commonvo.Parameter;
import com.example.demo.config.ParameterSource;
import com.example.demo.requestvo.ParameterChangeRequestVo;
import com.example.demo.responsevo.ApiResponse;
import com.example.demo.service.ParameterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/parameter")
@Api(tags = {"配置信息相关接口"})
public class ParameterController {
    @Resource
    private ParameterService parameterService;
    // 更新配置
    @PostMapping("/update")
    @ApiOperation(value = "更新配置", notes = "更新配置")
    public ApiResponse<String> update(@RequestBody ParameterChangeRequestVo requestVo) {
        return ApiResponse.buildSuccess("更新配置");
    }

    // 一键退回
    @PostMapping("/rollBack")
    @ApiOperation(value="回滚")
    public ApiResponse<String> rollBack(String parameterType) {
        return ApiResponse.buildSuccess("回滚");
    }

    // 获取初始参数配置信息
    @GetMapping("/getParameters")
    @ApiOperation(value="获取初始参数配置信息")
    public ApiResponse<Map<String, List<Parameter>>> getParameters(String parameterType) {
        Map<String, List<Parameter>> map = new HashMap<>();
        parameterService.init();
        List<Parameter> parameters = ParameterSource.getParameters(parameterType);
        map.put(parameterType, parameters);
        return ApiResponse.buildSuccess(map);
    }


}