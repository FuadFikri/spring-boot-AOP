package com.fikri.belajar_spring_aop;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloServiceTest {

    @Autowired
    private HelloService helloService;


    @Test
    void helloService(){
        Assertions.assertEquals("hello fikri", helloService.hello("fikri"));
        Assertions.assertEquals("bye fikri", helloService.bye("fikri"));
    }
}
