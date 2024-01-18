package PatronesCreacionales.AbstractFactory;

public interface IAbstractFactory {
    
    IComputadora crearComputadora();

    ITablet crearTablet();
}
