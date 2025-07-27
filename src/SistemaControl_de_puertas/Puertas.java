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
public class Puertas extends Sensor {
    //true=abierta,false=cerrada
    private boolean Pizquierda;
    private boolean Pderecha;

    public boolean isPizquierda() {
        return Pizquierda;
    }

    public boolean isPderecha() {
        return Pderecha;
    }
    
    public void SistemaPuertas(){
       if(Pizquierda==false){
          System.out.println("");
       }else{
           this.estadosensor=true;
           System.out.println("Puerta Izquierda abierta"); 
           
       }if(Pderecha==false){
          System.out.println("");
       }else{
           this.estadosensor=true;
           System.out.println("Puerta Derecha abierta"); 
           
       }
    }
}
