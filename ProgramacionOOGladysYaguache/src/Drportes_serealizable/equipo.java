
package Drportes_serealizable;

import java.io.Serializable;


public class equipo implements Serializable {
     private String nombre;
    private String color;
    private int numero_jugador;
    private String director;
    private futbolista futbolista;
    public equipo(String ganadores, String azul, int par, String carlos_Silva, futbolista futbolista1) {
    }

    public equipo(String nombre, String color, int numero_jugador, String director) {
        this.nombre = nombre;
        this.color = color;
        this.numero_jugador = numero_jugador;
        this.director = director;
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
    
    public static void main(String[] args) {
    equipo obj = new equipo ("ganadores","azul", 17, "Juan Calle", new futbolista("Pedro", "Vaca", 9, "Delantero", 432.89));
    }
    
}
