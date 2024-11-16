package com.fikri.belajar_spring_aop;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class HelloService {

    public String hello(String name){
        log.info("call helloService.hello()");
        return "hello "+ name;
    }

    public String bye(String name){
        log.info("call helloService.bye()");
        return "bye "+ name;
    }
}
