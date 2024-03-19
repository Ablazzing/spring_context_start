package org.example.cafe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example.cafe");
        Cafe cafe = context.getBean(Cafe.class);
        cafe.takeOrder(Dish.MEAT);
    }
}
