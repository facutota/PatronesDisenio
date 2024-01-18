package PatronesCreacionales.AbstractFactory;

public class SamsungStore implements IAbstractFactory{
    public IComputadora crearComputadora(){
        return new QX40();
    }

    public ITablet crearTablet(){
        return new GalaxyS20();
    }
}
