package PatronesCreacionales.SimpleFactory;

public class Pizzeria {
    
    public Pizza crearPizzaChica(){
        //podes crear DB, API, File,
        return new Pizza(6);
    }

    public Pizza crearPizzaMediana(){
        return new Pizza(8);
    }

    public Pizza crearPizzaGrande(){
        return new Pizza(12);
    }

}
