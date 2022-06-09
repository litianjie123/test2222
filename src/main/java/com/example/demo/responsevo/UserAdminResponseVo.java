package com.example.demo.responsevo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(value="用户信息")
public class UserAdminResponseVo {
    @ApiModelProperty(name = "账号名",value = "账号名")
    private String oprId;

    @ApiModelProperty(name = "用户中文名",value = "用户中文名")
    private String oprName;

    @ApiModelProperty(name = "用户角色",value = "用户角色")
    private String role;

    @ApiModelProperty(name = "创建时间",value = "创建时间")
    private String createTime;

    @ApiModelProperty(name = "创建人",value = "创建人")
    private String createOprName;

    @ApiModelProperty(name = "操作列表",value = "操作列表")
    private List<String> OperatorList;

    public void setUserAdminResponseVo(String oprId, String oprName, String role,
                                         String createTime, String createOprName){
        this.oprId = oprId;
        this.oprName = oprName;
        this.role = role;
        this.createTime = createTime;
        this.createOprName = createOprName;
    }
}