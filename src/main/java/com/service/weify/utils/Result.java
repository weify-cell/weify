package com.service.weify.utils;



import java.io.Serializable;

/**
 * 描述：
 *
 * @author panxg
 * @date 2020年11月28日 11:56
 */
public class Result<T> implements Serializable {

    /**
     * 返回状态
     */
    private Integer status;

    /**
     * 返回状态码
     */
    private Integer code;

    /**
     * 返回描述
     */
    private String msg;

    /**
     * 返回数据
     */
    private T data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
