package Contabilidad;



//
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MARIAJOSE
 */
public class Cuenta {
    private Clase clase;
    private int numGrupo;
    private String grupo;
    private int numCuentaa;
    private String cuenta;
    private int numSub;
    private String subcuenta;
    String numeroCuenta;
    

    public Cuenta( Clase clase, int numGrupo, String grupo, int numCuentaa, String cuenta, int numSub, String subcuenta, String nc) {
        this.clase = clase;
        this.numGrupo = numGrupo;
        this.grupo = grupo;
        this.numCuentaa = numCuentaa;
        this.cuenta = cuenta;
        this.numSub = numSub;
        this.subcuenta = subcuenta;
        this.numeroCuenta = nc;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public int getNumGrupo() {
        return numGrupo;
    }

    public void setNumGrupo(int numGrupo) {
        this.numGrupo = numGrupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getNumCuentaa() {
        return numCuentaa;
    }

    public void setNumCuentaa(int numCuentaa) {
        this.numCuentaa = numCuentaa;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public int getNumSub() {
        return numSub;
    }

    public void setNumSub(int numSub) {
        this.numSub = numSub;
    }

    public String getSubcuenta() {
        return subcuenta;
    }

    public void setSubcuenta(String subcuenta) {
        this.subcuenta = subcuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

 
    
}
