/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Alejandra Oporto
 */
public class NodoArbol {
    private Object dato;
    private NodoArbol padre;
    private ListaSimple hijos;

    public NodoArbol(Object dato) {
        this.dato = dato;
        this.padre = null;
        this.hijos = new ListaSimple();
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoArbol getPadre() {
        return padre;
    }

    public void setPadre(NodoArbol padre) {
        this.padre = padre;
    }

    public ListaSimple getHijos() {
        return hijos;
    }

    public void setHijos(ListaSimple hijos) {
        this.hijos = hijos;
    }
    
    public void agregarHijo(Object persona){
        NodoArbol hijo = new NodoArbol(persona);
        hijo.setPadre(this);
        this.hijos.aggFinal(hijo);
    } 
}
