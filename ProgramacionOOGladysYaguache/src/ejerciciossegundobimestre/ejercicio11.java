
package ejerciciossegundobimestre;


public class ejercicio11 {
    public static void imprimirRepetidos(long number) {
        int[] contador = new int[10]; // cuenta la cantidad de apariciones de cada digito
        int digito;
        while (number > 0) {
            digito = (int) (number % 10);
            contador[digito]++;
            number /= 10;
        }
        for (digito = 0; digito < 10; digito++) {
            if (contador[digito] > 1) {
                System.out.println("El digito " + digito + " se repite " + contador[digito] + " veces");
            }
        }
    }

}
    
