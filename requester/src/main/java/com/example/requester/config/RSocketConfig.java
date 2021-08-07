package com.example.requester.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.rsocket.RSocketRequester;

@Configuration
public class RSocketConfig {

    @Bean
    RSocketRequester rSocketRequesterConfig(RSocketRequester.Builder builder) {
        return builder.tcp("localhost", 9091);
    }
}
