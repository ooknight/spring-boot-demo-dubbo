package org.ufox.demo.b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class AppServiceB {

    public static void main(String[] args) {
        SpringApplication.run(AppServiceB.class, args);
    }
}
