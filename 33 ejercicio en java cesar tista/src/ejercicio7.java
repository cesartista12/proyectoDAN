
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
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tista = new Scanner (System.in);
        
        float presupuesto = 0;
        float URGENCIAS = (float) 0.37;
        float PEDIATRIA = (float) 0.42;
        float TRAUMATOLOGIA = (float) 0.21;
        float urgencias = 0;
        float pediatria = 0;
        float traumatologia = 0;
        
        System.out.print("Por favor ingrese el presupuestro del hostiptal para dividirlas: \nQ.");
        presupuesto = tista.nextFloat();
        
        urgencias = presupuesto * URGENCIAS;
        System.out.println("El presupuesto para el area de Urgencias es de: Q."+urgencias);
        
        pediatria = presupuesto * PEDIATRIA;
        System.out.println("El presupuesto para el area de Pediatria es de: Q."+pediatria);
        
        traumatologia = presupuesto * TRAUMATOLOGIA;
        System.out.println("El presupuesto para el area de Traumatologia es de: Q."+traumatologia);
    }
    
}
