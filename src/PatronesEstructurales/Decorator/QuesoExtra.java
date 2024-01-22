package PatronesEstructurales.Decorator;

//ahora queso extra es hermano de pizza pepperoni y napolitana
public class QuesoExtra implements IPizza{

    private IPizza pizza;

    public QuesoExtra(IPizza pizza){
        this.pizza = pizza;
    }

    public String descripcion(){
        return this.pizza.descripcion() + " queso extra";
    }

    public float precio(){
        return this.pizza.precio() + 2;
    }
}
