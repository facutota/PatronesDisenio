package PatronesDeComportamiento.Strategy;

//Hay q crear una clase que le de contexto
public class Transaccion {

    private IEstrategia estrategia;//Algoritmo

    public Transaccion(IEstrategia estrategia) {
        this.estrategia = estrategia;
    }

//esto lo que hace es ejecutar el algoritmo no importa cual, 
//y ya nuestros algoritmos estan encapsulados en clases
    public float ejecutarTransaccion(float balance, float cantidad){
        return this.estrategia.realizarOperacion(balance, cantidad);
    }

    public IEstrategia getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(IEstrategia estrategia) {
        this.estrategia = estrategia;
    }

    
    
}
