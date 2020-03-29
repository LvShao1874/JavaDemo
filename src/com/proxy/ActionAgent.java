package com.proxy;

import java.time.Duration;
import java.time.Instant;

/**
 * @author shaohai
 */
public class ActionAgent implements Action {
    A a;

    public ActionAgent(A a) {
        this.a = a;
    }

    @Override
    public void doSomething1() {
        Instant start = Instant.now();
        a.doSomething1();
        Instant end = Instant.now();
        System.out.println("方法执行花费 : " + Duration.between(start, end).getSeconds() + "秒");
    }

    @Override
    public void doSomething2() throws InterruptedException {
        Instant start = Instant.now();
        a.doSomething2();
        Instant end = Instant.now();
        System.out.println("方法执行花费 : " + Duration.between(start, end).getSeconds() + "秒");
    }
}
