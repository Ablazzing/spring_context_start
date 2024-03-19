package org.example.storage;

import java.util.List;

public interface Worker {

    public String getName();

    void throwItems(List<Item> items);
}
