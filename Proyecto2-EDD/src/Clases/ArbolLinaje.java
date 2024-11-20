/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import EDD.Arbol;
import EDD.HashTable;

/**
 * La clase ArbolLinaje representa una estructura que combina un árbol
 * y una tabla hash para gestionar información de linajes. 
 * 
 * Esta clase incluye métodos para obtener y modificar estas estructuras.
 * 
 * @author Alejandra Oporto
 */
public class ArbolLinaje {
    /**
     * Estructura de tabla hash para almacenar datos relacionados con el linaje.
     */
    private HashTable tablaLinaje;

    /**
     * Árbol para representar la jerarquía del linaje.
     */
    private Arbol arbolLinaje;

    /**
     * Constructor de la clase ArbolLinaje.
     * 
     * Inicializa la tabla hash con un tamaño predeterminado de 100 y crea una instancia de un árbol vacío.
     */
    public ArbolLinaje() {
        this.tablaLinaje = new HashTable(100);
        this.arbolLinaje = new Arbol();
    }

    /**
     * Obtiene la tabla hash utilizada para el almacenamiento de datos del linaje.
     * 
     * @return la tabla hash de linaje.
     */
    public HashTable getTablaLinaje() {
        return tablaLinaje;
    }

    /**
     * Establece una nueva tabla hash para almacenar los datos del linaje.
     * 
     * @param tablaLinaje la nueva tabla hash a asignar.
     */
    public void setTablaLinaje(HashTable tablaLinaje) {
        this.tablaLinaje = tablaLinaje;
    }

    /**
     * Obtiene el árbol utilizado para representar la jerarquía del linaje.
     * 
     * @return el árbol del linaje.
     */
    public Arbol getArbolLinaje() {
        return arbolLinaje;
    }

    /**
     * Establece un nuevo árbol para la jerarquía del linaje.
     * 
     * @param arbolLinaje el nuevo árbol a asignar.
     */
    public void setArbolLinaje(Arbol arbolLinaje) {
        this.arbolLinaje = arbolLinaje;
    }
}

