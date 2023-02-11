
package funciones;

import static funciones.Funciones.sumar;
import java.util.Scanner;

/**
 *
 * @author Mrp
 */
public class Funciones {

    public static void main(String[] args) {
      Scanner reader= new Scanner(System.in);

//      declarar variable resultado y leer por teclado los elementos de la funcion suma  

        int resultado=sumar((reader.nextInt()),(reader.nextInt()));
        
//        mostrar por pantalla el resultado de la funcion suma
        
        System.out.println(resultado);
        
//        leer por teclado el nombre de la funcion saludo
        
        System.out.println("ingrese su nombre: ");
        saludo(reader.next());
    }
    public static int sumar(int a, int b){
    int resultado= a +b;
    
        return resultado;
        
    }
    public static void saludo(String nombre){
        System.out.println("hola " +nombre+ " como estas");
    }
}
