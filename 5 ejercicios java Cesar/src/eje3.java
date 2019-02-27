
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
public class eje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tista = new Scanner(System.in);
        int da[];
        da = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("ingrese un valor el que ut desea ");
            da[i] = Integer.valueOf(tista.next());
        }
        System.out.println("los valores son");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("valor-"+ da[i]+" valor2-"+da[9-i]);
        }
    }
    
}
