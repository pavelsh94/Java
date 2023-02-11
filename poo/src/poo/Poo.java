
package poo;

import java.util.Scanner;
import poo.Entidades.Libro;

/**
 *
 * @author Mrp
 */
public class Poo {

    
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
       Libro usu1 = new Libro(reader.nextInt(), reader.next(), reader.next(),reader.nextInt());
       
        System.out.println(usu1.isbn +" "+ usu1.titulo +" "+usu1.autor +" "+ usu1.numPagina);
       
                
        
        
    }
   
}
