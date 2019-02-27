
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
public class eje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tista = new Scanner(System.in);
        int vals[];
        vals = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un numero el que usted desea");
            vals[i] = Integer.valueOf(tista.next());
        }
        System.out.println("Los valores son ");
        for (int i = 0; i < 5; i++) {
            System.out.println(vals[i]);
        }
        
    }
    
}
