package com.proxy;

public class A implements TimeRecord {

    @Override
    public void doSomething1() throws InterruptedException {
        System.out.println("执行方法1开始");
        Thread.sleep(3000);
        System.out.println("执行方法1结束");
    }

    @Override
    public void doSomething2() throws InterruptedException {
        System.out.println("执行方法2开始");
        Thread.sleep(2000);
        System.out.println("执行方法2结束");
    }
}
