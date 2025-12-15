package com.casino21.casino21api.controller;

import com.casino21.casino21api.model.Juego;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.casino21.casino21api.model.Vetado;

@RestController
@CrossOrigin(origins = "*") // permite que cualquier sitio web pueda consumir este endpoint
public class JuegoController {
    private final List<Juego> juegos = new ArrayList<>(Arrays.asList(
        new Juego(1L, "Blackjack", "Juego de cartas clásico", 500, 150000.0, "Activo", "Cartas", "Juego rápido y popular de casino", 48.5,
            Arrays.asList(
                new Vetado("Nicolás Álvarez", "Contó cartas y usó programas externos", 30)
            ),
            2500000.0, "Valores obtenidos de los últimos 7 días"),
        new Juego(2L, "Ruleta", "Apuesta a un número y gana", 200, 80000.0, "Próximamente", "Mesa", "Gira la ruleta y prueba tu suerte", 36.0,
            Arrays.asList(
                new Vetado("Nicolás Álvarez", "Intentó explotar un bug en la ruleta online", 15)
            ),
            1750000.0, "Valores obtenidos de versión beta"),
        new Juego(3L, "Poker", "El mejor juego de estrategia", 350, 120000.0, "Próximamente", "Cartas", "Estrategia y habilidad en cada mano", 22.7,
            Arrays.asList(
                new Vetado("Felipe Álvarez", "Colusión con otros jugadores y uso de señas", 20),
                new Vetado("Olga Fuentes", "Intentó sobornar al crupier y uso de cartas marcadas", 25)
            ),
            5000000.0, "Valores obtenidos de versión beta")
    ));

    @GetMapping("/api/juegos")
    public List<Juego> getJuegos() {
        return juegos;
    }

    @PostMapping("/api/juegos")
    public Juego crearJuego(@RequestBody Juego juego) {
        long nuevoId = juegos.stream().mapToLong(Juego::getId).max().orElse(0L) + 1;
        juego.setId(nuevoId);
        juegos.add(juego);
        return juego;
    }

    @PutMapping("/api/juegos/{id}")
    public Juego actualizarJuego(@PathVariable Long id, @RequestBody Juego juegoActualizado) {
        for (int i = 0; i < juegos.size(); i++) {
            if (juegos.get(i).getId().equals(id)) {
                juegoActualizado.setId(id);
                juegos.set(i, juegoActualizado);
                return juegoActualizado;
            }
        }
        throw new NoSuchElementException("Juego no encontrado");
    }

    @DeleteMapping("/api/juegos/{id}")
    public String eliminarJuego(@PathVariable Long id) {
        Juego juego = juegos.stream().filter(j -> j.getId().equals(id)).findFirst().orElse(null);
        if (juego == null) {
            return "Juego no encontrado";
        }
        if ("Blackjack".equalsIgnoreCase(juego.getNombre())) {
            return "No se puede eliminar el juego Blackjack";
        }
        juegos.remove(juego);
        return "Juego eliminado";
    }
}
