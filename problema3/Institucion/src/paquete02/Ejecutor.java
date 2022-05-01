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
        Institucion insti2 = new Institucion();

        insti.establecerNombre("Bernardo Valdivieso");
        insti.establecerTipo("Fiscal");
        insti.establecerNumAlumnos(1000);
        insti.establecerNumDocentes(2000);
        insti.establecerNumSedes(10);
        insti.establecerGastoEst(100);
        insti.establecerPresupuesto();

        System.out.printf("Institucion\n\nNombre: %s\n"
                + "Tipo: %s\nNum. Alumnos: %d\nNum Docentes: %d\n"
                + "Num Sedes: %d\n" + "Gastos Estudiantiles: %.2f\n"
                + "Presupuesto: %.2f\n"
                ,insti.obtenerNombre(), insti.obtenerTipo(), insti.obtenerNumAlumnos(),
                insti.obtenerNumDocentes(),insti.obtenerNumSedes(),
                insti.obtenerGastoEst(), insti.obtenerPresopuesto());
        
        insti2.establecerNombre("Daniel Alvarez Burneo");
        insti2.establecerTipo("Fiscomisional");
        insti2.establecerNumAlumnos(1000);
        insti2.establecerNumDocentes(500);
        insti2.establecerNumSedes(2);
        insti2.establecerGastoEst(500);
        insti2.establecerPresupuesto();

        System.out.printf("Institucion\n\nNombre: %s\n"
                + "Tipo: %s\nNum. Alumnos: %d\nNum Docentes: %d\n"
                + "Num Sedes: %d\n" + "Gastos Estudiantiles: %.2f\n"
                + "Presupuesto: %.2f\n"
                ,insti2.obtenerNombre(), insti2.obtenerTipo(), insti2.obtenerNumAlumnos(),
                insti2.obtenerNumDocentes(),insti2.obtenerNumSedes(),
                insti2.obtenerGastoEst(), insti2.obtenerPresopuesto());

    }

}
