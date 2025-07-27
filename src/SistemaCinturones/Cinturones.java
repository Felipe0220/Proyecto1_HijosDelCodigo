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
public class Cinturones extends Sensor {
    //true=abierto,false=cerrado
    private boolean Ccopiloto;
    private boolean Cacompañante;

    public boolean isCcopiloto() {
        return Ccopiloto;
    }

    public boolean isCacompañante() {
        return Cacompañante;
    }

  
    public void SistemaPuertas(){
       if(Ccopiloto==false){
          System.out.println("");
       }else{
           this.estadosensor=true;
           System.out.println("sinturon del copiloto no puesto"); 
           
       }if(Cacompañante==false){
          System.out.println("");
       }else{
           this.estadosensor=true;
           System.out.println("sinturon del acompañante no puesto"); 
           
       }
    }
}
