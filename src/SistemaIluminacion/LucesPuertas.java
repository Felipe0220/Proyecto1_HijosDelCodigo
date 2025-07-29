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
    }
    public void cerrarPuerta() {
        apagar();
    }
}
