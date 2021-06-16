package org.ufox.demo.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

@Service
@DubboService
public class ServiceBMock implements ServiceB {

    @Override
    public String b(String value) {
        return "call mock b";
    }
}
