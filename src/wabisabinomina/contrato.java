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
   private trabajador empleador;
   private trabajador empleado;
   private String LugCont;
   private float fechaI;
   private float fechaF;
   private double id;

   public contrato(){
       
   }
   
    public contrato(boolean aux ,String fecha, String nomb, String ape, double ti, String LTi, String dire, double tel, double salario, Turno sutur, String LugCont, double id, String tipo, trabajador empleador, float fechaI) {
        this.tipo = tipo;
        this.LugCont = LugCont;
        this.id = id;
        this.empleador = empleador;
        this.empleado = new trabajador (aux ,fecha, nomb, ape, ti, LTi, dire, tel, salario, sutur);
         this.fechaI = fechaI;

               
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }
    
         public float fechaFin(){
                     if (tipo.equals("Fijo")){
            Scanner q = new Scanner (System.in);
            System.out.println("Escriba la fecha de finalizacion del contrato: (dia.mes.año)");
            float fFinal = q.nextFloat();
            this.fechaF= fFinal;
        }
return this.fechaF;
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

    public trabajador getEmpleador() {
        return empleador;
    }

    public void setEmpleador(trabajador empleador) {
        this.empleador = empleador;
    }

    public trabajador getEmpleado() {
        return empleado;
    }

    public void setEmpleado(trabajador empleado) {
        this.empleado = empleado;
    }

    public float getFechaI() {
        return fechaI;
    }

    public void setFechaI(float fechaI) {
        this.fechaI = fechaI;
    }

    public float getFechaF() {
        return fechaF;
    }

    public void setFechaF(float fechaF) {
        this.fechaF = fechaF;
    }
    
   
    
   
}
