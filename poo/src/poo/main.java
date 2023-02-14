
package poo;


import poo.Entidades.Libro;

/**
 *
 * @author Mrp
 */
public class main {

    
    public static void main(String[] args) {
//        se crea un nuevo libro
      Libro l1 = new Libro();

//        se llama al metodo de nuevo libro     
      Libro nLibro= l1.nuevoLibro();   
   
//          se imprime el registro
        System.out.println(nLibro);     
    }
   
}
