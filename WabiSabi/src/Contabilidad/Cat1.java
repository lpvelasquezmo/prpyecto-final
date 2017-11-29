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
public class Cat1 {
    private ArrayList<Cuenta> cuentas;

    public Cat1() {
        this.cuentas =  new ArrayList<>();
    }
     public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    
    public void addCuenta1(Cuenta cuenta){
        this.cuentas.add(cuenta);
    }
    
   
   
    public void removeCuenta(Cuenta cuentaco2){
        this.cuentas.remove(cuentaco2);
    }
    
}
