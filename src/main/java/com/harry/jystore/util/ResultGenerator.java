package com.harry.jystore.util;

public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE="SUCCESS";

    public static JsonUtil genSuccessResult() {
        return new JsonUtil().setCode(ResultCode.SUCCESS).setMessage(DEFAULT_SUCCESS_MESSAGE);
    }
    public static JsonUtil genSuccessResult(Object data){
        return new JsonUtil().setCode(ResultCode.SUCCESS).setMessage(DEFAULT_SUCCESS_MESSAGE).setData(data);
    }
    public static JsonUtil genFailResult(String message){
        return new JsonUtil().setCode(ResultCode.FALE).setData(message).setMessage(message);
    }
    public static JsonUtil genFailResult(){
        return new JsonUtil().setCode(ResultCode.FALE).setMessage("操作失败，请稍后再试");
    }
}
