/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DEBER8;

/**
 *
 * @author HOGAR
 */
public class Productos {
   private String Nombre;
  private double Precio;

    public Productos() {
    }

  
  public Productos(String Nombre, double Precio) {
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "productos{" + "Nombre=" + Nombre + ", Precio=" + Precio + '}';
    }
   public double calcular(int cantidad_Productos){
         
        double fin = Precio * cantidad_Productos;
        setPrecio(fin);
        return fin;
    }
    
}
