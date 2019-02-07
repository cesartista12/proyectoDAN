/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos;

import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class Proyectos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        Scanner ingresar = new Scanner (System.in);
        float cantidad_q = 0;
        float cantidad_d =0;
        float total = 0;
        System.out.println("Sistema para convertir cantidad de quetzales a dolar");
        System.out.println("Ingresa la cantidad de como esta hoy el dolar;");
        cantidad_d = ingresar.nextFloat();
        System.out.println("Ingresa la cantidad en quetzales");
        cantidad_q = ingresar.nextFloat();
        total = (cantidad_q*cantidad_d);
        System.out.println("La cantidad totalen dolares es de : "+ total);
        
        
    }

    private static float nextFloat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
