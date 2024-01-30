package level2_ejercicio4_;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PalcosVip {

    Scanner sc = new Scanner(System.in);
      
    public void membresia(int numerospalcoVip[], int cantidadAsientos) {

        Set<Integer> conjunto = new HashSet<>();
                    
        for (int i = 0; i < cantidadAsientos; i++) {
            System.out.println("Eliga el aciento Palco");
            numerospalcoVip[i] = sc.nextInt();

            if (numerospalcoVip[i] >= 1 && numerospalcoVip[i] <= 3715) {
                if (!conjunto.add(numerospalcoVip[i])) {
                    System.out.println("Colocaste un numero repetido");
                    System.out.println("Realice nuevamente el procedimiento");
                    membresia(numerospalcoVip, cantidadAsientos);
                    break;
                }
            } else {
                System.out.println("Has colocado un aciento que no esta incluido el rango es de 1 a 3715");
                System.out.println("Realice nuevamente el procedimiento");
                membresia(numerospalcoVip, cantidadAsientos);
                break;
            }
        }    
    }   
}
