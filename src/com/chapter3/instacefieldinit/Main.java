package com.chapter3.instacefieldinit;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Olive> olives = new OliveJar(3, "Kalamata", 0x000000).olives;
        olives.forEach(item -> {
            System.out.println("it's a " + item.oliveName);
        });
    }
}
