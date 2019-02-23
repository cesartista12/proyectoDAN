
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
public class ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tista = new Scanner(System.in);
        float TAZA = (float) 0.10;
        float sueldo = (float) 0;
        float venta_1 = (float) 0;
        float venta_2 = (float) 0;
        float venta_3 = (float) 0;
        float comision = (float) 0;
        
        System.out.println("Ingrese sueldo base el que desea:");
        sueldo = Float.valueOf(tista.next());
        
        System.out.println("Ingrese valor de la primera venta el que desea:");
        venta_1 = Float.valueOf(tista.next());
        System.out.println("Ingrese valor de la segunda venta el que desea:");
        venta_2 = Float.valueOf(tista.next());
        System.out.println("Ingrese valor de la tercera venta el que desea:");
        venta_3 = Float.valueOf(tista.next());
        
        comision = (venta_1 + venta_2 + venta_3) * TAZA;
        
        System.out.println("Tu sueldo es: " + sueldo);
        System.out.println("tu comision es: "+ comision);
        System.out.println("Total:"+ (sueldo+comision));
    }
    
}
