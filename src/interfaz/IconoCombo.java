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
public class IconoCombo extends JLabel implements ListCellRenderer  {

    Hashtable <Object, ImageIcon> articulos = null;
    public IconoCombo (){
        articulos = new Hashtable <Object, ImageIcon>();
        articulos.put("CONTRATO", new ImageIcon(getClass().getResource("/interfaz/imagenes/editar.png")));//.getImage());       
        articulos.put("Crear Contrato", new ImageIcon(getClass().getResource("/interfaz/imagenes/agregar.png")));//.getImage());  
        articulos.put("Eliminar Contrato", new ImageIcon(getClass().getResource("/interfaz/imagenes/eliminar.png")));//.getImage());
        articulos.put("Buscar Contrato", new ImageIcon(getClass().getResource("/interfaz/imagenes/buscar.png")));//.getImage());       
        

    }
    
    
    @Override
    public Component getListCellRendererComponent(JList jlist, Object e, int i, boolean bln, boolean bln1) {
          if (articulos.get(e)!= null){
              setIcon(articulos.get(e));
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
