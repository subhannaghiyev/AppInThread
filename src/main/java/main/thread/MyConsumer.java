/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this Ïtemplate file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.thread;

/**
 *
 * @author subhan
 */
public class MyConsumer implements Runnable {

    private String name;

    public MyConsumer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            int lastIndex = Base.list.size() - 1;
            System.out.println("lastIndex" + lastIndex);
            if (lastIndex > -1) {
                String s = Base.list.remove(lastIndex);
                System.out.println(name + " " + s);
            }
        }
    }

}
