
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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);

        float kilomentros = 0;
        float PRECIO = (float) 10.50;
        float total = 0;
        
        System.out.println("Ingrese los kilometro a recorrer:");
        int kilometros_1 = teclado.nextInt();
        total = PRECIO * kilometros_1;
        
        System.out.println("El precio del boleto es: Q."+ total);
    }
    
}
