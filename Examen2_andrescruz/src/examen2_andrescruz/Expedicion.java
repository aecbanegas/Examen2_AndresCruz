/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_andrescruz;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MBanegas
 */
public class Expedicion implements Runnable {

    JTable tabla;
    Naves nave;
    Planeta destino;
    long tiempoida;
    long tiemporegreso;
    long ida = 0;
    long regreso = 0;
    boolean vive;

    public Expedicion(Naves nave,JTable tabla) {
        this.nave = nave;
        this.tabla=tabla;
        destino = nave.getDestino();
        vive = true;
        double[] tiempos = nave.calcularTiempo();
        tiempoida = Math.round(tiempos[0])*1000;
        tiemporegreso=Math.round(tiempos[1])*1000;
    }
    
    @Override
    public void run() {
        System.out.println(tiempoida);
        while (vive) {            
            if (ida < tiempoida && regreso < tiemporegreso) {
                ida++;
            } else if (ida == tiempoida && regreso < tiemporegreso) {
                if (regreso == 0) {
                    JOptionPane.showMessageDialog(null, "Ha llegado al planeta " + destino);
                }                
                regreso++;
            } else if (ida == tiempoida && regreso == tiemporegreso) {
                JOptionPane.showMessageDialog(null, "Ha regresado al planeta Tierra");
                DefaultTableModel modelo=(DefaultTableModel)tabla.getModel();
                Object[]row={destino,"Si"};
                modelo.addRow(row);
                tabla.setModel(modelo);
                vive = false;
                
            }
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {

            }
        }
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public Naves getNave() {
        return nave;
    }

    public void setNave(Naves nave) {
        this.nave = nave;
    }

    public Planeta getDestino() {
        return destino;
    }

    public void setDestino(Planeta destino) {
        this.destino = destino;
    }

    public long getTiempoida() {
        return tiempoida;
    }

    public void setTiempoida(long tiempoida) {
        this.tiempoida = tiempoida;
    }

    public long getTiemporegreso() {
        return tiemporegreso;
    }

    public void setTiemporegreso(long tiemporegreso) {
        this.tiemporegreso = tiemporegreso;
    }

    public long getIda() {
        return ida;
    }

    public void setIda(long ida) {
        this.ida = ida;
    }

    public long getRegreso() {
        return regreso;
    }

    public void setRegreso(long regreso) {
        this.regreso = regreso;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
}
