
package Drportes_serealizable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class serealizable {
    
    public void escribirarchivo (String rutaArchivo,equipo equipo) throws IOException{
 serealizable obj = new serealizable () ;
    
    try (ObjectOutputStream escribir = new ObjectOutputStream (new FileOutputStream(rutaArchivo))) {
        escribir.writeObject(equipo);
        escribir.close();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(serealizable.class.getName()).log(Level.SEVERE, null, ex);
    }
                  
}
    public void leerarchivo (String rutaArchivo){
try {
    ObjectInputStream leer = new ObjectInputStream (new FileInputStream   (rutaArchivo));
   // leer la linea codificada, creamos un auxiliar con las lineas de codigo         
Object auxiliar = leer.readObject();
equipo equipo = (equipo)auxiliar;

    System.out.println(equipo.getNombre());
    System.out.println(equipo.getNombre());
} catch (Exception e){
    System.out.println("Ocurrio un error"+e);
}

}   
    public static void main(String[] args) throws IOException {
    serealizable obj= new serealizable ();
    equipo objeto = new equipo ("ganadores","azul", 19, "Juan Calle", new futbolista("Simon", "Vargas", 8, "Delantero", 526.89));
    obj.escribirarchivo("C:\\Users\\HOGAR\\Desktop\\serearizable.txt", objeto);
    obj.leerarchivo("C:\\Users\\HOGAR\\Desktop\\serearizable.txt");
    }
   
    
}


