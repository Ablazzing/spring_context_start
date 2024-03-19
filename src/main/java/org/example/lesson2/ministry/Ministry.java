package org.example.lesson2.ministry;

import org.example.lesson2.hospital.Hospital;
import org.example.lesson2.pharmacy.PharmCompany;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Ministry {
    private ApplicationContext context;

    @PostConstruct
    public void init() {
        System.out.println("Министерство создано!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Министерство удаляются отсюда");
    }

    public Ministry(ApplicationContext context) {
        this.context = context;
    }

    public void stat() {
        int pharmCompaniesCount = context.getBeansOfType(PharmCompany.class).size();
        int hospitalCount = context.getBeansOfType(Hospital.class).size();
        System.out.printf(
                """
                    Количество фарм компаний - %s
                    Количество госпиталей - %s
                """, pharmCompaniesCount, hospitalCount);
    }
}
