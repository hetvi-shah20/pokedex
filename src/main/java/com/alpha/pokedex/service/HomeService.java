package com.alpha.pokedex.service;

import reactor.core.publisher.Mono;

public interface HomeService {

    Mono<String> getPokemonDetails(String id);
}
