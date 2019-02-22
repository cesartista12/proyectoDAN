
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cesar
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cesar = new Scanner (System.in);
        
        float salario = 0;
        float INCREMENTO_1 =  (float) 0.08;
        float DESCUENTO = (float) 0.025;
        float incremento = 0;
        float descuento = 0;
        float total = 0;
        
        System.out.println("Ingrese el salario para poder hacer las operaciones correspondientes:");
        salario = cesar.nextFloat();
        incremento = salario * INCREMENTO_1;
        descuento = salario * DESCUENTO;
        total = (salario - descuento) + incremento;
        System.out.println("El salario total  luego de las operaciones es:\nQ."+total);
    }
    
}
