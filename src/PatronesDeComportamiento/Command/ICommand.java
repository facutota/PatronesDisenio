package PatronesDeComportamiento.Command;

//solo un metodo en la interfaz y luego crear las clases de cada operacion en este caso ON y OFF
//CON ESTO DESACOPLAMOS
public interface ICommand {
    
    void operacion();
}
