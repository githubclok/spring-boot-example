package com.example.demo.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ThreadTestSimpleDateFormat {

    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        for (int i = 0;i < 50; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(simpleDateFormat.parse("2019-08-03"));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
        }
    }
}
