package com.example.gtserverside.auth.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GTAuthService {

    public Mono<String> forTryLogin(){

        return Mono.just("hi");
    }

}
