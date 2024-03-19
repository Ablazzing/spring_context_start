package org.example.lesson2.pharmacy;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JonsonPharmCompany extends PharmCompany {
    @Override
    public void sellPharma() {
        System.out.println("Продали масло для детей");
    }

    @Override
    public void buyPharma(int price) {
        System.out.println("Купили масло для детей");
    }
}
