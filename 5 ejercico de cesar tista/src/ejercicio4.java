
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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner tista = new Scanner(System.in);
        int dia = 0, mes = 0, año = 0;
        System.out.println("Ingres dia el que desea:.");
        dia = Integer.valueOf(tista.next());
        System.out.println("Ingres mes el que desea:.");
        mes = Integer.valueOf(tista.next());
        System.out.println("Ingres año el que desea:.");
        año = Integer.valueOf(tista.next());
        
        if(año > 0){
            if(mes > 0 && mes < 13){
                if(dia > 0 && dia < 30){
                    System.out.println("La fecha:."+dia+"-"+mes+"-"+año+" es correcta");
                }else{
                    System.out.println("El dia es incorrecto");
                }
            }else{
                    System.out.println("El mes es incorrecto");
                }
        }else{
            System.out.println("El año es incorrecto:.");
        }
    }
}
