package patrondecorador;

/**
 *
 * @author adrian
 */
public class Sabor extends Ingrediente{
    
    public Sabor (Bebida bebida){
        super(bebida);
    }
    
    @Override
    public double getPrecio() {
        return bebida.getPrecio()+3.0;
    }
    
    @Override
    public String getNombre(){
       return bebida.getNombre()+", Sabor";
    }
   
}
