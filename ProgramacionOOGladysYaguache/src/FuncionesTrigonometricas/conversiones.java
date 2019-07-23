
package FuncionesTrigonometricas;


public class conversiones {
     public static void main(String[] args) {
        double anguloEnGrados = 90;
        
        double anguloEnRadianes = Math.toRadians(anguloEnGrados);
         System.out.println("De grados a Radianes" + anguloEnGrados + "° = " + anguloEnRadianes + "rad");
         
        anguloEnGrados = Math.toRadians(anguloEnRadianes);
         System.out.println("Radianes a Grados" + anguloEnRadianes + "rad = " + anguloEnGrados + "°");
         
    }
    
}

    

