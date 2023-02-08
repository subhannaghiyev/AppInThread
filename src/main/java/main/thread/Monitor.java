package main.thread;

/**
 *
 * @author subhan
 */
public class Monitor {

    public static Object monitor1 = new Object(); // Burada ise biz yeni bir obyekt yaradib eger her hansi bir class-in thread lazim olmuyacagini isdeyirkse edirik...
    public static Object monitor2 = new Object();
    
    
    public void doIt1(int a) {
        System.out.println("doIt1 ishe basladi:");
        Object obj = null;
        if (a>3) {
            obj = monitor1;
        }
        else{
            obj = monitor2;
        }
        synchronized (obj) { //Meselen thread 1 bura geldi burada hamisi "this" obyektin icinde oldugundan bir-birlerini synchronized vasitesile gozleyirler.......
            System.out.println("doIt1");
        }
        System.out.println("doIt1 ish basa catdi.");
    }

    public void doIt2() {
        System.out.println("doIt2 ishe basladi:");
        synchronized (monitor1) { // thread 2 bura geldi
            System.out.println("doIt2");
        }
        System.out.println("doIt2 ish basa catdi.");
    }

    public void doIt3() {
        System.out.println("doIt3 ishe basladi:");
        synchronized (monitor2) { // thread 3 bura geldi
            System.out.println("doIt3");
        }
        System.out.println("doIt3 ish basa catdi.");
    }
}
