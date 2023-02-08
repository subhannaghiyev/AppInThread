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
public class ThreadDemo2 extends Thread { // deadlock olunur

    public void run() {
        synchronized (Lock2) {
            System.out.println("Thread 2: Holding lock 2...");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
            System.out.println("Thread 2: Waiting for lock 1...");

            synchronized (Lock1) {
                System.out.println("Thread 2: Holding lock 1 & 2...");
            }
        }
    }
}
