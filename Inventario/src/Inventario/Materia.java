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
public class Materia extends Producto {
protected ArrayList<Materia>materias;

    public Materia(ArrayList<Materia> materias, String nombre, int cantidad, double precio) {
        super(nombre, cantidad, precio);
        this.materias = materias;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public Materia(String nombre, int cantidad, double precio) {
        super(nombre, cantidad, precio);
    }

        public ArrayList<Materia>registrarGastados(String nombre, int cantidad) {
        int cGas;
        cGas = 0;
       this.cantidad = this.cantidad - cGas;
    return this.materias;

    }
public ArrayList<Materia> compras(String nombre, int cantidad) {
int cPed;
        cPed = 0;
        this.cantidad = this.cantidad + cPed;
    return this.materias;    
        //return this.tipos.add(tipo);

    }

}
