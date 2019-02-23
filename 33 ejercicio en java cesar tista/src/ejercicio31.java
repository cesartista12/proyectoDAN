
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
public class ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tista = new Scanner(System.in);
        float PI = (float) 3.1416;
        float radio_1 = 0;
        float area_1 = 0;
        
        System.out.println("bienvenido al prgrama de calcular area de un circulo");
        System.out.println("ingrese radio de un circulo");
        radio_1 = Float.valueOf(tista.next());
        
        area_1 = (PI*(radio_1*radio_1));
        
        System.out.println("el area del circulo es de:."+area_1);
    }
    
}
