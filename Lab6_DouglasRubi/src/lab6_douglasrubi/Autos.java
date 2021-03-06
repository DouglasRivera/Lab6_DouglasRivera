/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_douglasrubi;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author river
 */
public class Autos {
   int VIN;
   String Marca;
   String Modelo;
   String TipoCarroceria;
   int CantPasajeros;
   int CapacidadMal;
   String Color;
   double Precio;
   int PotenciaMotor;

    public Autos() {
    }
   

    public Autos(int VIN, String Marca) {
        this.VIN = VIN;
        this.Marca = Marca;
    }
    
    public Autos(int VIN, String Marca, String Modelo, String TipoCarroceria, int CantPasajeros, int CapacidadMal, String Color, double Precio, int PotenciaMotor) {
        this.VIN = VIN;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.TipoCarroceria = TipoCarroceria;
        this.CantPasajeros = CantPasajeros;
        this.CapacidadMal = CapacidadMal;
        this.Color = Color;
        this.Precio = Precio;
        this.PotenciaMotor = PotenciaMotor;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getTipoCarroceria() {
        return TipoCarroceria;
    }

    public void setTipoCarroceria(String TipoCarroceria) {
        this.TipoCarroceria = TipoCarroceria;
    }

    public int getCantPasajeros() {
        return CantPasajeros;
    }

    public void setCantPasajeros(int CantPasajeros) {
        this.CantPasajeros = CantPasajeros;
    }

    public int getCapacidadMal() {
        return CapacidadMal;
    }

    public void setCapacidadMal(int CapacidadMal) {
        this.CapacidadMal = CapacidadMal;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getPotenciaMotor() {
        return PotenciaMotor;
    }

    public void setPotenciaMotor(int PotenciaMotor) {
        this.PotenciaMotor = PotenciaMotor;
    }

    @Override
    public String toString() {
        return VIN + ":" + Modelo + ",";
    }
    
}
