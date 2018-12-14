/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_andrescruz;

import javax.swing.JOptionPane;

/**
 *
 * @author MBanegas
 */
public class Expedicion implements Runnable {

    Naves nave;    
    long tiempoida;
    long tiemporegreso;
    long ida=0;
    long regreso=0;
    boolean vive;

    public Expedicion(Naves nave) {
        this.nave = nave;
        vive=true;
        double[]tiempos=nave.calcularTiempo();
        tiempoida=Math.round(tiempos[0]);
    }
    

    @Override
    public void run() {
        while (vive) {            
            if (ida<tiempoida&&regreso<tiemporegreso) {
                ida++;
            }else if(ida==tiempoida&&regreso<tiemporegreso){
                if (regreso==0) {
                    JOptionPane.showMessageDialog(null, "Ha llegado al planeta "+nave.getDestino());
                }
                regreso++;
            }else if(ida==tiempoida&&regreso==tiemporegreso){
                JOptionPane.showMessageDialog(null, "Ha regresado al planeta Tierra");
                vive=false;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
            }
        }
    }

}
