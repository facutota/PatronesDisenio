package PatronesCreacionales.SimpleFactory;
//Patron simpleFactory  
public class Pizza {
    private int cantRebanadas;

    public Pizza(int cantRebanadas){
        this.cantRebanadas = cantRebanadas;
    }

    @Override
    public String toString() {
        return "Pizza [cantRebanadas=" + cantRebanadas + "]";
    }

    
}
