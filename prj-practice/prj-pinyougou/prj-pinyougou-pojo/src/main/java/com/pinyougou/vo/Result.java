package com.pinyougou.vo;

import java.io.Serializable;

/**
 * @author JW
 * @createTime 2018/10/19 4:17 PM
 * @desc todo
 */
public class Result implements Serializable {

    private boolean success;
    private String message;

    public static Result ok(String message) {
        return new Result(true, message);
    }

    public static Result fail(String message) {
        return new Result(false, message);
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}
