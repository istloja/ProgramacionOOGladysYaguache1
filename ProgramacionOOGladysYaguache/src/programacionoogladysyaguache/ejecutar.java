/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionoogladysyaguache;

/**
 *
 * @author HOGAR
 */
public class ejecutar {
    public static void main(String[] args) {
      Animal objetoanimal=new Animal("perro", 20, 6, 50, "blanco");
      Aves objeto2= new Aves(4, true, "Aguila",4.2, 4, 0.35,"blanco");
      Mamifero objeto3 = new Mamifero(5, true,"vaca", 50, 5, 1.80,"negra");
      objetoanimal.alimentarse();
      objeto2.alimentarse();
      objeto3.alimentarse();
     String Dato= objetoanimal.informacionAnimal();
     // un String sin un mesnaje no puede salir 
        System.out.println(objetoanimal.informacionAnimal());
      
}
    
}