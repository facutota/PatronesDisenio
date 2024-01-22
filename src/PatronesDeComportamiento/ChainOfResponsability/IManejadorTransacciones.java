package PatronesDeComportamiento.ChainOfResponsability;

public interface IManejadorTransacciones {

    //con este metodo podremos encadenar al siguiente objeto por si no puede responder
    //Seria una lista anidada.
    void setNextManejador(IManejadorTransacciones next);

    //Por principios solid el objeto a ejecutar debe ser abstracto.
    void ejecutarTransaccion(ITransaccion transaccion);
    
} 