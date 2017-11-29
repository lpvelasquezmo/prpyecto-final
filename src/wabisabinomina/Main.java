/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contabilidad;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author MARIAJOSE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) throws IOException{
      Cat1 catalogoCuentas = new Cat1 ();
      Contabilidad cont1 = new Contabilidad(catalogoCuentas);
      File clases = new File ("cuentas/clase.txt");
      
      //crear clases
       FileReader leeClase = new FileReader (clases);
      BufferedReader bc1 = new BufferedReader  (leeClase);
      String lineaClase;
      Clase[] clase = new Clase[6];
       int j = 0;
      while ( (lineaClase = bc1.readLine()) != null && j<=5){
         
          String div[] = lineaClase.split(",");
          int numero1 = Integer.parseInt(div[0]);
          String nombreCuenta = div[1];
          String naturalezaCuenta = div[2];
          Clase clases1 = new Clase (numero1, nombreCuenta,naturalezaCuenta);
         
                clase[j] = clases1;
                

              
                         j++;
      }
      
     // crear catalogo clases
//     String nomArc []= {"activos", "pasivos", "patrimonio", "ingresos","gastos" , "costosdeventa", "costosdePuO"};
//      
//     for (int i=0; i< nomArc.length; i++){
         File cuentas = new File ("cuentas/activos.txt");
         FileReader leeCuenta = new FileReader (cuentas);
      BufferedReader bc2 = new BufferedReader  (leeCuenta);
      String lineaCuenta;
       while ( (lineaCuenta = bc2.readLine()) != null){
          
         //  int k=0;
          String divCuenta[] = lineaCuenta.split(",");
         
         String hello ="";
         String hello1 ="";
                for (int k=0; k<6; k++) {
                    String hy = divCuenta[0];
                    clase[k].getNombreClase();
               
          if (hy.equals(clase[k].getNombreClase())){
           j = clase[k].getNumero();
             hello = clase[k].getNombreClase();
             hello1 = clase [k].getNaturaleza();
              
              Clase clase11 = new Clase (j, hello, hello1);
          int numeCuenta = Integer.parseInt(divCuenta[1]);
          String num1 = divCuenta[1];
        String grupoCuenta = divCuenta[2];
        String num2 = divCuenta[3];
        int numCuenta = Integer.parseInt(divCuenta[3]);
        String cuentaC = divCuenta[4];
        String num3 = divCuenta [5];
        int numSubCuenta = Integer.parseInt(divCuenta[5]);
        String nomSubCuenta = divCuenta[6];
        String ls = Integer.toString(j) +num1 +num2 +num3;
            
      Cuenta crearcuentas = new Cuenta (clase11, numeCuenta , grupoCuenta, numCuenta,cuentaC, numSubCuenta, nomSubCuenta, ls);
                catalogoCuentas.addCuenta1(crearcuentas);
          } else{
            
          }
                  };

       }
        File beneficiarios = new File ("Beneficiarios/beneficiarios.txt");
         FileReader leeBene = new FileReader (beneficiarios);
      BufferedReader bc3 = new BufferedReader  (leeBene);
      String lineaBene;
       while ( (lineaBene = bc3.readLine()) != null){
           String divB[] = lineaBene.split(",");
           String nomB = divB[0];
           String cedBene = divB[1];
           String dirB = divB[2];
           String telB = divB[3];
           Beneficiario ben = new Beneficiario (nomB, cedBene, dirB, telB);
           cont1.addBen(ben);
          
       }
        int contContabilidad;
        int opcCont;
        Scanner elegir =new Scanner (System.in);
        System.out.println("3. Contabilidad");
        contContabilidad = elegir.nextInt();
        
            while (contContabilidad == 3){
                System.out.println("1. Terceros");
                System.out.println("2. Contabilidad");
                System.out.println("3. Salir"); 
                int opCont33 = 0;
                opCont33 = elegir.nextInt();
               if (opCont33 == 1){
                   int el1 = elegir.nextInt();
                   switch (el1){
                       case 1 ://anadir
                           System.out.println("Ingrese los siguientes datos del nuevo beneficiario");
                           System.out.println("Nombre:");
                           String nombre = elegir.next();
                           System.out.println("Cedula");
                           String ced = elegir.next();
                           System.out.println("Direccion");
                           String dir = elegir.next();
                           System.out.println("Telefono");
                           String tel = elegir.next();
                           Beneficiario nuevo = new Beneficiario(nombre, ced, dir, tel);
                           cont1.addBen(nuevo);
                            BufferedWriter bw;
                           bw = new BufferedWriter(new FileWriter(beneficiarios,true));
                            String cadena = nuevo.getNombreTercero()+"," +nuevo.getCedulaNit()+","+  nuevo.getDireccion() + "," + nuevo.getTelefono();
                            bw.newLine();
                            
                            bw.write(cadena);
                            bw.close();
            
                                break;

                       case 2 : // modicicar
                           System.out.println("Cedula del ben a mod");
                           String ced11 = elegir.next();
                           String n = ""; String c = ""; String d = ""; String t = "";
                           for (Beneficiario u1 : cont1.getBeneficiarios()){
                               if (u1.getCedulaNit().equals(ced11)){
                                   n = u1.getNombreTercero();
                                   c = u1.getCedulaNit();
                                   d = u1.getDireccion();
                                   t = u1.getTelefono();
                               }
                           }
                           Beneficiario s = new Beneficiario ( n,  c,  d, t);
                           System.out.println("1, mod name");
                           System.out.println("2, mod ced");
                           System.out.println("3, mod dir");
                           System.out.println("4, mod tel");
                           int el2 = elegir.nextInt();
                           String select = "";
                           if (el2 == 1){
                               System.out.println("Ingrese nuevo nombre");
                               select = elegir.next();
                           } else if (el2 == 2){
                               System.out.println("Ingrese nuevo ced");
                               select = elegir.next();
                           } else if (el2 == 3){
                               System.out.println("Ingrese nuevo dir");
                               select = elegir.next();
                           } else if (el2 == 4){
                               System.out.println("Ingrese nuevo tel");
                               select = elegir.next();
                           }
                           //cont1.modBen(s, el2, select);
                            BufferedWriter b2;
                           b2 = new BufferedWriter(new FileWriter(beneficiarios,true));
                           for (Beneficiario bene : cont1.getBeneficiarios()){
                            String cadena1 = bene.getNombreTercero()+"," +bene.getCedulaNit()+","+  bene.getDireccion() + "," + bene.getTelefono();
                            b2.write(cadena1);
                            b2.newLine();
                           }
                            
                            b2.close();
                           break;
//                       case 3 : // eliminar 
//                       System.out.println("ello");
//                           break;
////                            try {
//            
//            if (!beneficiarios.isFile()) {
//                System.out.println("Parameter is not an existing file");
//                return;
//            }
//            //Construct the new file that will later be renamed to the original filename. 
//            File tempFile = new File(beneficiarios.getAbsolutePath() + ".txt");
//            BufferedReader br = new BufferedReader(new FileReader("beneficiarios.txt"));
//            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
//            String line ;
//            //Read from the original file and write to the new 
//            //unless content matches data to be removed.
//            while ((line = br.readLine()) != null) {
//                if (!line.trim().equals(lineToRemove)) {
//                    pw.println(line);
//                    pw.flush();
//                }
//            }
//            pw.close();
//            br.close();
//            //Delete the original file
//            if (!inFile.delete()) {
//                System.out.println("Could not delete file");
//                return;
//            }
//            //Rename the new file to the filename the original file had.
//            if (!tempFile.renameTo(inFile))
//                System.out.println("Could not rename file");
// 
//        } catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    
 
//                       case 4 :// mostrar
//                   if (opCont33 == 2 ) {
//                   
//               } else if (opCont33 == 3){
//                   
//               }
//            while (contContabilidad != 3){
//                break;
//            }
//      
//  }
//        }
//  
//}
            }
                   }
               }
               }
  }
  
      
