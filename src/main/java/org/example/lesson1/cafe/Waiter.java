package org.example.lesson1.cafe;

import org.springframework.stereotype.Component;

/**
 * Официант
 */
@Component
public class Waiter {
    private Cook cook;

    public Waiter(Cook cook) {
        this.cook = cook;
    }

    public ReadyDish takeOrder(Dish order) {
        System.out.println("Официант передает заказ повару");
        return cook.makeDish(order);
    }
}
