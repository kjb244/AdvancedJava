package com.chapter3.staticintializer;

import java.util.ArrayList;

public class StaticInit {

    public static void main(String[] args){
        ArrayList<Olive> olives = OliveJar.olives;
        olives.forEach(item -> {
            System.out.println("it's a " + item.oliveName);
        });
    }
}
