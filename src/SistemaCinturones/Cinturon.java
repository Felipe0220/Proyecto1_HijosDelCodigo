/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaCinturones;

import Funcionalidades.Sensor;

/**
 *
 * @author UTN
 */
public class Cinturon  {
     private Sensor sensor;
   
public void poner(){
    this.sensor.desactivado();
}

public void quitar(){
    this.sensor.activado(); 
}

    public Sensor getSensor() {
        return sensor;
    }


}
