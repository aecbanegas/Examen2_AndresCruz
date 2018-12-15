/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_andrescruz;

import java.io.Serializable;

/**
 *
 * @author MBanegas
 */
public abstract class Naves implements Serializable {

    Expedicion e;
    String num_serie;
    Planeta destino;
    double velocidad;
    private static final long SerialVersionUID = 4;

    public Naves(String num_serie, Planeta destino, double velocidad) {
        this.num_serie = num_serie;
        this.destino = destino;
        this.velocidad = velocidad;        
    }

    public String getNum_serie() {
        return num_serie;
    }

    public void inicio(){
        Thread a=new Thread(e);
        a.start();
    }
    
    public void setNum_serie(String num_serie) {
        this.num_serie = num_serie;
    }

    public Planeta getDestino() {
        return destino;
    }

    public void setDestino(Planeta destino) {
        this.destino = destino;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public abstract double[] calcularTiempo();        

    @Override
    public String toString() {
        return "Num_serie= " + num_serie + " destino=" + destino + " velocidad=" + velocidad;
    }

}
