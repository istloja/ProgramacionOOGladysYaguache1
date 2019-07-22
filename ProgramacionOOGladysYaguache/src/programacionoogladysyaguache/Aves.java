
package programacionoogladysyaguache;


public class Aves extends Animal {
private int numero_huevos ;
public boolean vuela;

    public Aves(int numero_huevos, boolean vuela, String nombre, double peso, double edad, double altura, String color) {
        super(nombre, peso, edad, altura, color);
        this.numero_huevos = numero_huevos;
        this.vuela = vuela;
    }

    public int getNumero_huevos() {
        return numero_huevos;
    }

    public void setNumero_huevos(int numero_huevos) {
        this.numero_huevos = numero_huevos;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

   
}