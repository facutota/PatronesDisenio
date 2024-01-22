package PatronesCreacionales.Prototype;

public class Enemigo {
    
    private String imagen;
    private int posX;
    private int posY;
    private int cantidadVida;
    
    public Enemigo(String imagen, int posX, int posY, int cantidadVida) {
        this.setImagen(imagen);
        this.setPosX(posX);
        this.setPosX(posX);
        this.setCantidadVida(cantidadVida);
    }

    //Hay varias formas de usar el patron Prototype vamos a ver 2 una es la de crear un constructor
    //de objeto de la misma clase
    public Enemigo(Enemigo enemigo) {
        this.setImagen(enemigo.getImagen());
        this.setPosX(enemigo.getPosX());
        this.setPosX(enemigo.getPosY());
        this.setCantidadVida(enemigo.getCantidadVida());
    }

    //la segunda forma es un metodo de instancia y retornamos alguno de los dos constructores
    //si usamos el segundo retornamos this
    public Enemigo clone(){
        return new Enemigo(this);
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getCantidadVida() {
        return cantidadVida;
    }

    public void setCantidadVida(int cantidadVida) {
        this.cantidadVida = cantidadVida;
    }

    @Override
    public String toString() {
        return "Enemigo [imagen=" + imagen + ", posX=" + posX + ", posY=" + posY + ", cantidadVida=" + cantidadVida
                + "]";
    }

    
    
}
