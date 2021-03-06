/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import wabisabinomina.Empresa;
import wabisabinomina.FechaActual;
import wabisabinomina.WabiSabiNomina;
import wabisabinomina.contrato;
import wabisabinomina.trabajador;

/**
 *
 * @author Maicol Velasquez
 */
public class Aviso extends javax.swing.JFrame {

    /**
     * Creates new form Aviso
     */
    
    File archiTrab = new File("Empresa/Trabajadores.txt");
    File archiEmpr = new File("Empresa/Datos Empresa.txt");
    File archiCont = new File("Empresa/Contratos.txt");
    File archiNom = new File("Empresa/Nomina.txt");
    File archiFecha = new File("Empresa/FechaNomina.txt");
    Empresa  empresa;
    //int cambiar =0;
    
    public Aviso() {
        
        
        initComponents();
        Scanner de = new Scanner(System.in);
        
        
        empresa = new Empresa();

        new WabiSabiNomina().iniciar(empresa, archiEmpr, de);
        new WabiSabiNomina().leerContras(archiCont, empresa);
        //System.out.println("hoa1   " +empresa.getContratos().size());

        // new WabiSabiNomina().fin ( empresa, archiCont);
        //  new WabiSabiNomina().leerTurns(archiTur, empresa);
        // System.out.println("hoa2");
        new WabiSabiNomina().leerTrabs(archiTrab, empresa);
        
        jComboBoxFNaDia.setVisible(false);
                                jComboBox9.setVisible(false);
                                jComboBox7.setVisible(false);
                                jPanel4.setVisible(false);
                                jLabel13.setVisible(false);
                                jLabel12.setVisible(false);
                                jLabel11.setVisible(false);
                                jLabel10.setVisible(false);
                                jButton4.setVisible(false);
                                jButton5.setVisible(false);
        
        //new Aviso().fin();
        

                setIconImage(new ImageIcon(getClass().getResource("/interfaz/imagenes/logows1.png")).getImage());

        
        
        
    }
    
    
    public void fin (){
        //Scanner hg = new Scanner (System.in);
        System.out.println("ENTRO FIN\n");
        
              jComboBoxFNaDia.setVisible(false);
                                jComboBox9.setVisible(false);
                                jComboBox7.setVisible(false);
                                
                                for (Iterator <contrato> con  = empresa.getContratos().iterator(); con.hasNext();){
                                   contrato x = con.next();
                                   
            if (x.getTipo().equals("Fijo")){
                
                 
                System.out.println("CONTRA:  "+ x.getId());
                
                FechaActual fecha = new FechaActual();
        int hoyD = fecha.getDia();
        int hoyM = fecha.getMes();
        int hoyA = fecha.getAño();
                
                int año = x.getFechaF().getAño() - hoyA;
                int mes = x.getFechaF().getMes() - hoyM;
                int dia = x.getFechaF().getDia() - hoyD;
                
                System.out.println("AÑO: \n" + año);
                System.out.println("mes : \n" + mes);
                System.out.println("dia : \n" + dia);
                
                if ( año == 0 && mes == 0 && dia <= 5 ){
                    
                    
                    for ( Iterator <trabajador> tra  = empresa.getTras().iterator(); tra.hasNext();){
                        trabajador trabaja = tra.next();
                     //   System.out.println("ENTRO FOR EACH \n");
                        if (trabaja.getTi().equals(x.getId())){
                            System.out.println("Al contrato del trabajador:   "+ trabaja.getNomb() + " "+ trabaja.getApe() + " le quedan:  " + dia);
                           jLabel8.setText( trabaja.getNomb() + " "+ trabaja.getApe() );
                           jLabel9.setText(trabaja.getTi());
                           jLabel7.setText(String.valueOf(dia));
                        }
                    }
                }
            }
                                }
        
    
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBoxFNaDia = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AlertaTerminoContrato - WabiSabiContabilidad");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Información del Trabajador:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Documento:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Dias Faltantes:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nombre:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 70, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 100, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 60, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/editar.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 80));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 380, 180));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Advertencia Contrato a punto de Terminar.");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 440, 70));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Omitir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 110, 40));

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Renovar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 110, 40));

        jComboBoxFNaDia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxFNaDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(jComboBoxFNaDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 50, -1));

        jComboBox9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel1.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 50, -1));

        jComboBox7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        jPanel1.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Año");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Mes");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Dia");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Nueva Fecha:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, -1, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 370, -1));

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Cargar Información");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 180, 40));

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Cancelar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, 110, 40));

        jButton5.setBackground(new java.awt.Color(153, 153, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("Guardar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
jComboBoxFNaDia.setVisible(true);
                                jComboBox9.setVisible(true);
                                jComboBox7.setVisible(true);
                                jPanel4.setVisible(true);
                                jLabel13.setVisible(true);
                                jLabel12.setVisible(true);
                                jLabel11.setVisible(true);
                                jLabel10.setVisible(true);
                                jButton4.setVisible(true);
                                jButton5.setVisible(true);
 
   
 
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
MenuPrincipal a = new MenuPrincipal();
        a.setVisible(true);
        this.setVisible(false);
        interfaz b = new interfaz ();
        b.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        
System.out.println("ENTRO FIN\n");
        
            
                                for (Iterator <contrato> con  = empresa.getContratos().iterator(); con.hasNext();){
                                   contrato x = con.next();
                                   
            if (x.getTipo().equals("Fijo")){
                
                 
                System.out.println("CONTRA:  "+ x.getId());
                
                FechaActual fecha = new FechaActual();
        int hoyD = fecha.getDia();
        int hoyM = fecha.getMes();
        int hoyA = fecha.getAño();
                
                int año = x.getFechaF().getAño() - hoyA;
                int mes = x.getFechaF().getMes() - hoyM;
                int dia = x.getFechaF().getDia() - hoyD;
                
                System.out.println("AÑO: \n" + año);
                System.out.println("mes : \n" + mes);
                System.out.println("dia : \n" + dia);
                
                if ( año == 0 && mes == 0 && dia <= 5 ){
                    
                    
                    for ( Iterator <trabajador> tra  = empresa.getTras().iterator(); tra.hasNext();){
                        trabajador trabaja = tra.next();
                     //   System.out.println("ENTRO FOR EACH \n");
                        if (trabaja.getTi().equals(x.getId())){
                            System.out.println("Al contrato del trabajador:   "+ trabaja.getNomb() + " "+ trabaja.getApe() + " le quedan:  " + dia);
                           jLabel8.setText( trabaja.getNomb() + " "+ trabaja.getApe() );
                           jLabel9.setText(trabaja.getTi());
                           jLabel7.setText(String.valueOf(dia));
                        }
                    }
                }
            }
                                }

// TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
jComboBoxFNaDia.setVisible(false);
                                jComboBox9.setVisible(false);
                                jComboBox7.setVisible(false);
                                jPanel4.setVisible(false);
                                jLabel13.setVisible(false);
                                jLabel12.setVisible(false);
                                jLabel11.setVisible(false);
                                jLabel10.setVisible(false);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked

        try {
          for (Iterator <contrato> con  = empresa.getContratos().iterator(); con.hasNext();){
                                   contrato x = con.next();
                                   
            if (x.getTipo().equals("Fijo")){
                
                 
                System.out.println("CONTRA:  "+ x.getId());
                
                FechaActual fecha = new FechaActual();
        int hoyD = fecha.getDia();
        int hoyM = fecha.getMes();
        int hoyA = fecha.getAño();
                
                int año = x.getFechaF().getAño() - hoyA;
                int mes = x.getFechaF().getMes() - hoyM;
                int dia = x.getFechaF().getDia() - hoyD;
                
                System.out.println("AÑO: \n" + año);
                System.out.println("mes : \n" + mes);
                System.out.println("dia : \n" + dia);
                
                if ( año == 0 && mes == 0 && dia <= 5 ){
                    
                    
                    for ( Iterator <trabajador> tra  = empresa.getTras().iterator(); tra.hasNext();){
                        trabajador trabaja = tra.next();
                     //   System.out.println("ENTRO FOR EACH \n");
                        if (trabaja.getTi().equals(x.getId())){
                            System.out.println("Al contrato del trabajador:   "+ trabaja.getNomb() + " "+ trabaja.getApe() + " le quedan:  " + dia);
                           jLabel8.setText( trabaja.getNomb() + " "+ trabaja.getApe() );
                           jLabel9.setText(trabaja.getTi());
                           jLabel7.setText(String.valueOf(dia));
                           
                            System.out.println("1. Renovar contrato. \n "+ "2. Regresar ");
                            //int op = hg.nextInt();
                            
                                
                                
                                
                                System.out.println(" Nueva fecha de finalizacion:   \n");
                                System.out.println("Dia : \n");
                                x.getFechaF().setDia(Integer.valueOf((String) jComboBoxFNaDia.getSelectedItem()));
                                System.out.println("Mes : \n");
                                x.getFechaF().setMes(Integer.valueOf((String) jComboBox9.getSelectedItem()));
                                System.out.println("Anio : \n");
                                x.getFechaF().setAño(Integer.valueOf((String) jComboBox7.getSelectedItem()));
                                PrintStream Out3 = new PrintStream (archiCont);
                                 new WabiSabiNomina().modifContras( empresa, Out3);
                                     JOptionPane.showMessageDialog(this, "Contrato Renovado.");

                                
                           
                                 MenuPrincipal a = new MenuPrincipal();
        a.setVisible(true);
        this.setVisible(false);
                                
                            }
                        }
                    }
                }  
            }
        
      }catch(FileNotFoundException ex) {
           System.out.println("Error: " + ex.getMessage());
           System.out.println(" hola fin");
        
 
      }

    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Aviso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aviso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aviso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aviso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aviso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JComboBox<String> jComboBoxFNaDia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
