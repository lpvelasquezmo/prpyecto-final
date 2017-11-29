package Contabilidad;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MARIAJOSE
 */
public class RegistroDia {
   private int dia;
   private double debito;
    private double credito;
    private ArrayList<Registro1> registros;

    public RegistroDia(int dia) {
        this.dia = dia;
        this.registros = new ArrayList<>();  
        this.debito= 0.0;
        this.credito= 0.0;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public ArrayList<Registro1> getRegistros() {
        return registros;
    }

    public void setRegistros(ArrayList<Registro1> registros) {
        this.registros = registros;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void addRegistro(Cuenta cuenta, String descripcion, Beneficiario b2, double valorRegistro){
        Registro1 e = new Registro1(cuenta, descripcion,b2,  valorRegistro);
        this.registros.add(e);
    }
   
  
    public ArrayList<Registro1> listRegistros(){
        for(Registro1 registro : registros){
          registros.addAll(registros);
        }
        return registros;       
    }
    
    public void addDebCre(){
        for(Registro1 registro : registros){
        if (registro.getCuenta().getClase().getNaturaleza().equals("debito")){
            if (registro.getValorRegistro() >= 0){
           this.debito += registro.getValorRegistro();
            }else {
                this.credito += registro.getValorRegistro();
            }
        } else if (registro.getCuenta().getClase().getNaturaleza().equals("credito")){
             if (registro.getValorRegistro() >= 0){
           this.credito += registro.getValorRegistro();
            }else {
                this.debito += registro.getValorRegistro();
            }
        }
    }
    }
    
    public boolean validarRegDia(){
            if (this.credito == this.debito){
                return true;
            }
        else {
        return false;
}
    }  
}
