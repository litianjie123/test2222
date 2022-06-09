package com.example.demo.enums;


import lombok.Getter;

@Getter
public enum UserRoleEnum {
    /**
     * 用户角色
     */
    SUPER(1,"超级管理员"),
    COMMON(2,"普通管理员")
    ;


    private Integer code;
    private String msg;

    UserRoleEnum(Integer code, String msg){
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
