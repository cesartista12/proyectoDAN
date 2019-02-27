
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
public class eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner tista = new Scanner(System.in);
        int arre[];
        arre = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese un valor que usted desea  ");
            arre[i] = Integer.valueOf(tista.next());
        }
        
        System.out.println("Los valores son");
        
        for (int i = 4; i >=  0; i--) {
            System.out.println("El valor es "+ arre[i]);
        }
    }
    
}
