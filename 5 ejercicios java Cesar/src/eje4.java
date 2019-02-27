
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
public class eje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //Leer por teclado dos tablas de 10 números enteros
        //y mezclarlas en una tercera de la forma:
        //el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.
        Scanner tista = new Scanner(System.in);
          int a[], b[], c[];
        
        a = new int [10];
        b = new int [10];
        c = new int [20];
        
        System.out.println("Digite el primer arreglo que ut desea:.");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+"Ingrese un numero el que ut desea:.");
            a[i] = tista.nextInt();
        }
        
        System.out.println("Digite el segundo arreglo el que ut desea:.");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+"Ingrese un numero el que ut desea:.");
            b[i] = tista.nextInt();
        }
        
        int j=0;
        for (int i = 0; i < 10; i++) {
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }
        
        System.out.print("\nEl tercer arreglo es:.");
        for (int i = 0; i < 20; i++) {
            System.out.print(c[i]+" ");
        }
        System.out.println("");
      
    }
    
}
