package org.example.storage;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manager {
    private WorkerImpl workerImpl;

    public Manager(@Qualifier("petr") WorkerImpl workerImpl) {
        this.workerImpl = workerImpl;
    }

    public void goWorker() {
        System.out.println("иди работай " + workerImpl.getName());
    }
}
