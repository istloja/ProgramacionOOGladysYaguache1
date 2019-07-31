package Metodos;

import java.util.Scanner;

public class Metodos {

    public double calcular_edad(double edad, int fechaActual) {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento");
        double nacimiento = dato.nextDouble();
        return 0;

    }

    public double CalcularHipotenusa(double catetoopuesto, double catetoadyacente) {
        double hipotenusa = Math.sqrt(Math.pow(catetoopuesto, 2) + Math.pow(catetoadyacente, 2));
        return hipotenusa;
    }

    public String edad(int edad) {
        if (edad >= 18) {
            return "Es mayor de edad";
        } else {
            return "no es mayor de edad";
        }
    }

    public double calcularIva(boolean iva, double precio) {

        if (iva == true) {

            double total = precio * 0.12;
            total = total + precio;
            return total;
        } else {
            return precio;

        }
    }
    public boolean Aprobar (double nota, int porcentajefaltas){
    if (nota>=7 && porcentajefaltas <20){
    return true; }
    else{
    return false;
    }
    }
    
    
    
    
}
