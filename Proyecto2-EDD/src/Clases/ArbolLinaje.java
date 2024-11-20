/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import EDD.Arbol;
import EDD.HashTable;
/**
 *
 * @author Alejandra Oporto
 */
public class ArbolLinaje {
    private HashTable tablaLinaje;
    private Arbol arbolLinaje;

    public ArbolLinaje() {
        this.tablaLinaje = new HashTable(100);
        this.arbolLinaje = new Arbol();
    }

    public HashTable getTablaLinaje() {
        return tablaLinaje;
    }

    public void setTablaLinaje(HashTable tablaLinaje) {
        this.tablaLinaje = tablaLinaje;
    }

    public Arbol getArbolLinaje() {
        return arbolLinaje;
    }

    public void setArbolLinaje(Arbol arbolLinaje) {
        this.arbolLinaje = arbolLinaje;
    }
}
