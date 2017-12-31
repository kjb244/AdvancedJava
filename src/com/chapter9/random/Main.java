package com.chapter9.random;

public class Main {

    public static void main(String[] args){
        MyThreads t1 = new MyThreads();
        MyThreads t2 = new MyThreads();
        System.out.println("threads starting");
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch (InterruptedException e){

        }
        System.out.println("all threads done");
        System.out.println(t1.getValue());
        System.out.println(t2.getValue());
    }

}
