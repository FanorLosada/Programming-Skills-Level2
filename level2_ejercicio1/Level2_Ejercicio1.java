package level2_ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Level2_Ejercicio1 {

    public static void main(String[] args) {

        Equipo manchesterUnited = new Equipo();
        Equipo liverpool = new Equipo();
        Equipo arsenal = new Equipo();
        Equipo chelsea = new Equipo();
        Equipo manchesterCity = new Equipo();
        Equipo tottenhamHotspur = new Equipo();
        Equipo eq = new Equipo();
        
        List<Equipo> lista = new ArrayList<Equipo>();

        lista.add(new Equipo("Manchester United",eq.resultadoEquipoUno().totalMu));
        lista.add(new Equipo("Liverpool",eq.resultadoEquipoUno().totalL));
        lista.add(new Equipo("Arsenal",eq.resultadoEquipoDos().totalA));
        lista.add(new Equipo("Chelsea",eq.resultadoEquipoDos().totalC));
        lista.add(new Equipo("Manchester City",eq.resultadoEquipoTres().totalMc));
        lista.add(new Equipo("Tottenham Hotspur",eq.resultadoEquipoTres().totalT));
        
        Collections.sort(lista, Comparator.comparingInt(Equipo::getPuntaje).reversed());
        
        
        for (Equipo equipo: lista) {
            System.out.println(equipo);
        }
    }   
}
