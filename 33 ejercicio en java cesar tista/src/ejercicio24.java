
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
public class ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner tista = new Scanner(System.in);
        float peso_1 = 0;
        System.out.println("ingrese el peso en kilos el que desea");
        peso_1 = Float.valueOf(tista.next());
        
        System.out.println("el peso en gramos es de:."+(peso_1*1000));
        System.out.println("el peso en libras es de:."+(peso_1*2.20462));
        System.out.println("el peso en toneladas es de:."+(peso_1*0.001));
    }
    
}
