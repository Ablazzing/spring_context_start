package org.example.lesson2.pharmacy;

import org.example.lesson2.hospital.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BlendamedPharmCompany extends PharmCompany {

    @Autowired
    @Lazy
    private Hospital hospital;
    @Override
    public void sellPharma() {
        System.out.println("Продали зубную пасту");
    }

    @Override
    public void buyPharma(int price) {
        System.out.println("Купили зубную пасту");
    }
}
