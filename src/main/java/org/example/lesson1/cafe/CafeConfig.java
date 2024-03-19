package org.example.lesson1.cafe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CafeConfig {

    @Bean
    public Cafe cafe(Waiter waiter, Cook cook, CashMachine cashMachine) {
        return new Cafe(cook, waiter, cashMachine);
    }

    @Bean
    public Cook cook() {
        return new Cook("Петр");
    }
}
