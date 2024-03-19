package org.example.storage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        //Создать склад. На складе работник, охранник и менеджер.
        //Склад имеет функцию принять товар.
        //Менеджер подгоняет работника по имени, во время разгрузки.
        //Работник разгружает товар (по факту просто выкидывает из тары)
        //Охранник при каждой погрузке, восклицает: я в шоке!
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example.storage");
        Storage storage = context.getBean(Storage.class);
        List<Item> items = List.of(
                new Item("Tv"),
                new Item("Phone")
        );
        storage.takeItems(items);
    }
}
