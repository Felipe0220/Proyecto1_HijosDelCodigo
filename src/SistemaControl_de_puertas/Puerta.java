/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaControl_de_puertas;

import Funcionalidades.Sensor;

/**
 *
 * @author UTN
 */
public class Puerta  {
    private Sensor sensor;
   
public void abrir(){
    this.sensor.desactivado();
}

public void cerrar(){
    this.sensor.activado(); 
}
}
