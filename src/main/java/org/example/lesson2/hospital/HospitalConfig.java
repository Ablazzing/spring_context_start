package org.example.lesson2.hospital;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@Import(PharmCompany.class)
@ComponentScan(basePackages = "org.example.lesson2.pharmacy")
public class HospitalConfig {
}
