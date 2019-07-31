/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DEBER2;

import java.util.Scanner;

/**
 *
 * @author HOGAR
 */
public class ejecutar {
    public static void main(String[] args) {

       System.out.println("Por favor ingrese su nombre");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.next();
        System.out.println("Edad");
        int edad = entrada.nextInt();
        System.out.println("Sexo");
        String sexo = entrada.next();
        System.out.println("Peso");
        double peso = entrada.nextDouble();
        System.out.println("Altura");
        double altura = entrada.nextDouble();

        Persona persona = new Persona(nombre, edad, sexo, peso, altura);
        System.out.println(persona.calcularIMC());
        System.out.println(persona.esMayorDeEdad());
    }

}
       

    

