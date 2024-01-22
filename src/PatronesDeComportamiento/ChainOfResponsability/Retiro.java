package PatronesDeComportamiento.ChainOfResponsability;

public class Retiro implements IManejadorTransacciones {
    
    private IManejadorTransacciones next;

    //todos los metodos de la Interfaz deben ser publicos    
    public void setNextManejador(IManejadorTransacciones next){
            this.next = next;
    }

   
    public void ejecutarTransaccion(ITransaccion transaccion){
        if(transaccion.getTipoTransaccion() == TipoTransaccion.Retiro){
            float cantidad =  transaccion.getBalance() - transaccion.getCantidad();
            System.out.println("El nuevo balance despues de un retiro es de " + cantidad);
        }else{
            //aca es cuando no puede ehecutar y se lo pasa al proximo objeto.
            this.next.ejecutarTransaccion(transaccion);
        }
    }
}
