package PatronesDeComportamiento.Strategy;

public class Deposito implements IEstrategia{
    //Esto son algoritmos simples obviamente que serian mas complicados.
    public float realizarOperacion(float balance, float cantidad){

        return balance + cantidad;

    }

}
