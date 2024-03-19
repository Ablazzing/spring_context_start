package org.example.cafe;

import org.springframework.stereotype.Component;

public class Cafe {
    private Cook cook;
    private Waiter waiter;
    private CashMachine cashMachine;

    public Cafe(Cook cook, Waiter waiter) {
        this.cook = cook;
        this.waiter = waiter;
    }

    public Cafe(Cook cook, Waiter waiter, CashMachine cashMachine) {
        this.cook = cook;
        this.waiter = waiter;
        this.cashMachine = cashMachine;
    }

    public ReadyDish takeOrder(Dish order) {
        ReadyDish readyDish = waiter.takeOrder(order);
        cashMachine.printPrice(order);
        return readyDish;
    }
}
