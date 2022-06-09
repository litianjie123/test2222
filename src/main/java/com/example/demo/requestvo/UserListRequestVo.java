package com.example.demo.requestvo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
@Data
@ApiModel(value="用户列表请求参数")
public class UserListRequestVo {
    @ApiModelProperty(name = "key",value = "模糊搜索key")
    private String key;

    @ApiModelProperty(name = "pageNo",value = "页码",example = "1")
    private Integer pageNo;

    @ApiModelProperty(name = "limit",value = "分页条数",example = "10")
    private Integer limit;
}
