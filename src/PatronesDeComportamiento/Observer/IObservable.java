package PatronesDeComportamiento.Observer;

public interface IObservable {

    void addObserver(IObserver o);

    void notificarObservadores();

    void removerObserver();
} 