package PatronesCreacionales.Builder;

public class Usuario {
    
    private String nombre;
    private String apellido;    

    private String email;
    private String telefono;
    private String direccion;

    public Usuario(String nombre, String apellido){ //1 er paso Hay q colocar el constuctor en privado
        this.nombre = nombre;
        this.apellido = apellido;

        
        this.email = "";
        this.telefono = "";
        this.direccion = "";

    }

   
    
//3 paso crear los setters de las variables q no estan en el constructor publicos que sean objeto
//usuario y retornarlos.
    public Usuario setEmail(String email) {
        this.email = email;
        return this;
    }



    public Usuario setTelefono(String telefono) {
        this.telefono = telefono;
        return this;

    }



    public Usuario setDireccion(String direccion) {
        this.direccion = direccion;
        return this;

    }



    public static Usuario Make(String nombre, String apellido){ //2 paso un metodo publico estatico
        return new Usuario(nombre, apellido);
    }

    //4 paso un metodo build()
    public Usuario Build(){
        return this;
    }


    @Override
    public String toString() {
        return this.nombre + " " + this.apellido + " " + this.email + " " + this.telefono
                + " " + this.direccion;
    }


    
}
