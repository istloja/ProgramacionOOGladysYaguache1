
package programacionoogladysyaguache.ConstructoresYherencias;


public class Triangulo2 extends DosDimensiones2{
    
    class Triangulo extends DosDimensiones{
    String estilo;
    double area(){
        return base*altura/2; //Error! no se puede acceder
    }
    void mostrarEstilo(){
        System.out.println("Triangulo es: "+estilo);
    }
}
}
