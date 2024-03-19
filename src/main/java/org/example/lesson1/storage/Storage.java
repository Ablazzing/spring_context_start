package org.example.lesson1.storage;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Storage {

    private Worker worker;
    private Manager manager;
    private Security security;

    public Storage(@Qualifier("petr") Worker worker, Manager manager, Security security) {
        this.manager = manager;
        this.security = security;
        this.worker = worker;
    }

    //Создать склад. На складе работник, охранник и менеджер.
    //Склад имеет функцию принять товар.
    //Менеджер подгоняет работника по имени, во время разгрузки.
    //Работник разгружает товар (по факту просто выкидывает из тары)
    //Охранник при каждой погрузке, восклицает: я в шоке!
    public void takeItems(List<Item> items) {
        manager.goWorker();
        worker.throwItems(items);
        security.speak();
    }
}
