package ru.javabegin.training.spring.aop.loggins;

import org.springframework.stereotype.Component;

@Component
public class MyLogger {
    public void printValue(Object obj) {
        System.out.println("obj: " + obj);
    }

    public void init() {
        System.out.println("init");
    }

    public void close() {
        System.out.println("close");
    }

    public void afterThrowingAdvice(IllegalArgumentException ex) {
        System.out.println("There has been an exception: " + ex.toString());
    }
}
