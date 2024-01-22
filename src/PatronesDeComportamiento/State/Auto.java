package PatronesDeComportamiento.State;

public class Auto implements IEstadoAuto {

    private IEstadoAuto autoEncendido;
    private IEstadoAuto autoMovimiento;
    private IEstadoAuto autoApagado;

    IEstadoAuto estadoActual;

    public Auto() {
        this.autoEncendido = new AutoEncender(this);
        this.autoMovimiento = new AutoManejar(this);
        this.autoApagado = new AutoApagar(this);

    //aca definimos el estado inicial del auto
        this.estadoActual = this.autoEncendido;
    }

    public void encender() {
        this.estadoActual.encender();

    }

    public void manejar() {
        this.estadoActual.manejar();

    }

    public void apagar() {

        this.estadoActual.apagar();
    }

    public IEstadoAuto getAutoEncendido() {
        return autoEncendido;
    }

    public void setAutoEncendido(IEstadoAuto autoEncendido) {
        this.autoEncendido = autoEncendido;
    }

    public IEstadoAuto getAutoMovimiento() {
        return autoMovimiento;
    }

    public void setAutoMovimiento(IEstadoAuto autoMovimiento) {
        this.autoMovimiento = autoMovimiento;
    }

    public IEstadoAuto getAutoApagado() {
        return autoApagado;
    }

    public void setAutoApagado(IEstadoAuto autoApagado) {
        this.autoApagado = autoApagado;
    }

    public IEstadoAuto getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(IEstadoAuto estadoActual) {
        this.estadoActual = estadoActual;
    }

    
}
