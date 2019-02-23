
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
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tista = new Scanner(System.in);
        float pre = (float) 0;
        int h = 0;
        int horas_extras = 0;
        
        System.out.println("Ingresa precio de hora:");
        pre = Float.valueOf(tista.next());
        System.out.println("Ingresa horas trabajadas:.");
        h = Integer.valueOf(tista.next());
        System.out.println("Ingresa horas extra trabajadas:.");
        horas_extras = Integer.valueOf(tista.next());
        
        System.out.println("Tu sueldo es:."+ ((pre * h) +(pre * (horas_extras * 2))));
    }
    
}
