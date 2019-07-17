
package ConvercionDePresion;

import java.util.Scanner;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Presionn {
private double numero;


    public Presionn (double numero) {
        this.numero = numero;
    }

   

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

 

   
   
public void LeerNumero(){
    Scanner dato = new Scanner (System.in); 
    System.out.println("Ingrese el numero para realiza la conversion");
    numero = dato.nextDouble();
   
  }
public double Conversionpascal (){
double pascal = numero*101325;
return pascal;   
}
public double Conversionbar (){
double Bar = numero*1.01325;
return Bar;   
}
public double Conversionkgm2 (){
double kgm = numero*10332.274527999;
return kgm;   
}
public double Conversionhectopascal (){
double hectopascal  = numero*1013.25;
return hectopascal;   
}
public double Conversionmilibar (){
double Milibar = numero*1013.25;
return Milibar;   
}
public double Conversionmetro2H2O (){
double metroagua = numero*10332.274527999;
return numero;   
}

public static void main(String[] args) {
    Presionn objeto = new Presionn(0);
    objeto.LeerNumero();
    int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Conversor de Unidades de Presion\n\n"
            +"1)Pascal\n"
            + "2)Bar\n"
            + "3)Kilogramo por metro cuadrado\n"
            + "4)Hectopascal\n"
            + "5)milibar\n"
            + "6)metro cuadrado de agua\n"));  
    switch (opcion){
        case 1: 
            System.out.println(objeto.Conversionpascal());
        break;
        case 2: 
            System.out.println(objeto.Conversionbar());
        break;
        case 3: 
            System.out.println(objeto.Conversionkgm2());
        break;
        case 4: 
            System.out.println(objeto.Conversionhectopascal());
        break;    
        case 5: 
            System.out.println(objeto.Conversionmilibar());
        break;    
        case 6: 
            System.out.println(objeto.Conversionmetro2H2O());
        break;
        default : System.out.println("Seleccione una opcionvalida");      
            
            
    } 
            
            
            


}    

}

