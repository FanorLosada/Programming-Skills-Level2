package level2_ejercicio1;

import java.util.Random;

public class Equipo {

    Random random = new Random();

    private String nombre;
    private int puntaje;

    int totalMu = 0;
    int totalL = 0;    
    int totalA = 0;
    int totalC = 0;
    int totalT = 0;
    int totalMc = 0; 
    
    public Equipo() {
    }

    public Equipo(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public Equipo resultadoEquipoUno(){
    
        int contador = 0; 
        
        int puntosL;
        int puntosMu;

        Equipo resultado = new Equipo();
        
        while (contador <= 5) {
            contador++;
            
            for (int i = 0; i < 1; i++) {
                puntosMu = random.nextInt(3);
                puntosL = random.nextInt(3);
                
                //3 Puntos 
                if (puntosMu == 2) {
                    puntosMu = 3;
                    puntosL = 0;
                } else if (puntosL == 2) {
                    puntosL = 3;
                    puntosMu = 0;
                } //1 Punto
                else if (puntosL == 1 || puntosMu== 1) {
                    puntosL = 1;
                    puntosMu = 1;

                } //0 Puntos
                else if (puntosMu == 0) {
                    puntosL = 2;
                    if (puntosL == 2) {
                        puntosL = 3;
                    }
                } else if (puntosL == 0) {
                    puntosMu = 2;
                    if (puntosMu == 2) {
                        puntosMu = 3;
                    }
                } 
                resultado.totalL +=puntosL;
                resultado.totalMu +=puntosMu;  
            }
        }
        return resultado; 
    }
    
    public Equipo resultadoEquipoDos(){
        
        int contador = 0; 
        
        Equipo resultado = new Equipo();
        
        int puntosA;
        int puntosC;
 
        while (contador <= 5) {
            contador++;
            
            for (int i = 0; i < 1; i++) {
                puntosA = random.nextInt(3);
                puntosC = random.nextInt(3);
                
                //3 Puntos 
                if (puntosA == 2) {
                    puntosA = 3;
                    puntosC = 0;
                } else if (puntosC == 2) {
                    puntosC = 3;
                    puntosA = 0;
                } //1 Punto
                else if (puntosC == 1 || puntosA== 1) {
                    puntosC = 1;
                    puntosA = 1;

                } //0 Puntos
                else if (puntosA == 0) {
                    puntosC = 2;
                    if (puntosC == 2) {
                        puntosC = 3;
                    }
                } else if (puntosC == 0) {
                    puntosA = 2;
                    if (puntosA == 2) {
                        puntosA = 3;
                    }
                } 
                resultado.totalA +=puntosA;
                resultado.totalC +=puntosC;  
            }
        }
        return resultado; 
    }      
    
    
    public Equipo resultadoEquipoTres(){
        
        Equipo resultado = new Equipo();

        int contador = 0; 
        
        int puntosMc;
        int puntosT;

        while (contador <= 5) {
            contador++;
            
            for (int i = 0; i < 1; i++) {
                puntosMc = random.nextInt(3);
                puntosT = random.nextInt(3);
                
                //3 Puntos 
                if (puntosMc == 2) {
                    puntosMc = 3;
                    puntosT = 0;
                } else if (puntosT == 2) {
                    puntosT = 3;
                    puntosMc = 0;
                } //1 Punto
                else if (puntosT == 1 || puntosMc== 1) {
                    puntosT = 1;
                    puntosMc = 1;

                } //0 Puntos
                else if (puntosMc == 0) {
                    puntosT = 2;
                    if (puntosT == 2) {
                        puntosT = 3;
                    }
                } else if (puntosT == 0) {
                    puntosMc = 2;
                    if (puntosMc == 2) {
                        puntosMc = 3;
                    }
                }                           
                resultado.totalT +=puntosT;
                resultado.totalMc +=puntosMc;
//                resultado.totalMc +=puntosMc;  
            }
        }
        return resultado; 
    } 
    
    @Override
    public String toString() {
        return nombre +
                "\nPuntaje: " + puntaje;
    }      
}
