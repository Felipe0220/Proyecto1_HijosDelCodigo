/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaReversaFrenodeMano;

import Funcionalidades.Sensor;

/**
 *
 * @author kevin
 */
public class SensorReversa extends Sensor {
     private boolean frenoDeManoPuesto;
    
    public SensorReversa() {
        this.frenoDeManoPuesto = true;
    }
    
    
    public void revisarObstaculo(boolean hayObstaculo) {
        if (hayObstaculo) {
            System.out.println("Obstáculo detectado");
        }
    }
    
    
    public void revisarFrenoDeMano() {
        if (frenoDeManoPuesto && estadosensor) {
            System.out.println("El freno de mano está puesto.");
        }
    }
    

    public void setFrenoDeMano(boolean estado) {
        this.frenoDeManoPuesto = estado;
    }
}
