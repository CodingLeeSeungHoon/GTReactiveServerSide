package com.example.gtserverside.auth.controller;

import com.example.gtserverside.auth.service.GTAuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Slf4j
@RestController
public class GTAuthController {

    private final GTAuthService authService;

    @GetMapping("/hello")
    public Flux<String> hello(){
        return Flux.just("hello", "world!");
    }

    @GetMapping("/")
    public Mono<String> loginToGodTong(){
        return authService.forTryLogin();
    }
}
