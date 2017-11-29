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
public class Beneficiario {
    protected String nombreTercero;
    protected String cedulaNit;
    protected String direccion;
    protected String telefono;

    public Beneficiario(String nombreTercero, String cedulaNit, String direccion, String telefono) {
        this.nombreTercero = nombreTercero;
        this.cedulaNit = cedulaNit;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombreTercero() {
        return nombreTercero;
    }

    public void setNombreTercero(String nombreTercero) {
        this.nombreTercero = nombreTercero;
    }

    public String getCedulaNit() {
        return cedulaNit;
    }

    public void setCedulaNit(String cedulaNit) {
        this.cedulaNit = cedulaNit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
   
    
    

}
