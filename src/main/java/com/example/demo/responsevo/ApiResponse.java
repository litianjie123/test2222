package com.example.demo.responsevo;

import com.example.demo.enums.ResultEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.io.Serializable;

@Data
@ApiModel(value = "ApiResponse", description = "公共响应")
public class ApiResponse<T> implements Serializable {

    @ApiModelProperty(value = "响应码")
    private Integer code;
    @ApiModelProperty(value = "是否成功")
    private boolean success;
    @ApiModelProperty(value = "错误信息描述")
    private String message;
    @ApiModelProperty(value = "响应体")
    private T data;

    public static <T> ApiResponse<T> buildSuccess(T data) {
        ApiResponse<T> response = new ApiResponse<>();
        response.setCode(200);
        response.setSuccess(true);
        response.setMessage("");
        response.setData(data);
        return response;
    }

    public static <T> ApiResponse<T> buildFail(ResultEnum errorCodeEnum) {
        ApiResponse<T> response = new ApiResponse<>();
        response.setSuccess(false);
        response.setCode(errorCodeEnum.getCode());
        response.setMessage(errorCodeEnum.getMsg());
        return response;
    }


}

