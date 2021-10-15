
package mascotapp;

import mascotapp.Servicios.ServicioMascota;
import mascotapp.entidades.Mascota;

public class MascotAPP {

  
    public static void main(String[] args) {
       
        ServicioMascota sm = new ServicioMascota(); 
        Mascota m1= sm.crearMascota();
        
        
        System.out.println(m1.toString());
        m1 =null;
        
    }
    
}
