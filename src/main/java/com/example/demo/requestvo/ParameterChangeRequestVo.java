package com.example.demo.requestvo;
import com.example.demo.commonvo.Parameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(value="配置更新参数")
public class ParameterChangeRequestVo {
    @ApiModelProperty(name = "parameterType",value = "参数类型")
    String parameterType;

    @ApiModelProperty(name = "parameterList",value = "参数信息")
    List<Parameter> parameterList;
}
