package com.myworld.backend.result;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一封装web层向前端页面返回的结果
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class R {
    //The returned status code,such as 200 for success and 500 for failure;
    private int code;

    //The returned status information,that is,the returned status
    //code represents an error in the backend, such as: the user does not exist
    private String msg;

    //The specific data returned can be of any type.For example,if the login is successful,
    // then the user object is returned
    private Object data;

    public static R OK(){
        return R.builder().code(CodeEnum.OK.getCode()).msg(CodeEnum.OK.getMsg()).build();
    }

    public static R OK(Object data){
        return R.builder().code(CodeEnum.OK.getCode()).msg(CodeEnum.OK.getMsg()).data(data).build();
    }

    public static R FAIL(CodeEnum codeEnum){
        return R.builder().code(codeEnum.getCode()).msg(codeEnum.getMsg()).build();
    }

    public static R FAIL(String msg){
        return R.builder().code(CodeEnum.Fail.getCode()).msg(msg).build();
    }

}
