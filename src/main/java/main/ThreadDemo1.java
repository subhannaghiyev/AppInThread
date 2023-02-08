/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import static main.TestThread.Lock1;
import static main.TestThread.Lock2;

/**
 *
 * @author subhan
 */
public class ThreadDemo1 extends Thread { // deadlock olunurr..

    public void run() {
        synchronized (Lock1) {
            System.out.println("Thread 1: Holding lock 1...");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
            System.out.println("Thread 1: Waiting for lock 2...");

            synchronized (Lock2) {
                System.out.println("Thread 1: Holding lock 1 & 2...");
            }
        }
    }
}

