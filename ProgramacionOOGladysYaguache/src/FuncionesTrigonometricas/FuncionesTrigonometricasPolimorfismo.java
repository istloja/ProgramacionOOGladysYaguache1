
package FuncionesTrigonometricas;


public class FuncionesTrigonometricasPolimorfismo {
     public static void main(String[] args) {
        
        double resultado =0;
        double anguloenGrados = 90;
        double angulosenRadianes = Math.toRadians(anguloenGrados);
        
        
        //Cos
        resultado = Math.cos(angulosenRadianes);
        System.out.println("Cos de " + anguloenGrados + "° = " +resultado );
        
        //Sen
        resultado = Math.sin(angulosenRadianes);
        System.out.println("Sen de " + anguloenGrados + "° = " +resultado );
        
         //Tang
        resultado = Math.tan(angulosenRadianes);
        System.out.println("Tang de " + anguloenGrados + "° = " +resultado );
        
    }
    
}


