package org.ufox.demo.b.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;
import org.ufox.demo.service.ServiceB;

@Service
@DubboService
public class SimpleServiceB implements ServiceB {

    @Override
    public String b(String value) {
        return "call service b:" + value;
    }
}
