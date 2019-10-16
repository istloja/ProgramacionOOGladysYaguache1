
package base_de_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class conexion {
   public void conexion (String  usuario, String clave){
       
       try {
           DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
           Connection poo = DriverManager.getConnection("jdbc:mysql://localhost/futbol_db", usuario, clave);
             System.out.println(poo.getCatalog());  
             Statement s = poo.createStatement();// inicializamos la consulta
             ResultSet resultado = s.executeQuery("select*from persona");
              while (resultado.next()){
                  System.out.println(resultado.getInt("idpersona"));
                  System.out.println(resultado.getString("nombre"));
                  System.out.println(resultado.getString("apellido"));
                  System.out.println(resultado.getString("CEDULA"));
                  System.out.println(resultado.getInt("edad"));
                  
              }
     } catch (Exception e) {
           System.out.println(e);
       }
       
   }
   public void escribir (String Usuario,String clave , int idpersona,String nombre,String apellido, String cedula, int edad){
       try {
           DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
           Connection poo = DriverManager.getConnection("jdbc:mysql://localhost/futbol_db", Usuario, clave);
           PreparedStatement s = poo.prepareStatement("Insert into persona values ?,?,?,?,?");
          s.setInt(1, idpersona);
          s.setString(2, nombre);
          s.setString(3, apellido);
          s.setString(4, cedula);
          s.setInt(5, edad);
          s.executeUpdate();
          
       } catch (SQLException e){
       }
   }
    public static void main(String[] args) {
        
       conexion Ale = new conexion ();
//       Ale.conexion("root","ROOT");// SIRVE PARA LLAMAR UN  METODO
//       Ale.escribir("root", "ROOT", 1158, "LUPE"," Fernandez","1149687362", 18);
       // Ale.actualizar("root","ROOT",4,"Vicente");
      s.eliminar("root","ROOT","Ruben","Yaguache");
    }
      public void eliminar (String usuario,String clave,int persona,String nombre,String apellido){
        try {
           DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
          Connection poo = DriverManager.getConnection("jdbc:mysql://localhost/futbol_db", usuario,clave);
         //PreparedStatement s = poo.prepareStatement("UPDATE persona set nombre =? where idpersona =?");
        //PreparedStatement s = poo.prepareStatement("UPDATE persona set nombre = ? ,apellido =? ,cedula=? where idpersona=?");
          PreparedStatement s = poo.prepareStatement("DELETE from persona where idpersona=?");
           s.setInt(1,persona);
           s.setString(2,nombre);
           s.setString(3,apellido);
           
           
           s.executeUpdate();
            
           
          } catch (SQLException e){
              System.out.println(e);
            
            
        }
      
        
        
    }
}
   
