
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
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tista = new Scanner(System.in);
        float MONEDAS1 = (float) 0.05;
        float MONEDAS2 = (float) 0.1;
        float MONEDAS3 = (float) 0.12;
        float MONEDAS4 = (float) 0.25;
        float MONEDAS5 = (float) 0.50;
        float MONEDAS6 = (float) 1;
        float monedas1 = (float) 0;
        float monedas2 = (float) 0;
        float monedas3 = (float) 0;
        float monedas4 = (float) 0;
        float monedas5 = (float) 0;
        float monedas6 = (float) 0;
        float total = (float) 0;
        System.out.println("Ingrese cantidad de monedas de 0.05:");
        monedas1 = Float.valueOf(tista.next());
        System.out.println("Ingrese cantidad de monedas de 0.10:");
        monedas2 = Float.valueOf(tista.next());
        System.out.println("Ingrese cantidad de monedas de 0.12:");
        monedas3 = Float.valueOf(tista.next());
        System.out.println("Ingrese cantidad de monedas de 0.25:");
        monedas4 = Float.valueOf(tista.next());
        System.out.println("Ingrese cantidad de monedas de 0.5:");
        monedas5 = Float.valueOf(tista.next());
        System.out.println("Ingrese cantidad de monedas de 1:");
        monedas6 = Float.valueOf(tista.next());
        total = (monedas1 * MONEDAS1) + (monedas2 * MONEDAS2) + (monedas3 * MONEDAS3) + (monedas4 * MONEDAS4) + (monedas5 * MONEDAS5) + (monedas6 * MONEDAS6); 
        System.out.println("Total: "+ total);
    }
    
}
