package com.chapter3.enumclasses;


public class EnumClasses {

    public static void main(String[] args) throws Exception {

        OliveJar jar = new OliveJar();
        jar.addOlive(OliveName.KALMATA, 0x000000);
        jar.addOlive(OliveName.PICHOLINE, 0x000000);
        jar.reportOlives();
    }

}
