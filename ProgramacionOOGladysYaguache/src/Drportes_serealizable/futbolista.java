
package Drportes_serealizable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class futbolista implements Serializable {
private String nombre;
private String apellido;
private int numero;
private String Posicion;
private double sueldo;
private double asistencia;
private double kmrecorridos;
private int perdida_goles;

    public futbolista(String nombre, String apellido, int numero, String Posicion, double sueldo, int par2, double par3, double par4) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.Posicion = Posicion;
        this.sueldo = sueldo;
        
    }

    public futbolista(double asistencia, double kmrecorridos, int perdida_goles) {
        this.asistencia = asistencia;
        this.kmrecorridos = kmrecorridos;
        this.perdida_goles = perdida_goles;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getAsistencia() {
        return asistencia;
    }

    public double getKmrecorridos() {
        return kmrecorridos;
    }

    public int getPerdida_goles() {
        return perdida_goles;
    }

    public void setAsistencia(double asistencia) {
        this.asistencia = asistencia;
    }

    public void setKmrecorridos(double kmrecorridos) {
        this.kmrecorridos = kmrecorridos;
    }

    public void setPerdida_goles(int perdida_goles) {
        this.perdida_goles = perdida_goles;
    }
    public double porcentajesrendimiento(futbolista obj){
        double ren=obj.getNumero()+obj.getAsistencia()/obj.getPerdida_goles();
        return ren;
    }
       public double porcentajedeEfectividad(futbolista obj){
           double efec = obj.getNumero()+obj.getAsistencia()/obj.getKmrecorridos();
           return efec;
       }
       
 
    public static void main(String[] arg){
        futbolista fut=new futbolista("Simon", "Vargas", 8, "Delantero", 526.89,130,26.36,7894.14);
        futbolista fut2=new futbolista("Andres", "Samaniego", 20, "Defensa", 883.96, 140, 26.36, 7894.14);
        futbolista fut3=new futbolista("Pedro", "Armijos", 1, "Arquero", 728.00, 180, 29.36, 7894.58);
        futbolista fut4=new futbolista("Carlos", "Quintero", 14, "Delantero", 978.23, 1390, 26.36, 7894.58);
        futbolista fut5=new futbolista("Javier", "Masache", 13, "Delantero", 456.25, 120, 26.36, 7894.78);
        List<futbolista>lista=new ArrayList<>();
        lista.add(fut);
        lista.add(fut2);
        lista.add(fut3);
        lista.add(fut4);
        lista.add(fut5);
        
        
        
        
        
    }
}

    