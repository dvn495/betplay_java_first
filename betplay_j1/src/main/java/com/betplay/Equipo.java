package com.betplay;

public class Equipo {
    String name;
    int partidos_jugados = 0;
    int partidos_ganados = 0;
    int partidos_perdidos = 0;
    int partidos_empatados = 0;
    int goles_favor = 0;
    int goles_contra = 0;
    int total_puntos = 0;

    public Equipo(){
        
    }

    public Equipo(String name, int partidos_jugados, int partidos_ganados, int partidos_perdidos, int partidos_empatados, int goles_favor, int goles_contra, int total_puntos) {
        this.name = name;
        this.partidos_jugados = partidos_jugados;
        this.partidos_ganados = partidos_ganados;
        this.partidos_perdidos = partidos_perdidos;
        this.partidos_empatados = partidos_empatados;
        this.goles_favor = goles_favor;
        this.goles_contra = goles_contra;
        this.total_puntos = total_puntos;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    

}
