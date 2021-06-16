package org.ufox.demo.b.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDubbo(scanBasePackages = "org.ufox.demo.b.service.impl")
public class AppConfig {
}
