package patrondecorador;

/**
 *
 * @author adrian
 */
public abstract class Bebida {
    
    protected String nombre,tamanio;
    protected double precio;

    public Bebida(String nombre, String tamanio, double precio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.precio = precio;
    }
    
    public abstract double getPrecio();
    
    public String getNombre(){
        return nombre;
    }
    
    public String getTamanio(){
        return tamanio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
   
}
