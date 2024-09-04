package com.alpha.pokedex.controller;

import com.alpha.pokedex.service.HomeService;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HomeController {
    private final HomeService homeService;
    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping("/get-pokemon-details/{id}")
    public Mono<String> getPokemonDetails(@PathVariable String id) throws JsonProcessingException {
        return homeService.getPokemonDetails(id);
    }
}
