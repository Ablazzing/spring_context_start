package org.example.lesson1.storage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.storage")
public class StorageConfig {

    @Bean
    public WorkerImpl ivan() {
        return new WorkerImpl("Иваныч");
    }

    @Bean
    public WorkerImpl petr() {
        return new WorkerImpl("Петрович");
    }
}
