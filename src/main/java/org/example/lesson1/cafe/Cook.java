package org.example.lesson1.cafe;

public class Cook {
    private final String name;

    public Cook(String name) {
        this.name = name;
    }

    public ReadyDish makeDish(Dish dish) {
        System.out.printf("Повар %s готовит блюдо\n", name);
        return new ReadyDish(dish);
    }
}
