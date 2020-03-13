package patrondecorador;

/**
 *
 * @author adrian
 */
public class Nieve extends Ingrediente
{
    public Nieve (Bebida bebida)
    {
        super(bebida);
    }

    @Override
    public double getPrecio() {
        return bebida.getPrecio()+5.0;
    }
    
    @Override
    public String getNombre(){
       return bebida.getNombre()+", Nieve";
    }

    
}
