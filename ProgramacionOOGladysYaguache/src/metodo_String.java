/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOGAR
 */
public class metodo_String {
    public static void main(String[] args) {
//       int i=0;
//            String  cadena = "hola";
            //cadena.length();// devuelve un entero
//            System.out.println(cadena.length());
//            cadena.compareTo("hola");
//          cadena.equals("chao");  
//          System.out.println(cadena.equals("hola"));
          String hola="hola";
//         System.out.println(hola.contains("d"));
//           metodo_String ob=new metodo_String(); 
           ob.verificarletra(hola, 'd');
    
    }
    public boolean verificarletra(String cadena, char letra){
        boolean bandera =false;
        for(int i= 0;i< cadena.length();i++){
            if(cadena.charAt(i)==letra){
                bandera=true;
            }
            return bandera;
            
             
        }
        
              
    

