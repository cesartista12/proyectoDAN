
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
public class ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tista = new Scanner(System.in);
        int actual = 0;
        int nacimiento = 0;
        
        System.out.println("ingrese fecha actual");
        actual = Integer.valueOf(tista.next());
        System.out.println("ingrese fecha nacimiento");
        nacimiento = Integer.valueOf(tista.next());
        
        int edad = (actual-nacimiento);
        if(edad > 0 && nacimiento > 0 && actual > nacimiento )
        {
            System.out.println("su edad es de "+(actual-nacimiento));
        }
        else{
            System.out.println("la fecha nacimiento es negativa");
        }
    }
    
}
