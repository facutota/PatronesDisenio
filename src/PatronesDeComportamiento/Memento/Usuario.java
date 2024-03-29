package PatronesDeComportamiento.Memento;

public class Usuario {
    
    private String nombre;
    private int edad;
    
    public Usuario(String nombre, int edad) {
        this.setNombre(nombre);
        this.setEdad(edad); 
    }

    //Generamos un nuevo metodo que hara la copia de seguridad
    public Usuario getMemento(){
        return new Usuario(this.getNombre(), this.getEdad());
    }

    //ahora creamos el metodo para restaurar la copia
    public void restartMemento(Usuario usuario){
        this.setNombre(usuario.getNombre());
        this.setEdad(usuario.getEdad());
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
}
