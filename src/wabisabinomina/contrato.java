/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wabisabinomina;

import java.util.Scanner;

/**
 *
 * @author Maicol Velasquez
 */
public class contrato {
   private String tipo;
   private String id;
   private String empleador;
  // private trabajador empleado;
   private String LugCont;
   private int horaI;
   private int horaF; 
   private int TotalHoras;
   private fecha fechaI;
   private int DiContra; 
   private fecha fechaF;

   public contrato(){
       this.fechaI = new fecha();
       this.fechaF = new fecha();
   }
   
    public contrato(int hoI, int Hof, String id, String tipo, String empleador, int diaI, int mesI, int anoI, int diaF,int mesF , int anoF , String LugCont) {
        this.tipo = tipo;
        this.horaI = hoI;
        this.horaF = Hof;
        int auxi = Hof - hoI;
        this.TotalHoras = auxi; System.out.println("hora total: " + this.TotalHoras);
        this.id = id;
        this.fechaI = new fecha (diaI, mesI, anoI);
        this.fechaF = new fecha (diaF, mesF, anoF);
        this.LugCont = LugCont;
        this.empleador = empleador;
     //   this.empleado = new trabajador (aux ,fecha, nomb, ape, ti, LTi, dire, tel, salario, sutur);
         this.fechaI = fechaI;

               
    }

    public int getHoraI() {
        return horaI;
    }

    public void setHoraI(int horaI) {
        this.horaI = horaI;
    }

    public int getHoraF() {
        return horaF;
    }

    public void setHoraF(int horaF) {
        this.horaF = horaF;
    }

    public int getTotalHoras() {
        return TotalHoras;
    }

    public void setTotalHoras(int TotalHoras) {
        this.TotalHoras = TotalHoras;
    }

  

    

    public int getDiContra() {
        return DiContra;
    }

    public void setDiContra(int DiContra) {
        this.DiContra = DiContra;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

  
   


    public String getLugCont() {
        return LugCont;
    }

    public void setLugCont(String LugCont) {
        this.LugCont = LugCont;
    }

         
         
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEmpleador() {
        return empleador;
    }

    public void setEmpleador(String empleador) {
        this.empleador = empleador;
    }

    public fecha getFechaI() {
        return fechaI;
    }

    public void setFechaI(fecha fechaI) {
        this.fechaI = fechaI;
    }

    public fecha getFechaF() {
        return fechaF;
    }

    public void setFechaF(fecha fechaF) {
        this.fechaF = fechaF;
    }

   

 
   
    
   
}
