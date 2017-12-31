package com.chapter2.numericliterals;

import java.text.NumberFormat;

public class NumericLiteralDemo {

    public static void main(String[] args){
        int number = 1_000_000;
        NumberFormat formatter = NumberFormat.getInstance();

        System.out.println(formatter.format(number));
    }
}
