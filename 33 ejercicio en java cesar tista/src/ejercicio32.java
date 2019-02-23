
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
public class ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tista = new Scanner(System.in);
        float cm = 0;
        float PI = (float) 0.39737;
        
        System.out.println("ingrese cantidad en cm para convertilos a pulgadas el que desea");
        cm = Float.valueOf(tista.next());
        
        System.out.println("la medida en pulgadas es de:."+(cm*PI));
    }
    
}
