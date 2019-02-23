
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
public class ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner tista = new Scanner(System.in);
        float P = (float) 0.25;
        float salario = 0;
        float nuevo_1 = 0;
        
        System.out.println("ingrese su sueldo anterior");
        System.out.println("para calcular su aumento");
        salario = Float.valueOf(tista.next());
        nuevo_1 = salario*P;
        System.out.println("su nuevo sueldo es de "+(salario+nuevo_1));
    }
    
}
