package patrondecorador;

/**
 *
 * @author adrian
 */
public class BebidaSimple extends Bebida
{    

    public BebidaSimple(String nombre, String tamanio, double precio) {
        super(nombre, tamanio, precio);
    }

    @Override
    public double getPrecio() {
        return precio;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return nombre;//To change body of generated methods, choose Tools | Templates.
    }
    
}
