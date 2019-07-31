
package Archivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Logger;


public class File {
   
     // public static void main(String[] args) throws IOException {
//        FileWriter archivo= null; // EScrbimos variables de tipo FileWriter con el no,bre archivo
//         PrintWriter dato= null;// Es la escritora que nos permite dar texto al bloc dde notas 
//          try {
//            archivo = new FileWriter ("C:\\Users\\HOGAR\\Desktop\\notas.txt");
//            dato = new PrintWriter (archivo);
//            dato.println("Meta# 1: Ser profesional");
//            dato.println("Meta# 2: Tocar Guitarra");
//            dato.println("meta# 3: Sacar buenas notas ");
//            dato.println("meta# 4: Pasar el ciclo");
//            dato.println("meta# 5: Ser mas activa ");
//            dato.println("Meta# 6: Aprender mas sobre la carrera");
//            dato.println("Meta# 7: Cumplir con todas mis expectativas ");
//            dato.println("Meta# 8:  Deseo que toda mi familia este muy bien");
//            dato.println("Meta# 9: Aprender ingles ");
//            dato.println("Meta# 10: Ir de paseo a otro lugar");
//            
//            } catch (Exception e) {
//              System.out.println("Error :" +e.getMessage());
//              archivo.close();
//              
//          }
//          archivo.close();
   //}
   public static void main(String[] args){
   Scanner entrada= new Scanner(System.in);
       System.out.println("ingrese la direcion del archivo");
       String Direccion = entrada.nextLine() ;
      System.out.println("ingrese el texto a escribir en el archivo");
       String texto = entrada.nextLine();
       System.out.println(texto);
       File objeto = new File();
       objeto.Escribir(Direccion, texto);
   
   
   
   }
       public void Escribir(String Direccion,String mensaje){
       try {
           FileWriter archivo = new FileWriter(Direccion) ;
           PrintWriter Escribir = new PrintWriter(archivo);
           Escribir.println(mensaje);
           archivo.close();
       
       } catch (Exception e){
           System.out.println(e);
       }
       }
}