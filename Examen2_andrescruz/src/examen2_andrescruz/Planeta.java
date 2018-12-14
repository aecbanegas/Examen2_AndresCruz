/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_andrescruz;

/**
 *
 * @author MBanegas
 */
public class Planeta {

    String nombre;
    double temp;
    boolean anillos;
    String superficie;
    double distancia;

    public Planeta(String nombre, double temp, boolean anillos, String superficie, double distancia) {
        this.nombre = nombre;
        this.temp = temp;
        this.anillos = anillos;
        this.superficie = superficie;
        this.distancia = distancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public boolean isAnillos() {
        return anillos;
    }

    public void setAnillos(boolean anillos) {
        this.anillos = anillos;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
