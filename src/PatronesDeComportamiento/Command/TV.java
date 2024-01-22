package PatronesDeComportamiento.Command;

//lo que vamos a hacer es desacoplar estos metodos de la clase que lo va a llamar.
public class TV implements IDevice{
    
    private boolean on;

    public TV(){
        this.on = false;
    }

    public void on(){
        this.on = true;
        System.out.println("TV encendida!");
    }

    public void off(){
        this.on = true;
        System.out.println("TV apagada!");

    }
}
