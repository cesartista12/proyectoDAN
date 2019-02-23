
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
public class ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner tista = new Scanner(System.in);
        int años = 0;
        int meses = 0;
        int edad = 0;
        System.out.println("Ingresa los años que desea ");
        años = Integer.valueOf(tista.next());
        System.out.println("Ingresa los meses que desea ");
        meses = Integer.valueOf(tista.next());
        edad = (años * 12) + meses;
        System.out.println("tu edad en meses es:."+ edad);
    }
    
}
