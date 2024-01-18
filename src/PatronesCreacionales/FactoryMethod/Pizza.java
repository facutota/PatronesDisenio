package PatronesCreacionales.FactoryMethod;

public class Pizza {
    private int cantRebanadas;
    private String especialidad;

    public Pizza(int cantRebanadas, String especialidad){
        this.cantRebanadas = cantRebanadas;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Cantidad de Rebanadas: " + this.cantRebanadas + " Especialidad: "+this.especialidad;
    }

    
}
