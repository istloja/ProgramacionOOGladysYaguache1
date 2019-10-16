
package ejerciciossegundobimestre;


public class ejercicio8 {
 
    public int numerodepalabras(String cadena) {
        String caracter = "a";
        int numeroveces = 0;
        String palabras[] = cadena.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].contains(caracter)) {
                numeroveces++;
            }
        }
        return numeroveces;
    }

    public static void main(String[] args) {
        ejercicio8 Ale = new ejercicio8();

        System.out.println(Ale.numerodepalabras("pro gra mar r"));
    }
}
    

