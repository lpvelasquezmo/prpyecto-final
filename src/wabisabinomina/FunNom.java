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
public class FunNom {
    trabajador trabaja;
    Fecha fePago;
    private double comisiones;
    private double cesantias;
    private double prima;
    private double vacaciones;
    private double interCens;
    private double SegSocTrab;
    private double PensTrab;
    private double SaludTrab;
    private double HoExtraDiur;
    private double HoExtraNoct;
    private double HoNoct;
    private double HoDomiFest;
    private double HExtraDOFEDI;
    private double HEctraDOFENO;
    private double auxTrans;

    public FunNom(trabajador trabaja, Fecha fePago) {
        this.trabaja = trabaja;
        this.fePago = fePago;
    }
    
    
        
    public double comisiones (double Tcomi){
        this.comisiones = Tcomi;
        return this.comisiones;
    } 
    
    public void nomina (double salario, boolean auxTra){
        double aux = 8.33 / 100;
        this.cesantias = salario * aux;
        this.prima = salario * aux;
        double aux2 = 4.17 /100;
        this.vacaciones = salario * aux2;
        double aux3 = 1 /100;
        this.interCens = this.cesantias * aux3;
        aux = 4/100;
        this.SegSocTrab = salario * aux;
        this.PensTrab = salario * aux;
        this.SaludTrab = salario * aux;
        if (auxTra== true){
            this.auxTrans = 83140;
        }else {
           this.auxTrans = 0;
        }
        
    }

    public trabajador getTrabaja() {
        return trabaja;
    }

    public void setTrabaja(trabajador trabaja) {
        this.trabaja = trabaja;
    }

    public Fecha getFePago() {
        return fePago;
    }

    public void setFePago(Fecha fePago) {
        this.fePago = fePago;
    }

    public double getComisiones() {
        return comisiones;
    }

    public void setComisiones(double comisiones) {
        this.comisiones = comisiones;
    }

    public double getCesantias() {
        return cesantias;
    }

    public void setCesantias(double cesantias) {
        this.cesantias = cesantias;
    }

    public double getPrima() {
        return prima;
    }

    public void setPrima(double prima) {
        this.prima = prima;
    }

    public double getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(double vacaciones) {
        this.vacaciones = vacaciones;
    }

    public double getInterCens() {
        return interCens;
    }

    public void setInterCens(double interCens) {
        this.interCens = interCens;
    }

    public double getSegSocTrab() {
        return SegSocTrab;
    }

    public void setSegSocTrab(double SegSocTrab) {
        this.SegSocTrab = SegSocTrab;
    }

    public double getPensTrab() {
        return PensTrab;
    }

    public void setPensTrab(double PensTrab) {
        this.PensTrab = PensTrab;
    }

    public double getSaludTrab() {
        return SaludTrab;
    }

    public void setSaludTrab(double SaludTrab) {
        this.SaludTrab = SaludTrab;
    }

    public double getHoExtraDiur() {
        return HoExtraDiur;
    }

    public void setHoExtraDiur(double HoExtraDiur) {
        this.HoExtraDiur = HoExtraDiur;
    }

    public double getHoExtraNoct() {
        return HoExtraNoct;
    }

    public void setHoExtraNoct(double HoExtraNoct) {
        this.HoExtraNoct = HoExtraNoct;
    }

    public double getHoNoct() {
        return HoNoct;
    }

    public void setHoNoct(double HoNoct) {
        this.HoNoct = HoNoct;
    }

    public double getHoDomiFest() {
        return HoDomiFest;
    }

    public void setHoDomiFest(double HoDomiFest) {
        this.HoDomiFest = HoDomiFest;
    }

    public double getHExtraDOFEDI() {
        return HExtraDOFEDI;
    }

    public void setHExtraDOFEDI(double HExtraDOFEDI) {
        this.HExtraDOFEDI = HExtraDOFEDI;
    }

    public double getHEctraDOFENO() {
        return HEctraDOFENO;
    }

    public void setHEctraDOFENO(double HEctraDOFENO) {
        this.HEctraDOFENO = HEctraDOFENO;
    }

    public double getAuxTrans() {
        return auxTrans;
    }

    public void setAuxTrans(double auxTrans) {
        this.auxTrans = auxTrans;
    }
    
    public double HoraNoctu (double salario, int cantid){
        
        double norma = salario / 24 ; // 24 dias al mes?????
        this.HoNoct = (norma * 1.35);
       
       return this.HoNoct;
    }
    
    public double ExtraDiurna (double salario, int cantid){
        
        double norma = salario / 24 ; // 24 dias al mes?????
this.HoExtraDiur = (norma * 1.25);       
       return this.HoExtraDiur;
    }
    
    
    public double ExtraNocturna (double salario, int cantid){
        
        double norma = salario / 24 ; // 24 dias al mes?????
this.HoExtraNoct = ( norma * 1.75);
return this.HoExtraNoct ;
    }
    
       public double ordinariaDomiFest (double salario, int cantid){
        
        double norma = salario / 24 ; // 24 dias al mes?????
this.HoDomiFest = (norma * 1.75);
return this.HoDomiFest ;
    }
        
       public double ExtraDomFestDiurno (double salario, int cantid){
        
        double norma = salario / 24 ; // 24 dias al mes?????
        this.HExtraDOFEDI = ( norma * 2.00);
return this.HExtraDOFEDI ;
    } 
        public double ExtraDomFestNocturno (double salario, int cantid){
        
        double norma = salario / 24 ; // 24 dias al mes?????
        this.HEctraDOFENO = ( norma * 2.50);      
        return this.HEctraDOFENO ;
    } 
}
       
