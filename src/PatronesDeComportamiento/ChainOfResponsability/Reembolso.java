package PatronesDeComportamiento.ChainOfResponsability;

public class Reembolso implements IManejadorTransacciones {
    
    private IManejadorTransacciones next;

    //todos los metodos de la Interfaz deben ser publicos    
    public void setNextManejador(IManejadorTransacciones next){
            this.next = next;
    }

   
    public void ejecutarTransaccion(ITransaccion transaccion){
        if(transaccion.getTipoTransaccion() == TipoTransaccion.Reembolso){
            float cantidad =  transaccion.getBalance() + transaccion.getCantidad();
            System.out.println("El nuevo balance despues de un reembolso es de " + cantidad);
        }else{
            //Como es el ultimo objeto de la lista se envia mensaje si no se puede contestar.
            System.out.println("Operacion no valida.");
        }
    }
}
