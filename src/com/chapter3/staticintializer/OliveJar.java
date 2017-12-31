package com.chapter3.staticintializer;

import java.util.ArrayList;

public class OliveJar {

    public static ArrayList<Olive> olives;

    static{
        olives = new ArrayList<>();
        olives.add(new Olive("Kalamata", 0x000000));
        olives.add(new Olive("Picholine", 0x00FF00));
        olives.add(new Olive("Kalamata", 0x000000));

    }
}
