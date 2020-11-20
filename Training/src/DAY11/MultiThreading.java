package DAY11;

import javax.swing.*;

public class MultiThreading implements Runnable{
    static Thread t;
    static Thread t1;

//    manual Thread
//    extends Thread
//    implement Runnable
     int count=0;
    public static void main(String[] args) {
        MultiThreading obj = new MultiThreading();
        t =new Thread(obj,"Aditya");
        t.start();
        MultiThreading obj1 = new MultiThreading();
        t1 =new Thread(obj1,"Jatin");
        t1.start();
        System.out.println(t.getName());
        System.out.println(t1.getName());
//      MultiDemo multiDemo= new MultiDemo("Thread1");
//        MultiDemo multiDemo1 = new MultiDemo("Thread2")         ;
//        multiDemo.start();
//        multiDemo1.start();
    }
    public void run(){
//        t=Thread.currentThread();
//        System.out.println(Thread.currentThread().getName());
        System.out.println("running");
        System.out.println("Hi this the thread "+t.getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi this is "+t.getName());
            System.out.println(count++);
            try {
                if(t.getName()=="Aditya")
                Thread.sleep(0,100000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}
class MultiDemo{
    Thread t;
    String threadName;
    int count=0;

    public MultiDemo(String threadName) {
        this.threadName = threadName;
        t= new Thread(threadName);
//        t.run();
    }

    public void run(){
        System.out.println("Hi this the thread "+Thread.currentThread());
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi this is "+Thread.currentThread());
            System.out.println(count++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
//    public void start(){
//        t= new Thread(threadName);
//    }


}
