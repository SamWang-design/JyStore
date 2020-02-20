package com.harry.jystore.util;

public class JsonUtil {
    private int code;
    private String message;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }


    public Object getData() {
        return data;
    }



    public JsonUtil setCode(ResultCode resultCode){
        this.code = resultCode.code;
        return this;
    }

    public JsonUtil setMessage(String message){
        this.message=message;
        return this;
    }
    public JsonUtil setData(Object data){
        this.data=data;
        return this;
    }

    @Override
    public String toString() {
        return "JsonUtil{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
