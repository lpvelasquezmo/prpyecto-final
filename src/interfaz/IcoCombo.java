/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Color;
import java.awt.Component;
import java.util.Hashtable;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Maicol Velasquez
 */
public class IcoCombo extends JLabel implements ListCellRenderer  {

    Hashtable <Object, ImageIcon> articulo = null;
    public IcoCombo (){
        articulo = new Hashtable <Object, ImageIcon>();
        articulo.put("NOMINA", new ImageIcon(getClass().getResource("/interfaz/imagenes/Cnomina.png")));//.getImage());       
        articulo.put("Hacer Nomina", new ImageIcon(getClass().getResource("/interfaz/imagenes/sacarNo.png")));//.getImage());  
        articulo.put("Ver Nomina", new ImageIcon(getClass().getResource("/interfaz/imagenes/verNO.png")));//.getImage());
        

    }
    
    
    @Override
    public Component getListCellRendererComponent(JList jlist, Object e, int i, boolean bln, boolean bln1) {
          if (articulo.get(e)!= null){
              setIcon(articulo.get(e));
              setText((String) e);
              if (bln){
                  setBackground(Color.CYAN);
                  
              }else{
                  setBackground (Color.WHITE);
              }
              return this;
          }else{
              return null;
          }

    }
    
}

 