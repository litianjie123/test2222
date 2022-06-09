package com.example.demo.requestvo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="用户信息请求参数")
public class UserRequestVo {
    @ApiModelProperty(name = "oprId",value = "账号名")
    private String oprId;

    @ApiModelProperty(name = "oprName",value = "用户中文名")
    private String oprName;

    @ApiModelProperty(name = "tel",value = "用户电话")
    private String tel;

    @ApiModelProperty(name = "role",value = "用户角色",example = "1")
    private String role;

    @ApiModelProperty(name = "password",value = "密码")
    private String password;

    @ApiModelProperty(name = "passwordConfirm",value = "确认密码")
    private String passwordConfirm;

}
