package com.example.demo.proxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@Slf4j
public class TestProxyHandler implements InvocationHandler {

    private Object proxyService;

    TestProxyHandler(Object proxyService) {
        this.proxyService = proxyService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("current proxy object is :{}", proxy);
        log.info("execute method:{}", method.getName());
        log.info("args is :{}", args);
        return method.invoke(proxyService, args);
    }
}
