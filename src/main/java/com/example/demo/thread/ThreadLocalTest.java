package com.example.demo.thread;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ThreadLocalTest {
    private static ThreadLocal<DateFormat> dateFormat = new ThreadLocal<DateFormat>(){
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }
    };

    // @author sxy 如此声明会报空指针异常
    private static ThreadLocal<SimpleDateFormat> safeSdf = new ThreadLocal<>();

    public static void main(String[] args) {

        for (int i = 0;i < 500; i++) {
            Thread thread = new Thread(() -> {
                try {
                    System.out.println(Thread.currentThread().getName() + " " + ThreadLocalTest.dateFormat.get().parse("2019-08-03"));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            });
            thread.setName("Thread" + i);
            thread.start();
        }
    }

}
