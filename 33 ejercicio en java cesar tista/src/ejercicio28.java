
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
public class ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner tista = new Scanner(System.in);
        
        float precio = 0;
        float IVA = (float) 0.09;
        float pro = 0;
        
        System.out.println("ingrese el precio del articulo que desea");
        precio = Float.valueOf(tista.next());
        System.out.println("ingrese la cantidad del articulo que desea");
        pro = Float.valueOf(tista.next());
        
        float to = precio*pro;
        float total = ((precio*pro)*IVA);
        
        System.out.println("la cantidad a pagar es de "+(to-total));
    }
    
}
