/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaCombustible;

import Funcionalidades.Encendido;

/**
 *
 * @author kevin
 */
public class Combustible extends Encendido {
    private double nivel; 
    
    public Combustible() {
        this.nivel = 100; 
    }
    
  
    public void usarCombustible(double cantidad) {
        if (!estado) {
            System.out.println("¡El sistema está apagado!");
            return;
        }
        nivel -= cantidad;
        if (nivel < 0) nivel = 0;
        System.out.println("Nivel de combustible: " + nivel + "%");
    }
    
   
    public void rellenar(double cantidad) {
        nivel += cantidad;
        if (nivel > 100) nivel = 100;
        System.out.println("¡Combustible rellenado! Nivel: " + nivel + "%");
    }
    
    
    public double getNivel() {
        return nivel;
    }
}