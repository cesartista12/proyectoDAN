
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
public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tista = new Scanner(System.in);
        int valor_1 = 0;
        int valor_2 = 0;
        int valor_3 = 0;
        int resultado = 0;
        System.out.println("Ingresa el primer valor:");
        valor_1 = Integer.valueOf(tista.next());
        System.out.println("Ingresa el segundo valor:");
        valor_2 = Integer.valueOf(tista.next());
        System.out.println("Ingresa el tercero valor:");
        valor_3 = Integer.valueOf(tista.next());
        
        resultado = Integer.valueOf(String.valueOf(valor_1)+String.valueOf(valor_2)+String.valueOf(valor_3));
        System.out.println("El resultado es:" + resultado);
    }
    
}
