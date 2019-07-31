
package Exepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class Archivos {
    public static void main(String[] args) {
//        File archivo = new File("C:\\Users\\HOGAR\\Desktop\\Ejemplo.txt");
//        //Para saber si el archivo o una carpeta no existe, devuelve true o false
//        System.out.println(archivo.exists());
//        //Para saber si una carpeta existe o no, devuelve true o flase
//        System.out.println(archivo.isDirectory());
//        //Para saber la fecha de modificacion del archivo
//        System.out.println(archivo.lastModified());
//        //Pra obtener el nombre del archivo
//        System.out.println(archivo.getName());
       //Para borrar el archivo
       //System.out.println(archivo.delete());
//       File carpeta = new File("C:\\Users\\HOGAR\\Desktop\\");
//       String[] archivos=carpeta.list();
//        for (int i = 0; i < archivos.length; i++) {
//            System.out.println(archivos[i]);
        
        try {
            String Archivo = null;
        
         FileReader lector = new FileReader(Archivo);//pasar un archivo a un objeto
         BufferedReader re =new BufferedReader (lector);//me va servir para  
         String Linea ="";
         while ((Linea =re.readLine()) != null){//leer linea por el archivo
             System.out.println(Linea);
         } 
        re.close();// para cerrar el archivo
    } catch (Exception e){
            System.out.println("ocurrio un error"+e);
}
    }
}
    


    

