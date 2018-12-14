/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_andrescruz;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author MBanegas
 */
public class adminNaves {
    private ArrayList<Naves> listaNaves = new ArrayList();
    private File archivo = null;

    public adminNaves(String path) {
        archivo = new File(path);
    }

    public ArrayList<Naves> getListaNaves() {
        return listaNaves;
    }

    public void setListaNaves(ArrayList<Naves> listaNaves) {
        this.listaNaves = listaNaves;
    }


    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "lista=" + listaNaves;
    }

    //extra mutador
    public void setNaves(Naves p) {
        this.listaNaves.add(p);
    }

    public void cargarArchivo() {
        try {            
            listaNaves = new ArrayList();
            Naves temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Naves) objeto.readObject()) != null) {
                        listaNaves.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Naves t : listaNaves) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
