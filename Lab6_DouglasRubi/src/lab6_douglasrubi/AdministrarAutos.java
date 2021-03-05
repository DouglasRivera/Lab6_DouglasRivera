/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_douglasrubi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class AdministrarAutos {
     private ArrayList<Autos> ListaAutos = new ArrayList();
    private File archivo = null;

    public AdministrarAutos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Autos> getListaAutos() {
        return ListaAutos;
    }

    public void setListaAutos(ArrayList<Autos> ListaAutos) {
        this.ListaAutos = ListaAutos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "ListaAutos = " + ListaAutos;
    }
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Autos t : ListaAutos) {
                bw.write(t.getVIN()+ ";");
                bw.write(t.getMarca()+ ";");
                bw.write(t.getModelo()+ ";");
                bw.write(t.getTipoCarroceria()+ ";");
                bw.write(t.getCantPasajeros()+ ";");
                bw.write(t.getCapacidadMal()+ ";");
                bw.write(t.getColor() + ";");
                bw.write(t.getPrecio() + ";");
                bw.write(t.getPotenciaMotor()+ ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        ListaAutos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    int VIN_A = sc.nextInt();
                    String MarcaA = sc.next();
                    String ModeloA = sc.next();
                    String TipoCarroceriaA = sc.next();
                    int CantPasajerosA = sc.nextInt();
                    int CapacidadMalA = sc.nextInt();
                    String ColorA = sc.next();
                    double PrecioA = sc.nextDouble();
                    int PotenciaMotorA = sc.nextInt();
                    Autos auto = new Autos(VIN_A, MarcaA, ModeloA, TipoCarroceriaA, CantPasajerosA,CapacidadMalA,ColorA,PrecioA,PotenciaMotorA
                    ); 
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            sc.close();
        }//FIN IF
    }
}
