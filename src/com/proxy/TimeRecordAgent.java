package com.proxy;

import java.time.Duration;
import java.time.Instant;

public class TimeRecordAgent implements TimeRecord {
    A a;

    public TimeRecordAgent(A a) {
        this.a = a;
    }

    @Override
    public void doSomething1() throws InterruptedException {
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
