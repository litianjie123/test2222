package com.example.demo.controller;

import com.example.demo.requestvo.UserListRequestVo;
import com.example.demo.requestvo.UserLoginRequestVo;
import com.example.demo.requestvo.UserRequestVo;
import com.example.demo.requestvo.UserVehicleBindVo;
import com.example.demo.responsevo.ApiPagingResponse;
import com.example.demo.responsevo.ApiResponse;
import com.example.demo.responsevo.UserAdminResponseVo;
import com.example.demo.responsevo.UserLoginResponseVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
@Api(tags = {"用户相关接口"})
public class UserController {
    // 登陆
    @PostMapping("/login")
    @ApiOperation(value = "登陆页面", notes = "登陆页面")
    public ApiResponse<UserLoginResponseVo> login(@RequestBody UserLoginRequestVo requestVo) {
        UserLoginResponseVo vo = new UserLoginResponseVo();
        vo.setUserResponseVo("lisi","李四","管理员","111","111");
        return ApiResponse.buildSuccess(vo);
    }

    // 登出
    @PostMapping("/logout")
    @ApiOperation(value = "登出页面", notes = "登出")
    public ApiResponse<String> logout() {
        return ApiResponse.buildSuccess("登出");
    }

    // 获取用户列表
    @GetMapping("/getUserList")
    @ApiOperation(value="获取用户列表", httpMethod = "GET", produces="application/json")
    public ApiPagingResponse<List<UserAdminResponseVo>> getUserList(UserListRequestVo requestVo) {
        List<UserAdminResponseVo> reList = new ArrayList<>();
        UserAdminResponseVo vo = new UserAdminResponseVo();
        vo.setOprId("lisi");
        vo.setOprName("李四");
        vo.setRole("普通用户");
        vo.setCreateTime("2022-11-11");
        vo.setCreateOprName("张三");
        List<String> list = new ArrayList<>();
        list.add("编辑");
        list.add("删除");
        vo.setOperatorList(list);
        reList.add(vo);
        ApiPagingResponse.Paging paging = new ApiPagingResponse.Paging();
        paging.setLimit(10);
        paging.setPageNo(1);
        paging.setTotal(122);
        paging.setHasMore(true);
        return ApiPagingResponse.buildSuccessWithPaging(reList,paging);
    }

    // 新增用户
    @PostMapping("/addUser")
    @ApiOperation(value = "增加用户", notes = "增加用户")
    public ApiResponse<String> addUser(@RequestBody UserRequestVo requestVo) {
        return ApiResponse.buildSuccess("增加用户");
    }

    // 编辑用户信息
    @PostMapping("/updateUser")
    @ApiOperation(value = "编辑用户信息", notes = "编辑用户信息")
    public ApiResponse<String> updateUser(@RequestBody UserRequestVo requestVo) {
        return ApiResponse.buildSuccess("编辑用户信息");
    }

    // 删除用户信息
    @PostMapping("/deleteUser")
    @ApiOperation(value = "删除用户", notes = "删除用户")
    public ApiResponse<String> deleteUser(String oprId) {
        return ApiResponse.buildSuccess("删除用户");
    }

    // 用户绑定车辆信息更新
    @PostMapping("/UserVehicleBind")
    @ApiOperation(value = "绑定车辆信息", notes = "绑定车辆信息")
    public ApiResponse<String> UserVehicleBind(@RequestBody UserVehicleBindVo requestVo) {
        return ApiResponse.buildSuccess("绑定车辆信息");
    }
}