package org.example.lesson1.cafe;

import org.springframework.stereotype.Component;

@Component
public class CashMachine {
    public void printPrice(Dish order) {
        System.out.printf("Стоимость заказа: %s", order.getPrice());
    }
}
