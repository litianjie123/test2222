package com.example.demo.responsevo;

import com.example.demo.commonvo.ParameterChangeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(value="日志列表信息")
public class LogListResponseVo {
    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private int id;
    /**
     * 参数类别
     */
    @ApiModelProperty(value = "参数类别")
    private String parameterType;


    /**
     * 操作时间
     */
    @ApiModelProperty(value = "操作时间")
    private String createTime;

    /**
     * 用户中文名
     */
    @ApiModelProperty(value = "用户中文名")
    private String oprName;

    /**
     * 操作类型
     */
    @ApiModelProperty(value = "操作类型")
    private String oprType;

    /**
     * 有变化的字段
     */
    @ApiModelProperty(value = "有变化的字段")
    private List<ParameterChangeInfo> parameterChange;
}
