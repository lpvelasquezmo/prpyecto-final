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
public class NomEmp {
    
    private double totalDeven;
    private double SegSocEmpre;
    private double PensEmp;
    private double SaludEmp;
    private boolean aporPa;
    private double sena;
    private double icbf;
    private double CajaCompFa;

    public double getSena() {
        return sena;
    }

    public void setSena(double sena) {
        this.sena = sena;
    }

    public double getIcbf() {
        return icbf;
    }

    public void setIcbf(double icbf) {
        this.icbf = icbf;
    }

    public double getCajaCompFa() {
        return CajaCompFa;
    }

    public void setCajaCompFa(double CajaCompFa) {
        this.CajaCompFa = CajaCompFa;
    }

    public NomEmp(double totalDeven, boolean aporPa) {
        this.totalDeven = totalDeven;
        this.aporPa = aporPa;
        if (this.aporPa == true){
            this.CajaCompFa = (0.04 * totalDeven);
            this.icbf = (0.03 * totalDeven);
            this.sena = (0.02 * totalDeven );          
        } else {
            this.CajaCompFa = 0; this.icbf = 0; this.sena = 0;
        }
    } 
    
    public void AportesSociales ( double totalDeven){
        this.PensEmp= (totalDeven * 0.12);
        this.SaludEmp = (totalDeven * 0.085);
        this.SegSocEmpre = (totalDeven * 0.085);
    }
    

    public double getTotalDeven() {
        return totalDeven;
    }

    public void setTotalDeven(double totalDeven) {
        this.totalDeven = totalDeven;
    }

    public double getSegSocEmpre() {
        return SegSocEmpre;
    }

    public void setSegSocEmpre(double SegSocEmpre) {
        this.SegSocEmpre = SegSocEmpre;
    }

    public double getPensEmp() {
        return PensEmp;
    }

    public void setPensEmp(double PensEmp) {
        this.PensEmp = PensEmp;
    }

    public double getSaludEmp() {
        return SaludEmp;
    }

    public void setSaludEmp(double SaludEmp) {
        this.SaludEmp = SaludEmp;
    }

    public boolean isAporPa() {
        return aporPa;
    }

    public void setAporPa(boolean aporPa) {
        this.aporPa = aporPa;
    }

    


}
