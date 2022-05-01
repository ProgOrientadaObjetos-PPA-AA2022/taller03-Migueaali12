/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author Miguel Alvarez
 */
public class Celular {
    
    private String so;
    private String tpantalla;
    private double costo_inicial;
    private int iva;
    private double iva_del_costo_inicial;
    private String mac;
    private String imei;
    private double costo_final;
    
    //Establecer
    
    public void establecerSO(String c){
        so = c;
    }
    
    public void establecerTPantalla(String c){
        tpantalla = c;
    }
    
    public void establecerCostoIncial(double c){
        costo_inicial = c;
    }
    
    public void establecerIva(int c){
        iva = c;
    }
    
    public void establecerIDCI(){
        iva_del_costo_inicial = (costo_inicial / 100) * 12;
    }
    
    public void establecerMac(String c){
        mac = c;
    }
    
    public void establecerImei(String c){
        imei = c;
    }
    
    public void establecerCostoFinal(){
        costo_final = costo_inicial + iva_del_costo_inicial;
    }
    
    //Obtener
    
    public String obtenerSO(){
        return so;
    }
    
    public String obtenerTPantalla(){
        return tpantalla;
    }
    
    public double obtenerCostoInicial(){
        return costo_inicial;
    }
    
    public int obtenerIva(){
        return iva;
    }
    
    public double obtenerIDCI(){
        return iva_del_costo_inicial;
    }
    
    public String obtenerMac(){
        return mac;
    }
    
    public String obtenerImei(){
        return imei;
    }
    
    public double obtenerCostoFinal(){
        return costo_final;
    }
}
