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
    private Turno[] turnos;
    private int NumTurnos;
    private String nombre;
    private String Rlegal;
    private double nit;
    private String Dir;
    private double tel;
    private String Rgimen;
    private boolean granCont;
    private String tipoAport;
    private String moneda;
   
    Scanner en = new Scanner (System.in);
    
    
    public String getRgimen() {
        return Rgimen;
    }
    

    public void setRgimen(String Rgimen) {
        this.Rgimen = Rgimen;
    }

    public Turno[] getTurnos() {
        return turnos;
    }

    public void setTurnos(Turno[] turnos) {
        this.turnos = turnos;
    }

    public Empresa() {
        this.nombre = "";
        this.Rgimen = "";
        this.contratos = new ArrayList <>();
        this.tras = new ArrayList <>();
        this.turnos = new Turno [this.NumTurnos];
        this.NumTurnos = 0;        
        this.Rlegal = "";
        this.nit = 0;
        this.Dir = "";
        this.tel = 0;
        this.granCont = false;
        this.moneda = "";
    }

    public ArrayList<contrato> getContratos() {
        return contratos;
    }

    public void setContratos(ArrayList<contrato> contratos) {
        this.contratos = contratos;
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
         
         
         return aux; 
     } 
     
     
     
     public boolean eliminarContra (contrato Contrato){
        boolean aux = false;
         if (aux == false){
             
             aux = this.contratos.remove(Contrato);
             
         }
         return aux;
     }
     
      public boolean addTurno (float hoini, float hofin, int id){
         boolean au = false;
                  Turno turno = new Turno ();
                 while (au = false){
        
         au = turno.Turno(hoini, hofin, id);
                        
                 }
                 for (int i=0; i<this.turnos.length; i++){
                 if (this.turnos [i]==null){
                 this.turnos[i] = turno; 
                 }
                 }
                 return au;
     }
    
      
    public Turno buscarT (int id) {
        
        Turno turno=null;
        for (int ih = 0; ih < this.NumTurnos; ih++) {
            if (this.turnos[ih].getId()== id) {
               
                turno = this.turnos[ih];
                
            }
        }
        return turno;
    }
    
    
    
    public String tipoAportador (ArrayList <contrato> contratos){
       int tama =contratos.size();
        if (tama> 20){
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

    public int getNumTurnos() {
        return NumTurnos;
    }

    public void setNumTurnos(int NumTurnos) {
        this.NumTurnos = NumTurnos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRlegal() {
        return Rlegal;
    }

    public void setRlegal(String Rlegal) {
        this.Rlegal = Rlegal;
    }

    public double getNit() {
        return nit;
    }

    public void setNit(double nit) {
        this.nit = nit;
    }

    public String getDir() {
        return Dir;
    }

    public void setDir(String Dir) {
        this.Dir = Dir;
    }

    public double getTel() {
        return tel;
    }

    public void setTel(double tel) {
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
