package com.myworld.backend.result;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
public enum CodeEnum {

    OK(200,"成功"),
    Fail(500,"失败"),

    Login_JWT_IS_EMPTY(901,"请求jwt为空"),
    Login_JWT_IS_ILLEGAL(902,"请求jwt不合法"),
    Login_JWT_IS_EXPIRE(903,"请求jwt已过期"),
    Login_JWT_NO_MATCH(904,"请求jwt不正确"),
    ;

    private int code;

    private String msg;
}
