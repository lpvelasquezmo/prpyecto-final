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
public abstract class Persona {
  private String nomb;
  private String ape;
  private double ti;
  private String Fnacimi;
  private String LTi;
  private String dire;
  private double tel;

    public Persona(String fecha, String nomb, String ape, double ti, String LTi, String dire, double tel) {
        this.nomb = nomb;
        this.Fnacimi =fecha;
        this.ape = ape;
        this.ti = ti;
        this.LTi = LTi;
        this.dire = dire;
        this.tel = tel;
    }

    public String getFnacimi() {
        return Fnacimi;
    }

    public void setFnacimi(String Fnacimi) {
        this.Fnacimi = Fnacimi;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public double getTi() {
        return ti;
    }

    public void setTi(double ti) {
        this.ti = ti;
    }

    public String getLTi() {
        return LTi;
    }

    public void setLTi(String LTi) {
        this.LTi = LTi;
    }

    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        this.dire = dire;
    }

    public double getTel() {
        return tel;
    }

    public void setTel(double tel) {
        this.tel = tel;
    }
 
  
  
}
