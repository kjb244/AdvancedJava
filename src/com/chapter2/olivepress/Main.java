package com.chapter2.olivepress;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        Olive o1 = new Olive("Kalamata", 0x000000);
        Olive o2 = new Olive("Picholine", 0x00FF00);
        Olive o3 = new Olive("Ligurio", 0x000000);

        //Olive[] olives = {o1, o2, o3};
        ArrayList<Olive> arr = new ArrayList<>();
        arr.add(o1);
        arr.add(o2);
        arr.add(o3);
        System.out.println(arr);
    }

}
