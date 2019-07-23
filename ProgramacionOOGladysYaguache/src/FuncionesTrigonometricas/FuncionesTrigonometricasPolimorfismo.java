
package FuncionesTrigonometricas;


public class FuncionesTrigonometricasPolimorfismo {
     public static void main(String[] args) {
        
        double result =0;
        double anguloenGrados = 90;
        double angulosenRadianes = Math.toRadians(anguloenGrados);
        
        
        //Cos
        result = Math.cos(angulosenRadianes);
        System.out.println("Cos de " + anguloenGrados + "° = " +result );
        
        //Sen
        result = Math.sin(angulosenRadianes);
        System.out.println("Sen de " + anguloenGrados + "° = " +result );
        
         //Tang
        result= Math.tan(angulosenRadianes);
        System.out.println("Tang de " + anguloenGrados + "° = " +result );
        
    }
    
}


