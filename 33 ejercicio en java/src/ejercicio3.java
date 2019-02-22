
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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entra = new Scanner (System.in);
        
        float horas_1 = 0;
        float costo_hora = (float) 1.5;
        float total = 0;
        float resto = 0;
        
        System.out.println("Ingrese las horas que estarà en el café internet:");
        horas_1 = entra.nextFloat();
        
        if(horas_1 < 5)
        {
            total = horas_1 * costo_hora;
            System.out.println("EL total a pagar es de: Q."+total);
        }
        else if (horas_1 > 5)
        {
            resto = horas_1 -1;
            total = (float) (resto * 1.5);
            System.out.println("Se le regalar una hora gratis por exceder las 5 :-3");
            System.out.println("El total a pagar es de: Q."+total );           
        }
        else
        {
            System.out.println("Por favor ingrese lo solicitado:");
        }    
        
    }
    
}
