package com.example.demo.bean;

import lombok.Data;

/**
 * 响应基类
 *
 * @author thf
 * @version v1.0.0
 * @date 2019-03-25
 */
@Data
public class BaseResult {

    /**
     * 响应码
     */
    private Integer code;
    /**
     * 响应消息
     */
    private String msg;
    /**
     * 响应数据
     */
    private Object data;

    public BaseResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BaseResult(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

}
