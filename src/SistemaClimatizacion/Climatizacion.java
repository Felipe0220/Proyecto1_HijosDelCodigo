/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaClimatizacion;

import Funcionalidades.Encendido;
import SistemaLimpiaParabrisas.Velocidad;

/**
 *
 * @author Sebastian
 */
public class Climatizacion extends Encendido {
    private int temperatura;
    private Velocidad velocidadAbanico;
    private boolean acActivo;
    private boolean calefaccionActiva;
    private String modo;
    
    public void encender() {
        this.estado = true;
    }
    public void apagar() {
        this.estado = false;
    }

    public Climatizacion() {
        this.temperatura = 22;
        this.velocidadAbanico = Velocidad.LENTO;
        this.acActivo = false;
        this.calefaccionActiva = false;
    }
    
    public void subirTemp(){
        if(temperatura<30) temperatura++;
    }
    
    public void bajarTemp(){
        if(temperatura<15) temperatura--;
    }
    
    public void cambiarVelocidad(){
        velocidadAbanico=Velocidad.MEDIO;
    }
    
    public void encenderAC(){
        acActivo=true;
        calefaccionActiva=false;
    }
    
    public void encenderCalefaccion(){
        calefaccionActiva=true;
        acActivo=false;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public Velocidad getVelocidadAbanico() {
        return velocidadAbanico;
    }

    public boolean isAcActivo() {
        return acActivo;
    }

    public boolean isCalefaccionActiva() {
        return calefaccionActiva;
    }
    
    public String getEstado(){
        if(!estado) return "Clima Apagado";
        if(acActivo){
            modo="A/C";
        }else if(calefaccionActiva){
            modo="Calefaccion";
        }else{
            modo="Ventilacion";
        }
        return "Modo: " +modo+ ", Temperatura: " +temperatura+ ", Velocidad: " +velocidadAbanico;
    }
}
