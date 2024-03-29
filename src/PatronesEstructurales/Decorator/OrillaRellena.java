package PatronesEstructurales.Decorator;

//ahora queso extra es hermano de pizza pepperoni y napolitana
public class OrillaRellena implements IPizza{

    private IPizza pizza;

    public OrillaRellena(IPizza pizza){
        this.pizza = pizza;
    }

    public String descripcion(){
        return this.pizza.descripcion() + " con orilla rellena";
    }

    public float precio(){
        return this.pizza.precio() + 4;
    }
}
