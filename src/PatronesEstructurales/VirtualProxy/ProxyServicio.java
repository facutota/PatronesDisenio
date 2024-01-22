package PatronesEstructurales.VirtualProxy;

public class ProxyServicio implements IServicio{

    private IServicio servicio; //el objeto costoso que hay q crear
    private Usuario usuario;

//Vamos a indicar que el Proxy sea el que cree el objeto
    public ProxyServicio(Usuario usuario){
      this.usuario = usuario;
    }

    public void escribir() {        
            this.obtenerServicio().escribir();        
     }
 
    
     public void leer() {
        this.obtenerServicio().leer();;
     }
 
  
     public void actualizar() {       
            this.obtenerServicio().actualizar();
     }
 
     
     public void eliminar() {        
            this.obtenerServicio().eliminar();       
     }

     //Aca se crea el objeto costoso una sola vez, solo cuando sea necesario.
     //Los metodos deben cambiar a this.obtenerServicio().eliminar();
     private IServicio obtenerServicio(){
        if(this.servicio == null){
            this.servicio = new Servicio();
        }
        return this.servicio;
     }
     
    
}
