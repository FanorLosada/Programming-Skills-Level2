package level2_ejercicio4_;

import java.util.ArrayList;
import java.util.Scanner;

public class Manchester {

    Scanner sc = new Scanner(System.in); 
    
    public void sesion() {

        String usuario = "1";
        String contrasenaU = "1";

        int opcion = 0;
        int indice = 2; 
        
        
        while (opcion < 3) {
            
            System.out.println("Ingrese su nombre de usuario");
            String nombreU = sc.nextLine();
            System.out.println("Ingrese su contraseña");
            String contrasena = sc.nextLine();
            
            if (usuario.equals(nombreU) && contrasenaU.equals(contrasena)) {
                membresia();
                return;
            } else {
                
                if(indice == 2 || indice ==1) System.out.println("Tienes "+indice+" intentos");
                else if(indice == 0) System.out.println("Hasta pronto");  
                indice--;
                opcion++;
            }
        }
        sc.close();
        System.exit(0);
    }

   
    public void membresia(){        
       System.out.println("Indique si usted tiene membresia: ");
       String opcionMembresia= sc.nextLine();
       opcionMembresia = opcionMembresia.toLowerCase();
       boolean membresia = true;
       
       if(opcionMembresia.equals("si")){
           membresia = true;
           asientos(membresia);
       }
       else if(opcionMembresia.equals("no")){
           membresia = false;
           noMembresia(membresia);
       }
    }
    
    
    public void asientos(boolean tieneMembresia) {

        System.out.println("Indique el tipo de asiento\n1. Palco\n2. Asientos VIP\n3. Asiento general ");
        int opcion = sc.nextInt();
        int cantidadAsientos; 
        double precioTotal; 
        double descuentoMembresia = 0.15;
        if (tieneMembresia == true) {
            System.out.println("Puedes comprar hasta 10 acientos");
            
            switch (opcion) {
                case 1:
                    
                    PalcosVip palcovip = new PalcosVip();
                    System.out.println("Indique la cantidad de asientos: ");
                    cantidadAsientos = sc.nextInt();
                    int numerospalcoVip[] = new int[cantidadAsientos];
                    palcovip.membresia(numerospalcoVip,cantidadAsientos); 
                    precioTotal = (cantidadAsientos*1000)/descuentoMembresia ;
                    System.out.println("El precio es: "+precioTotal);
                    break;
                    
                case 2: 
                    
                    Vip vip = new Vip();
                    System.out.println("Indique la cantidad de asientos: ");
                    cantidadAsientos = sc.nextInt();
                    int numerosVip[] = new int[cantidadAsientos];
                    vip.membresia(numerosVip,cantidadAsientos); 
                    precioTotal = (cantidadAsientos*500)/descuentoMembresia;
                    System.out.println("El precio es: "+precioTotal);
                    break;
                    
                    
                case 3: 
                    
                    AsientosGeneral asientosg = new AsientosGeneral();
                    System.out.println("Indique la cantidad de asientos: ");
                    cantidadAsientos = sc.nextInt();
                    int numerosGeneral[] = new int[cantidadAsientos];
                    asientosg.membresia(numerosGeneral,cantidadAsientos); 
                    precioTotal = (cantidadAsientos*90)/descuentoMembresia;
                    System.out.println("El precio es: "+precioTotal);                    

            }
        }
    }
    
    public void noMembresia(boolean membresia){
        
        System.out.println("Indique el tipo de aciento\n1. Palco\n2. Asientos VIP\n3. Asiento general ");
        int opcion = sc.nextInt();
        int cantidadAsientos; 
        int precioTotal; 
        if (membresia == false) {
            System.out.println("Puedes comprar hasta 3 asientos");
            
            switch (opcion) {
                case 1:
                    
                    PalcosVip palcovip = new PalcosVip();
                    System.out.println("Indique la cantidad de asientos: ");
                    cantidadAsientos = sc.nextInt();
                    int numerospalcoVip[] = new int[cantidadAsientos];
                    palcovip.membresia(numerospalcoVip,cantidadAsientos); 
                    precioTotal = cantidadAsientos*1000;
                    System.out.println("El precio es: "+precioTotal);
                    break;
                    
                case 2: 
                    
                    Vip vip = new Vip();
                    System.out.println("Indique la cantidad de asientos: ");
                    cantidadAsientos = sc.nextInt();
                    int numerosVip[] = new int[cantidadAsientos];
                    vip.membresia(numerosVip,cantidadAsientos); 
                    precioTotal = cantidadAsientos*500;
                    System.out.println("El precio es: "+precioTotal);
                    break;
                    
                    
                case 3: 
                    
                    AsientosGeneral acientosg = new AsientosGeneral();
                    System.out.println("Indique la cantidad de asientos: ");
                    cantidadAsientos = sc.nextInt();
                    int numerosGeneral[] = new int[cantidadAsientos];
                    acientosg.membresia(numerosGeneral,cantidadAsientos); 
                    precioTotal = cantidadAsientos*90;
                    System.out.println("El precio es: "+precioTotal);                    

            }
        }        
    }  
}
