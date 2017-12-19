package ru.javabegin.training.spring.aop.objects;

import org.springframework.stereotype.Component;

@Component
public class SomeService {
    public int getIntValue() {
        return 4;
    }

    public double getDoubleValue() {
        return 5.6;
    }
}
