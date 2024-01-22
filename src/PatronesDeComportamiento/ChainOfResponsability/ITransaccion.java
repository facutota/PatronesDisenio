package PatronesDeComportamiento.ChainOfResponsability;

public interface ITransaccion {

    
    TipoTransaccion getTipoTransaccion();

    float getBalance();

    float getCantidad();
}
