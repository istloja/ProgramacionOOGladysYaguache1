/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DEBER3;

import java.util.Scanner;

/**
 *
 * @author HOGAR
 */
public class Fracciones {
     private int numerador;
     private int denominador;

    public Fracciones() {
    }

     
    public Fracciones(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
        
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    public static void main(String[]args){
        Scanner dato= new Scanner(System.in);
        Fracciones  objeto = new Fracciones();
        System.out.println("Ingrese el primer numero: ");
        objeto.getNumerador();
        System.out.println("Ingrese el denominador: ");
        objeto.getDenominador();
       
    }
}
    
