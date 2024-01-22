package PatronesEstructurales.Facade;

public class Fachada {
    
    private Computadora computadora;

    public Fachada(){
        ITeclado teclado = new Teclado();
        IMouse mouse = new Mouse();

        this.computadora = new Computadora(teclado, mouse);
    }

    public void encender(){
        this.computadora.encender();
    }
    @Override
    public String toString() {
        return "Fachada [computadora=" + computadora + "]";
    }

    
}
