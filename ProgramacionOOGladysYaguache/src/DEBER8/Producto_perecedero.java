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
public class Producto_perecedero extends Productos {
     private int dias_para_caducar;
     
    public Producto_perecedero(int dias_para_caducar, String nombre, double precio){
        super(nombre, precio);
        this.dias_para_caducar = dias_para_caducar;
         
    }
 
    @Override
    public String toString() {
        return "Producto_perecedero{" + "dias_para_caducar=" + dias_para_caducar + '}';
    }
 
    public int getDias_para_caducar() {
        return dias_para_caducar;
    }
 
    public void setDias_para_caducar(int dias_para_caducar) {
        this.dias_para_caducar = dias_para_caducar;
    }
     
    double  precio_total = 0;
    public double calcular(int cantidad_productos){
        System.out.println("Perecedero");
        double  precio_final = super.calcular(cantidad_productos);
        System.out.println("Precio total:"+precio_final +" \n descuento por caducidad...");
        if(getDias_para_caducar() == 1){
            precio_total = precio_final - (precio_final / 4);
            setPrecio(precio_total);
            }else if(getDias_para_caducar() == 2){
            precio_total = precio_final - (precio_final / 3);
            setPrecio(precio_total);
        }else if(getDias_para_caducar() == 3){
            precio_total = precio_final - (precio_final / 2);
            setPrecio(precio_total);
        }
        return precio_total;
    }
    
}
