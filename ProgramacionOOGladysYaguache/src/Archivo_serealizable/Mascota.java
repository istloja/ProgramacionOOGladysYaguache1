
package Archivo_serealizable;

import java.io.Serializable;


public class Mascota implements Serializable {
    
   private String Nombre;
   private int Numero_de_patas;

    public Mascota(String Nombre, int Numero_de_patas) {
        this.Nombre = Nombre;
        this.Numero_de_patas = Numero_de_patas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNumero_de_patas() {
        return Numero_de_patas;
    }

    public void setNumero_de_patas(int Numero_de_patas) {
        this.Numero_de_patas = Numero_de_patas;
    }
   
}
