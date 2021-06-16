package org.ufox.demo.consumer.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ufox.demo.service.ServiceA;
import org.ufox.demo.service.ServiceB;

@RestController
public class DemoController {

    @DubboReference(check = false, mock = "return null")
    private ServiceA serviceA;

    @DubboReference(check = false, mock = "true")
    private ServiceB serviceB;

    @GetMapping("/demo1")
    public String demo1() {
        return serviceA.a("a");
    }

    @GetMapping("/demo2")
    public String demo2() {
        return serviceB.b("b");
    }

    @GetMapping("/demo")
    public String demo() {
        return "ok";
    }
}
