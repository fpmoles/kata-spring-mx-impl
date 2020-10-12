package com.frankmoley.kata.spring;

import org.springframework.stereotype.Component;

@Component
public class WorkerB implements SGWorker{

    @Override
    public String doSomething() {
        return WorkerB.class.getName();
    }
}
