package com.casino21.casino21api.model;

import java.util.List;


public class Juego {
    private Long id;
    private String nombre;
    private String descripcion;
    private int jugadores;
    private double dineroMovido;
    private String estado;
    private String tipo;
    private String descripcionCorta;
    private double winrate;
    private List<Vetado> vetados;
    private double ultimoJackpot;
    private String nota;

    public Juego(Long id, String nombre, String descripcion, int jugadores, double dineroMovido, String estado, String tipo, String descripcionCorta, double winrate, List<Vetado> vetados, double ultimoJackpot, String nota) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.jugadores = jugadores;
        this.dineroMovido = dineroMovido;
        this.estado = estado;
        this.tipo = tipo;
        this.descripcionCorta = descripcionCorta;
        this.winrate = winrate;
        this.vetados = vetados;
        this.ultimoJackpot = ultimoJackpot;
        this.nota = nota;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public int getJugadores() { return jugadores; }
    public void setJugadores(int jugadores) { this.jugadores = jugadores; }
    public double getDineroMovido() { return dineroMovido; }
    public void setDineroMovido(double dineroMovido) { this.dineroMovido = dineroMovido; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getDescripcionCorta() { return descripcionCorta; }
    public void setDescripcionCorta(String descripcionCorta) { this.descripcionCorta = descripcionCorta; }
    public double getWinrate() { return winrate; }
    public void setWinrate(double winrate) { this.winrate = winrate; }
    public List<Vetado> getVetados() { return vetados; }
    public void setVetados(List<Vetado> vetados) { this.vetados = vetados; }
    public double getUltimoJackpot() { return ultimoJackpot; }
    public void setUltimoJackpot(double ultimoJackpot) { this.ultimoJackpot = ultimoJackpot; }
    public String getNota() { return nota; }
    public void setNota(String nota) { this.nota = nota; }
}
