/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author MARIAJOSE
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader bf = new BufferedReader(new FileReader("gastos.txt"));
        String sCadena;
        while ((sCadena = bf.readLine())!=null) {
   System.out.println(sCadena);
}
        
    }
    
}
