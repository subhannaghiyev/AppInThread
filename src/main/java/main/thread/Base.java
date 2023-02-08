/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.thread;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author subhan
 */
public class Base {

    public static List<String> list = new ArrayList<String>();

    private static volatile int a = 0;

    /* Bu volatile odur ki , Bizim Synchronized ederken Thread meselen 0 daki 100 deki gormeye biler
     volatile etdikde ise bu onlarin hamisindan xeber tutmasini tenzimleyir....
     */
    public static synchronized int getA() {
        return a;
    }

    public static synchronized void incA() {
        /* Burada Synchronized edirik cunki race condition bas verir ve bir cox Thread data ni ve
        // ya melumati deyismek isdiyir biz burada Synchronized etdikde ise bunun qarsini alir ve sirayla tenzimleyir.......
         */
        a++;
    }

}
