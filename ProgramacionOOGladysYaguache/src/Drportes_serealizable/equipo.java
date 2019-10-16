
package Drportes_serealizable;

import java.io.Serializable;


public class equipo implements Serializable {
  

    private String nombre;
    private String color;
    private int numero_jugador;
    private String director;
    private int titulos; 
    private int pases;
    private String asistencia;
    private double kmrecorridos;
    private int perdidas_goles;
    private futbolista futbolista;
    
    public equipo(String ganadores, String azul, int par, String jesus_Silva,int titulos, futbolista futbolista1) {
    }

    public equipo(String nombre, String color, int numero_jugador, String director) {
        this.nombre = nombre;
        this.color = color;
        this.numero_jugador = numero_jugador;
        this.director = director;
    }

    public equipo(int titulos) {
        this.titulos = titulos;
    }

    public equipo(futbolista futbolista) {
        this.futbolista = futbolista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumero_jugador() {
        return numero_jugador;
    }

    public void setNumero_jugador(int numero_jugador) {
        this.numero_jugador = numero_jugador;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public futbolista getFutbolista() {
        return futbolista;
    }

    public void setFutbolista(futbolista futbolista) {
        this.futbolista = futbolista;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }
    
    public static void main(String[] args) {
    equipo obj = new equipo ("ganadores","azul", 18, "jesus Silva",23, new futbolista("Simon", "Vargas", 8, "Delantero", 526.89, 130, 26.36, 7894.14));
    }
}