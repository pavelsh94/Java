
package Circunferencia;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author Mrp
 */
public class Circunferencia {
    
    private Double radio;

    public Circunferencia(Double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
  
    public void crearCircunferencia(){
        Scanner reader = new Scanner(System.in);
        System.out.println("ingrese el radio: ");
        double radio = reader.nextDouble();
    }
    
    public double area(){
            return Math.PI * Math.pow(radio, 2);                     
    }
    
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
    
    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
    

    
    
    
    
    
}
