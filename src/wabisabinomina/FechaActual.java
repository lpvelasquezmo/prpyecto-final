/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wabisabinomina;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FechaActual {

    private Date date;
    
    public FechaActual() {
        date = new Date();
    }
    
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

public int getDia() {
    DateFormat dateFormat = new SimpleDateFormat("dd");
System.out.println("dia: "+dateFormat.format(date));

return Integer.parseInt(dateFormat.format(date));

}

public int getMes (){
    
    DateFormat dateFormat2 = new SimpleDateFormat("MM");
System.out.println("MES: "+dateFormat2.format(date));
return Integer.parseInt(dateFormat2.format(date));    
}

public int getAño(){
//    
//Caso 2: obtener la fecha y salida por pantalla con formato:
DateFormat dateFormat3 = new SimpleDateFormat("yyyy");
System.out.println("AÑO: "+dateFormat3.format(date));
return Integer.parseInt(dateFormat3.format(date));
//
}

public String Fecha (){
//    
String fecha = "";
//Caso 2: obtener la fecha y salida por pantalla con formato:
DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
System.out.println("dia: "+dateFormat.format(date));
fecha = (dateFormat.format(date));

return fecha;
}
   
}




  

