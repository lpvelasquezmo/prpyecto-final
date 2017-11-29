/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import java.util.ArrayList;

/**
 *
 * @author Maicol Velasquez
 */
public class Platos extends Producto{
   
    
    
    
    private ArrayList <Ingredientes > Nproduc;

    public Platos( String nombre, int cantidad, double precio) {
        super(nombre, cantidad, precio);
        this.Nproduc = new ArrayList <>();
      
    }

  

    public ArrayList<Ingredientes> getNproduc() {
        return Nproduc;
    }

    public void setNproduc(ArrayList<Ingredientes> Nproduc) {
        this.Nproduc = Nproduc;
    }

   
    
    public boolean anadirPla(String nombre, int cant) {
     
        Ingredientes ingre = new Ingredientes (cant, nombre);
    return this.Nproduc.add(ingre);    
        //return this.tipos.add(tipo);

    }
        

    public boolean eliminar(Ingredientes pro) {

          return   this.Nproduc.remove(pro);
           
        }

   

}
