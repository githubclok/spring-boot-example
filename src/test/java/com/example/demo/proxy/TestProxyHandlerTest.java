package com.example.demo.proxy;

import com.example.demo.service.ProxyTestService;
import com.example.demo.service.impl.ProxyServiceImpl;
import org.junit.Test;

import java.lang.reflect.Proxy;

// @author sxy JDK动态代理只能代理有接口的类，并且是只能代理接口方法，不能代理一般的类中的方法
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
    public void testProxy3(){
        TestProxyHandler2 handler2 = new TestProxyHandler2();
        ProxyTestService service = new ProxyServiceImpl();
        ProxyTestService serviceProxy = (ProxyTestService) handler2.newProxyInstance(service);
        serviceProxy.runProxy("李宁");
    }

    @Test
    // @author sxy TODO CGLib test
    public void testCG() {
        
    }
}