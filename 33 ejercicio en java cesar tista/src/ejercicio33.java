
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
public class ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tista = new Scanner(System.in);
        float lbrs = 0;
        float KILOGRAMOS = (float) 2.2046;
        
        System.out.println("ingrese cantidad en cm para convertilos a pulgadas el que desea");
        lbrs = Float.valueOf(tista.next());
        
        System.out.println("la cantida en kilogramos es de :."+(lbrs*KILOGRAMOS));
    }
    
}
