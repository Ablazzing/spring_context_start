package org.example.lesson2.hospital;

import org.example.lesson2.pharmacy.PharmCompany;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Hospital {
    private int income = 0;
    private int outcome = 0;
    private List<PharmCompany> pharmCompanies;

    public Hospital(List<PharmCompany> pharmCompanies) {
        this.pharmCompanies = pharmCompanies;
    }

    public void heal() {
        pharmCompanies.forEach(PharmCompany::sellPharma);
        outcome += 100;
        System.out.println("Лечим людей");
    }

    public void sellNoNeededPharma() {
        this.income += 50;
    }

    @Override
    public String toString() {
        return "Hospital{" +
               "income=" + income +
               ", outcome=" + outcome +
               '}';
    }
}
