/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionalidades;

/**
 *
 * @author Luisf
 */
public abstract class Encendido {
    protected boolean estado;
    
    public boolean isEstado() {
        return estado;
    }
    public Encendido() {
        this.estado = false;
    }
    public void encender() {
        this.estado = true;
    }
    public void apagar() {
        this.estado = false;
    }
}
