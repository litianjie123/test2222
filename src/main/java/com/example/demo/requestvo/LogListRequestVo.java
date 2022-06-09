package com.example.demo.requestvo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="日志列表请求参数")
public class LogListRequestVo {
    @ApiModelProperty(name = "parameterType",value = "参数类别")
    private String parameterType;

    @ApiModelProperty(name = "startTime",value = "开始时间")
    private String startTime;

    @ApiModelProperty(name = "endTime",value = "结束时间")
    private String endTime;

    @ApiModelProperty(name = "pageNo",value = "页码",example = "1")
    private Integer pageNo;

    @ApiModelProperty(name = "limit",value = "分页条数",example = "10")
    private Integer limit;
}
