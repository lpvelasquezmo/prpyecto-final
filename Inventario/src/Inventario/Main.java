/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Familia Bastidas
 */
public class Main {

    /**
     *
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Inventario inve = new Inventario();
        File Inventario = new File("archIn.txt");
        File plato = new File("archiMa.txt");

//ArrayList<String> tipos = new ArrayList<String>();
        new Main().leerArch(Inventario, inve);
        new Main().leerArchPla(plato, inve);

        Scanner f = new Scanner(System.in);
        Scanner g = new Scanner(System.in);
        Scanner h = new Scanner(System.in);
        Scanner i = new Scanner(System.in);
        int continuar = 1, opcion = 0;
        System.out.println("presione 1 para ver el menú");
        continuar = f.nextInt();
        do {

            System.out.println("1. Mostrar los registros");
            System.out.println("2. Registrar un producto ");
            System.out.println("3. Registrar un plato");
            System.out.println("4. Eliminar un producto o material");
            System.out.println("5. Eliminar un plato");
            System.out.println("6.Registrar ventas y gastos de material");
            System.out.println("7.Registrar compras de material");

            opcion = f.nextInt();
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
            switch (opcion) {

                case 1:
                    int eli = 1;
                    System.out.println("eli : " + eli);
                    while (eli == 1) {
                        for (Producto x : inve.getTipos()) {
                            System.out.println("Nombre  " + x.getNombre() + "Cantidad: " + x.getCantidad() + "Precio: " + x.getPrecio());
                        }
                        //recorere arrray
//                    System.out.println(tipos);
//                    new Inventario(nombre, precio, cantidad).toString();
                        System.out.println(" 1. Para volver a mostrar producto : \n 2. Para volver al menu: \n");
                        eli = f.nextInt();
                    }
                    break;
                case 2:

                    System.out.println("Ingrese el nombre del producto a registrar:");
                    String nombrex = f.next();
                    System.out.println("Ingrese el precio unitario del producto:");
                    double preciox = g.nextInt();
                    System.out.println("Ingrese la cantidad de unidades existentes:");
                    int cantidadx = h.nextInt();
                    Producto produc = new Producto(nombrex, cantidadx, preciox);
                    inve.anadir(produc);
                    PrintStream Out3 = new PrintStream(Inventario);

                    new Main().modifProductos(inve, Out3);

                    break;
                case 3:
                    
                    String nombre3="";
                    int can = 0;
                    System.out.println("Ingrese el nombre del plato");
                   String nom = f.next();
                   System.out.println("Ingrese el precio del plato");
precio = f.nextDouble();
System.out.println("Ingrese el numero de ingredientes del plato");
int ingrets = f.nextInt();
Platos plato1 = new Platos(nom, ingrets, precio);
                for (int j = 0; j< ingrets; j++) {
                    System.out.println("Ingrese el nombre de el ingrediente usado");
                    nombre3 = f.next();
                    System.out.println("Ingrese la cantidad de: "+nombre3);
                    can = f.nextInt();

                    plato1.anadirPla(nombre3, can);

                }
                
                
                inve.anadirPla(plato1);
            PrintStream Out7 = new PrintStream(plato);
                new Main().modifPlatos(inve, Out7);
                                break;
                case 4:
                    eli = 1;

                    while (eli == 1) {
                        try {
                            //new WabiSabiNomina().leerContras(archiCont, empresa);
//                        new WabiSabiNomina().leerTrabs(archiTrab, empresa);
                            Scanner en2 = new Scanner(System.in);

                            System.out.println("Escriba el nombre del producto:\n");
                            String cc = en2.nextLine();

                            for (Iterator<Producto> prod = inve.getTipos().iterator(); prod.hasNext();) { //trabajador x : empresa.getTras() // for( int i = 0; i < arr.size(); i++ )
                                //   System.out.println(" ti trab  "+ tra.+ "espacio:  "+ empresa.getContratos().size());
                                Producto pro1 = prod.next();
                                if (pro1.getNombre().equals(cc)) {
                                    // boolean auxq = empresa.eliminarTrab(x);

                                    //System.out.println("id contra: " +x1.getId());
                                    //boolean au2 =    empresa.eliminarContra(x1);
                                    prod.remove();

                                    //  System.out.println("trab  "+ auxq + "contra   " + au2);
                                    PrintStream OutI = new PrintStream(Inventario);

                                    new Main().modifProductos(inve, OutI);

                                    cc = "";

                                } else {
                                    System.out.println("Producto  no encontrado");
                                }

                            }

                            System.out.println(" 1. Para volver a eliminar producto : \n 2. Para volver al menu: \n");
                            eli = en2.nextInt();
                        } catch (InputMismatchException ex) {
                            System.out.println("Error: " + ex.getMessage());
                            eli = 2;
                        }
                    }

                    break;
                case 5:
                eli = 1;

                    while (eli == 1) {
                        try {

                            Scanner en2 = new Scanner(System.in);

                            System.out.println("Escriba el nombre del plato:\n");
                            String cc = en2.nextLine();

                            for (Iterator<Platos> pla= inve.getPlatos().iterator(); pla.hasNext();) { 
                                Platos pla1 = pla.next();
                                if (pla1.getNombre().equals(cc)) {
                                    // boolean auxq = empresa.eliminarTrab(x);

                                    //System.out.println("id contra: " +x1.getId());
                                    //boolean au2 =    empresa.eliminarContra(x1);
                                    pla.remove();

                                    //  System.out.println("trab  "+ auxq + "contra   " + au2);
                                    PrintStream OutI = new PrintStream(plato);

                                    new Main().modifPlatos(inve, OutI);

                                    cc = "";

                                } else {
                                    System.out.println("Producto  no encontrado");
                                }

                            }

                            System.out.println(" 1. Para volver a eliminar producto : \n 2. Para volver al menu: \n");
                            eli = en2.nextInt();
                        } catch (InputMismatchException ex) {
                            System.out.println("Error: " + ex.getMessage());
                            eli = 2;
                        }
                    }
                    break;
                case 6:
                    int alo = 1;

                    while (alo == 1) {

                        System.out.println("Ingrese el nombre del plato vendido: ");
                        nombre = f.next();
                        System.out.println("Ingrese la cantidad vendida: ");
                        cantidad = f.nextInt();

                        for (Platos pl : inve.getPlatos()) {
                            if (pl.getNombre().equals(nombre)) {
                                double total = pl.precio * cantidad;
                                System.out.println("Precio de la venta: " + total);
                                inve.registrarVentas(nombre, cantidad);
                            }
                        }
                        System.out.println(" 1. Para volver a vender producto : \n 2. Para volver al menu: \n");
                        alo = f.nextInt();
                    }

                    break;

                case 7:
                    System.out.println("Ingrese el nombre del producto comprado");
                    nombre = f.next();
                    System.out.println("Ingrese la cantidad comprada");
                    cPed = f.nextInt();
                    for (Producto pro : inve.getTipos()) {
                        if (pro.getNombre().equals(nombre)) {
                            double total = pro.precio * cantidad;
                            System.out.println("Precio de la compra:" + total);
                            inve.compras(nombre, cantidad);
                        } else {
                            System.out.println("Producto no encontrado, presione 1 para volver al menú");
                        }
                    }
                    break;

            }
            System.out.println("presione 1 para volver al menú");
            continuar = f.nextInt();
        } while (continuar == 1);

    }

    public void leerArch(File archIn, Inventario tipos) {
        //   boolean rf = false;
        try {
            Scanner co = new Scanner(new FileInputStream(archIn));

            while (co.hasNextLine()) {
                String line = co.nextLine();
                StringTokenizer st = new StringTokenizer(line, ";");
                String nombre = (st.nextToken());
                int cantidad = Integer.parseInt(st.nextToken().trim());
                double precio = Double.parseDouble(st.nextToken().trim());
                Producto prod = new Producto(nombre, cantidad, precio);

                tipos.anadir(prod);

            }
//            for (int i =0; i < empresa.getContratos().size(); i ++){
//            System.out.println("tamaño: "+ empresa.getContratos().size() + empresa.getContratos().get(i).getId());
//            
//            }
        } catch (FileNotFoundException en) {
            System.out.println("Error" + en.getMessage());
        }
    }

    public boolean modifProductos(Inventario tipos, PrintStream Out3) {
        boolean aut = false;
        for (Producto x : tipos.getTipos()) {
            System.out.println(" Productos registrados  " + tipos.getTipos().size());

            Out3.print(x.getNombre() + ";");
            Out3.print(x.getCantidad() + ";");
            Out3.print(x.getPrecio() + ";\n");

//int id, String tipo, String empleador, int diaI, int mesI, int anoI, int diaF,int mesF , int anoF , String LugCont                   
            aut = true;
        }
        return aut;
    }

    public void leerArchPla(File archiPla, Inventario inve) {
        //   boolean rf = false;
        try {
            Scanner co = new Scanner(new FileInputStream(archiPla));
            String nombre = "";
            int can = 0;

            while (co.hasNextLine()) {
                String line = co.nextLine();
                StringTokenizer st = new StringTokenizer(line, ";");
                String nom = st.nextToken();
                double precio = Double.parseDouble(st.nextToken().trim());
                int ingrets = Integer.parseInt(st.nextToken().trim());
                             

                for (int i = 0; i < ingrets; ++i) {
                    line = co.nextLine();
                    st = new StringTokenizer(line, ";");
                    nombre = st.nextToken();
                    can = Integer.parseInt(st.nextToken());

                    

                }
                   Platos plato1 = new Platos(nom, ingrets, precio);
                   plato1.anadirPla(nombre, can);
                inve.anadirPla(plato1);
//            for (int i =0; i < empresa.getContratos().size(); i ++){
//            System.out.println("tamaño: "+ empresa.getContratos().size() + empresa.getContratos().get(i).getId());
//            
            }
        } catch (FileNotFoundException en) {
            System.out.println("Error" + en.getMessage());
        }
    }

    public boolean modifPlatos(Inventario inve, PrintStream Out3) {
        boolean aut = false;
        for (Platos x : inve.getPlatos()) {

            System.out.println(" Productos registrados  " + inve.getPlatos().size());
            System.out.println(x.getNproduc().size());

            Out3.print(x.getNombre() + ";");
            Out3.print(x.getPrecio() + ";");
            Out3.print(x.getCantidad() + ";\n");
            for (Ingredientes x1 : x.getNproduc()) {
                Out3.print(x1.getNproduc() + ";");
                Out3.print(x1.getCantidadPez() + ";\n");

            }

//int id, String tipo, String empleador, int diaI, int mesI, int anoI, int diaF,int mesF , int anoF , String LugCont                   
            aut = true;
        }
        return aut;
    }

}
