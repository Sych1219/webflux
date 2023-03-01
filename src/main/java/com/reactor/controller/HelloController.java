package com.reactor.controller;

import com.reactor.model.HelloDTO;
import com.reactor.services.HelloServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class HelloController {
    @Autowired
    private HelloServices helloServices;

    @GetMapping("/hello")
    public Mono<String> hello() {
        return helloServices.getHello();
    }

    @GetMapping("/helloFlux")
    public Flux<String> getHelloFlux() {
        return helloServices.getHelloFlux();
    }

    @GetMapping("/helloDTOFlux")
    public Flux<HelloDTO> getHelloDTOFlux() {
        return helloServices.getHelloDTOFlux();
    }
}
