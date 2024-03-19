package org.example.lesson1.storage;

import java.util.List;

public interface Worker {

    public String getName();

    void throwItems(List<Item> items);
}
