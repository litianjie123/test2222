package com.example.demo.requestvo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="用户登陆请求参数")
public class UserLoginRequestVo {
    @ApiModelProperty(name = "oprId",value = "账号名")
    private String oprId;

    @ApiModelProperty(name = "password",value = "用户密码")
    private String password;
}
