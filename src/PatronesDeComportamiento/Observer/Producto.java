package PatronesDeComportamiento.Observer;

import java.util.LinkedHashSet;
import java.util.Set;

public class Producto implements IObservable{
    
    //Utiliza un Set de tal forma q los observadores no se repitan.
    private Set<IObserver> observadores;
    private int stock;

    public Producto(int stock) {
        this.stock = stock;
        //Importa Linked porque a veces las notificaciones se deben hacer en orden como primero avisar
        //los administradores antes q al usuario.
        this.observadores = new LinkedHashSet<>();
    }

    public void venta(){
        this.setStock(this.stock - 1);
        System.out.println("Producto vendido!");

        this.notificarObservadores();
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    
    public void addObserver(IObserver o){
        this.observadores.add(o);

    }

    public void notificarObservadores(){
        for(IObserver observador : this.observadores){
            observador.notificacion("El producto se vendio.");
        }
    }

    public void removerObserver(){

    }
}
