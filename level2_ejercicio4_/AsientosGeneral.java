package level2_ejercicio4_;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AsientosGeneral {
    
    public void membresia(int numerosGeneral[],int cantidadAsientos){

        Scanner sc = new Scanner(System.in);
        
        Set<Integer> conjunto = new HashSet<>();
         
        
        if (cantidadAsientos <= 10) {
            for (int i = 0; i < cantidadAsientos; i++) {
                System.out.println("Ingrese el aciento");
                numerosGeneral[i] = sc.nextInt();
                if (numerosGeneral[i] > 11148 && numerosGeneral[i] < 74310) {
                    if(!conjunto.add(numerosGeneral[i])){
                        System.out.println("El numero esta repetido: ");
                        System.out.println("Realice nuevamente el procedimiento");
                        membresia(numerosGeneral,cantidadAsientos);
                    }
                }
                else{
                    System.out.println("El numero sobrepaso el rango 11148 - 74310");
                    System.out.println("Realice nuevamente el procedimiento");
                     membresia(numerosGeneral,cantidadAsientos);
                }
            }
        }
    }  
}
