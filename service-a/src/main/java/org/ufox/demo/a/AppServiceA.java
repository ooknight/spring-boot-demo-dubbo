package org.ufox.demo.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class AppServiceA {

    public static void main(String[] args) {
        SpringApplication.run(AppServiceA.class, args);
    }
}
