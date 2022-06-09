package com.example.demo.enums;

import lombok.Getter;


@Getter
public enum ActionEnum {
    /**
     * 操作按钮
     */
    VIEW("VIEW","查看"),
    EDIT("EDIT","修改"),
    DELETE("DELETE","删除"),
    EMPTY("", "");
    private String title;
    private String msg;
    ActionEnum(String title, String msg) {
        this.title = title;
        this.msg = msg;
    }
}
