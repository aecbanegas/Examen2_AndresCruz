/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_andrescruz;

import java.util.ArrayList;

/**
 *
 * @author MBanegas
 */
public class Tripulada extends Naves{
    String despegue;
    ArrayList<Astronauta>astronautas=new ArrayList();

    public Tripulada(String despegue, String num_serie, Planeta destino, double velocidad) {
        super(num_serie, destino, velocidad);
        this.despegue = despegue;
    }

    public String getDespegue() {
        return despegue;
    }

    public void setDespegue(String despegue) {
        this.despegue = despegue;
    }

    public ArrayList<Astronauta> getAstronautas() {
        return astronautas;
    }

    public void setAstronautas(ArrayList<Astronauta> astronautas) {
        this.astronautas = astronautas;
    }

    public String getNum_serie() {
        return num_serie;
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

    @Override
    public String toString() {
        return "Tripulada{" + "despegue=" + despegue + ", astronautas=" + astronautas + '}';
    }

    
    
    @Override
    public int[] calcularTiempo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
