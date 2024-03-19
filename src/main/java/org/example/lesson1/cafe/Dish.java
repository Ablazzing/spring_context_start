package org.example.cafe;

public enum Dish {
    MEAT(200);

    private int price;

    Dish(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Dish{" +
               "price=" + price +
               '}';
    }
}
