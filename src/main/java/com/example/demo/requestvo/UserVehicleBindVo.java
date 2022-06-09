package com.example.demo.requestvo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="用户车辆绑定请求参数")
public class UserVehicleBindVo {
    @ApiModelProperty(name = "vehicleType",value = "车辆类型")
    private String vehicleType;

    @ApiModelProperty(name = "vehicleNumber",value = "车辆编号")
    private String vehicleNumber;
}
