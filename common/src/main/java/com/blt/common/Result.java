package com.blt.common;

import lombok.Data;

/**
 * @author by lxmin
 * @create 2021-04-16
 * @E-mail 294900038@qq.com
 */
@Data
public class Result<T> {
    private Boolean result;

    private String msg;

    private T data;

    public Result(Boolean result) {
        this.result = result;
    }

    public Result(Boolean result, String msg) {
        this.result = result;
        this.msg = msg;
    }

    public Result(Boolean result, String msg, T data) {
        this.result = result;
        this.msg = msg;
        this.data = data;
    }

    public Result(Boolean result, T data) {
        this.result = result;
        this.data = data;
    }

}
