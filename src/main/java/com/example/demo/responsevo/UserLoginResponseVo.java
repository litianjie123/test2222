package com.example.demo.responsevo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="用户登陆返回信息")
public class UserLoginResponseVo {
    @ApiModelProperty(name = "账号名",value = "账号名")
    private String oprId;

    @ApiModelProperty(name = "用户中文名",value = "用户中文名")
    private String oprName;

    @ApiModelProperty(name = "用户角色",value = "用户角色")
    private String role;

    @ApiModelProperty(name = "车辆类型",value = "车辆类型")
    private String vehicleType;

    @ApiModelProperty(name = "车辆编号",value = "车辆编号")
    private String vehicleNumber;

    public void setUserResponseVo(String oprId, String oprName, String role,
                                         String vehicleType, String vehicleNumber){
        this.oprId = oprId;
        this.oprName = oprName;
        this.role = role;
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
    }
}