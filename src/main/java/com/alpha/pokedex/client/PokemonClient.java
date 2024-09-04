package com.alpha.pokedex.client;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Component
public class PokemonClient {
    private final WebClient webClient;

    public PokemonClient(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<String> getPokemonDetails(String id){
        Mono<String> pokemonDetails =  webClient
                .get()
                .uri("https://pokeapi.co/api/v2/pokemon/" + id + "/").retrieve().bodyToMono(String.class);;
        return pokemonDetails;
    }
}
