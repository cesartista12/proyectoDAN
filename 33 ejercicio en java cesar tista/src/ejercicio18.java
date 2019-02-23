
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
public class ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tista = new Scanner(System.in);
        float TAZA = (float) 0.15;
        float valor_compra = 0;
        float des = 0;
        
        System.out.println("Ingrese valor de la compra el que desea:");
        valor_compra = Float.valueOf(tista.next());
        
        des = valor_compra * TAZA;
        System.out.println("Tu descuento es:"+ des);
        
        System.out.println("Tu total a pagar es:" + (valor_compra - des));
    }
    
}
