/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaKilometraje;

import Funcionalidades.Encendido;

/**
 *
 * @author Sebastian
 */
public class Kilometraje extends Encendido {
    private double kmhTotales;
    private int velocidadActual;
    private int rpm;

    public Kilometraje() {
        this.kmhTotales = 0;
        this.velocidadActual = 0;
        this.rpm = 0;
    }
    
     private void calcularRpm(){
        rpm=velocidadActual*60;
    }
    
    public void acelerar(){
        if(estado && velocidadActual< 180){
            velocidadActual+= 10;
            calcularRpm();
        }
    }
    
    public void frenar(){
        if(estado && velocidadActual> 0){
            velocidadActual -= 10;
            calcularRpm();
        }
    }
    
    public void avanzar(double segundos){
        if(estado && velocidadActual> 0){
            double horas = segundos/3600.0;
            kmhTotales+= velocidadActual*horas;
        }
    }

    public double getKmhTotales() {
        return kmhTotales;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public int getRpm() {
        return rpm;
    }
    
    public String getEstado(){
        if(!estado) return "Motor apagado";
        return "Velocidad: " +velocidadActual+ ", Rpm: " +rpm+ ", Kilometros: " +kmhTotales;
    }
}
