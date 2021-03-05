/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_douglasrubi;

import java.util.ArrayList;

/**
 *
 * @author river
 */
public class Cliente {
    int Id;
    String Nombre;
    String Nacionalidad;
    String LugarTrabajo;
    String Puesto_Trabajo;
    String UserName;
    String Contra;
    double DineroActual;
    ArrayList<Autos> car = new ArrayList();

    public Cliente() {
    }

    public Cliente(int Id, String Nombre, String Nacionalidad, String LugarTrabajo, String Puesto_Trabajo, String UserName, String Contra, double DineroActual) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
        this.LugarTrabajo = LugarTrabajo;
        this.Puesto_Trabajo = Puesto_Trabajo;
        this.UserName = UserName;
        this.Contra = Contra;
        this.DineroActual = DineroActual;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getLugarTrabajo() {
        return LugarTrabajo;
    }

    public void setLugarTrabajo(String LugarTrabajo) {
        this.LugarTrabajo = LugarTrabajo;
    }

    public String getPuesto_Trabajo() {
        return Puesto_Trabajo;
    }

    public void setPuesto_Trabajo(String Puesto_Trabajo) {
        this.Puesto_Trabajo = Puesto_Trabajo;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getContra() {
        return Contra;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }

    public double getDineroActual() {
        return DineroActual;
    }

    public void setDineroActual(double DineroActual) {
        this.DineroActual = DineroActual;
    }

    public ArrayList<Autos> getCar() {
        return car;
    }

    public void setCar(ArrayList<Autos> car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return Nombre + ":" + car;
    }
    
}
