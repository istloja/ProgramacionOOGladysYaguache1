
package Archivo_serealizable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;


public class LeerYescribir {
    public void escribirArchivo(String rutaArchivo,Persona persona){
        try {
         ObjectOutputStream ejemplo = new ObjectOutputStream(new FileOutputStream(rutaArchivo)); 
         ejemplo.writeObject(persona);
         ejemplo.close();//cerrar objeto
        } catch (Exception e) {
            System.out.println("Error"+ e);
            
        }

}
       public void leerArchivo(String rutaArchivo){
           try {
               ObjectInputStream leer = new ObjectInputStream(new FileInputStream(rutaArchivo));
               Object auxiliar =leer.readObject();
             
               while (auxiliar != null){
              Persona persona = (Persona) auxiliar;
              System.out.println(persona.getMascota().getNombre());
                   auxiliar = leer.readObject();
               }
               
          } catch (Exception e) {
               System.out.println("Error"+ e);
           }
               
           }
       public void EscribirLista(String direccion_archivo, List<Persona>listaPersona){
           try {
               ObjectOutputStream leer = new ObjectOutputStream( new FileOutputStream(direccion_archivo));
               for (Persona persona: listaPersona)
                   leer.writeObject(persona);
           } catch (Exception e) {
           }
       }
       public  List<Persona>lista(String direccion){
           List<Persona>lista=new ArrayList<Persona>();
           try {
             ObjectInputStream leer = new ObjectInputStream(new FileInputStream(direccion));
           
             Object auxiliar= leer.readObject();
             while (auxiliar!=null){
                 Persona persona = (Persona)auxiliar;
             lista.add(persona);
               auxiliar=leer.readObject();
             }
           } catch (Exception e) {
           }
         return lista;
       }
       public static void main(String[] args) {
        LeerYescribir obj = new LeerYescribir();
        Persona obj1 = new Persona("Gladys","Yaguache",22,new Mascota("Tarzan",4));
//        obj.escribirArchivo("C:\\Users\\HOGAR\\Desktop\\clasesarchivos.txt", obj1);
//        obj.leerArchivo("C:\\Users\\HOGAR\\Desktop\\clasesarchivos.txt");
         Persona obj2 = new Persona("Fernanda","Garcia",19, new Mascota("Samy",4));
         Persona obj3 = new Persona("Pablo","Abrigo",20, new Mascota("Odie",4));
         Persona obj4 = new Persona("Lorena","Yaguache",26, new Mascota("firulais",4));
         List<Persona>lista =new ArrayList<>();
         lista.add(obj1);
         lista.add(obj2);
         lista.add(obj3);
         lista.add(obj4);
         obj.EscribirLista("C:\\Users\\HOGAR\\Desktop\\clasesarchivos.txt", lista);
         obj.leerArchivo("C:\\Users\\HOGAR\\Desktop\\clasesarchivos.txt");
         List<Persona>lista1=obj.lista("C:\\Users\\HOGAR\\Desktop\\clasesarchivos.txt");
         for(Persona persona:lista1){
             System.out.println(persona.getNombre());
         }
         }
    }

 
