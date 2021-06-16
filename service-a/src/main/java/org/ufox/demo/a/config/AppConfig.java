package org.ufox.demo.a.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDubbo(scanBasePackages = "org.ufox.demo.a.service.impl")
public class AppConfig {
}
