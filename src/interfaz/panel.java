/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Maicol Velasquez
 */
public class panel extends javax.swing.JFrame {
    
    
    
    public static void main(String[] args) {
            JFrame fram = new JFrame();
                    fram.setTitle ("WabiSabi");


    }
    
    public panel (){
        centralVentana();
        
    }
    
    

public void centralVentana(){
Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
Dimension frameSize = getSize();
if (frameSize.height > screenSize.height ){
    frameSize.height=screenSize.height ;
}
if (frameSize.width> screenSize.width ){
    frameSize.width=screenSize.width ;
}
setLocation ((screenSize.width-frameSize.width)/2, (screenSize.height - frameSize.height)/2);

}

}