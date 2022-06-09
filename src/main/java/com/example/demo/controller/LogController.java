package com.example.demo.controller;

import com.example.demo.commonvo.ParameterChangeInfo;
import com.example.demo.requestvo.LogListRequestVo;
import com.example.demo.responsevo.ApiPagingResponse;
import com.example.demo.responsevo.ApiResponse;
import com.example.demo.responsevo.LogListResponseVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/log")
@Api(tags = {"操作日志相关接口"})
public class LogController {
    // 获取日志详细信息
    @GetMapping("/getLogInfo")
    @ApiOperation(value = "获取当前日志详情信息", notes = "获取当前日志详情信息")
    public ApiResponse<LogListResponseVo> getLogInfo(Integer id) {
        LogListResponseVo vo = new LogListResponseVo();
        return ApiResponse.buildSuccess(vo);
    }

    // 获取日志列表
    @GetMapping("/getLogList")
    @ApiOperation(value="获取日志列表", httpMethod = "GET", produces="application/json")
    public ApiPagingResponse<List<LogListResponseVo>> getLogList(LogListRequestVo requestVo) {
        List<LogListResponseVo> re = new ArrayList<>();

        List<LogListResponseVo> reList = new ArrayList<>();
        LogListResponseVo vo = new LogListResponseVo();
        vo.setParameterType("感知类");
        vo.setOprName("李四");
        vo.setOprType("修改");
        vo.setCreateTime("2022-11-11");
        List<ParameterChangeInfo> list = new ArrayList<>();
        ParameterChangeInfo parameterChangeInfo = new ParameterChangeInfo();
        parameterChangeInfo.setParameterName("duration");
        parameterChangeInfo.setParameterDesc("单bag包长度（秒）");
        parameterChangeInfo.setParameterValueChangeInfo("300 -> 200");
        list.add(parameterChangeInfo);
        vo.setParameterChange(list);
        reList.add(vo);
        ApiPagingResponse.Paging paging = new ApiPagingResponse.Paging();
        paging.setLimit(10);
        paging.setPageNo(2);
        paging.setTotal(122);
        paging.setHasMore(true);
        return ApiPagingResponse.buildSuccessWithPaging(reList, paging);
    }
}