
package Archivo_serealizable;

import java.io.Serializable;


public class Persona implements Serializable {
    private String Nombre;
    private String Apellido;
    private int edad;
    private Mascota mascota;

    public Persona(String Nombre, String Apellido, int edad, Mascota mascota) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.edad = edad;
        this.mascota = mascota;//objeto de tipo mascota
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
    public static void main(String[] args) {
        Persona obj = new Persona("Gladys","Yaguache",22,new Mascota("Tarzan",4));
        Mascota masc=new Mascota("Tarzan",4);//variable
        Persona obj2 =new Persona("Cynthia","Yaguache",20,new Mascota("luna",4));
        System.out.println("la mascota de"+obj.getNombre()+"Se llama"+obj.getMascota().getNombre());
        
    }
    
}
