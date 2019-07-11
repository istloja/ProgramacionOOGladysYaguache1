
package programacionoogladysyaguache.ConstructoresYherencias;


public class DosDimensiones4 {
    
     private double base;
    private double altura;
   //Métodos de acceso para base y altura
    public double getBase (){
            return base;}
   public  double getAltura(){
       return altura;}
   public void setBase(double b){base=b;}
    public void setAltura (double h){altura=h;}
    void mostrarDimension(){
        System.out.println("La base y altura es: "+base+" y "+altura);
    }
}
