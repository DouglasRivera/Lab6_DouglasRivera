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
public class AdministrarClientes {

    private ArrayList<Cliente> ListaCliente = new ArrayList();
    private File archivo = null;

    public AdministrarClientes(String path) {
        archivo = new File(path);
    }

    public ArrayList<Cliente> getListaCliente() {
        return ListaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> ListaCliente) {
        this.ListaCliente = ListaCliente;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "ListaCliente =" + ListaCliente;
    }

    public void setPersona(Cliente c) {
        this.ListaCliente.add(c);
    }

    public void LeerArchivo() {
        Scanner sc = null;
        sc.useDelimiter(";");
        while (sc.hasNext())
        {
            int IdCL = sc.nextInt();
                    String NombreCL = sc.next();
                    String NacionalidadCL = sc.next();
                    String LugarTrabajoCL = sc.next();
                    String Puesto_TrabajoCL = sc.next();
                    String UserNameCL = sc.next();
                    String ContraCL = sc.next();
            String[] propiedadesAuto = sc.next().split(",");
            for (int i = 0; i < propiedadesAuto.length; i++) {
               String[] pa = propiedadesAuto[i].split(":");
               Autos auto = new Autos(Integer.parseInt(pa[0]),pa[1]);
            }
            
        }
    }
    
    

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Cliente t : ListaCliente) {
                bw.write(t.getId() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getNacionalidad() + ";");
                bw.write(t.getLugarTrabajo() + ";");
                bw.write(t.getPuesto_Trabajo() + ";");
                bw.write(t.getUserName() + ";");
                bw.write(t.getContra() + ";");
                bw.write(t.getDineroActual() + ";");
                for (Autos auto : t.getCar()) {
                    bw.write(auto.toString());
                }
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        ListaCliente = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    int IdCL = sc.nextInt();
                    String NombreCL = sc.next();
                    String NacionalidadCL = sc.next();
                    String LugarTrabajoCL = sc.next();
                    String Puesto_TrabajoCL = sc.next();
                    String UserNameCL = sc.next();
                    String ContraCL = sc.next();
                    double DineroActualCL = sc.nextDouble();
                    Cliente cl = new Cliente(IdCL, NombreCL, NacionalidadCL, LugarTrabajoCL, Puesto_TrabajoCL, UserNameCL, ContraCL, DineroActualCL
                    );
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            sc.close();
        }//FIN IF
    }
}
