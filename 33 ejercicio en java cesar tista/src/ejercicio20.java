
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
public class ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tista = new Scanner(System.in);
        int n_hombre = 0;
        int n_mujeres = 0;
        int total = 0;
        
        System.out.println("Ingresa la cantidad de hombres el que desea:");
        n_hombre = Integer.valueOf(tista.next());
        System.out.println("Ingresa la cantidad de mujeres el que desea:");
        n_mujeres = Integer.valueOf(tista.next());
        
        total = n_hombre + n_mujeres;
        
        System.out.println("El porcentaje de mujeres es:" + ((n_mujeres *100) / total));
        System.out.println("El porcentaje de hombres es:" + ((n_hombre *100) / total));
    }
    
}
