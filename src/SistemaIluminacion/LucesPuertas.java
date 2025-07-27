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
public class LucesPuertas extends Encendido {
    private final String lado;

    public LucesPuertas(String lado) {
        super();
        this.lado = lado;
    }
    public void abrirPuerta() {
        encender();
        System.out.println("Puerta " + lado + " abierta, la luz de la puerta esta encendida");
    }
    public void cerrarPuerta() {
        apagar();
        System.out.println("Puerta " + lado + " cerrada, la luz de la puerta esta apagada");
    }
}
