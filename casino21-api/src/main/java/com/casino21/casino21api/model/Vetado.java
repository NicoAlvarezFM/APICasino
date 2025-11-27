package com.casino21.casino21api.model;


public class Vetado {
    private String nombre;
    private String causa;
    private int añosBaneo;

    public Vetado(String nombre, String causa, int añosBaneo) {
        this.nombre = nombre;
        this.causa = causa;
        this.añosBaneo = añosBaneo;
    }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCausa() { return causa; }
    public void setCausa(String causa) { this.causa = causa; }
    public int getAñosBaneo() { return añosBaneo; }
    public void setAñosBaneo(int añosBaneo) { this.añosBaneo = añosBaneo; }
}
