
package programacionoogladysyaguache;



public class Mamifero extends Animal{
private int  tiempogestacion ;
public boolean sangrecaliente;

    public Mamifero(int tiempogestacion, boolean sangrecaliente, String nombre, double peso, double edad, double altura, String color) {
        super(nombre, peso, edad, altura, color);
        this.tiempogestacion = tiempogestacion;
        this.sangrecaliente = sangrecaliente;
    }

    public int getTiempogestacion() {
        return tiempogestacion;
    }

    public void setTiempogestacion(int tiempogestacion) {
        this.tiempogestacion = tiempogestacion;
    }

    public boolean isSangrecaliente() {
        return sangrecaliente;
    }

    public void setSangrecaliente(boolean sangrecaliente) {
        this.sangrecaliente = sangrecaliente;
    }
}


    

   

    
   

   
    
  

