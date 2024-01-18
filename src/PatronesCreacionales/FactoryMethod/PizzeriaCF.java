package PatronesCreacionales.FactoryMethod;

public class PizzeriaCF implements IPizzeria{
    
    public Pizza crearPizza(String tipo){

        if(tipo.equals("Pepperoni")){
            return new Pizza(8, "Pepperoni");
        }

        if(tipo.equals("Napolitana")){
            return new Pizza(12, "Napolitana");
        }

        if(tipo.equals("Pepperoni orilla rellena")){
            return new PizzaOrillaRellena(12, "Pepperoni");
        }

        return null;
    }
}
