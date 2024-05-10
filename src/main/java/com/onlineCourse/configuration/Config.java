package com.onlineCourse.configuration;

import com.stripe.Stripe;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class Config {
    @Value("${stripe.api.secretKey}")
    private String secretKey;

    @PostConstruct
    public void  initSecretKey(){
        Stripe.apiKey = secretKey;
    }
}