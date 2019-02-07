
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
public class ejercicio4 {
     // TODO code application logic here
    Scanner ingresar = new Scanner (System.in);
    float numero = 0;
    float cubo = 0;
    float cuadrado =0;
    int incremento =0;
    
    while (incremento != 5)
    {
        System.out.println("Ingrese el numero para elevarlo al cubo y al cuadrado:"); 
        numero = ingresar.nextFloat();
        cubo = numero*numero*numero;
        System.out.println("El numero al cuadrado es : " + cuadrado);
        System.out.println("El numero al cubo" + cubo);
        incremento++;
        
    }


    
    
}

