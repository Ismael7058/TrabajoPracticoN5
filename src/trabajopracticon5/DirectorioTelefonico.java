package trabajopracticon5;

import java.util.TreeMap;

public class DirectorioTelefonico {
    public static void main(String[] args) {
        
        Contacto contacto=new Contacto(0);
        Telefono tel = new Telefono(1231);
        
        TreeMap<Contacto, Telefono> entrada= new TreeMap<>();
        
        entrada.put(contacto, tel);
        System.out.println("Datos: "+ entrada);
        
    }
    
}
