/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionalidades;

/**
 *
 * @author Luisf
 */
public abstract class Sensor {
    protected boolean estadosensor;
    
    public boolean isCinturon() {
        return estadosensor;
    }
    public Sensor() {
        this.estadosensor = false;
    }
    public void activado() {
        this.estadosensor = true;
    }
    public void desactivado() {
        this.estadosensor = false;
    }

}
