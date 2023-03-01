package com.reactor.services;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class HelloServices {

    public Mono<String> getHello() {
        return Mono.just("Hello, World!");
    }
}
