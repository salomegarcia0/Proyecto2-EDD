/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author salom
 */
public class Nodo {
    private Object dato;
    private Nodo next;

    /**
     * 
     */
    public Nodo() {
        this.dato = null;
        this.next = null;
    }
    
    /**
     * 
     * @param dato 
     */
    public Nodo(Object dato) {
        this.dato = dato;
        this.next = null;
    }
    
    /**
     * 
     * @return 
     */
    public Object getDato() {
        return dato;
    }
    
    /**
     * 
     * @param dato 
     */
    public void setDato(Object dato) {
        this.dato = dato;
    }
    
    /**
     * 
     * @return 
     */
    public Nodo getNext() {
        return next;
    }
    
    /**
     * 
     * @param next 
     */
    public void setNext(Nodo pNext) {
        this.next = pNext;
    } 
}
