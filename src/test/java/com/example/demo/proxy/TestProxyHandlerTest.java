package com.example.demo.proxy;

import com.example.demo.service.ProxyTestService;
import com.example.demo.service.impl.ProxyServiceImpl;
import org.junit.Test;

import java.lang.reflect.Proxy;

public class TestProxyHandlerTest {

    @Test
    public void testProxy() {
        ProxyServiceImpl test = new ProxyServiceImpl();
        TestProxyHandler handler = new TestProxyHandler(test);
        ProxyTestService proxyService = (ProxyTestService) Proxy.newProxyInstance(ProxyServiceImpl.class.getClassLoader(), ProxyServiceImpl.class.getInterfaces(), handler);
        proxyService.runProxy("sxy");
        Class clazz = ProxyTestService.class;
    }

    @Test
    public void testProxy2() {
        TestProxyHandler2 handler2 = new TestProxyHandler2();
        ProxyServiceImpl serviceImpl = new ProxyServiceImpl();
        ProxyTestService testServiceProxy = (ProxyTestService) handler2.newProxyInstance(serviceImpl);
        testServiceProxy.runProxy("刘翔");
    }

    @Test
    // @author sxy TODO CGLib test
    public void testCG() {
        
    }
}