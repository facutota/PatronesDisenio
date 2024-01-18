package PatronesCreacionales.SingletonConcurrente;

public class ConexionDB {

    private static ConexionDB conexion; //este atributo tambien debe ser privado asi no lo puede utilizar otra clase

    //debemos poner el constructor como privado ya que sino lo podria utlizar cualquier clase.
    private ConexionDB(){

    }

   
    //el metodo se hace estatico asi se puede instancia usando clase.metodostatuc
    public synchronized static ConexionDB obtenerConexion(){ //hay que poner syncrhtonized para que los hilos usen la misma instancia
       if(conexion == null){ //se debe ver si no se ha instanciado
         conexion = new ConexionDB(); //aca en el metodo creo la conexion con el constructor
       }

       return conexion;
    }
    
}
