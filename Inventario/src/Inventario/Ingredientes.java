/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import java.util.ArrayList;

/**
 *
 * @author Maicol Velasquez
 */
public class Ingredientes {
    private int cantidadPez;
    private String Nproduc;

    public Ingredientes(int cantidadPez, String Nproduc) {
        this.cantidadPez = cantidadPez;
        this.Nproduc = Nproduc;
    }

    public int getCantidadPez() {
        return cantidadPez;
    }

    public void setCantidadPez(int cantidadPez) {
        this.cantidadPez = cantidadPez;
    }

    public String getNproduc() {
        return Nproduc;
    }

    public void setNproduc(String Nproduc) {
        this.Nproduc = Nproduc;
    }

}
