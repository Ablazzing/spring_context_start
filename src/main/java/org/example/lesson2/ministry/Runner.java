package org.example.lesson2.ministry;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                "org.example.lesson2.hospital",
                "org.example.lesson2.ministry"
        );
        Ministry ministry = context.getBean(Ministry.class);
        ministry.stat();
        context.close();
    }
}
