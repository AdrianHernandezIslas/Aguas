package patrondecorador;

/**
 *
 * @author adrian
 */
public abstract class Ingrediente extends Bebida{
    protected Bebida bebida;
    
    protected Ingrediente(Bebida bebida){
        super(bebida.getNombre(),bebida.tamanio,bebida.getPrecio());
        this.bebida = bebida;
    }
    
    @Override
    public String toString(){
        return "Bebida de: "+nombre+" Tanaño: "+tamanio+" $"+precio;
    }
}
