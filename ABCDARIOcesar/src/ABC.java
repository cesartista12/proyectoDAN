
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
public class ABC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tista = new Scanner(System.in);
        
        char mayusculas[] = new char[26];
        for (int i = 65, j = 0; i <= 90; i++, j++)
        {
            mayusculas[j] = (char) i;
        }   
        
        String cadena = "";
        int eleccion = -1;
        
        do
        {
            System.out.println("ELIJA UN INDICE ENTRE 0 y "+(mayusculas.length -1));
            eleccion = Integer.valueOf(tista.next());
            
            if (!(eleccion >= 0 && eleccion <= mayusculas.length -1))
            {
                System.out.println("Error,el numero que ingreso ingrese otro numero");
            }
            else
            {
                if (eleccion != -1)
                {
                    cadena += mayusculas[eleccion];
                }
            }
        } while (eleccion != -1);
        System.out.println(cadena);
    }
    
}

