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
public class IntermitentesyEmergencia extends Encendido {
    private boolean intizquierda;
    private boolean intderecha;

    public void encenderIntizquierda(Motor motor) {
        if (motor != null && motor.isEstado()) {
            intizquierda = true;
        }
    }
    public void apagarIntizquierda() {
        intizquierda = false;
    }
    public void encenderIntderecha(Motor motor) {
        if (motor != null && motor.isEstado()) {
            intderecha = true;
        }
    }
    public void apagarIntderecha() {
        intderecha = false;
    }
    public void activarEmergencia(Motor motor) {
        encenderIntizquierda(motor);
        encenderIntderecha(motor);
    }
    public void apagarEmergencia() {
        apagarIntizquierda();
        apagarIntderecha();
    }
    public boolean isIzquierdaEncendida() {
        return intizquierda;
    }
    public boolean isDerechaEncendida() {
        return intderecha;
    }
}
