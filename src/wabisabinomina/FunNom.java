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
    //FechaActual fePago;
    private String fePago;
    private String Ufecha;//ultima fecha de nomina;
    private double Dominicales;
    private double cesantias;
    //private int diasTrados;
    private int diasDescuento; //
    private double TotalDiaDES;
    private int horasDescuento;
    private double TotalHorDescuento;
    private double ExtraREST;
    
    private double prima;
    // private double salarioDia;
    private double salario15;
    private double salarioDia;
    private double salarioHora;
    
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
    private double Deducciones;
    private double prestamos;
    private double valeAlmuerzos = 1800;
    private double Tdevengado;
    private double NetoPago;
    private double auxTrans;

    public FunNom(trabajador trabaja,  double prestamos) {
        this.trabaja = trabaja;
      //  this.diasTrados = diasT;
        this.prestamos = prestamos;
        this.salario15 = trabaja.getSalario() / 2;
         this.salarioDia =  this.salario15/ 15;
         System.out.println("horas: " + trabaja.getSucontra().getTotalHoras() );
         this.salarioHora = this.salarioDia / trabaja.getSucontra().getTotalHoras();
        int dia = 0, mes = 0, annio = 0;
        FechaActual fecha = new FechaActual();
        this.fePago = fecha.Fecha();//.Fecha(int dia, int mes, int annio);
    }

    public double DesDia (int cantidad){
        
       this.TotalDiaDES = this.salarioDia * cantidad;
       System.out.println("Dia DES :" + this.TotalDiaDES );
        
        return this.TotalDiaDES;
    }
    
    public double DesHora (int cantidad){
        this.TotalHorDescuento = this.salarioHora * cantidad;
        
        System.out.println("des Horas: " + this.TotalHorDescuento);
        return this.TotalHorDescuento;
        
    }
    
    public double horasExtraResta (int cantidad ){
        this.ExtraREST = this.salarioHora * cantidad;
        System.out.println(" extraRes: "+ this.ExtraREST);
        return this.ExtraREST;
    }
   

    public void nomina(boolean auxTra, int Domi, double salario15) {

        double aux = 8.33 / 100;
        this.cesantias = salario15 * aux;
        this.prima = salario15 * aux;
        double aux2 = 4.17 / 100;
        this.vacaciones = salario15 * aux2;
        double aux3 = 1 / 100;
        this.interCens = this.cesantias * aux3;
        double aux4 = 0.04;
        System.out.println(" auxiliar "+ aux4);
        this.SegSocTrab = (this.salario15 * aux4);
        
        this.PensTrab = (salario15 * aux4);
        System.out.println("pension" + this.PensTrab + "   salario  " + salario15);
        this.SaludTrab = (salario15 * aux4);
        if (auxTra == true) {
            this.auxTrans = 41570;
        } else {
            this.auxTrans = 0;
        }
        this.Dominicales = (salario15 /15)*Domi;
        
        //double auxExtra = this.HoExtraDiur + this.HoExtraNoct + this.HoNoct + this.HoDomiFest + this.HExtraDOFEDI + this.HEctraDOFENO; 
        this.Deducciones = -this.prestamos - this.valeAlmuerzos - this.PensTrab  - this.SaludTrab - this.TotalHorDescuento - this.TotalDiaDES;
        this.Tdevengado = salario15 + this.ExtraREST + this.auxTrans + this.Dominicales;
        this.NetoPago = this.Tdevengado + this.Deducciones;

    }

    public int getDiasDescuento() {
        return diasDescuento;
    }

    public void setDiasDescuento(int diasDescuento) {
        this.diasDescuento = diasDescuento;
    }

    public double getTotalDiaDES() {
        return TotalDiaDES;
    }

    public void setTotalDiaDES(double TotalDiaDES) {
        this.TotalDiaDES = TotalDiaDES;
    }

    public int getHorasDescuento() {
        return horasDescuento;
    }

    public void setHorasDescuento(int horasDescuento) {
        this.horasDescuento = horasDescuento;
    }

    public double getTotalHorDescuento() {
        return TotalHorDescuento;
    }

    public void setTotalHorDescuento(double TotalHorDescuento) {
        this.TotalHorDescuento = TotalHorDescuento;
    }

    public double getExtraREST() {
        return ExtraREST;
    }

    public void setExtraREST(double ExtraREST) {
        this.ExtraREST = ExtraREST;
    }

    public double getSalarioDia() {
        return salarioDia;
    }

    public void setSalarioDia(double salarioDia) {
        this.salarioDia = salarioDia;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }
    
    

    public trabajador getTrabaja() {
        return trabaja;
    }

    public void setTrabaja(trabajador trabaja) {
        this.trabaja = trabaja;
    }

    public String getFePago() {
        return fePago;
    }

    public void setFePago(String fePago) {
        this.fePago = fePago;
    }

    public double getDominicales() {
        return Dominicales;
    }

    public void setDominicales(double Dominicales) {
        this.Dominicales = Dominicales;
    }

    public double getNetoPago() {
        return NetoPago;
    }

    public void setNetoPago(double NetoPago) {
        this.NetoPago = NetoPago;
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

    public double HoraNoctu(int cantid) {

        double norma = this.trabaja.getSalario() / 30; // 24 dias al mes?????
        double aux = (norma * 1.35);
        this.HoDomiFest = aux * cantid;
        return this.HoNoct;
    }

    public double ExtraDiurna(int cantid) {

        double norma = this.trabaja.getSalario() / 30; // 24 dias al mes?????

        double aux = (norma * 1.25);
        this.HoDomiFest = aux * cantid;
        return this.HoExtraDiur;
    }

    public double ExtraNocturna( int cantid) {

        double norma = this.trabaja.getSalario() / 30; // 24 dias al mes?????

        double aux = (norma * 1.75);
        this.HoDomiFest = aux * cantid;
        return this.HoExtraNoct;
    }

    public double ordinariaDomiFest(int cantid) {

        double norma = this.trabaja.getSalario() / 30; // 24 dias al mes?????

        double aux = (norma * 1.75);
        this.HoDomiFest = aux * cantid;
        return this.HoDomiFest;
    }

    public double ExtraDomFestDiurno(int cantid) {

        double norma = this.trabaja.getSalario() / 30; // 24 dias al mes?????

        double aux = (norma * 2.00);
        this.HoDomiFest = aux * cantid;
        return this.HExtraDOFEDI;
    }

    public double ExtraDomFestNocturno(double salario, int cantid) {

        double norma = this.trabaja.getSalario() / 30; // 24 dias al mes?????

        double aux = (norma * 2.50);
        this.HoDomiFest = aux * cantid;
        return this.HEctraDOFENO;
    }

    public String getUfecha() {
        return Ufecha;
    }

    public void setUfecha(String Ufecha) {
        this.Ufecha = Ufecha;
    }

   

    public double getSalario15() {
        return salario15;
    }

    public void setSalario15(double salario15) {
        this.salario15 = salario15;
    }

    public double getDeducciones() {
        return Deducciones;
    }

    public void setDeducciones(double Deducciones) {
        this.Deducciones = Deducciones;
    }

    public double getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(double prestamos) {
        this.prestamos = prestamos;
    }

    public double getValeAlmuerzos() {
        return valeAlmuerzos;
    }

    public void setValeAlmuerzos(double valeAlmuerzos) {
        this.valeAlmuerzos = valeAlmuerzos;
    }

    public double getTdevengado() {
        return Tdevengado;
    }

    public void setTdevengado(double Tdevengado) {
        this.Tdevengado = Tdevengado;
    }
    
    
    
    
}
