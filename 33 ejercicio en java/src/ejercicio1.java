
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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner (System.in);
        
        int prestamo_bancario = 10000;
        float interes = (float) 0.27;
        float monto_cabal = 0;
        int años = 0;
        
        System.out.println("El prestamo concedido es:  Q"+prestamo_bancario );
        monto_cabal = prestamo_bancario * interes;
        System.out.println("El monto total a pagar es de:  Q"+monto_cabal );   
    }
    
}
