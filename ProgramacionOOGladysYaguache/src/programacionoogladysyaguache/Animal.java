
package programacionoogladysyaguache;


public class Animal {
private String nombre;
private double peso;
private double edad;
private double altura;
private String color;

// constructor no es tipo void ni dato  sirve para inicalizar valores y atributos de un objeto un constructor siempre tiene el nombre de la clase 

    public Animal(String nombre, double peso, double edad, double altura, String color) {
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
        this.altura = altura;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
   public void  alimentarse (){
       System.out.println("soy"+nombre+" y me alimento");
       
    }
  
public String informacionAnimal(){
    String cadena ="Soy  "+ nombre+"mi peso es"+peso+" y mi color es"+color+"";
    return cadena;
}
}
// set valor a una sola variable
    // get sirve para inicializar una variable
   