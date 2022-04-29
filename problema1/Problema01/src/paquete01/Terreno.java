/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

/**
 *
 * @author SALA I
 */
public class Terreno {
    
    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;
    private double valormetrocuadrado;
    
    //Establecer
    
    public void establecerAncho(double c){
        ancho = c;
    }
    
    public void establecerLargo(double c){
        largo = c;
    }
    
    public void establecerArea(){
        area = ancho * largo;
    }
    
    public void establecerValorMetroCuadrado(double c){
        valormetrocuadrado = c;
    }
    
    public void calcularCosto_Terreno(){
        costo_terreno = area * valormetrocuadrado;
    }
    
    //Obtener
    
    public double obtenerCostoTerreno(){
        return costo_terreno;
    }
    
    public double obtenerAncho(){
        return ancho;
    }
    
    public double obtenerLargo(){
        return largo;
    }
    
    public double obtenerArea(){
        return area;
    }
    
    public double obtenerValorMetroCuadrado(){
        return valormetrocuadrado;
    }
}
