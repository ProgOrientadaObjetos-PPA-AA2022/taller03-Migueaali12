/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;
import paquete01.Terreno;

/**
 *
 * @author SALA I
 */
public class Ejecutor01 {
    
    public static void main(String[] args) {
        
        Terreno terra = new Terreno();
        
        Terreno terra2 = new Terreno();
        
        terra.establecerValorMetroCuadrado(10);
        terra.establecerAncho(100);
        terra.establecerLargo(200);
        
        terra.establecerArea();
        terra.calcularCosto_Terreno();
        
        System.out.printf("Terreno\n\nAncho: %s\n"
                + "Largo: %.2f\nArea: %.2f\n"
                + "Valor metro cuadrado: %.2f\n" + "Costo total: %.2f\n" , terra.obtenerAncho(),
                terra.obtenerLargo(), terra.obtenerArea(),
                terra.obtenerValorMetroCuadrado(), terra.obtenerCostoTerreno());
        
        terra2.establecerValorMetroCuadrado(30);
        terra2.establecerAncho(112);
        terra2.establecerLargo(400);
        
        terra2.establecerArea();
        terra2.calcularCosto_Terreno();
        
        System.out.printf("Terreno\n\nAncho: %s\n"
                + "Largo: %.2f\nArea: %.2f\n"
                + "Valor metro cuadrado: %.2f\n" + "Costo total: %.2f\n" , 
                terra2.obtenerAncho(),
                terra2.obtenerLargo(), terra2.obtenerArea(),
                terra2.obtenerValorMetroCuadrado(), terra2.obtenerCostoTerreno());
        
    }
    
}
