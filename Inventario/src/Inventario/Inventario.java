/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import java.util.ArrayList;

/**
 *
 * @author Familia Bastidas
 */
public class Inventario {

//    protected String nombre;
//    protected int cantidad;
//    protected double precio;
    protected ArrayList<Producto> tipos;
    private ArrayList <Platos> platos;



    public Inventario() {
//        this.nombre = nombre;
this.tipos = new ArrayList <>();
this.platos  = new ArrayList <>();
//        this.cantidad = cantidad;
//        this.precio = precio;
    }


    public boolean anadir(Producto pro) {

    return this.tipos.add(pro);    
        //return this.tipos.add(tipo);

    }
    public ArrayList<Producto> getTipos() {
        return tipos;
    }

    public void setTipos(ArrayList<Producto> tipos) {
        this.tipos = tipos;
    }

      public boolean anadirPla(Platos Pla) {

    return this.platos.add(Pla);    
        //return this.tipos.add(tipo);

    }
        

    public boolean eliminar(Producto pro) {

          return   tipos.remove(pro);
           
        }

    public boolean eliminarPla(Platos Pla) {


          return   tipos.remove(Pla);
           
        }

public ArrayList<Producto> mostrar(String nombre, double precio, int cantidad){
  System.out.println(tipos);
return tipos;
}




public void compras(String nombre, int cantidad) {
        for ( Producto x : this.tipos){
            if (x.getNombre().equals(nombre)){
                int aux = x.getCantidad() + cantidad;
                x.setCantidad(aux);
            }
        }
    }
public void registrarVentas(String nombre, int cantidad) {
        for ( Platos x : this.platos){
            
            if (x.getNombre().equals(nombre)){
                for (Ingredientes x1 : x.getNproduc()){
                    
                    for (Producto x2: this.tipos){
                    if (x1.getNproduc().equals(x2.getNombre())){
                    int aux = x2.getCantidad() - (x1.getCantidadPez()*cantidad);
                    x2.setCantidad(aux); 
                    }
                }
                
               

                }
                
            }
        }
    }
public void cambiarPrecio(String nombre,double precio){
     for ( Producto x : this.tipos){
            if (x.getNombre().equals(nombre)){
               
                x.setPrecio(precio);
            }
        }  
}

    public ArrayList<Platos> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Platos> platos) {
        this.platos = platos;
    }

   


} 
