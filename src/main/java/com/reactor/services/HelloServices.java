package com.reactor.services;

import com.reactor.model.HelloDTO;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class HelloServices {

    public Mono<String> getHello() {
        return Mono.just("Hello, World!");
    }

    public Flux<String> getHelloFlux() {
        return Flux.just("Hello, World!","hello 2","hello 3");
    }

    public Flux<HelloDTO> getHelloDTOFlux() {
        HelloDTO helloDTO = new HelloDTO();
        helloDTO.setName("name");
        helloDTO.setMessage("message");
        helloDTO.setStatus("status");

        HelloDTO helloDTO2 = new HelloDTO();
        helloDTO2.setName("name2");
        helloDTO2.setMessage("message2");
        helloDTO2.setStatus("status2");

        return Flux.just(helloDTO,helloDTO2);
    }
}
