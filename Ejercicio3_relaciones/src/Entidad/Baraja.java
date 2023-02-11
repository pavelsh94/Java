/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import Enumeraciones.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usario
 */
/*Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o 
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de 
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero 
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna 
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y 
luego se llama al método, este no mostrara esa primera carta*/
public class Baraja {
    private List<Carta> listaCartas = new ArrayList();
    private List<Carta> listaRetiradas = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Baraja() {
    }

    public List<Carta> getListaCartas() {
        return listaCartas;
    }

    public void setListaCartas(List<Carta> listaCartas) {
        this.listaCartas = listaCartas;
    }
    
    public void llenarBaraja(){
       // System.out.println("rrr");
        Palo []palo = Palo.values();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 13; j++) {
                if (j!=8 && j!=9) {
                    listaCartas.add(new Carta(j, palo[i]));
                }
            }
        }
    }
    
    public void mostrarBaraja(){
       // System.out.println("aaaa");
        System.out.println("Las cartas son:");
        for (Carta var : listaCartas) {
            System.out.println(var.toString());
        }
    }
    
    public void barajar(){
        Collections.shuffle(listaCartas);
    }
    
    public void siguienteCarta(){
        //int siguiente;
        if (listaCartas.get(0) != null) { //listaCartas.size()=0
            System.out.println(listaCartas.get(0));
            listaRetiradas.add(listaCartas.get(0));
            listaCartas.remove(0);
        }else{
            System.out.println("Ya no hay más cartas.");
        }
    }
    
    public void cartasDisponibles(){
        System.out.println("Las cartas disponibles son:"+listaCartas.size());
    }
    
    public void darCartas(){
        System.out.println("Ingrese la cantidad de cartas que desea:");
        int cantidad=leer.nextInt();
        if (listaCartas.size() > cantidad) {
            for (int i = 0; i < cantidad; i++) {
            siguienteCarta();
        }
        }else{
            System.out.println("No hay suficientes cartas.");
        }
    } 
    
    public void cartasMonton(){
        if (listaRetiradas.size() > 0) {
            for (Carta aux : listaRetiradas) {
            System.out.println(aux);
        }
        }else{
            System.out.println("No salió ninguna carta.");
        }
    }
    
    public void menu(){
        int opc;
        do{
        System.out.println("Ingrese una opción:");
        System.out.println("1-Llenar baraja");
        System.out.println("2-Barajar");
        System.out.println("3-Siguiente carta");
        System.out.println("4-Cartas disponibles");
        System.out.println("5-Dar cartas");
        System.out.println("6-Cartas montón");
        System.out.println("7-Mostrar baraja");
        System.out.println("8-Salir");
        opc=leer.nextInt();
            switch (opc) {
                case 1:
                    llenarBaraja();
                    break;
                case 2:
                    barajar();
                    break;
                case 3:
                    siguienteCarta();
                    break;
                case 4:
                    cartasDisponibles();
                    break;
                case 5:
                    darCartas();
                    break;
                case 6:
                    cartasMonton();
                    break;
                case 7:
                    mostrarBaraja();
                    break;
                case 8:
                    System.out.println("Que tenga un buen día.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opc!=8);
    }
}
