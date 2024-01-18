package PatronesCreacionales.AbstractFactory;

public class AppleStore implements IAbstractFactory{
    
    public IComputadora crearComputadora(){
        return new MacBook();
    }

    public ITablet crearTablet(){
        return new Ipad();
    }
}
