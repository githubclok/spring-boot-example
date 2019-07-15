package com.example.demo.controller;

import com.example.demo.bean.ResponseResult;
import com.example.demo.enums.ResponseCodeEnum;
import com.example.demo.query.LoginQuery;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Api(tags = "Web登陆接口")
@RestController
@RequestMapping(value = "/web")
public class WebLoginController {

    @ApiOperation(value = "Web用户登陆")
    @PostMapping(value = "/login")
    public ResponseResult login(@RequestBody LoginQuery loginInfo){
        log.info("user request login...");
        System.out.println("user request login");
        return new ResponseResult(ResponseCodeEnum.SUCCESS);
    }
}
