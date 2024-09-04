package com.alpha.pokedex.service.impl;

import com.alpha.pokedex.client.PokemonClient;
import com.alpha.pokedex.service.HomeService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class HomeServiceImpl implements HomeService {
    private final PokemonClient pokemonClient;
    public HomeServiceImpl(PokemonClient pokemonClient) {
        this.pokemonClient = pokemonClient;
    }

    @Override
    public Mono<String> getPokemonDetails(String id) {
        return pokemonClient.getPokemonDetails(id);
    }
}
