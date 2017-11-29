/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contabilidad;

/**
 *
 * @author MARIAJOSE
 */
public class Clase {
    private int numero;
    private String nombreClase;
    private String naturaleza;

    public Clase(int numero, String nombreClase, String naturaleza) {
        this.numero = numero;
        this.nombreClase = nombreClase;
        this.naturaleza = naturaleza;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }
    
    
}
