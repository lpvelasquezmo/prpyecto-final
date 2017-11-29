
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
public class Registro1 {
    private Cuenta cuenta;
    private String descripcion;
    Beneficiario beneficiario;
    private double valorRegistro;
    

    public Registro1(Cuenta cuenta, String descripcion, Beneficiario beneficiario, double valorRegistro) {
        this.cuenta = cuenta;
        this.descripcion = descripcion;
        this.beneficiario = beneficiario;
        this.valorRegistro = valorRegistro;
        
    }

    public Beneficiario getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Beneficiario beneficiario) {
        this.beneficiario = beneficiario;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValorRegistro() {
        return valorRegistro;
    }

    public void setValorRegistro(double valorRegistro) {
        this.valorRegistro = valorRegistro;
    }
    
    
}
