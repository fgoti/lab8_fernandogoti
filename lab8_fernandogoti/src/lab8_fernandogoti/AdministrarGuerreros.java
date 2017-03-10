/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_fernandogoti;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Fernando Goti
 */
public class AdministrarGuerreros {

    ArrayList<Guerreros> ListaGuerreros = new ArrayList();
    File Archivos = null;

    public AdministrarGuerreros(String path) {
        Archivos = new File(path);
    }

    public ArrayList<Guerreros> getListaguerro() {
        return ListaGuerreros;
    }

    public void setListaguerro(ArrayList<Guerreros> listaguerrero) {
        this.ListaGuerreros = listaguerrero;
    }

    public File getArchivo() {
        return Archivos;
    }

    public void setArchivo(File archivo) {
        this.Archivos = archivo;
    }

    @Override
    public String toString() {
        return "AdministrarGuerreros{" + "ListaGurreros=" + ListaGuerreros + '}';
    }

    public void setGuerrero(Guerreros g) {
        this.ListaGuerreros.add(g);
    }

    public void cargarArchivo() {
        try {
            ListaGuerreros = new ArrayList();
            Guerreros temp;
            if (Archivos.exists()) {
                FileInputStream Entrada = new FileInputStream(Archivos);
                ObjectInputStream Objeto = new ObjectInputStream(Entrada);
                try {
                    while ((temp = (Guerreros) Objeto.readObject()) != null) {
                        ListaGuerreros.add(temp);
                    }
                } catch (EOFException e) {
                }
                Objeto.close();
                Entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(Archivos);
            bw = new ObjectOutputStream(fw);
            for (Guerreros t : ListaGuerreros) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }

}
