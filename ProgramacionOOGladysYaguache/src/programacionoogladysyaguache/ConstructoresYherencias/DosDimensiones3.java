
package programacionoogladysyaguache.ConstructoresYherencias;


public class DosDimensiones3 {
      private double base;
    private double altura;
    //Métodos de acceso para base y altura

        public double getBase() {
            return base;
        }

        public void setBase(double base) {
            this.base = base;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }
   
    void mostrarDimension(){
        System.out.println("La base y altura es: "+base+" y "+altura);
    }
  
}

