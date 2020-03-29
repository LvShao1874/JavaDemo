package com.thread;

import java.util.ArrayList;
import java.util.List;

class RunnableImplements implements Runnable {
    public volatile int number;

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            int temp = number;
            number++;
            //System.out.printf("%s: %d => %d\n", Thread.currentThread().getName(), temp, number);
        }
    }

    public int getNumber(){
        return number;
    }
}

/**
 * @author shaohai
 */
public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {
        List<Thread> threadList = new ArrayList<>();
        RunnableImplements runnable = new RunnableImplements();
        for (int i = 1; i <= 100; i++) {
            Thread thread = new Thread(runnable);
            threadList.add(thread);
            thread.start(); // start()启动一个新线程，新线程会执行相应的run()方法。start()不能被重复调用
            // thread.run();   // run()和普通的成员方法一样，可以被重复调用。单独调用run()的话，会在当前线程中执行run()，而并不会启动新线程！
        }

        for (Thread t : threadList) {
            t.join();
        }
        System.out.println(runnable.getNumber());
    }
}
