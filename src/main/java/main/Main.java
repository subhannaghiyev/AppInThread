/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import main.thread.Base;
import main.thread.Monitor;
import main.thread.MyConsumer2;
import main.thread.MyRunnable;

/**
 *
 * @author subhan
 */
public class Main {

    public static void main(String[] args) throws Exception {
        
    }

    private static void scheduledThreadPool() {
        ScheduledExecutorService ex = Executors.newScheduledThreadPool(3);

        ex.schedule(new MyRunnable(1), 3, TimeUnit.SECONDS);
        ex.schedule(new MyRunnable(2), 4, TimeUnit.SECONDS);
        ex.shutdown();
    }

    private static void cachedThreadPool() {
        ExecutorService service1 = new ThreadPoolExecutor(10, 50, 10 * 60, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(20));
        ExecutorService service2 = Executors.newCachedThreadPool();
        service1.shutdown();
    }

    private static void fixedThreadPoolExecutor() {
        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            service.submit(new MyRunnable(i));
        }
        service.shutdown();
    }

    private static void singleThreadExecutor() {
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(new MyRunnable(1));
        service.submit(new MyRunnable(2));
        service.submit(new MyRunnable(3));
        service.submit(new MyRunnable(4));
        service.shutdown();
    }

    public static void threadOperatingRules() throws Exception {
        Thread[] threads = new Thread[1000];
        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(new MyConsumer2());
        }
        for (int i = 0; i < 100; i++) {
            threads[i].start();
        }
        Thread.sleep(5000);
        System.out.println(Base.getA()); // race condition

        Monitor m = new Monitor();
        m.doIt1(5);
        m.doIt2();
        m.doIt3();


        /* 
        Thread s = new Thread(new MyProducer());
        Thread s1 = new Thread(new MyProducer());
        Thread m = new Thread(new MyConsumer("Subhan"));
        Thread m1 = new Thread(new MyConsumer("Hasan"));
        Thread m2 = new Thread(new MyConsumer("Xanlar"));
        Thread m3 = new Thread(new MyConsumer("Camal"));
        Thread m4 = new Thread(new MyConsumer("Sebuter"));
        Thread m5 = new Thread(new MyConsumer("Mustafa"));

        s.start();
        s1.start();
        m.start();
        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
         */
 /*
        MyWorker m = new MyWorker("Subhan");
        MyWorker m1 = new MyWorker("Hasan");
        MyWorker m2 = new MyWorker("Camal");
        MyWorker m3 = new MyWorker("Xanlar");
        MyWorker m4 = new MyWorker("Sebuter");
        
        m.start();
        m1.start();
        m2.start();
        m3.start();
        m4.start();
         */
    }

}
