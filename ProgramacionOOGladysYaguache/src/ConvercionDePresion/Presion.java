
package ConvercionDePresion;
import java.util.Scanner;

public class Presion {
    
public double Fuerza;
public double Area;
public double Presion;
public double Superficie;

    public double getSuperficie() {
        return Superficie;
    }

    public void setSuperficie(double Superficie) {
        this.Superficie = Superficie;
    }
    public double getFuerza() {
        return Fuerza;
    }

    public void setFuerza(double Fuerza) {
        this.Fuerza = Fuerza;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }

    public double getPresion() {
        return Presion;
    }

    public void setPresion(double Presion) {
        this.Presion = Presion;
    }
 public void LeerCantidad(){
    Scanner entrada  = new Scanner (System.in); 
    System.out.println("Ingrese Fuerza en Newton");
    Fuerza = entrada.nextDouble();
    System.out.println("Ingrese area en metros cuadrados");    
    Area = entrada.nextDouble();
  }
public double CalcularFuerza (){
Presion = Fuerza/Area;
return Presion;   
}
public void mostrarfuerza (){
    System.out.println("El valor de la presion es: "+Presion);
}

public static void main(String[] args) {
Presion objeto = new Presion();

objeto.LeerCantidad();
objeto.CalcularFuerza();
objeto.mostrarfuerza();
}     

}
