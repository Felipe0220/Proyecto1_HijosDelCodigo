/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaIluminacion;

import Funcionalidades.Encendido;
import SistemaEncendido.Motor;

/**
 *
 * @author Luisf
 */
public class LuzAlta extends Encendido {
    public void encender(Motor motor) {
        if (motor.isEstado()) {
            super.encender();
        }
    }
    public void apagar() {
        super.apagar();
    }
}
