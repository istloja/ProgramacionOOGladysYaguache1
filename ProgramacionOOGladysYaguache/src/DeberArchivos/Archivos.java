
package DeberArchivos;
import java.io.File;
import java.util.Scanner;

public class Archivos {
  public static void main(String[] args) {
     int opciones = 0;
        Scanner Ale = new Scanner(System.in);
    try {
       System.out.println("Ingresar un numero segun el archivo que quiera verificar");
       System.out.println("1:Escritorio");
       System.out.println("2:Documentos");
       System.out.println("3:Imagenes");
       System.out.println("4:videos");
       System.out.println("5:musica");
       opciones = Ale.nextInt();
     if (opciones > 0) {
          switch (opciones) {
        case 1:
        File carpeta = new File("C:\\Users\\Gladys\\Desktop");
        String[] archivos = carpeta.list();
        for (int i = 0; i < archivos.length; i++) {
         System.out.println(archivos[i]);
          }
       break;
     case 2:
       File carpeta1 = new File("C:\\Users\\Gladys\\Documentos");
       archivos = carpeta1.list();
       for (int i = 0; i < archivos.length; i++) {
         System.out.println(archivos[i]);
        }
       break;
     case 3:
      File carpeta2 = new File("C:\\Users\\Gladys\\Imagenes");
      archivos = carpeta2.list();
      for (int i = 0; i < archivos.length; i++) {
       System.out.println(archivos[i]);
        }
     break;
   case 4:
     File carpeta3 = new File("C:\\Users\\Gladys\\Videos");
     archivos = carpeta3.list();
     for (int i = 0; i < archivos.length; i++) {
       System.out.println(archivos[i]);
        }
     break;
   case 5:
    File carpeta4 = new File("C:\\Users\\Gladys\\musica");
    archivos = carpeta4.list();
    for (int i = 0; i < archivos.length; i++) {
      System.out.println(archivos[i]);
        }
     break;
    default:
      System.out.println("ingresar un numero del 1 al 5 ");
     break;
         }
     } else {
       System.out.println("digite un numero mayor a 0");
            }
        } catch (Exception e) {
            System.out.println("Se ha generado la excepcion" + e);
        }
        System.out.println("El numero ingresado es" + opciones);
    }

}    
       
   
        
    
    
   

