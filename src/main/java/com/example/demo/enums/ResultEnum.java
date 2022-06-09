package com.example.demo.enums;


import lombok.Getter;

@Getter
public enum ResultEnum {
    /**
     * 响应枚举
     */
    SUCCESS(200,"成功"),
    FAIL(100,"失败"),
    EXCEPTION(300,"系统异常")
    ;

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg){
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
