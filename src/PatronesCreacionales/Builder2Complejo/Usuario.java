package PatronesCreacionales.Builder2Complejo;

public class Usuario {
    
    private String nombre;
    private String apellido;

    //Esto se realiza si queremos restringir a completar o no la informacion de contacto
    //osea los areibutos opcionales como emeail telefono direccion.
    private boolean medioContacto;


    private String email;
    private String telefono;
    private String direccion;

    private String metodoPago;
    private String token;
   

    public Usuario(String nombre, String apellido){ //1 er paso Hay q colocar el constuctor en privado
        this.nombre = nombre;
        this.apellido = apellido;

        this.medioContacto = false;
        this.email = "";
        this.telefono = "";
        this.direccion = "";

    }

    public BuilderUsuario setMedioContacto(boolean medioContacto) {

        if(!medioContacto){
            throw new IllegalArgumentException("No es posible asignar un valor falso a medio contacto.");
        }
        this.medioContacto = medioContacto;
        return new BuilderUsuario(this);
    }
    
//3 paso crear los setters de las variables q no estan en el constructor publicos que sean objeto
//usuario y retornarlos. En el Builder 2 complejo estos setters van a una clase aparte.
   



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
                + " " + this.direccion + " " + this.metodoPago + " " + this.token;
    }

    public static class BuilderUsuario{
        private Usuario usuario;

        public BuilderUsuario(Usuario usuario){
            this.usuario = usuario;
        }

        public BuilderUsuario setEmail(String email) {
            usuario.email = email;
            return this;
        }
    
    
    
        public BuilderUsuario setTelefono(String telefono) {
            usuario.telefono = telefono;
            return this;
    
        }
    
    
        public BuilderUsuario setDireccion(String direccion) {
            usuario.direccion = direccion;
            return this;
    
        }

        public BuilderUsuario setMetodoPago(String metodoPago) {
            if (!usuario.medioContacto || usuario.email.isEmpty() || usuario.telefono.isEmpty() || usuario.direccion.isEmpty()) {
                throw new IllegalStateException("Completa primero los datos de contacto.");
            }
            usuario.metodoPago = metodoPago;
            return this;
        }

        public BuilderUsuario setToken(String token) {
            if (usuario.metodoPago == null || usuario.metodoPago.isEmpty()) {
                throw new IllegalStateException("Completa primero el método de pago.");
            }
            usuario.token = token;
            return this;
        }

        public Usuario Build(){
            return usuario;
        }
    }
    
}
