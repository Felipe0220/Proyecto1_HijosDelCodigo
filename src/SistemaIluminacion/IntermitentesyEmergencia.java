/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaIluminacion;

import Funcionalidades.Encendido;

/**
 *
 * @author Luisf
 */
public class IntermitentesyEmergencia extends Encendido {
    private boolean intizquierda;
    private boolean intderecha;

    public void encenderIntizquierda() {
        intizquierda = true;
        System.out.println("Intermitente izquierda encendida");
    }
    public void apagarIntizquierda() {
        intizquierda = false;
        System.out.println("Intermitente izquierda apagada");
    }
    public void encenderIntderecha() {
        intderecha = true;
        System.out.println("Intermitente derecha encendida");
    }
    public void apagarIntderecha() {
        intderecha = false;
        System.out.println("Intermitente derecha apagada");
    }
    public void activarEmergencia() {
        encenderIntizquierda();
        encenderIntderecha();
        System.out.println("Luces de emergencia encendidas");
    }
    public void apagarEmergencia() {
        apagarIntizquierda();
        apagarIntderecha();
        System.out.println("Luces de emergencia apagadas");
    }
    public boolean isIzquierdaEncendida() {
        return intizquierda;
    }
    public boolean isDerechaEncendida() {
        return intderecha;
    }
}
