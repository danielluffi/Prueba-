package mascotapp.Servicios;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class ServicioMascota {
    private Scanner leer= new Scanner(System.in). useDelimiter("\n");
    public Mascota crearMascota(){
        System.out.println(" Introducir nombre");
        String nombre= leer.next();
        System.out.println(" Introducir Apodo");
        String apodo= leer.next();
        System.out.println(" Introducir Tipo");
        String tipo= leer.next();
      
        return new Mascota(nombre, apodo, tipo);
        
        
    }
    
}
