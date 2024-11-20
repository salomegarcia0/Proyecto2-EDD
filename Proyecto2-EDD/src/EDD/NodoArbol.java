/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 * Clase que representa el nodo del Arbol.
 * Cada nodo puede tener un dato, un nodo padre y una lista de nodos hijos.
 * 
 * Utiliza la clase ListaSimple para manejar la colección de hijos.
 * 
 * @author Alejandra Oporto
 */

public class NodoArbol {

    /**
     * El dato almacenado en el nodo.
     */
    private Object dato;

    /**
     * El nodo padre de este nodo.
     */
    private NodoArbol padre;

    /**
     * Lista de hijos de este nodo.
     */
    private ListaSimple hijos;

    /**
     * Constructor que inicializa el nodo con un dato.
     * Crea un nodo sin padre y con una lista vacía de hijos.
     * 
     * @param dato el dato que almacena el nodo.
     */
    public NodoArbol(Object dato) {
        this.dato = dato;
        this.padre = null;
        this.hijos = new ListaSimple();
    }

    /**
     * Obtiene el dato almacenado en el nodo.
     * 
     * @return el dato del nodo.
     */
    public Object getDato() {
        return dato;
    }

    /**
     * Establece un nuevo dato para el nodo.
     * 
     * @param dato el nuevo dato del nodo.
     */
    public void setDato(Object dato) {
        this.dato = dato;
    }

    /**
     * Obtiene el nodo padre de este nodo.
     * 
     * @return el nodo padre.
     */
    public NodoArbol getPadre() {
        return padre;
    }

    /**
     * Establece el nodo padre de este nodo.
     * 
     * @param padre el nodo padre.
     */
    public void setPadre(NodoArbol padre) {
        this.padre = padre;
    }

    /**
     * Obtiene la lista de nodos hijos de este nodo.
     * 
     * @return la lista de hijos.
     */
    public ListaSimple getHijos() {
        return hijos;
    }

    /**
     * Establece una nueva lista de hijos para este nodo.
     * 
     * @param hijos la nueva lista de hijos.
     */
    public void setHijos(ListaSimple hijos) {
        this.hijos = hijos;
    }
    
    /**
     * Agrega un nuevo hijo a este nodo.
     * Crea un nuevo nodo con el dato proporcionado y lo enlaza a este nodo como su padre.
     * 
     * @param persona el dato del nuevo nodo hijo.
     */
    public void agregarHijo(Object persona) {
        NodoArbol hijo = new NodoArbol(persona);
        hijo.setPadre(this);
        this.hijos.aggFinal(hijo);
    } 
}
