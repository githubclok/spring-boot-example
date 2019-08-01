package com.example.demo.proxy;


import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Slf4j
public class TestProxyHandler2 implements InvocationHandler {
    // @author sxy 委托类
    private Object delegator;

    /**
     * 创建代理类实例
     * @param delegator 委托类
     * @Author sxy
     * @Date 2019-08-01
     * @Return java.lang.Object
     * @Exception
     **/
    // @author sxy TODO 注意，只有实现了接口的具体实现类才能够作为委托类被代理类代理
    Object newProxyInstance(Object delegator) {
        this.delegator = delegator;
        return Proxy.newProxyInstance(delegator.getClass().getClassLoader(),
                delegator.getClass().getInterfaces(), this);
    }


    /**
     * 代理类通过此方法调用委托类的具体实现方法
     * @param proxy 调用该方法的代理类实例(当前由本类的newProxyInstance方法生成，在方法中不会被调用)
     * @param method 调用的委托类方法
     * @param args 方法参数
     * @Author sxy
     * @Date 2019-08-01 
     * @Return java.lang.Object
     * @Exception 
     **/
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("当前方法:{}, 参数类型为：{}, 具体参数为：{}", method.getName(), args.getClass(), args);
        return method.invoke(delegator, args);
    }
}
