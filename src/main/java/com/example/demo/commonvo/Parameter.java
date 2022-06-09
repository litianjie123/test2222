package com.example.demo.commonvo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="配置参数基本信息")
public class Parameter {
    @ApiModelProperty(name = "参数名",value = "参数名")
    private String parameterName;

    @ApiModelProperty(name = "参数说明",value = "参数说明")
    private String parameterDesc;

    @ApiModelProperty(name = "参数值",value = "参数值")
    private String parameterValue;

    @ApiModelProperty(name = "输入框类型",value = "输入框类型")
    private String parameterInputType;
}
