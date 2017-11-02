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
   private Turno sutur;

    public Turno getSutur() {
        return sutur;
    }

    public void setSutur(Turno sutur) {
        this.sutur = sutur;
    }
   private boolean aux;
   private double salario;
   
    
    
    public trabajador(boolean aux ,String fecha, String nomb, String ape, double ti, String LTi, String dire, double tel, double salario, Turno sutur) {
        super(fecha, nomb, ape, ti, LTi, dire, tel);
        this.salario = salario;
        this.sutur = sutur;
        this.aux = aux;
      //  contrato sucontra = null;
    }

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
