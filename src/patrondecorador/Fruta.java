package patrondecorador;

/**
 *
 * @author adrian
 */
public class Fruta extends Ingrediente
{

    public Fruta(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double getPrecio() {
        return bebida.getPrecio()+10.0;
    }
    
    @Override
    public String getNombre(){
       return bebida.getNombre()+", Fruta";
    }

    
}
