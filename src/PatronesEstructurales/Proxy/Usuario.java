package PatronesEstructurales.Proxy;

public class Usuario {
    
    private int nivelPermiso; //del 1 al 5 //5 == administrador

    public Usuario(int nivelPermiso){
        this.nivelPermiso = nivelPermiso;
    }

    public int getNivelPermiso() {
        return nivelPermiso;
    }

    public void setNivelPermiso(int nivelPermiso) {
        this.nivelPermiso = nivelPermiso;
    }

    
}
