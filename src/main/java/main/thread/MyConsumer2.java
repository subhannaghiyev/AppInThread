/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author subhan
 */
public class MyConsumer2 implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("I am started and Waiting");
            Thread.sleep(2000);
        } catch (InterruptedException ex) {

        }

        Base.incA();
    }

}
