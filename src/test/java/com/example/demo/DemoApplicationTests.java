package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("this is spring boot example");
    }

    @Test
    public void completableFutureTest() {
        System.out.println("start execute");
//        CompletableFuture<Long> future =   CompletableFuture.supplyAsync(()->"Hello")
//                .thenApply(s -> s+"World")
////                .thenApply(s-> System.out.println("waiting c"))
//                .whenComplete((s, throwable) -> System.out.println(s));
        System.out.println("end execute");
        System.out.println(System.nanoTime());
        while (true);
    }

    private static void thenApply() throws Exception {
        CompletableFuture<Long> future = CompletableFuture.supplyAsync(() -> {
            long result = new Random().nextInt(100);
            System.out.println("result1="+result);
            return result;
        }).thenApply(t -> {
            long result = t*5;
            System.out.println("result2="+result);
            return result;
        });

        long result = future.get();
        System.out.println(result);
    }
}
