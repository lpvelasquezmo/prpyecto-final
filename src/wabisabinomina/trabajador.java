/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wabisabinomina;

/**
 *
 * @author Maicol Velasquez
 */
public class trabajador extends Persona {
    
    // forma de variar el turno
   private String cargo;
   private contrato sucontra;
  // private Turno sutur;
   private boolean aux;
   private double salario;
  
   public trabajador (){
       
   }
    
     
    public trabajador(boolean aux ,int dia, int mes, int anio, String cargo, String nomb, String ape, String ti,String LTi, String dire, String tel, double salario,  contrato Contra) {
        super( dia, mes, anio,  nomb, ape,  ti, LTi, dire, tel) ;
        this.salario = salario;
        this.cargo = cargo;
        //this.sutur = sutur;
        this.sucontra = Contra;
        this.aux = aux;
      //  contrato sucontra = null;
    }

    
    
    public contrato getSucontra() {
        return sucontra;
    }

    public void setSucontra(contrato sucontra) {
        this.sucontra = sucontra;
    }
    
    
      
//       public Turno getSutur() {
//        return sutur;
//    }
//
//    public void setSutur(Turno sutur) {
//        this.sutur = sutur;
//    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isAux() {
        return aux;
    }

    public void setAux(boolean aux) {
        this.aux = aux;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
