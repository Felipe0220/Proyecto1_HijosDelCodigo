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
public class LuzAlta extends Encendido {
    public void encender() {
        super.encender();
        System.out.println("Se encendio la luz alta");
    }
    public void apagar() {
        super.apagar();
        System.out.println("Se apago la luz alta");
    }
}
