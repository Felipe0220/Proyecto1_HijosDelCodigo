/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaRadio;

import Funcionalidades.Encendido;

/**
 *
 * @author Sebastian
 */
public class Radio extends Encendido {
    private String modo;
    private double frecuencia;
    
    public void encender() {
        this.estado = true;
    }
    public void apagar() {
        this.estado = false;
    }

    public Radio() {
        this.modo = "FM";
        this.frecuencia = 99.5;
        this.estado=false;
    }
    
    public void CambiarModo(){
        if(modo.equals("FM")){
            modo="AM";
            frecuencia=680;
        }else if (modo.equals("AM")){
            modo="Bluetooth";
            frecuencia=0.0;
        }else{
            modo="FM";
            frecuencia=99.5;
        }
    }
    
    public void SubirFrecu(){
        if(modo.equals("FM")) frecuencia+=0.2;
        else if (modo.equals("AM")) frecuencia+=10;
    }
    
    public void BajarFrecu(){
        if(modo.equals("FM")) frecuencia-=0.2;
        else if (modo.equals("AM")) frecuencia-=10;
    }

    public String getModo() {
        return modo;
    }

    public double getFrecuencia() {
        return frecuencia;
    }
    
    public String getEstado(){
        if(!estado)return "Radio Apagada";
        if(modo.equals("Bluetooth")) return "Modo: Bluetooth";
        return "Modo: " +modo+ " - " +frecuencia;
    }
}
