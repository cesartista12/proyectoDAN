
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
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner tista = new Scanner(System.in);
        float DES =(float) 0.20;
        float sueldo_1 = 0;
        
        System.out.println("Ingresa tu sueldo actual del empleado:");
        sueldo_1 = Float.valueOf(tista.next());
        System.out.println("Tu nuevo sueldo es: "+ (sueldo_1 - (sueldo_1 * DES)));
    }
    
}
