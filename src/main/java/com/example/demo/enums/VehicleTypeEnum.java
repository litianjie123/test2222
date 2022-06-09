package com.example.demo.enums;

import lombok.Getter;

@Getter
public enum VehicleTypeEnum {
    /**
     * 车辆类型
     */
    PLUS(1,"1.0PLUS"),
    VISIT(2,"观光车"),
    BUG(3,"BUS")
    ;


    private Integer code;
    private String msg;

    VehicleTypeEnum(Integer code, String msg){
        this.code=code;
        this.msg=msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
