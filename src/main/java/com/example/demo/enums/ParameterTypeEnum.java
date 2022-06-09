package com.example.demo.enums;

import lombok.Getter;

@Getter
public enum ParameterTypeEnum {
    /**
     * 车辆类型
     */
    PERCEPTION(1,"感知类"),
    CONTROL(2,"归控类"),
    MAP(3,"地图定位类"),
    UTILS(4,"工具类")
    ;


    private Integer code;
    private String msg;

    ParameterTypeEnum(Integer code, String msg){
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
