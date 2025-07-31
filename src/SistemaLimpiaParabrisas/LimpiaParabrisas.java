/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaLimpiaParabrisas;

import Funcionalidades.Encendido;

/**
 *
 * @author UTN
 */
public class LimpiaParabrisas extends Encendido {
 
    private boolean activado;  // true = encendido
    private Velocidad velocidad;

      public LimpiaParabrisas() {
        this.activado = false;
        this.velocidad = Velocidad.LENTO;
    }
  // Enciende/apaga el sistema
    public void palanca() {
        activado = !activado;
    }
     public void cambiarVelocidad() {
        switch (velocidad) {
            case LENTO -> {
                velocidad = Velocidad.MEDIO;
           
            }
            case MEDIO -> {
                velocidad = Velocidad.RAPIDO;
          
            }
            case RAPIDO -> {
                velocidad = Velocidad.LENTO;
              
            }
        }
    }
     public void activar() {
        if (activado) {
            // es para que se vea limbiando
        }
    }

    public boolean isActivado() {
        return activado;
    }

    public Velocidad getVelocidad() {
        return velocidad;
    }
     
    
}
