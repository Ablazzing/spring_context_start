package org.example.lesson2.pharmacy;

import org.example.lesson2.hospital.Hospital;
import org.springframework.context.ApplicationContext;

public class HospitalProxy {
    private ApplicationContext context;

    public void heal() {
        context.getBean(Hospital.class).heal();;
    }

    public void sellNoNeededPharma() {
        context.getBean(Hospital.class).sellNoNeededPharma();
    }
}
