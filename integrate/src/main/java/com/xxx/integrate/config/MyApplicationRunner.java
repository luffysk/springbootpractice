package com.xxx.integrate.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
@Component
@Order(1)
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<String> nonOptionArgs =  args.getNonOptionArgs();
        Set<String> optionNames = args.getOptionNames();
        String[] sourceArgs = args.getSourceArgs();
    }
}
