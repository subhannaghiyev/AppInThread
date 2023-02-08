/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.thread;

/**
 *
 * @author subhan
 */
public class MyWorker extends Thread {

    private String name1;

    public MyWorker(String name1) {
        this.name1 = name1;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) 
           System.out.println(name1+" Processed");
        
    }
}
