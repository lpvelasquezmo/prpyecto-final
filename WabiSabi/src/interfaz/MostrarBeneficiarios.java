/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Contabilidad.Beneficiario;
import Contabilidad.Cat1;
import Contabilidad.Contabilidad;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MARIAJOSE
 */
public class MostrarBeneficiarios extends JPanel {
    private boolean DEBUG = false;

    public MostrarBeneficiarios() throws IOException{
        
        // TODO code application logic here
        Cat1 catal = new Cat1();
        Contabilidad conBen = new Contabilidad(catal);
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
           conBen.addBen(ben);
           System.out.println(ben.getNombreTercero()+"   "+ ben.getDireccion());
       }
    JPanel  panel = new JPanel();
        DefaultTableModel tableModel = new DefaultTableModel ();
        JTable table = new JTable (tableModel);
        panel.setLayout( new BorderLayout());
        String[] columnNames = {"Nombre del beneficiario","Cedula / NIT ",
                                "Direccion",
                                "Telefono"};
       tableModel.setColumnIdentifiers(columnNames);
       String fila[] = new String[tableModel.getColumnCount()];
       String ncc; String cl; String gr; String c; String sc;
       
       for (int i = 0; i < conBen.getBeneficiarios().size(); i++){
           fila [0] = conBen.getBeneficiarios().get(i).getNombreTercero();
           fila [1] = conBen.getBeneficiarios().get(i).getCedulaNit();
           fila [2] = conBen.getBeneficiarios().get(i).getDireccion();
           fila [3] = conBen.getBeneficiarios().get(i).getTelefono();
           
     
              tableModel.addRow(fila);
        };
      
       table.setModel(tableModel);
  
//       
//        table.setPreferredScrollableViewportSize(new Dimension(500, 1000));
//        table.setFillsViewportHeight(true);
//       
        //Create the scroll pane and add the table to it.
   JScrollPane scrollPane = new JScrollPane(table);
//
//        //Add the scroll pane to this panel.
        add(scrollPane);
    }
public static void createAndShowGUIBEN() throws IOException  {
        //Create and set up the window.
        javax.swing.JFrame frame = new javax.swing.JFrame("Beneficiarios");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        MostrarBeneficiarios newContentPane = new MostrarBeneficiarios();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
       
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    createAndShowGUIBEN();
                } catch (IOException ex) {
                    Logger.getLogger(MostrarBeneficiarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}