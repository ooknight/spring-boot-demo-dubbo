package org.ufox.demo.a.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;
import org.ufox.demo.service.ServiceA;

@Service
@DubboService
public class SimpleServiceA implements ServiceA {

    @Override
    public String a(String value) {
        return "call service a:" + value;
    }
}
