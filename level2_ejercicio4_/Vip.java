package level2_ejercicio4_;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Vip {

    Scanner sc = new Scanner(System.in);
 
    public void membresia(int numerosVip[],int cantidadAsientos){
        
    Set <Integer> conjunto = new HashSet<>();
    
        for (int i = 0; i < cantidadAsientos; i++) {
            
            System.out.println("Indicacion: Los acientos del palco van desde 3716 a 11147");
            System.out.println("Eliga el aciento del palco");
            numerosVip[i]= sc.nextInt();
            
            if(numerosVip[i] >= 3716 && numerosVip[i] <= 11147){
                if(!conjunto.add(numerosVip[i])){
                    System.out.println("El numero esta repetido");
                    System.out.println("Realice nuevamente el procedimiento");
                    membresia(numerosVip,cantidadAsientos);
                }
            } 
            else{
                System.out.println("El numero no esta en el rango de 3716-11147");
                System.out.println("Realice nuevamente el procedimiento");
                membresia(numerosVip,cantidadAsientos);
            }
        }  
    } 
}
