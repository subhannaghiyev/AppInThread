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
public class MyRunnable implements Runnable {

    private int index;

    public MyRunnable(int index) {
        this.index = index;
    }

    @Override
    public void run() {
        System.out.println(index+".Runnable ishe basladi ve 3 saniye gozleyecek...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Runnable ishi bitirdi.");
    }

}
