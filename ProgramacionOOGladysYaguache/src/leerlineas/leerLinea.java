
package leerlineas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class leerLinea {
   
    
    public static void main(String[] args) {
       File archivo = new File("C:\\Users\\Usuario\\Desktop\\texto.txt");
       try{
       FileReader leer = new FileReader(archivo);
       BufferedReader texto = new BufferedReader(leer);
       String Linea = "" ;
    
    while ((Linea= texto.readLine())!= null){
   
        System.out.println(texto.readLine());
    }

    texto.close();
} catch (Exception e){
 System.out.println("Ha ocurrido un error" +e); 
    }

}
}
    

