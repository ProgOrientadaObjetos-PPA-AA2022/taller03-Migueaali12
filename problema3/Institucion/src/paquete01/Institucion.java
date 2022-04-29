/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

/**
 *
 * @author SALA I
 */
public class Institucion {

    private String nombre;
    private String tipo;
    private int numAlumnos;
    private int numDocentes;
    private int numSedes;
    private double gastoEst;
    private double prespupesto;

    //Establecer
    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerTipo(String c) {
        tipo = c;
    }

    public void establecerNumAlumnos(int c) {
        numAlumnos = c;
    }

    public void establecerNumDocentes(int c) {
        numDocentes = c;
    }

    public void establecerNumSedes(int c) {
        numSedes = c;
    }

    public void establecerGastoEst(double c) {
        gastoEst = c;
    }

    public void establecerPresupuesto() {
        prespupesto = numAlumnos * gastoEst;
    }

    //obtener
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public int obtenerNumAlumnos() {
        return numAlumnos;
    }

    public int obtenerNumDocentes() {
        return numDocentes;
    }

    public int obtenerNumSedes() {
        return numSedes;
    }

    public double obtenerGastoEst() {
        return gastoEst;
    }
    
    public double obtenerPresopuesto(){
        return prespupesto;
    }

}
