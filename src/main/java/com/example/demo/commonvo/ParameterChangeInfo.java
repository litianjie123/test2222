package com.example.demo.commonvo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="配置参数修改信息")
public class ParameterChangeInfo {
    @ApiModelProperty(name = "参数名",value = "参数名")
    private String parameterName;

    @ApiModelProperty(name = "参数说明",value = "参数说明")
    private String parameterDesc;

    @ApiModelProperty(name = "参数变化记录",value = "参数变化记录")
    private String parameterValueChangeInfo;
}
