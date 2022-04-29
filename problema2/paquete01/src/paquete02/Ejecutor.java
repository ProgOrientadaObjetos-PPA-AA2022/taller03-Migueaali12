/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;
import paquete01.EquivalenteHora;
/**
 *
 * @author SALA I
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        
        EquivalenteHora tm = new EquivalenteHora();
        
        EquivalenteHora tm2 = new EquivalenteHora();
        
        tm.establecerHoras(48);
        tm.establecerMinutos();
        tm.establecerSegundos();
        tm.establecerDias();
        
        System.out.printf("Equivalente Hora\n\nHoras: %s\n"
                + "Minutos: %.2f\nSegundos: %.2f\n"
                + "Dias: %.2f\n", tm.obtenerHoras(),
                tm.obtenerMinutos(), tm.obtenerSegundos(),
                tm.obtenerDias());
        
        tm2.establecerHoras(100);
        tm2.establecerMinutos();
        tm2.establecerSegundos();
        tm2.establecerDias();
        
        System.out.printf("Equivalente Hora\n\nHoras: %s\n"
                + "Minutos: %.2f\nSegundos: %.2f\n"
                + "Dias: %.2f\n", tm2.obtenerHoras(),
                tm2.obtenerMinutos(), tm2.obtenerSegundos(),
                tm2.obtenerDias());
        
    }
    
}
