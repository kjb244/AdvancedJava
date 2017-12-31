package com.chapter3.localinnerclass;


public class Main {

    public static void main(String[] args){
        OliveJar jar = new OliveJar();
        jar.addOlives("Kalamata", 0x000000);
        jar.addOlives("Kalamata", 0x000000);
        jar.addOlives("Kalamata", 0x000000);
        jar.reportOlives();
    }
}
