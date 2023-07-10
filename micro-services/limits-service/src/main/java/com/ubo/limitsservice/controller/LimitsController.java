package com.ubo.limitsservice.controller;

import com.ubo.limitsservice.bean.Limits;
import com.ubo.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    Configuration configuration;
    @GetMapping("/limits")
    public Limits retrieveLimits()
    {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }

}