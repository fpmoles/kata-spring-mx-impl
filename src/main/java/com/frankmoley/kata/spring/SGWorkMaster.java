package com.frankmoley.kata.spring;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SGWorkMaster {
    private List<SGWorker> workerList;

    public SGWorkMaster(List<SGWorker> workerList) {
        this.workerList = workerList;
    }

    public void doWork(){
        workerList.forEach(worker->{System.out.println(worker.doSomething());});
    }

}
