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
public class Sonda extends Naves{

    String material;
    double peso;

    public Sonda(String material, double peso, String num_serie, Planeta destino, double velocidad) {
        super(num_serie, destino, velocidad);
        this.material = material;
        this.peso = peso;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
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
    public double[] calcularTiempo() {
        double[] tiempos = new double[2];
        tiempos[0] = ida();
        tiempos[1] = vuelta(tiempos[0]);
        return tiempos;
    }

    public double ida() {
        return super.destino.getDistancia() / super.velocidad;
    }

    public double vuelta(double ida) {
        return 9.8 * ida;
    }

    @Override
    public String toString() {
        return "Sonda{" + "material=" + material + ", peso=" + peso + '}';
    }

}
