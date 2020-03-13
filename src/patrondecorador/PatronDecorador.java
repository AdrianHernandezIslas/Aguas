/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrondecorador;

/**
 *
 * @author adrian
 */
public class PatronDecorador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Bebida simpleSaborNieve = new Nieve(new Sabor(new BebidaSimple("Agua Natural", "Chica", 15.0)));
       Bebida simpleSaborNieveG = new Nieve(new Sabor(new BebidaSimple("Agua Natural", "Grande", 40.0)));
       Bebida saborNieveSimple = new Sabor(new Nieve(new BebidaSimple("Agua Natural", "Chica",15.0)));
       Bebida saborSimple = new Sabor(new BebidaSimple("Agua Natural","Mediana", 35.0));
       Bebida simple = new BebidaSimple("Agua Natural", "Chica", 15.0);
       
       
       System.out.printf("%-35s%-27s%-10s\n\n","NOMBRE","TAMAÑO","PRECIO");
       
       
       System.out.printf("%-35s%-27s%-10s\n",simpleSaborNieveG.getNombre(),simpleSaborNieveG.getTamanio(),simpleSaborNieveG.getPrecio());
       System.out.printf("%-35s%-27s%-10s\n",saborNieveSimple.getNombre(),saborNieveSimple.getTamanio(),saborNieveSimple.getPrecio());
       System.out.printf("%-35s%-27s%-10s\n",simpleSaborNieve.getNombre(),simpleSaborNieve.getTamanio(),simpleSaborNieve.getPrecio());
       System.out.printf("%-35s%-27s%-10s\n",saborSimple.getNombre(),saborSimple.getTamanio(),saborSimple.getPrecio());
       System.out.printf("%-35s%-27s%-10s\n",simple.getNombre(),simple.getTamanio(),simple.getPrecio());
    }
    
}
