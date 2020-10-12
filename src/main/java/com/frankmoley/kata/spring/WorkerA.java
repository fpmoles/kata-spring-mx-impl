package com.frankmoley.kata.spring;

import org.springframework.stereotype.Component;

@Component
public class WorkerA  implements SGWorker{

    @Override
    public String doSomething() {
        return WorkerA.class.getName();
    }

}
