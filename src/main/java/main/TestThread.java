/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author subhan
 */
public class TestThread { // deadlock olurrr....

    public static Object Lock1 = new Object();
    public static Object Lock2 = new Object();

    public static void main(String args[]) {
        ThreadDemo1 T1 = new ThreadDemo1();
        ThreadDemo2 T2 = new ThreadDemo2();
        T1.start();
        T2.start();
    }
    /*
    deadlock qarsini nece almaq olar? deadlock un qarsini almaq mumkun deyil lakin biz ele etmeliyikki ona searit olamsin meselen biz 
    Obyektlerimizi private ederik bu sayede ne o birisi bunu gorer nede bu o birisini biz birinci calismaliyiq ki ilk novbede xaricden 
    her hansi bir methodu cagirmiyaqki deadlock prosesinin olmasini azaldaq bu o demek deyilki sen hecvaxt deadlock olmuyacaq 
    2 ci novbede ise biz oz classimizin icindeki deadlock oluna bilencek metodlari yox eliyek bu ise Global yox local etmelyik 
    lock larimizi....
    */
}
