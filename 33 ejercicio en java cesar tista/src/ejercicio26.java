
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
public class ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tista = new Scanner(System.in);
        int numero_0 = 0;
        int numero_1 = 0;
        int numero_2 = 0;
        System.out.println("ingrese un numero");
        numero_0 = Integer.valueOf(tista.next());
        System.out.println("ingrese un segundo numero");
        numero_1 = Integer.valueOf(tista.next());
        System.out.println("ingrese un tercer numero");
        numero_2 = Integer.valueOf(tista.next());
        
        
        int suma = (numero_0+numero_1+numero_2);
        int resta = (numero_0-numero_1-numero_2);
        int multi = (numero_0*numero_1*numero_2);
        if (suma > 0 && resta > 0 && multi > 0){
            System.out.println("la suma es "+suma);
            System.out.println("la resta es "+resta);
            System.out.println("la multipĺicacion es "+multi);

        }
        else{
            System.out.println("los numeros son negativos");
        }
    }
    
}
