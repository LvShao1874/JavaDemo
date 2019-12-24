package com.proxy;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        // 静态代理
        //A a = new A();
        //TimeRecordAgent aAgent = new TimeRecordAgent(a);
        //aAgent.doSomething1();

        // 动态代理
        // 实现我们自己的调用逻辑,并传入委托的对象(因为我们重写的调用肯定有一部分需要由委托类的方法来实现,这是动态代理的前提).
        DInvocation myInvocation = new DInvocation(new A());
        // 接口类和代理类由Proxy来管理生成,最终返回一个我们想要的代理类.
        TimeRecord a = (TimeRecord)(Proxy.newProxyInstance(
                TimeRecord.class.getClassLoader(), new Class[] {TimeRecord.class}, myInvocation));
        a.doSomething1();
    }
}
