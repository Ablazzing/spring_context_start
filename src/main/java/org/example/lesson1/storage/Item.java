package org.example.lesson1.storage;

public class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item{" +
               "name='" + name + '\'' +
               '}';
    }
}
