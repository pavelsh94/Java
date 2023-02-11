
package MatrizVector;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {

        Scanner reader= new Scanner(System.in);
        
//        declaramos las variablres para la matriz y el vector

        int[]vector = new int[2];
        int[]producto = new int[3];
        int[][] matriz = new int [2][3];
        
//        for each para llenado de la matriz

        System.out.println("ingrese numeros a la matriz: ");
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[j] = reader.nextInt();
            }
           
        }
        
//        for para llenado de vector
        
        System.out.println("ingrese numero al vector: ");
        for (int i = 0; i < vector.length; i++) {
            vector[i]=reader.nextInt();
        }

//         mostrar matriz mediante for each

        System.out.println("los numeros q se llenaron a la matriz son: ");
        for(int[] matrizImp: matriz){
            for (int i = 0; i < matrizImp.length; i++) {
                System.out.print(matrizImp[i]+ " ");
               
            }
            System.out.println();
        }     
        
//        multiplicacion de vector con matriz y suma
       
        int suma;
        for (int i = 0; i < matriz[0].length; i++) {
            suma=0;
            for (int j = 0; j < vector.length; j++) {
                suma+=vector[j]*matriz[j][i];
                
            }
            producto[i]=suma;
           
        }
        
//        imprimir el resultado de la multiplicacion y suma de vector con la matriz
        
        System.out.println("la Suma de la matriz con el vector es: ");
       
        for (int i = 0; i < producto.length; i++) {
           
            System.out.print(producto[i]+" ");
        }
        System.out.println();
            
        

    }  
    
}   

