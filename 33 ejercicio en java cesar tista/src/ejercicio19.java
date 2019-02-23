
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
public class ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner tista = new Scanner(System.in);
        int not_1 = 0;
        int not_2 = 0;
        int not_3 = 0;
        int nota_final = 0;
        
        System.out.println("Ingresa primera nota:.");
        not_1 = Integer.valueOf(tista.next());
        System.out.println("Ingresa segunda nota:.");
        not_2 = Integer.valueOf(tista.next());
        System.out.println("Ingresa tercera nota:.");
        not_3 = Integer.valueOf(tista.next());
        
        System.out.println("Tu nota final es:"+(not_1 + not_2 + not_3));
    }
    
}
