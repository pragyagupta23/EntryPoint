package com.pragyagupta.entrypoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableTransactionManagement
@EnableScheduling

public class EntryPointApplication {

    public static void main(String[] args) {
        System.out.println("=== DEBUG MONGODB_URI: [" + System.getenv("MONGODB_URI") + "] ===");
        SpringApplication.run(EntryPointApplication.class, args);
    }

    @Bean
    public PlatformTransactionManager xyz(MongoDatabaseFactory dbFactory){
        return new MongoTransactionManager(dbFactory);
    }
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
        
    }


}