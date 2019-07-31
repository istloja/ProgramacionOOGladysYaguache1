
import java.util.Date;


public class TrabajoFecha {
    public static void main(String[] args) {
        Date fecha =new Date (101,06,18);
        Date fechaActual =new Date (119,06,16);
        System.out.println(fecha.after(fechaActual));
        System.out.println(fecha.before(fechaActual));
        
        
    }
    
     
}
