package com.chapter9.random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class MyThreads extends Thread {

    private String value;
    private int initParm;

    public MyThreads(){

    }

    public  MyThreads(int initParm){
        this.initParm = initParm;
    }

    @Override
    public void run(){
        if(initParm ==1){
            makeHttpGet("https://api.github.com/users/kjb244");
        }
        else{
            makeHttpGet("https://api.github.com/users/kjb");

        }
    }

    public String getValue(){
        return value;
    }

    private void makeHttpGet(String urlString){
        try {
            URL url = new URL(urlString);
            URLConnection conn = url.openConnection();
            InputStream is = conn.getInputStream();
            String result = new BufferedReader(new InputStreamReader(is))
                    .lines().collect(Collectors.joining("\n"));
            this.value = result;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
