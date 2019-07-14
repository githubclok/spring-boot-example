package com.example.demo.bean;

import com.example.demo.enums.ResponseCodeEnum;

/**
 * 系统响应
 *
 * @author thf
 * @version v1.0.0
 * @date 2019-03-25
 */
public class ResponseResult extends BaseResult {

    public ResponseResult(ResponseCodeEnum response) {
        super(response.getCode(), response.getMessage());
    }

    public ResponseResult(ResponseCodeEnum response, Object data) {
        super(response.getCode(), response.getMessage(), data);
    }


    public ResponseResult(Integer code, String message) {
        super(code, message);
    }

    public ResponseResult(Object data) {
        super(ResponseCodeEnum.SUCCESS.getCode(), ResponseCodeEnum.SUCCESS.getMessage(), data);
    }

    public ResponseResult() {
        super(ResponseCodeEnum.SUCCESS.getCode(), ResponseCodeEnum.SUCCESS.getMessage());
    }
}
