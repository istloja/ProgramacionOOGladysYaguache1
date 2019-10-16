
package Drportes_serealizable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class serealizable {
    
 

//    public void escribirarchivo(String rutaArchivo, Equipo equipo) throws IOException {
//        Serearizable obj = new Serearizable();
//
//        try (ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) {
//            escribir.writeObject(equipo);
//            escribir.close();
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Serearizable.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
//
//    public void leerarchivo(String rutaArchivo) {
//        try {
//            ObjectInputStream leer = new ObjectInputStream(new FileInputStream(rutaArchivo));
//            // leer la linea codificada, creamos un auxiliar con las lineas de codigo         
//            Object auxiliar = leer.readObject();
//            Equipo equipo = (Equipo) auxiliar;
//
//            System.out.println(equipo.getNombre());
//            System.out.println(equipo.getFutbolista().getNombre());
//        } catch (Exception e) {
//            System.out.println("Ocurrio un error" + e);
//        }
//
    
    public futbolista verificarmenor(List<futbolista> Lista) {
        futbolista menor = Lista.get(0);
        for (futbolista jugador : Lista) {
            if (menor.getNumero() > jugador.getNumero()) {
                menor = jugador;
            }
        }
        return menor;
    }

    public equipo mastitulos(List<equipo> Lista) {
        equipo mas = Lista.get(0);
        for (equipo equi : Lista) {
            if (mas.getTitulos() < equi.getTitulos()) {
                mas = equi;
            }
        }
        return mas;
    }

    public static void main(String[] args) throws IOException {
        serealizable obj = new serealizable();
        equipo equipo1 = new equipo("ganadores", "azul", 18, "Jesus  Silva", 5, new futbolista("Simon", "Vargas", 8, "Delantero", 526.89, 130, 26.36, 7894.14));
        equipo equipo2 = new equipo("ballenita", "morado", 12, "Marcos Sanchez", 12, new futbolista("Andres", "Samaniego", 20, "Defensa", 823.96, 130, 26.36, 7894.14));
        equipo equipo3 = new equipo("Barcelona", "amarillo", 22, "Mario Torres", 6, new futbolista("Pedro", "Armijos", 1, "Arquero", 728.00, 130, 26.36, 7894.14));
        equipo equipo4 = new equipo("Emelec", "Azul", 15, " Carlos Altamirano", 9, new futbolista("Carlos", "Quintero", 14, "Delantero", 978.23, 130, 26.36, 7894.14));
        equipo equipo5 = new equipo("Liga de Loja", "Blanco", 17, "Fernando Campoverde", 3, new futbolista("Javier", "Masache", 13, "Delantero", 456.25, 130, 26.36, 7894.14));
        equipo equipo6 = new equipo("Nacional", "Rojo", 13, "Rafael Villalta", 17, new futbolista("Mario", "Correa", 1, "Arquero", 879, 130, 26.36, 7894.14));
        equipo equipo7 = new equipo("Liga de Quito", "Blanco", 15, "Eduardo Garcia", 6, new futbolista("Richard", "Salazar", 2, "defensa", 578.35, 130, 26.36, 7894.14));
        equipo equipo8 = new equipo("Aucas", "amarillo", 13, "Fabian  Mera", 5, new futbolista("Felioe", "Caicedo", 3, "Defensa", 846.00, 130, 26.36, 7894.14));
        equipo equipo9 = new equipo("Olmedo", "Rojo", 14, "Walter Medina", 9, new futbolista("Gerardo", "Montaño", 5, "Delantero", 956, 130, 26.36, 7894.14));
        equipo equipo10 = new equipo("Manta_FC", "Azul", 17, "Matias Lopez", 11, new futbolista("David", "Mogroviejo", 13, "Delantero", 687.457, 130, 26.36, 7894.14));        obj.escribirarchivo("C:\\Users\\FRANCO\\Desktop\\serearizable.txt", equipo1);
//        obj.escribirarchivo("C:\\Users\\USUARIO\\Desktop\\serearizable.txt", equipo2);
//        obj.escribirarchivo("C:\\Users\\USUARIO\\Desktop\\serearizable.txt", equipo3);
//        obj.escribirarchivo("C:\\Users\\USUARIO\\Desktop\\serearizable.txt", equipo4);
//        obj.escribirarchivo("C:\\Users\\USUARIO\\Desktop\\serearizable.txt", equipo5);
//        obj.escribirarchivo("C:\\Users\\USUARIO\\Desktop\\serearizable.txt", equipo6);
//        obj.escribirarchivo("C:\\Users\\USUARIO\\Desktop\\serearizable.txt", equipo7);
//        obj.escribirarchivo("C:\\Users\\USUARIO\\Desktop\\serearizable.txt", equipo8);
//        obj.escribirarchivo("C:\\Users\\USUARIO\\Desktop\\serearizable.txt", equipo9);
//        obj.escribirarchivo("C:\\Users\\USUARIO\\Desktop\\serearizable.txt", equipo10);
//        obj.leerarchivo("C:\\Users\\USUARIO\\Desktop\\serearizable.txt");
        List<equipo> Lista = new ArrayList<>();
        Lista.add(equipo1);
        Lista.add(equipo2);
        Lista.add(equipo3);
        Lista.add(equipo4);
        Lista.add(equipo5);
        Lista.add(equipo6);
        Lista.add(equipo7);
        Lista.add(equipo8);
        Lista.add(equipo9);
        Lista.add(equipo10);
        System.out.println(Lista);
   
        System.out.println(obj.mastitulos(Lista));
    
    
    }
}

    
    


    
    
    
   
    



