package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;

//动态代理的关注点:不修改原方法的前提下,任意class的任意方法层面的自定义
public class DInvocation implements InvocationHandler {
    private Object obj;

    public DInvocation(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Instant start = Instant.now();
        Object result = method.invoke(obj, args);
        Instant end = Instant.now();
        System.out.println("方法执行花费 : " + Duration.between(start, end).getSeconds() + "秒");
        return result;
    }
}
