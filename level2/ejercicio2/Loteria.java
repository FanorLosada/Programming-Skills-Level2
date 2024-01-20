package level2.ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class Loteria {
    
    Scanner sc = new Scanner(System.in);
    
    public void loteria(){
        
        String boletos[] = {"5678B", "9876C", "2345D", "6789E", "3456F", "8765G", 
        "4321H", "7890J", "5432K", "2109L", "8765M", "1357N", "2468P", "6543Q", 
        "7891R", "3579S", "9821T", "4682U", "5763V", "1234A"};
    
        System.out.println("Bienvenido\nEstos son los boletos disponibles");
        System.out.println("---------------------------------------------");
        
        for (String boleto : boletos) {
            System.out.println(boleto);
        }
        
        compra(boletos); 
    } 
    
    public void compra(String boletos[]) {

        System.out.println("---------------------------------------------");
        System.out.println("\nIndique cuantos boletos quiere comprar");
        System.out.println("1 o 2");
        int cantidadBoletos = sc.nextInt();
        int precioBoleto = 1;
        
        
        
        switch (cantidadBoletos) {

            case 1:
                break;
            case 2:
                precioBoleto = 2;
                break;
            default:
                System.out.println("Has ingresado incorrectamente");
                loteria();
                break;
        } 
        int indice = 1;
        
        String[] boletosUsuario =new String[cantidadBoletos];

        for (int i = 0; i < cantidadBoletos; i++) {
            System.out.println("Ingrese el boleto " + indice + ": ");
            String boletoIngresado = sc.next();
            
            // Validación del boleto
            if (Arrays.asList(boletos).contains(boletoIngresado)) {
                System.out.println("El boleto " + boletoIngresado + " es válido.");
                boletos[i] = boletoIngresado;  // Guardar el boleto válido en el array
                boletosUsuario[i] = boletoIngresado;
                indice++;
            } else {
                System.out.println("Error: El boleto " + boletoIngresado + " no es válido.");
                i--;  // Repetir la entrada del boleto
            }
        }
        
        texto(precioBoleto, boletos, cantidadBoletos,boletosUsuario);   
    }
    
    public void texto(int precioBoleto, String boletos[],int cantidadBoletos,String boletosUsuario[]){
        
        System.out.println("El total es de: "+precioBoleto+" dolares");
        sc.nextLine();
       
        boolean opcionPagoB = true;
        
        while (opcionPagoB) {

            System.out.println("Indique si quiere pagar en efectivo o tarjeta bancaria");
            String opcionPago = sc.nextLine();
                               
            String opcionPagoM = opcionPago.toLowerCase();
            
            if (!opcionPagoM.equals("efectivo") && !opcionPagoM.equals("tarjeta bancaria")) {
                System.out.println("Valor ingresado no valido");
                opcionPagoB= true;
                System.out.println("Ingrese nuevamente");
            }
            else {
                opcionPagoB = false;
                pago(precioBoleto,cantidadBoletos,boletos,boletosUsuario);
            }            
        }        
    } 
    
    public void pago(int precioBoleto, int cantidadBoletos, String boletos[],String boletosUsuario[]){
        
        
        System.out.println("Solo se puede ingresar billetes de 1 USD y 5 USD");
        System.out.println("Indique la opcion");
        System.out.println("1. Billetes de 1 USD");
        System.out.println("2. Billetes de 5 USD");
        int opcionBilletes = sc.nextInt();

        int devolucion = 0;
        
        switch(opcionBilletes){
            
            case 1:
                
                boolean opcion = true;
                
                while (opcion) {
                    System.out.println("Has ingresado billetes de 1 USD\nIndique la cantidad de billetes a ingresar: ");
                    int cantidadBilletesU = sc.nextInt();
                    if (cantidadBoletos == 2 && cantidadBilletesU == 1) {
                        System.out.println("No te alcanza");
                        System.out.println("Haz el procedimiento nuevamente");
                    } else {
                        int devolucionU = cantidadBilletesU - precioBoleto;
                        devolucion = devolucionU;
                        opcion = false;
                    }
                }
                boleto(boletos,devolucion, opcionBilletes,precioBoleto,boletosUsuario);
                break;
                
            case 2:
                System.out.println("Has ingresado billetes de 5 USD");
                System.out.println("Indique la cantidad de billetes a ingresar: ");
                int cantidadBilletesC= sc.nextInt();
                int devolucionC = (5 * cantidadBilletesC)-precioBoleto;
                devolucion = devolucionC;
                boleto(boletos,devolucion, opcionBilletes,precioBoleto,boletosUsuario);
                break;
                
            default:    
                System.out.println("Has ingresado un valor no valido");
                       
        }
        
    }
    
    public void boleto(String boletos[], int devolucion, int opcionBilletes,int precioBoleto,String boletosUsuario[]){
        
        int indice = 1;

        System.out.println("BOLETO");
        System.out.println("------------------------------------");
        System.out.println("Sus boletos son: ");
        
        for (String boleto: boletosUsuario) {
            System.out.println("Boleto " + indice + ": " + boleto);
            indice++;
        }
        
        System.out.println("El costo es de: "+precioBoleto+"\nSe le devuelve: "+devolucion);
    }
}
