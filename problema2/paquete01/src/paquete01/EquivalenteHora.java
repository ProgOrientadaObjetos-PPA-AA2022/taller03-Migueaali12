/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

/**
 *
 * @author SALA I
 */
public class EquivalenteHora {

    private double horas;
    private double minutos;
    private double segundos;
    private double dias;
    
    //Establecer
    
    public void establecerHoras(double c){
        horas = c;
    }
    
    public void establecerMinutos(){
        minutos = horas * 60;
    }
    
    public void establecerSegundos(){
        segundos = horas * 3600;
    }
    
    public void establecerDias(){
        dias = horas / 24;
    }
    
    //Obtener
    
    public double obtenerHoras(){
        return horas;
    }
    
    public double obtenerMinutos(){
        return minutos;
    }
    
    public double obtenerSegundos(){
        return segundos;
    }
    
    public double obtenerDias(){
        return dias;
    }
    
}
