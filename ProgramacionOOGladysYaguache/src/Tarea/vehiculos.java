
package Tarea;

import javax.swing.JOptionPane;


public class vehiculos {
    

        private String automovil, automovil1, automovil2, automovil3, automovil4, automovil5;
        private double precio, precio1, precio2, precio3, precio4, precio5;
        private String estado, estado1, estado2, estado3, estado4, estado5;
        private int capacidad, capacidad1, capacidad2, capacidad3, capacidad4, capacidad5;
        private boolean nuevo, nuevo1, nuevo2, nuevo3, nuevo4, nuevo5;

         public void precios() {
            precio = 150.000;
            precio1 = 350.000;
            precio2 = 380.000;
            precio3 = 600.000;
            precio4 = 550.000;
            precio5 = 400.000;

        }
        
        public void Marcas() {
            automovil = "Chervolet";
            automovil1 = "BMW";
            automovil2 = "FORD";
            automovil3 = "HONDA";
            automovil4 = "Mercedes-Benz";
            automovil5 = "Nissan";

        }

       

        public void estados() {
            estado = "Bueno";
            estado1 = "Excelente";
            estado2 = "Regular";
            estado3 = "Excelente";
            estado4 = "excelente";
            estado5 = "Malo";

        }

     
        

        public void condicion_del_vehiculo() {
            nuevo = true;
            nuevo1 = true;
            nuevo2 = false;
            nuevo3 = false;
            nuevo4 = true;
            nuevo5 = false;

        }
        
           public void capacidades_de_asientos() {
            capacidad = 6;
            capacidad1 = 3;
            capacidad2 = 7;
            capacidad3 = 4;
            capacidad4 = 5;
            capacidad5 = 4;
           }
        
        
        public String mostrarChevrolet() {
            JOptionPane.showMessageDialog(null,"La marca de el automovil es\n" + automovil + "El precio es\n" + precio
                    + "El estado es\n" + estado + "La capacidades_de_asientos es\n" + capacidad);
            return automovil;
        }

        public String mostrarBMW() {
            JOptionPane.showMessageDialog(null,"La marca de el automovil es\n" + automovil1 + "El precio es\n" + precio1
                    + "El estado es\n" + estado1 + "La capacidades_de_asientos es\n" + capacidad1);
            return automovil1;
        }

        public String mostrarFord() {
            JOptionPane.showMessageDialog(null,"La marca de el automovil es\n" + automovil2 + "El precio es\n" + precio2
                    + "El estado es\n" + estado2 + "La capacidades_de_asientos es\n" + capacidad2);
            return automovil2;
        }

        public String mostrarHonda() {
            JOptionPane.showMessageDialog(null,"La marca de el automovil es\n" + automovil3 + "El precio es\n" + precio3
                    + "El estado es\n" + estado3 + "La capacidades_de_asientos es\n" + capacidad3);
            return automovil3;
        }

        public String mostrarMercedesBenz() {
            JOptionPane.showMessageDialog(null,"La marca de el automovil es\n" + automovil4 + "El precio es\n" + precio4
                    + "El estado es\n" + estado + "La capacidades_de_asientos es\n" + capacidad4);
            return automovil4;
        }

        public String mostrarNissan() {
            JOptionPane.showMessageDialog(null,"La marca de el automovil es\n" + automovil5 + "El precio es\n" + precio5
                    + "El estado es\n" + estado5 + "La capacidades_de_asientos es\n" + capacidad5);
            return automovil5;

        }
    

    public static void main(String[] args) {

        vehiculos com = new vehiculos();

        int dato;

        do {
            dato = Integer.parseInt(JOptionPane.showInputDialog("Escoje el auto que mas te guste\n"
                    + "\n1. chevrolet\n"
                    + "2. BMW\n"
                    + "3. Ford\n"
                    + "4. Honda\n"
                    + "5. Mercedes_Benz\n"
                    + "6. Nissan\n"
                    + "Preciona 0 para SALIR DEL PROGRAMA"));

            switch (dato) {

                case 0:

                    JOptionPane.showMessageDialog(null, "Usted ha salido del programa");
                    JOptionPane.showMessageDialog(null, "Las caracteristicas del vehiculo son ");
                    

                    break;

                case 1:
                    JOptionPane.showMessageDialog(null, "Usted ha elegido el automovil chevrolet");

                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Usted ha elegido el automovil BMW");

                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Usted ha elegido el automovil Ford");

                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Usted ha elegido el automovil Honda");

                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Usted ha elegido el automovil Mercedes _Benz");

                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Usted ha elegido el automovil Nissan");

                    break;

                default:
                    JOptionPane.showMessageDialog(null, "EL NUMERO DIGITADO  ES INCORRECTO");
            }
        } while (dato !=0);
}
    
}