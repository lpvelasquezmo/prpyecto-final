/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wabisabinomina;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha {
    

private Date date = new Date();

        public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    


 


public String Hora (){
  String llegada;
//Caso 1: obtener la hora y salida por pantalla con formato:
DateFormat hourFormat = new SimpleDateFormat("HH.mm");

System.out.println("Hora: "+hourFormat.format(date));
llegada = hourFormat.format(date);
return llegada;
}

public String Fecha (){
    String Fsalida = "";
//Caso 2: obtener la fecha y salida por pantalla con formato:
DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
System.out.println("Fecha: "+dateFormat.format(date));
Fsalida = dateFormat.format(date);
return Fsalida;
}





}

  

