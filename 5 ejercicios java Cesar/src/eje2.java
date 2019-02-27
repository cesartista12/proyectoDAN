
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
public class eje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tista = new Scanner(System.in);
        int nu[];
        nu = new int[5];
        int conta_p = 0, conta_n = 0, conta_0 = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese un valor que el usted desea ");
            nu[i] = Integer.valueOf(tista.next());
            if(nu[i] > 0){
                conta_p++;
            }
            else if(nu[i] < 0){
                conta_n++;
            }
            else{
                conta_0++;
            }
        }
        
        System.out.println("La cantidad de positivos es "+ conta_p);
        System.out.println("La cantidad de negativos es "+ conta_n);
        System.out.println("La cantidad de ceros es "+ conta_0);
    }
    
}
