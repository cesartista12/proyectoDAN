
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
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner cesar = new Scanner(System.in);
        float MI_CU = (float)0.5;
        float largo_1 = 0;
        float ancho_1 = 0;
        
        System.out.println("Ingrese largo de la pared en metros:");
        largo_1 = Float.valueOf(cesar.next());
        System.out.println("Ingrese ancho de la pared en metros:");
        ancho_1 =  Float.valueOf(cesar.next());
        
        System.out.println("La arena requerida es:."+ ((largo_1 * ancho_1 )*MI_CU));
    }
    
}
