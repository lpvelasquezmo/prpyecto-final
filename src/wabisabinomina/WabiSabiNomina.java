/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wabisabinomina;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;


public class WabiSabiNomina {
     
        private static Empresa empresa;
        private static Scanner en = new Scanner (System.in);
            
           public static void main(String[] args) throws FileNotFoundException {
               
            File archiTrab = new File ("Empresa/Trabajadores.txt");
            File Directorio = new File ("Empresa");
            File archiEmpr = new File ("Empresa/Datos Empresa.txt");
            File archiCont = new File ("Empresa/Contratos.txt");
            File archiNom = new File ("Empresa/Nomina.txt");
            
            if ( Directorio.exists() == false || archiTrab.exists() == false ){
             Directorio.mkdir();             
             archiTrab = new File ( "Empresa/Trabajadores.txt"); 
             archiEmpr= new File ("Empresa/Datos Empresa.txt");
             archiCont = new File ("Empresa/Contratos.txt");
             archiNom  = new File ("Empresa/Nomina.txt");
            }
            
            
        PrintStream Out1 = new PrintStream(archiEmpr);
        PrintStream Out2 = new PrintStream (archiTrab);
        PrintStream Out3 = new PrintStream (archiCont);
        PrintStream Out4 = new PrintStream (archiNom);
        
         
  
      int continuar = 1, opcion = 0;
        do {
            System.out.println("1. crear Empresa ");
            System.out.println("2. crear turno");
            System.out.println("3. crear contrato");
            System.out.println("4. Eliminar contrato");
            System.out.println("5. sacar nomina del mes");
            System.out.println("6. ver nomina ");
            opcion = en.nextInt();
            switch (opcion) {
                case 1:
                  boolean aux = crearEmp (Out1, archiEmpr );
                    break;

                case 2:
         System.out.println("Hora de inicio del Turno (formato de 24 horas):\n");
         float hoini = en.nextFloat();
         System.out.println("Hora de finalización del Turno (Formato de 24 horas):\n");
         float hofin = en.nextFloat();
         System.out.println(" numero unico identificador del turno: \n");
         int id = en.nextInt();
        boolean aux1 = empresa.addTurno(hoini, hofin, id);
        if (aux1 == true){
            System.out.println("creado con exito, gracias");
        }else {
            System.out.println("Error");
        }
                    break;

                case 3:
                    System.out.println("id del turno que le tocara al trabajador:\n");
                    int nu = en.nextInt();
                    
                  Turno tur = empresa.buscarT(nu);     
                        
                boolean a = crearContrato (Out2, Out3, tur);
            if (a == true){
                System.out.println("Creado con exito\n");
            }else {
                System.out.println("Error\n");
                       
            }
                   
                    break;
                
                case 4:
                    System.out.println("Escriba el id del contrato a eliminar:\n ");
                    int ide = en.nextInt();
                    System.out.println("Escriba el documento del trabajador del contrato:");
                    Double cc = en.nextDouble();
                    
                    if (empresa.getContratos().contains(ide) || empresa.getTras().contains(cc)){
                        boolean ay = false;
                        
                        
                        
                    }
                    
             break;
                case 5:
                    
                    break;
                    

            }

        } while (continuar == 1);

        
                
    }  
      
         
       
       // crear trabajador y contrato
         
         
     public static boolean crearContrato (PrintStream Out,PrintStream Out1,Turno turno){
         //crear y añadirlo a arrayList de empresa
          System.out.println("Escriba el Documento de Identidad del nuevo trabajador:\n");
         double cc1 = en.nextDouble();
         boolean aux  = empresa.getTras().contains(cc1);
         if (aux == false){
         
         contrato Contra = new contrato ();
         System.out.println("Tipo de Contrato (Indefinido o fijo):\n");
         Contra.setTipo(en.next());
         Out.print(Contra.getTipo()+ ";");
         System.out.println("Persona que contrata :");
         
         System.out.println("Lugar donde se genero el contrato: \n");
         Contra.setLugCont(en.next());
         Out.print(Contra.getLugCont()+ ";");
         float fFin = Contra.fechaFin();
         Out.print(fFin+ ";");
         Contra.setId(cc1); 
         Out.print(cc1+ ";");
         empresa.addContra(Contra);
         trabajador tra= null;
         Out1.print(cc1+ ";");
         tra.setTi(cc1);
         System.out.println("Escriba los nombres del trabajador:\n");
         tra.setNomb(en.next());
         Out.print(tra.getNomb()+ ";");
         System.out.println("Escriba el cargo del trabajador:\n");
         tra.setCargo(en.next());
         Out1.println(tra.getNomb()+ ";");
         System.out.println("Escriba el Apellido del trabajador:\n");
         tra.setApe(en.next());
         Out1.print(tra.getCargo()+ ";");
         System.out.println("Escriba lugar de expedicion del documento:\n");
         tra.setLTi(en.next());
         Out1.print(tra.getLTi()+ ";");
             System.out.println("la direccion de recidencia:");
             tra.setDire(en.next());
             Out1.print(tra.getDire()+ ";");
             System.out.println("el numero de contacto:\n");
             tra.setTel(en.nextDouble());
             Out1.print(tra.getTel()+ ";");
             System.out.println("Fecha de nacimiento:");
             tra.setFnacimi(en.next());
             Out1.print(tra.getFnacimi()+ ";");
             System.out.println("Tiene auxilio de transporte (SI o NO ):\n");
             String auxili = en.next(); boolean auux= false;
             if (auxili == "Si" || auxili == "SI" || auxili == "si"){
                 auux = true;
             }else {
                 auux = false;
             }
             tra.setAux(auux);
             Out1.print(tra.isAux()+ ";");
             tra.setSutur(turno);
             Out1.print(tra.getSutur()+ ";");
             System.out.println("Salario mensual:");
             tra.setSalario(en.nextDouble());
             Out1.print(tra.getSalario()+ ";");
             
             
            aux = empresa.addContra(Contra);
            aux = empresa.addTrab(tra);
         }
         else {
             System.out.println("El trabajador ya existe en la base de datos de la empresa.");
           
         }
         
        return aux; 
     }
         
         
     public static boolean crearEmp (PrintStream Out, File archiEmpre){
         
        boolean aux = false;
          empresa = new Empresa();
          
         if (archiEmpre.canRead()) {
         System.out.println("Nombre:\n");
         String name = en.next();
         empresa.setNombre(name);
         Out.println(empresa.getNombre()+ "\n");
         System.out.println("Numero de Turnos:");
         empresa.setNumTurnos(en.nextInt());
         Out.println(empresa.getNumTurnos() + "\n");
         System.out.println("Representante legal:\n");
         empresa.setRlegal(en.next());
         Out.println(empresa.getRlegal()+ "\n");
         System.out.println("Nit de la empresa: \n");
         empresa.setNit(en.nextDouble());
         Out.println(empresa.getNit()+ "\n");
         System.out.println("Direcion de la empresa:\n");
         empresa.setDir(en.next());
         Out.println(empresa.getDir()+ "\n");
         System.out.println("Telefono :\n");
         empresa.setTel(en.nextDouble());
         Out.println(empresa.getTel()+ "\n");
         System.out.println("Regimen legal: \n");
         empresa.setRgimen( en.next());
         Out.println(empresa.getRgimen()+ "\n");
         System.out.println("Es gran contrbuyente (SI o NO): /n");
         String cont = en.next();
         empresa.setGranCont(false);
         if (cont.equals("SI")){
         empresa.setGranCont(true);
         }else {
         empresa.setGranCont(false);
        }
         Out.println(empresa.isGranCont()+ "\n");
         System.out.println("moneda que maneja: \n");
         empresa.setMoneda(en.next());
         Out.println(empresa.getMoneda()+ "\n");
         String TipApor = empresa.tipoAportador(empresa.getContratos());
         Out.println(TipApor+ "\n");
         aux = true;
        }
        else {
      aux = true;
        }
        return aux;
     }   
     
    
         
  
     public void NominaTrab (){
         
     }
     
     public void NominaEmpr (){
         
     }
       
    
    
}
