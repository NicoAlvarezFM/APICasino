package com.casino21.casino21api.controller;

import com.casino21.casino21api.model.Juego;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Arrays;

@RestController
@CrossOrigin(origins = "*")
public class JuegoController {

    @GetMapping("/api/juegos")
    public List<Juego> getJuegos() {
        return Arrays.asList(
            new Juego(1L, "Blackjack", "Juego de cartas clásico"),
            new Juego(2L, "Ruleta", "Apuesta a un número y gana"),
            new Juego(3L, "Poker", "El mejor juego de estrategia")
        );
    }
}
