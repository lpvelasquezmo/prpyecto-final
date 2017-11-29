/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contabilidad;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author MARIAJOSE
 */
public class Contabilidad {
    private Cat1 catalogo;
    private RegistroMes[] registrosanio;
    private ArrayList<Beneficiario> beneficiarios;

    public Contabilidad(Cat1 catalogo) {
        this.catalogo = catalogo;
        this.registrosanio = new RegistroMes[12];
        this.beneficiarios = new ArrayList<>();
    }

    public ArrayList<Beneficiario> getBeneficiarios() {
        return beneficiarios;
    }

    public void setBeneficiarios(ArrayList<Beneficiario> beneficiarios) {
        this.beneficiarios = beneficiarios;
    }

    public Cat1 getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Cat1 catalogo) {
        this.catalogo = catalogo;
    }

    public RegistroMes[] getRegistrosanio() {
        return registrosanio;
    }

    public void setRegistrosanio(RegistroMes[] registrosanio) {
        this.registrosanio = registrosanio;
    }
    
    
    public boolean BG(){
        double debitoTotal = 0.0;
        double creditoTotal = 0.0;
        double total = 0.0;
        for(RegistroMes registrom  : registrosanio){
            for (RegistroDia registrod1 : registrom.getRegistroM() ){
                for (Registro1 registrouno : registrod1.getRegistros()){
                if (registrouno.getCuenta().getClase().getNombreClase().equals("activo")){
                    registrouno.getCuenta().getSubcuenta();
               if (registrouno.getValorRegistro() <= 0){//menor
                       creditoTotal += registrouno.getValorRegistro();
                    } else {
                    debitoTotal += registrouno.getValorRegistro();
                } }else if (registrouno.getCuenta().getClase().getNombreClase().equals("pasivo") && registrouno.getCuenta().getClase().getNombreClase().equals("patrimonio")){
                        registrouno.getCuenta().getSubcuenta();
                        if (registrouno.getValorRegistro() <= 0){//menor
                       debitoTotal += registrouno.getValorRegistro();
                    } else {
                    creditoTotal += registrouno.getValorRegistro();
                }
            }
                }
        }
    }
       if (debitoTotal == creditoTotal){
           return true;
       }else;
       return false;
   }
  public void addBen (Beneficiario e){
      this.beneficiarios.add(e);
  }
  public void eliminarBen (Beneficiario e){
      this.beneficiarios.remove(e);
  }
  public void modBen (Beneficiario e, String cambiob, String h, String l, String f ){
      for (Beneficiario s : beneficiarios){
          if (e.getNombreTercero().equals(s.getNombreTercero())){
             s.setNombreTercero(cambiob);
             s.setCedulaNit(h);
             s.setDireccion(l);
             s.setTelefono(f);
          }
      }
  }
   
//    public String[] mostrarBG(){
//        
//         for(RegistroMes registrom  : registrosanio){
//            for (RegistroDia registrod1 : registrom.getRegistroM() ){
//                for (Registro1 registrouno : registrod1.getRegistros()){
//                if (registrouno.getCuenta().getClase().getNombreClase().equals("activo")){
//                    String hello= "";
//                    hello = String.valueOf(registrouno.getValorRegistro());
//                  if (registrouno.getValorRegistro() <= 0){//menor
//                      
//                        
//                    } else  {
//                    
//               
//            }
//        }
//            if (registrouno.getCuenta().getClase().getNombreClase().equals("pasivo")){
//                String hello= "";
//                    hello = String.valueOf(registrouno.getValorRegistro());
//                  if (registrouno.getValorRegistro() <= 0){//menor
//                      
//                        
//                    } else  {
//                    result.put("Paivo",registrouno.getCuenta().getSubcuenta(), "", hello);
//               
//            }
//            }   if (registrouno.getCuenta().getClase().getNombreClase().equals("patrimonio")){
//                String hello= "";
//                    hello = String.valueOf(registrouno.getValorRegistro());
//                  if (registrouno.getValorRegistro() <= 0){//menor
//                      
//                        result.put("Patrimonio",registrouno.getCuenta().getSubcuenta(), hello,  "");
//                    } else  {
//                    result.put("Patrimonio",registrouno.getCuenta().getSubcuenta(), "", hello);
//               
//            }
//       
//    }
//} 
//    }
//         
//    }
//         return result;
//}
}