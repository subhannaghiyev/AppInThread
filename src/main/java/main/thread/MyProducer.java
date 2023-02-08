/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.thread;

import java.util.UUID;

/**
 *
 * @author subhan
 */
public class MyProducer implements Runnable {

    @Override
    public void run() {
        while (true) {
            Base.list.add(UUID.randomUUID().toString());
        }
    }

}
