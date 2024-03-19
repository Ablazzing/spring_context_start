package org.example.lesson1.storage;

import java.util.List;

public class WorkerImpl implements Worker {
    private final String name;

    public WorkerImpl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void throwItems(List<Item> items) {
        items.forEach(item -> System.out.println("Бросаю товар: " + item.getName()));
    }
}
