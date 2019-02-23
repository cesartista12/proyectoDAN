
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
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tista = new Scanner(System.in);
        int v_1 = 0;
        int v_2 = 0;
        int operacion_1 = 0;
        int operacion_2 = 0;
        
        System.out.println("Ingresa el primer valor:");
        v_1 = Integer.valueOf(tista.next());
        System.out.println("Ingresa el primer valor:");
        v_2 = Integer.valueOf(tista.next());
        operacion_1 = (v_1 * 2) + (v_2 *v_2);
        operacion_2 = ((v_1 * v_1 * v_1)+(v_2 * v_2 * v_2))/3;
        
        System.out.println("La primera operacion es: " + operacion_1);
        System.out.println("La segunda operacion es: " + operacion_2);
    }
    
}
