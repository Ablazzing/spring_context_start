package org.example.lesson2.hospital;

import org.example.lesson2.pharmacy.PharmCompany;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example.lesson2.hospital");
        Hospital hospital = context.getBean(Hospital.class);
        hospital.heal();
        Map<String, PharmCompany> beansOfType = context.getBeansOfType(PharmCompany.class);
        beansOfType.get("blendamedPharmCompany").buyPharma(50);

        System.out.println(hospital);

    }
}
