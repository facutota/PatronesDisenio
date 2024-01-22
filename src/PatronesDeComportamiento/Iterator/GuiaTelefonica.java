package PatronesDeComportamiento.Iterator;

import java.util.ArrayList;

public class GuiaTelefonica {
    
    private ArrayList<String> numeros;

    public GuiaTelefonica() {
        this.numeros = new ArrayList<String>();
    }

    public ArrayList<String> getNumeros() {
        return numeros;
    }

    public void add(String numero) {
        this.numeros.add(numero);
    }

    

    
}
