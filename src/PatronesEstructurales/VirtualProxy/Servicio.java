package PatronesEstructurales.VirtualProxy;

public class Servicio implements IServicio {


    public void escribir() {
       System.out.println("Escribo");
    }

   
    public void leer() {
        System.out.println("Leo");
    }

 
    public void actualizar() {
        System.out.println("Actualizo");
    }

    
    public void eliminar() {
        System.out.println("Elimino");
    }

   
    
}
