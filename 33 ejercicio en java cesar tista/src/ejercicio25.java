
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
public class ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tista = new Scanner(System.in);
        int numero_0 = 0;
        int numero_1 = 0;
        System.out.println("ingrese un numeroel que desea");
        numero_0 = Integer.valueOf(tista.next());
        System.out.println("ingrese un segundo numero el que desea");
        numero_1 = Integer.valueOf(tista.next());
        if (numero_0 >= 0 && numero_1 >= 0)
        {
            System.out.println("la suma es:."+(numero_0+numero_1));
            System.out.println("la multiplicacion es:."+(numero_0*numero_1));
        }
        else{
            System.out.println("ingrese un numero positivo");
        }
    }
    
}
