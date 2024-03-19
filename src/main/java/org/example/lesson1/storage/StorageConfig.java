package org.example.storage;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
