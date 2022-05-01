/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;
import paquete01.Celular;

/**
 *
 * @author Miguel Alvarez
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        
        Celular cel = new Celular();
        
        Celular cel2 = new Celular();
        
        cel.establecerSO("Android 11.2");
        cel.establecerTPantalla("6,0 x 2,50");
        cel.establecerCostoIncial(350);
        cel.establecerIva(12);
        cel.establecerIDCI();
        cel.establecerMac("A5-79-22-51-2E-5F");
        cel.establecerImei("518934652278784");
        cel.establecerCostoFinal();
        
        System.out.printf("Celulares\n\nSistema: %s\n"
        + "Tamaño Pantalla: %s\nCosto inicial: %.2f\nIva: %d\n"
        + "Costo inicial (iva): %.2f\nMac: %s\nImei: %s\n"
        + "Costo final: %.2f\n"
        ,cel.obtenerSO(),cel.obtenerTPantalla(), cel.obtenerCostoInicial(),
        cel.obtenerIva(), cel.obtenerIDCI(), cel.obtenerMac(),
        cel.obtenerImei(),cel.obtenerCostoFinal());
        
        cel2.establecerSO("Android 9");
        cel2.establecerTPantalla("6,5 x 3,10");
        cel2.establecerCostoIncial(800);
        cel2.establecerIva(20);
        cel2.establecerIDCI();
        cel2.establecerMac("7E-1F-F2-AC-7A-25");
        cel2.establecerImei("107907224023141");
        cel2.establecerCostoFinal();
        
        System.out.printf("Celulares\n\nSistema: %s\n"
        + "Tamaño Pantalla: %s\nCosto inicial: %.2f\nIva: %d\n"
        + "Costo inicial (iva): %.2f\nMac: %s\nImei: %s\n"
        + "Costo final: %.2f\n"
        ,cel2.obtenerSO(),cel2.obtenerTPantalla(), cel2.obtenerCostoInicial(),
        cel2.obtenerIva(), cel2.obtenerIDCI(), cel2.obtenerMac(),
        cel2.obtenerImei(),cel2.obtenerCostoFinal());
        
    }
    
}
