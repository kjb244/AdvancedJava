package com.chapter9.synchronizing;

public class TargetClass {
    public void call(int threadId){
        System.out.println("calling thread from " + threadId);
    }
}
