package com.example.demo.service.impl;

import com.example.demo.service.ProxyTestService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProxyServiceImpl implements ProxyTestService {
    @Override
    public String runProxy(String runner) {
        log.info("test start...");
        log.info("runner is ：{}", runner);
        log.info("test end...");
        return null;
    }
}
