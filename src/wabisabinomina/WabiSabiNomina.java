/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wabisabinomina;

import inventario.Inventario;
import inventario.Materia;
import inventario.Producto;
import java.awt.BorderLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WabiSabiNomina {

    public static void main(String[] args) throws FileNotFoundException {

        Empresa empresa = new Empresa();
        Turno newT = new Turno();

        File archiTrab = new File("Empresa/Trabajadores.txt");
        File Directorio = new File("Empresa");
        File archiEmpr = new File("Empresa/Datos Empresa.txt");
        File archiCont = new File("Empresa/Contratos.txt");
        File archiNom = new File("Empresa/Nomina.txt");
        File archiTur = new File("Empresa/Turnos.txt");
        File archiFecha = new File("Empresa/FechaNomina.txt");
        // Scanner sc = new Scanner(new FileInputStream(archiTur));

        if (Directorio.exists() == false || archiTrab.exists() == false || archiFecha.exists() == false) {
            Directorio.mkdir();
            archiTrab = new File("Empresa/Trabajadores.txt");
            archiEmpr = new File("Empresa/Datos Empresa.txt");
            archiCont = new File("Empresa/Contratos.txt");
            archiNom = new File("Empresa/Nomina.txt");
            archiFecha = new File("Empresa/FechaNomina.txt");

            archiTur = new File("Empresa/Turnos.txt");

        }

        Scanner de = new Scanner(System.in);

        new WabiSabiNomina().iniciar(empresa, archiEmpr, de);
        new WabiSabiNomina().leerContras(archiCont, empresa);
        System.out.println("hoa1   " +empresa.getContratos().size());
        
        new WabiSabiNomina().fin ( empresa, archiCont);
      //  new WabiSabiNomina().leerTurns(archiTur, empresa);
        System.out.println("hoa2");
        new WabiSabiNomina().leerTrabs(archiTrab, empresa);
        System.out.println(" hoa3");
//if (auxi1 == true && auxi2 == true && auxi3 == true ){

       int continuarUni = 1, opcionUni = 0;
        Scanner tr = new Scanner(System.in);

        do {
           // System.out.println("1. crear turno");
            System.out.println("1. Inventario");
            System.out.println("2. Nomina");
            System.out.println("3. Contabilidad");
            System.out.println("4. Cerra Sesion ");

            
            opcionUni = tr.nextInt();
            tr.nextLine();

            switch (opcionUni) {
                
                
                
                
               case 1: //INVENTARIO
            
            
                            ArrayList<String> tipos = new ArrayList<String>();

        Scanner f = new Scanner(System.in);
        Scanner g = new Scanner(System.in);
        Scanner h = new Scanner(System.in);
        Scanner i = new Scanner(System.in);
        int continuar1 = 1, opcion1 = 0;

        do {
            System.out.println("1.Mostrar los registros");
            System.out.println("2. Registrar un producto o material");
            System.out.println("3. Eliminar un producto o material");
            System.out.println("4.Registrar ventas");
            System.out.println("5.Registrar compras de material");
            System.out.println("6.Registrar gasto de material");
            System.out.println("7. Cambiar precio");
            System.out.println("8. Volver al menu principal");

            opcion1 = f.nextInt();
            String nombre;
            double precio;
            int cantidad;
            nombre = "";
            precio = 0.0;
            cantidad = 0;
            int cPed;
            cPed = 0;
            String nCliente;
            double porcProm;
            int cGas;
            String nombre1;
            switch (opcion1) {

                case 1:
                    System.out.println(tipos);
                    new Inventario(nombre, precio, cantidad).toString();
                    break;
                case 2:

                    System.out.println("Ingrese el nombre del producto a registrar:");
                    String nombrex = f.next();
                    System.out.println("Ingrese el precio unitario del producto:");
                    double preciox = g.nextInt();
                    System.out.println("Ingrese la cantidad de unidades existentes:");
                    int cantidadx = h.nextInt();

                    do {

                        tipos.add(nombrex + " " + cantidadx + " " + preciox + "\n");

                    } while (opcion1 == 2);
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del producto que desea eliminar:");
                    
                    nombre1 = f.next();
                    new Inventario(nombre, precio, cantidad).eliminar(nombre1, precio, cantidad);

                    break;
                case 4:
                    System.out.println("presione: 1 para compras corrientes"
                            + "2 para compras al  por mayor");
                    int caso;
                    caso = f.nextInt();
                    switch (caso) {
                        case 1:
                            System.out.println("Ingrese el nombre del producto vendido");
                            nombre = f.next();
                            System.out.println("Ingrese la cantidad vendida");
                            cantidad = f.nextInt();
                            System.out.println("Ingrese el precio unitario");
                            precio = f.nextDouble();
                            new Producto(nombre, cantidad, precio).registrarVentas(nombre, cantidad, precio);
                        case 2:
                            break;
//                            System.out.println("Ingrese el nombre del producto vendido");
//                            nombre = f.next();
//                            System.out.println("Ingrese la el precio unitario");
//                            precio = f.nextDouble();
//                            System.out.println("Ingrese la cantidad vendida");
//                            cantidad = f.nextInt();
//                            System.out.println("Ingrese el nombre del cliente");
//                            nCliente = f.next();
//                            System.out.println("Ingrese la promoción actual del producto, si no hay promoción ponga 0");
//                            porcProm = f.nextInt();
//                            new Producto(nCliente, porcProm, nombre, cantidad, precio).registrarVentasPM(nombre, cantidad, precio, nCliente, porcProm);
                    }
                case 5:
            System.out.println("Ingrese el nombre del producto vendido");
                            nombre = f.next();
                            System.out.println("Ingrese el precio unitario");
                            precio = f.nextDouble();
                            System.out.println("Ingrese la cantidad comprada");
                            cantidad = f.nextInt();
                            new Materia(nombre,cantidad,precio).registrarCompras(nombre,cantidad,precio);
                case 6:

                    System.out.println("Ingrese el nombre del material");
                    nombre = f.next();
                    System.out.println("Ingrese la cantidad gastada de " + nombre);
                    cGas = f.nextInt();
                    new Materia(nombre, cantidad, precio).registrarGastados(nombre, cGas);

                case 7:
                  System.out.println("Ingrese el nombre del producto o material");
                  nombre1=f.next();
                  System.out.println("Ingrese el nuevo precio");
            double precio1 = f.nextDouble();
                  if (nombre1.equals(nombre)){
                  new Inventario(nombre,precio,cantidad).setPrecio(nombre1,precio1);
                  }
                  
                case 8:
                    continuar1 = 2;
                    break;
            }

        } while (continuar1 == 1);

        //*
        System.out.println();
        File inventario = new File("directorio.txt");
        File productos = new File("productos.txt");
        File materia = new File("materia.txt");
        File ganancias = new File("ganancias.txt");
        if (inventario.exists() && productos.exists() && ganancias.exists()) {
            String archivos[] = inventario.list();
            for (String archivo : archivos) {
                System.out.println(archivo);

            }
            System.out.println(inventario.getAbsolutePath());
        } else {
            try {
                inventario.createNewFile();
                productos.createNewFile();
                materia.createNewFile();
                ganancias.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
                   
                   
            
            break;
            
            
            
            
               case 2: // NOMINA
                   
                   
                   
                   
                   
 int continuar = 1, opcion = 0;
       // Scanner tr = new Scanner(System.in);

        do {
           // System.out.println("1. crear turno");
            System.out.println("1. crear contrato");
            System.out.println("2. Eliminar contrato");
            System.out.println("3. sacar nomina de la quincena");
            System.out.println("4. ver nomina ");
            System.out.println("5. Volver a menu principal");

            
            opcion = tr.nextInt();
            tr.nextLine();

            switch (opcion) {
//                case 1:
//                  boolean aux = crearEmp (Out1, archiEmpr );
//                    break;

//                case 1:
//                    Scanner en = new Scanner(System.in);
//
//                    int volvertur = 1;
//                    while (volvertur == 1) {//try {
//
//                     try{
//                         new WabiSabiNomina().leerTurns(archiTur, empresa);
//
//                        System.out.println("Hora de inicio del Turno (formato de 24 horas):\n");
//                        float hoini = en.nextFloat();
//                        System.out.println("Hora de finalización del Turno (Formato de 24 horas):\n");
//                        float hofin = en.nextFloat();
//                        System.out.println(" numero unico identificador del turno: \n");
//                        int id = en.nextInt();
//                        boolean au = false;
//                        while (au == false) {
//
//                            boolean auuu = newT.Turno(hoini, hofin, id);
//                            boolean auuuu = empresa.addTurno(newT);
//                            if (auuu == true && auuuu == true) {
//                                au = new WabiSabiNomina().modifTur(archiTur, empresa);
//                                if (au == false) {
//                                    System.out.println(" no sirve");
//                                    au = true;
//                                }
//                            } else if (auuu == true && auuuu == false) {
//                                System.out.println("no se escribio correctamente, vuelva a intentar");
//                                volvertur = 1;
//                            }
//                        }
//                        System.out.println(" 1. Para volver a crear un turno : \n 2. Para volver al menu: \n");
//                        volvertur = en.nextInt();
//                        } catch (InputMismatchException ex) {
//                            System.out.println("Error: " + ex.getMessage());
//                            volvertur = 2;
//                        }
//                    }
//                    break;

                case 1:
                    int volver = 1;
                    while (volver == 1) {
                        Scanner en1 = new Scanner(System.in);
//                        new WabiSabiNomina().leerContras(archiCont, empresa);
//                        new WabiSabiNomina().leerTrabs(archiTrab, empresa);
                        try {
                            boolean a = false;
                            // trabajador tra = null;//
                            System.out.println("Escriba el Documento de Identidad del nuevo trabajador:\n");
                            String cc1 = en1.next();
                            System.out.println("ti " + cc1);
                            boolean aux = empresa.getTras().contains(cc1);
                            if (aux == false) {
                                contrato Contra = new contrato();
                                Contra.setId(cc1);
                                System.out.println("Tipo de Contrato (indefinido o fijo):\n");
                                Contra.setTipo(en1.next()); //en.nextLine();
                                System.out.println("Persona que contrata :");
                                String pr = en1.next();
                                en1.nextLine();
                                Contra.setEmpleador(pr);
                                System.out.println("dia de inicio del contrato:\n");
                                int diaI = en1.nextInt();//en.nextLine();
                                Contra.getFechaI().setDia(diaI);
                                System.out.println("mes de inicio del contrato:\n");
                                int mesI = en1.nextInt();//en.nextLine();
                                Contra.getFechaI().setMes(mesI);
                                System.out.println("anio de inicio del contrato:\n");
                                int anioI = en1.nextInt();
                                en1.nextLine();
                                Contra.getFechaI().setAño(anioI);
                                if (Contra.getTipo().equals("fijo") || Contra.getTipo().equals("Fijo")) {
                                    System.out.println("dia de finalización del contrato:\n");
                                    Contra.getFechaF().setDia(en1.nextInt());
                                    en1.nextLine();
                                    System.out.println("mes de finalización del contrato:\n");
                                    Contra.getFechaF().setMes(en1.nextInt());
                                    en1.nextLine();
                                    System.out.println("anio de finalización del contrato:\n");
                                    Contra.getFechaF().setAño(en1.nextInt());
                                    en1.nextLine();

                                } else {
                                    Contra.getFechaF().setAño(0);
                                    Contra.getFechaF().setDia(0);
                                    Contra.getFechaF().setMes(0);
                                }
                                System.out.println("Hora de inicio de turno de trabajador:");
                                Contra.setHoraI(Integer.parseInt(en1.nextLine()));
                                 System.out.println("Hora de Finalizacion de turno de trabajador:");
                                Contra.setHoraF(Integer.parseInt(en1.nextLine()));
                                int auxTotalH = (Contra.getHoraF() - Contra.getHoraI());
                                Contra.setTotalHoras(auxTotalH);
                                System.out.println(" Total Horas Trabajadas: " + Contra.getTotalHoras());
                                System.out.println("Lugar donde se genero el contrato: ;\n");
                                Contra.setLugCont(en1.nextLine());
                                // tra.setSucontra(Contra);

                                empresa.addContra(Contra);

//                                System.out.println("ID del turno que tendra el trabajador:\n");
//                                int ID = en1.nextInt();
//                                en1.nextLine();
//                                Turno sutur = new Turno();
//                                for (Turno x : empresa.getTurnos()) {
//                                    if (x.getId() == ID) {
//                                        sutur = x;
//                                        //Out2.print(ID);
//                                    } else {
//                                        System.out.println("No encontrado");
//                                    }
//                                }

                                System.out.println("Tiene auxilio de transporte (SI o NO ):\n");
                                String auxili = en1.next();
                                //en1.nextLine();
                                System.out.println(" as" + auxili);
                                boolean auux = false;
                                if (auxili.equals("Si") || auxili.equals("SI") || auxili.equals( "si")) {
                                    System.out.println("edfhgjhk");
                                    auux = true;
                                    System.out.println(" hafoi  "+ auux);
                                } else {
                                    System.out.println("df");
                                    auux = false;
                                }
                                
                                System.out.println("dia de nacimiento:");
                                int diaNa = en1.nextInt();
                                System.out.println("dia na "+ diaNa);
                                en1.nextLine();
                                System.out.println("mes de nacimiento");
                                int mesNa = en1.nextInt();
                                en1.nextLine();
                                System.out.println("anio de nacimiento ");
                                int Año = en1.nextInt();
                                en1.nextLine();
                                System.out.println("Escriba el cargo del trabajador:\n");
                                String Cargo = (en1.nextLine());
                                System.out.println("Escriba los nombres del trabajador:\n");
                                String Nomb = (en1.nextLine());
                                System.out.println("Escriba los Apellido del trabajador:\n");
                                String Ape = (en1.nextLine());

                                System.out.println("Escriba lugar de expedicion del documento:\n");
                                String LTi = (en1.nextLine());
                                System.out.println("la direccion de recidencia:");
                                String Dire = (en1.nextLine());
                                System.out.println("el numero de contacto:\n");
                                Double Tel = (en1.nextDouble());
                                en1.nextLine();
                                System.out.println("Salario mensual:");
                                Double Salario = (en1.nextDouble());
                                en1.nextLine();
                                trabajador tra = new trabajador(auux, diaNa, mesNa, Año, Cargo, Nomb, Ape, cc1, LTi, Dire, Tel, Salario, Contra);
                                a = empresa.addTrab(tra);
                                PrintStream Out2 = new PrintStream(archiTrab);
                                PrintStream Out3 = new PrintStream(archiCont);
                                
                                new WabiSabiNomina().modifContras(empresa, Out3);
                                new WabiSabiNomina().escribirModifTrab(empresa, Out2);

                                if (a == true) {
                                    System.out.println("Creado con exito\n");
                                } else {
                                    System.out.println("Error\n");
                                }
                            } else {
                                System.out.println("El trabajador ya existe en la base de datos de la empresa.");

                            }

                            System.out.println("1. Para volver a crear contrato:\n 2. Para volver al menu: \n ");
                            volver = en1.nextInt();

                        } catch (InputMismatchException ex) {
                            System.out.println("Error: " + ex.getMessage());
                            volver = 2;
                        }
                    }
                    break;

                case 2:

                    //actualizar archivos
                    int eli = 1;
                    System.out.println("eli : " + eli);
                    while (eli == 1) {
                     try{ 
                         //new WabiSabiNomina().leerContras(archiCont, empresa);
//                        new WabiSabiNomina().leerTrabs(archiTrab, empresa);
                        Scanner en2 = new Scanner(System.in);

                        System.out.println("Escriba el documento del trabajador:\n");
                        String cc = en2.nextLine();
                        
                        
                        for (Iterator <trabajador> tra = empresa.getTras().iterator(); tra.hasNext();) { //trabajador x : empresa.getTras() // for( int i = 0; i < arr.size(); i++ )
                         //   System.out.println(" ti trab  "+ tra.+ "espacio:  "+ empresa.getContratos().size());
                            trabajador tra1 = tra.next();
                            if (tra1.getTi().equals(cc)) {
                               // boolean auxq = empresa.eliminarTrab(x);
                                for (Iterator <contrato> con  = empresa.getContratos().iterator(); con.hasNext();){
                                   contrato con1 = con.next();
                                    if (con1.getId().equals(cc)){
                                        //System.out.println("id contra: " +x1.getId());
                                 //boolean au2 =    empresa.eliminarContra(x1);
                                tra.remove();
                                con.remove();
                               //  System.out.println("trab  "+ auxq + "contra   " + au2);
                                 PrintStream Out3 = new PrintStream(archiCont);
                                PrintStream Out2 = new PrintStream(archiTrab);
                                new WabiSabiNomina().modifContras(empresa, Out3);
                                new WabiSabiNomina().escribirModifTrab(empresa, Out2);
                                System.out.println("holaeliminar");
                                cc="";
                                    }
                                }
                            } else {
                                System.out.println("Trabajador no encontrado");
                            }

                        }

                        System.out.println(" 1. Para volver a eliminar contrato : \n 2. Para volver al menu: \n");
                        eli = en2.nextInt();
                        } catch (InputMismatchException ex) {
                            System.out.println("Error: " + ex.getMessage());
                            eli = 2;
                        }
                    }

                    break;

                case 3:
                    //   Scanner  = new Scanner (archiTrab);
                    new WabiSabiNomina().NominaTrab(empresa, archiFecha);
                    break;
                case 4:
                    break;
                    
                case 5:
                    continuar = 2;
            }

        } while (continuar == 1);
              
                    
                   
                   
                   
                   break;
                   
                   
                   
               case 3: // CONTABILIDAD:
                   
                   
                   
                   
                   break;
                   
               case 4 : // CERRAR SESION;
                   
                   
                   
                   break;
            }


        } while (continuarUni == 1);
    }

    public void iniciar(Empresa empresa, File archiEmpr, Scanner en) {

        try {
            Scanner em = new Scanner(new FileInputStream(archiEmpr));
            int cosito = Integer.parseInt(em.nextLine().trim());
            System.out.println(cosito);
            if (cosito == 0) {
                try {
                    PrintStream Out1 = new PrintStream(archiEmpr);
                    cosito = 1;
                    Out1.print(cosito + "\n");

                    System.out.println("Usuario:");
                    empresa.setUsuario(en.nextLine());
                    Out1.print(empresa.getUsuario() + "\n");
                    System.out.println("contraseña:");;
                    empresa.setContraseña(en.nextLine() + "\n");
                    Out1.print(empresa.getContraseña());
                    System.out.println("Nombre:\n");
                    empresa.setNombre(en.nextLine());
                    Out1.print(empresa.getNombre() + "\n");

                    System.out.println("Representante legal:\n");
                    empresa.setRlegal(en.nextLine());
                    Out1.print(empresa.getRlegal() + "\n");
                    System.out.println("Nit de la empresa: \n");
                    empresa.setNit(en.nextLine());
                    Out1.print(empresa.getNit() + "\n");
                    System.out.println("Direcion de la empresa:\n");
                    empresa.setDir(en.nextLine());
                    Out1.print(empresa.getDir() + "\n");
                    System.out.println("Telefono :\n");
                    empresa.setTel(en.nextLine());
                    Out1.print(empresa.getTel() + "\n");
                    System.out.println("Regimen legal: \n");
                    empresa.setRgimen(en.nextLine());
                    Out1.print(empresa.getRgimen() + "\n");
                    System.out.println("Es gran contribuyente (SI o NO): /n");
                    String cont = en.nextLine();
                    empresa.setGranCont(false);
                    if (cont.equals("SI")) {
                        empresa.setGranCont(true);
                    } else {
                        empresa.setGranCont(false);
                    }
                    Out1.print(empresa.isGranCont() + "\n");
                    System.out.println("moneda que maneja: \n");
                    empresa.setMoneda(en.nextLine());
                    Out1.print(empresa.getMoneda() + "\n");
                    System.out.println("Numero de empleados:");
                    int Nemple = en.nextInt();
                    en.nextLine();
                    String TipApor = empresa.tipoAportador(Nemple);
                    Out1.print(TipApor + "\n");
                } catch (IOException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            } else if (cosito == 1) {
                Scanner ef = new Scanner(new FileInputStream(archiEmpr));

                while (ef.hasNextLine()) {
                    String numero = ef.nextLine();
                    String usuario = ef.nextLine();
                    System.out.println(" usu " + usuario);
                    empresa.setUsuario(usuario);
                    String Contraseña = ef.nextLine();
                    empresa.setContraseña(Contraseña);
                    String name = ef.nextLine();
                    empresa.setNombre(name);
                    String Rlegal = ef.nextLine();
                    empresa.setRlegal(Rlegal);
                    String nit = ef.nextLine();
                    empresa.setNit(nit);
                    String Dir = ef.nextLine();
                    empresa.setDir(Dir);
                    String tel = ef.nextLine();
                    empresa.setTel(tel);
                    System.out.println("tel " + tel);
                    String Rgimen = ef.nextLine();
                    empresa.setRgimen(Rgimen);
                    boolean granCont = Boolean.parseBoolean(ef.nextLine());
                    empresa.setGranCont(granCont);
                    String moneda = ef.nextLine();
                    empresa.setMoneda(moneda);
                    String tipoAport = ef.nextLine();
                    empresa.setTipoAport(tipoAport);

                }
            }

        } catch (FileNotFoundException wn) {
            System.out.println("Error: " + wn.getMessage());

        }
    }

    public void leerTrabs(File archiTrab, Empresa empresa) {
        //  boolean db = false;
        try {
            Scanner tr = new Scanner(new FileInputStream(archiTrab));

            while (tr.hasNextLine()) {
                trabajador traba = new trabajador();
                String line = tr.nextLine();
                StringTokenizer st = new StringTokenizer(line, ";");
                boolean auxilio = Boolean.parseBoolean(st.nextToken().trim());
                traba.setAux(auxilio);
               // int edad = Integer.parseInt(st.nextToken().trim());
                int dia = Integer.parseInt(st.nextToken().trim());
                
                int mes = Integer.parseInt(st.nextToken().trim());
                
                int año = Integer.parseInt(st.nextToken().trim());
                fecha Fnacimi = new fecha (dia,mes,año);
                traba.setFnacimi(Fnacimi);
                String carg = st.nextToken();
                traba.setCargo(carg);
                String name = st.nextToken().trim();
                traba.setNomb(name);
                String apell = st.nextToken().trim();
                traba.setApe(apell);
                String cc = (st.nextToken().trim());
                traba.setTi(cc);
                String lugar = st.nextToken();
                traba.setLTi(lugar);
                String dir = st.nextToken();
                traba.setDire(dir);
                double tel = Double.parseDouble(st.nextToken().trim());
                traba.setTel(tel);
                double salario = Double.parseDouble(st.nextToken().trim());
                traba.setSalario(salario);
                String idContra = (st.nextToken());
                System.out.println(" id contra:  " + idContra);
                contrato suco = new contrato();

                for (contrato x2 : empresa.getContratos()) {
                    if (x2.getId().equals(idContra)) {
                        suco = x2;
                        traba.setSucontra(suco);
                        System.out.println(" Contrato ok");
                    } else {
                        System.out.println("Contrato No encontrado");
                    }
                }
//                int idTurno = Integer.parseInt(st.nextToken().trim());
//                Turno sutur1 = new Turno();
//                for (Turno x1 : empresa.getTurnos()) {
//                    if (x1.getId() == idTurno) {
//                        sutur1 = x1;
//                        traba.setSutur(sutur1);
//                    } else {
//                        System.out.println("Turno No encontrado");
//                    }
//                }

                empresa.addTrab(traba);
            }
        } catch (FileNotFoundException en) {
            System.out.println("Error: " + en.getMessage());
        }
// return db;
    }

    public void leerContras(File archiCont, Empresa empresa) {
        //   boolean rf = false;
        try {
            Scanner co = new Scanner(new FileInputStream(archiCont));
            contrato Lcontra = new contrato();
            while (co.hasNextLine()) {
                String line = co.nextLine();
                StringTokenizer st = new StringTokenizer(line, ";");
                String idC = (st.nextToken());
                Lcontra.setId(idC);
                System.out.println("id %%% :" + idC);
                String Tipo = st.nextToken();
                Lcontra.setTipo(Tipo);
                String empleador = st.nextToken().trim();
                Lcontra.setEmpleador(empleador);
                Lcontra.getFechaI().setDia(Integer.parseInt(st.nextToken().trim()));
                Lcontra.getFechaI().setMes(Integer.parseInt(st.nextToken().trim()));
                Lcontra.getFechaI().setAño(Integer.parseInt(st.nextToken().trim()));
                Lcontra.getFechaF().setDia(Integer.parseInt(st.nextToken().trim()));
                Lcontra.getFechaF().setMes(Integer.parseInt(st.nextToken().trim()));
                Lcontra.getFechaF().setAño(Integer.parseInt(st.nextToken().trim()));
                int hoi = Integer.parseInt(st.nextToken().trim());
                Lcontra.setHoraI(hoi);
                int hof = Integer.parseInt(st.nextToken().trim());
                Lcontra.setHoraF(hof);
                int TotalHoras = Integer.parseInt(st.nextToken().trim());
                Lcontra.setTotalHoras(TotalHoras);
                String lugar = st.nextToken().trim();
                Lcontra.setLugCont(lugar);
                empresa.addContra(Lcontra);

            }
        } catch (FileNotFoundException en) {
            System.out.println("Error" + en.getMessage());
        }
        //  return rf;
    }

//    public void leerTurns(File archiTur, Empresa empresa) {
//        //boolean at = false;
//        //leer turnos:
////                    String line = sis.nextLine();
////                    String[] linea = sis.nextLine().split(";");
//        try {
//            Scanner sis = new Scanner(new FileInputStream(archiTur));
//
//            while (sis.hasNextLine()) {
//                Turno newT = new Turno();
//                String line = sis.nextLine();
//                StringTokenizer st = new StringTokenizer(line, ";");
//                int d = Integer.parseInt(st.nextToken().trim());
//                newT.setId(d);
//                float i = Float.parseFloat(st.nextToken().trim());
//                newT.setHoini(i);
//                float f = Float.parseFloat(st.nextToken().trim());
//                newT.setHofin(f);
//                int di = Integer.parseInt(st.nextToken().trim());
//                int no = Integer.parseInt(st.nextToken().trim());
//                newT.setHoraDiur(di);
//                newT.setHoraNoct(no);
//                empresa.addTurno(newT);
//
//                // System.out.println("array" + linea[0]);
//                // System.out.println(newT.getId() + newT.getHoini() + newT.getHofin());
//            }
//        } catch (FileNotFoundException wn) {
//            System.out.println("Error: " + wn.getMessage());
//
//        }
////return at;
//    }

//    public boolean modifTur(File archiTur, Empresa empresa) {
//
//        boolean aur = false;
//
//        try {
//            PrintStream tur = new PrintStream(archiTur);
//
//            for (int g = 0; g < empresa.getTurnos().size(); g++) {
//                tur.print(empresa.getTurnos().get(g).getId() + ";");
//                tur.print(empresa.getTurnos().get(g).getHoini() + ";");
//                tur.print(empresa.getTurnos().get(g).getHofin() + ";");
//                tur.print(empresa.getTurnos().get(g).getHoraDiur() + ";");
//                tur.print(empresa.getTurnos().get(g).getHoraNoct() + ";\n");
//                aur = true;
//
//            }
//        } catch (FileNotFoundException ex) {
//            System.out.println("Error: " + ex.getMessage());
//        }
//        return aur;
//    }

    public boolean modifContras(Empresa empresa, PrintStream Out3) {
        boolean aut = false;
        for (contrato x : empresa.getContratos()) {
            System.out.println(" contrato:  " + empresa.getContratos().size());

            Out3.print(x.getId() + ";");
            Out3.print(x.getTipo() + ";");
            Out3.print(x.getEmpleador() + ";");
            Out3.print(x.getFechaI().getDia() + ";");
            Out3.print(x.getFechaI().getMes() + ";");
            Out3.print(x.getFechaI().getAño() + ";");
            Out3.print(x.getFechaF().getDia() + ";");
            Out3.print(x.getFechaF().getMes() + ";");
            Out3.print(x.getFechaF().getAño() + ";");
            Out3.print(x.getHoraI() + ";");
            Out3.print(x.getHoraF() + ";");
            Out3.print(x.getTotalHoras() + ";");
            Out3.print(x.getLugCont() + ";\n");
//int id, String tipo, String empleador, int diaI, int mesI, int anoI, int diaF,int mesF , int anoF , String LugCont                   

            aut = true;
        }
        return aut;
    }

    public boolean escribirModifTrab(Empresa empresa, PrintStream Out2) {
        boolean ae = false;
        for (trabajador x2 : empresa.getTras()) {
            System.out.println("empresa :  " + empresa.getTras().size());
            //		System.out.println();
            Out2.print(x2.isAux() + ";");
            Out2.print(x2.getFnacimi().getDia() + ";");
            Out2.print(x2.getFnacimi().getMes() + ";");
            Out2.print(x2.getFnacimi().getAño() + ";");

            Out2.print(x2.getCargo() + ";");
            Out2.print(x2.getNomb() + ";");
            Out2.print(x2.getApe() + ";");
            // documento:
            Out2.print(x2.getTi() + ";");
            //Out2.println(empresa.getTras().get(i).getNomb() + ";");                            
            Out2.print(x2.getLTi() + ";");
            Out2.print(x2.getDire() + ";");
            Out2.print(x2.getTel() + ";");
            Out2.print(x2.getSalario() + ";");
            Out2.print(x2.getSucontra().getId() + ";\n");
           // Out2.print(empresa.getTras().get(i).getSutur().getId() + ";\n");
            ae = true;
        }
        return ae;
    }

    public void NominaTrab(Empresa empresa, File archiFecha) {
        try {
            //   for (trabajador traba : empresa.getTras()){

            for (trabajador trab : empresa.getTras()){
                
                System.out.println("Nomina para el Trabajador:  " + trab.getNomb() + "  "+ trab.getApe());
            Scanner se = new Scanner(System.in);

            System.out.println("Dias trabajados:\n");
            int dias = se.nextInt();
            System.out.println("Prestamos al trabajador\n");
            double prestamos = se.nextDouble();
            System.out.println("Dominicales trabajados:\n");
            int domi = se.nextInt();
            FunNom nomina = new FunNom(trab, dias, prestamos);
            nomina.nomina(trab.isAux(), domi, nomina.getSalario15());

            System.out.println("Dominicales" + nomina.getDominicales());
            // extra dominicales
            // nomina.nomina(traba.getSalario(), traba.isAux());
            String fecha = nomina.getFePago();
            Scanner de = new Scanner(new FileInputStream(archiFecha));
            while (de.hasNextLine()) {
                Turno newT = null;
                String fechaUl = de.nextLine();
                nomina.setUfecha(fechaUl);

            }

            File DirecF = new File(fecha);
            String cc = String.valueOf(trab.getTi());
            File archiNomTra = new File(fecha + "/" + cc + ".txt");

            if (DirecF.exists() == false || archiNomTra.exists() == false) {

                DirecF.mkdirs();
                archiNomTra = new File(fecha + "/" + cc + ".csv");
            }

            PrintStream tur = new PrintStream(archiNomTra);

            tur.println("                          ;" + "PORTAL MARINO PESCADERIA" + ";" + "   ");
            tur.println("                          ;" + empresa.getNit() + ";" + "   ");
            tur.println("                          ;" + "COMPROBATE DE PAGO DE SALARIO;" + "   ");
            tur.println("EMPLEADO                  ;" + ";" + trab.getNomb() + trab.getApe() + ";");
            tur.println("C.C.                      ;" + ";" + trab.getTi() + ";");
            tur.println("CARGO                     ; " + ";" + trab.getCargo());
            tur.println("SALARIO BASICO            ;" + ";" + +trab.getSalario() + ";");
            tur.println("PERIODO DE PAGO           ;" + ";" + nomina.getUfecha() + " a " + nomina.getFePago());
            tur.println("FECHA DE PAGO             ;" + ";" + nomina.getFePago());
            tur.println("CIUDAD                    ;" + ";" + "BOGOTA D.C.");
            tur.println("PAGOS                     ;");
            tur.println("Salario                   ;" + ";" + "$" + nomina.getSalario15() + ";");
            tur.println("Dominicales               ;" + ";" + "$" + nomina.getDominicales() + ";");
            tur.println("Auxilio de transporte     ;" + ";" + "$" + nomina.getAuxTrans() + ";");
            tur.println("TOTAL PAGOS               ;" + ";" + " ;" + "$" + nomina.getTdevengado() + ";");
            tur.println(" ;" + " ;" + " ;");
            tur.println("DEDUCCIONES               ;");
            tur.println("Descto seguridad salud    ;" + " ;" + "$" + nomina.getSaludTrab() + ";");
            tur.println("Descto seguridad pension  ;" + " ;" + "$" + nomina.getPensTrab());
            tur.println("Vale por Almuerzos        ;" + ";" + "$" + nomina.getValeAlmuerzos());
            tur.println("Prestamos                 ;" + ";" + "$" + nomina.getPrestamos());
            tur.println("TOTAL DEDUCCIONES         ;" + ";" + " ;" + "$" + nomina.getDeducciones());
            tur.println(";" + " ;" + " ;");
            tur.println("NETO A PAGAR              ;" + ";" + " ;" + "$ " + nomina.getNetoPago());
            tur.println(";" + " ;" + " ;");
            tur.println(";" + " ;" + " ;");
            tur.println("Autorizado por:           ;" + ";" + "Recibe conforme:;");
            tur.println(";" + " ;" + " ;");
            tur.println("__________________________;" + ";" + "_____________________________ ;");
            tur.println("YULINA GARCIA;" + " ;" + trab.getNomb() + trab.getApe() + ";");
            // tur.print( + ";");

            PrintStream fe = new PrintStream(archiFecha);
            fe.print(nomina.getFePago());
            }
            // }
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }
    
    public void fin (Empresa empresa, File archiContra){
        Scanner hg = new Scanner (System.in);
        System.out.println("ENTRO FIN\n");
      try {
          for (Iterator <contrato> con  = empresa.getContratos().iterator(); con.hasNext();){
                                   contrato x = con.next();
                                   System.out.println("ENTRO FOR FIN\n");
            if (x.getTipo().equals("fijo")){
                int año = x.getFechaF().getAño() - x.getFechaI().getAño();
                System.out.println("AÑO: \n" + año);
                int mes = x.getFechaF().getMes() - x.getFechaI().getMes();
                System.out.println("mes : \n" + mes);
                int dia = x.getFechaF().getDia() - x.getFechaI().getDia();
                System.out.println("dia : \n" + dia);
                if (año ==0 && mes ==0 && dia <=5 ){
                    System.out.println("ENTRO IF FIN\n");
                    for (Iterator <trabajador> tra  = empresa.getTras().iterator(); tra.hasNext();){
                        trabajador trabaja = tra.next();
                        System.out.println("ENTRO FOR EACH \n");
                        if (trabaja.getTi().equals(x.getId())){
                            System.out.println("Al contrato del trabajador:   "+ trabaja.getNomb() + " "+ trabaja.getApe() + " le quedan:  " + dia);
                            System.out.println("1. Renovar contrato. \n "+ "2. Regresar ");
                            int op = hg.nextInt();
                            if (op ==1){
                                System.out.println(" Nueva fecha de finalizacion:   \n");
                                System.out.println("Dia : \n");
                                x.getFechaF().setDia(hg.nextInt());
                                System.out.println("Mes : \n");
                                x.getFechaF().setMes(hg.nextInt());
                                System.out.println("Anio : \n");
                                x.getFechaF().setAño(hg.nextInt());
                                PrintStream Out3 = new PrintStream (archiContra);
                                modifContras( empresa, Out3);
                                
                            }
                        }
                    }
                }  
            }
        }
      }catch(FileNotFoundException ex) {
           System.out.println("Error: " + ex.getMessage());
           System.out.println(" hola fin");
        }
     }

////    public void NominaEmpr() {
////
////    }
}
