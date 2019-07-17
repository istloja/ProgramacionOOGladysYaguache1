
package ConvercionDePresion;


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
    Scanner entrada = new Scanner (System.in); 
    System.out.println("Ingrese el numero para realiza la conversion");
    numero = entrada.nextDouble();
   
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
public double  ConversiommHg(){
double mmHg = numero*760.00210017852;
return mmHg;
}
public double ConversionTorr(){
 double Torr = numero*760.00210017852;
 return Torr;
}
public static void main(String[] args) {
    Presionn objeto = new Presionn(0);
    objeto.LeerNumero();
    int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "conversor de Unidades de presion \n\n")
            +"1)Pascal\n"
            + "2)Bar\n"
            + "3)Kilogramo por metro cuadrado\n"
            + "4)Hectopascal\n"
            + "5)milibar\n"
            + "6)metro cuadrado de agua\n"
            + "7)mmHg\n"
            +"8) Torr\n");       
            
            
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
        case 7:
            System.out.println(objeto.ConversiommHg());
        break;
        case 8:
        System.out.println(objeto.ConversionTorr());
        
        break;
        default : System.out.println("Seleccione una opcionvalida");      
            
    }      
    }

}  



