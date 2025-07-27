/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaEncendido;

import Funcionalidades.Encendido;

/**
 *
 * @author Luisf
 */
public class Motor extends Encendido {
    public void encender() {
        this.estado = true;
    }
    public void apagar() {
        this.estado = false;
    }
}
