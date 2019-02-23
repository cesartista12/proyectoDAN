
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
public class ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tista = new Scanner(System.in);
        
        float TAZA = (float) 0.025;
        float capi_1 = (float) 0;
        float inte_1 = (float) 0;
        
        System.out.println("Ingresa el capital el que desea:");
        capi_1 = Float.valueOf(tista.next());
        inte_1 = (capi_1 * TAZA) *12;
        System.out.println("Tu interes es de:." + inte_1);
    }
    
}
