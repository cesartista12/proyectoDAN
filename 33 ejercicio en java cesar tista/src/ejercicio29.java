
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
public class ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tista = new Scanner(System.in);
        float nota_1 = 0;
        float nota_2 = 0;
        float nota_3 = 0;
        float promedio = 0;
        
        System.out.println("ingresa nota1");
        nota_1 = Float.valueOf(tista.next());
        System.out.println("ingresa nota2");
        nota_2 = Float.valueOf(tista.next());
        System.out.println("ingresa nota3");
        nota_3 = Float.valueOf(tista.next());
        promedio = (nota_1+nota_2+nota_3)/3;
        
        if(promedio >= 16){
            System.out.println(promedio);
            System.out.println("el promedio total es 20 gano");
            
        }
        else if(promedio >= 9.5){
            System.out.println("aprobado");
        }
        else{
            System.out.println("desaprobado");
        }
    }
    
}
