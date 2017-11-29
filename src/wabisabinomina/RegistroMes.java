/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contabilidad;

import java.util.ArrayList;

/**
 *
 * @author MARIAJOSE
 */
public class RegistroMes {
    private String mes;
    private String año;
    private ArrayList<RegistroDia> registroM;

    public RegistroMes(String mes, String año) {
        this.mes = mes;
        this.año = año;
        this.registroM = new ArrayList<>();
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public ArrayList<RegistroDia> getRegistroM() {
        return registroM;
    }

    public void setRegistroM(ArrayList<RegistroDia> registroM) {
        this.registroM = registroM;
    }
    
    public void addRegistroDia(RegistroDia registrodia1){
        this.registroM.add(registrodia1);
    }
    
    public boolean removerRegistro(RegistroDia regdia){
        return registroM.remove(regdia);
    }
     
}
