/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wabisabinomina;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;



public class Empresa {
    
    private ArrayList <contrato> contratos;
    private ArrayList <trabajador> tras;
   // private ArrayList <Turno> turnos;
    private String nombre;
    private String Rlegal;
    private String usuario;
    private String contraseña;
    private String nit;
    private String Dir;
    private String tel;
    private String Rgimen;
    private boolean granCont;
    private String tipoAport;
    private String moneda;
     
    
    public String getRgimen() {
        return Rgimen;
    }
    

    public void setRgimen(String Rgimen) {
        this.Rgimen = Rgimen;
    }

   

    public Empresa() {
        this.nombre = "";
        this.Rgimen = "";
       this.contratos = new ArrayList <>();
        this.tras = new ArrayList <>();
//         this.turnos = new ArrayList <>();
        this.Rlegal = "";
        this.nit = "";
        this.Dir = "";
        this.tel = "";
        this.granCont = false;
        this.moneda = "";
        this.usuario ="";
        this.contraseña ="";
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

   

   
    
    
    public boolean addContra (contrato Contrato){
        return this.contratos.add(Contrato);
     }

    public boolean addTrab (trabajador Tra){
        return this.tras.add(Tra);
    }
    
    public boolean eliminarTrab (trabajador Tra){
        
        return this.tras.remove(Tra);
    }
       
     public boolean RenovarContrato (){
        boolean  aux = false;
        //FFFFFFFFFFFFFF
         
         return aux; 
     } 
     
     
     
     public boolean eliminarContra (contrato Contrato1){
        
            return this.contratos.remove(Contrato1);

     }
     
     
     
//     public boolean eliminarTur(Turno turno){
//         return this.turnos.remove(turno);
//     }
//     
//      public boolean addTurno (Turno turno){
//        
//         return this.turnos.add(turno);
//     }
    
      

    
    
    
    public String tipoAportador (int nEmple){
       
        if (nEmple> 20){
            this.tipoAport = "Gran Aportador";
        }  else {
            this.tipoAport = "Pequeño Aportador";
        }      
        return this.tipoAport;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<trabajador> getTras() {
        return tras;
    }

    public void setTras(ArrayList<trabajador> tras) {
        this.tras = tras;
    }

//    public ArrayList<Turno> getTurnos() {
//        return turnos;
//    }
//
//    public void setTurnos(ArrayList<Turno> turnos) {
//        this.turnos = turnos;
//    }
//
//   

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRlegal() {
        return Rlegal;
    }

    public void setRlegal(String Rlegal) {
        this.Rlegal = Rlegal;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDir() {
        return Dir;
    }

    public void setDir(String Dir) {
        this.Dir = Dir;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

   
    

  

    public boolean isGranCont() {
        return granCont;
    }

    public void setGranCont(boolean granCont) {
        this.granCont = granCont;
    }

    public String isTipoAport() {
        return tipoAport;
    }

    public ArrayList<contrato> getContratos() {
        return contratos;
    }

    public void setContratos(ArrayList<contrato> contratos) {
        this.contratos = contratos;
    }

    public void setTipoAport(String tipoAport) {
        this.tipoAport = tipoAport;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
    
    
    
}
