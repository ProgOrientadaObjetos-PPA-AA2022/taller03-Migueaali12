/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;
import paquete01.Institucion;

/**
 *
 * @author SALA I
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        
        Institucion insti = new Institucion();
        
        insti.establecerNombre("Bernardo Valdivieso");
        insti.establecerTipo("Fiscal");
        insti.establecerNumAlumnos(1000);
        insti.establecerNumDocentes(2000);
        insti.establecerNumSedes(10);
        insti.establecerGastoEst(100);
        insti.establecerPresupuesto();
        
        System.out.printf("Institucion\n\nNombre: %s\n"
                + "Tipo: %s\Num Alumnos: %d\n"
                + "Num Docentes: %d\n" + "Num Sedes: %d\n" + "Gasto estudiantil:: %.2f\n" + "Presupuesto: %.2f\n", tm.obtenerHoras(),
                insti.obtenerNombre(), insti.obtenerTipo(), insti.obtenerNumAlumnos(), insti.obtenerNumDocentes(), insti.establecerNumSedes(), insti.obtenerGastoEst(), insti.obtenerPresopuesto());
        
    }
    
}
