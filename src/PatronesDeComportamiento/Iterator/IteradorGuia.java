package PatronesDeComportamiento.Iterator;

//Esta clase solo va a acceder al atributo numeros, no le interesa otros atributos que tenga la clase
//Guia telefonica
public class IteradorGuia implements IIterador {

    private GuiaTelefonica guia;
    private int posicion; //o indice o index
     
    public IteradorGuia(GuiaTelefonica guia) {
        this.guia = guia;
    }

    public String siguiente(){
        return this.guia.getNumeros().get(this.posicion++);
    };

    public boolean contieneSiguiente(){
        return this.posicion < this.guia.getNumeros().size() && this.guia.getNumeros().get(this.posicion) != null;
    };

}
