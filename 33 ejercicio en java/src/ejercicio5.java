
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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner buenas = new Scanner (System.in);
        
        String producto = "";
        float valor = 0;
        float DESCUENTO_1 = (float) 0.35;
        float total_2 = 0;
        float monto = 0;
        
        System.out.println("Ingrese el producto farmaceutico:");
        producto = buenas.next();
        System.out.println("Ingrese el valor del producto farmaceutico:");
        valor = buenas.nextInt();
        monto = valor * DESCUENTO_1;
        total_2 = valor - monto;
        System.out.println("El descuento del producto:"+producto+"es:"+monto);
        System.out.println("El total a pagar con el descuento aplicado es de:\nQ."+total_2);
    }
    
}
