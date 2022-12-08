package com.example.demo.chapter03.used;

import org.springframework.stereotype.Component;


@Component
public class EvenGreet implements Greet{
    @Override
    public void greeting(){
        System.out.println("-------좋은 저녁입니다. ---");
    }
}
