/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author salom
 */
public class ListaSimple {
    private Nodo first;
    private int size;

    /**
     * 
     */
    public ListaSimple() {
        this.first = null;
        this.size = 0;
    }
    
    /**
     * 
     * @return 
     */
    public Nodo getFirst() {
        return first;
    }
    
    /**
     * 
     * @param pFirst 
     */
    public void setFirst(Nodo pFirst) {
        this.first = pFirst;
    }
    /**
     * 
     * @return 
     */
    public int getSize() {
        return size;
    }
    
    /**
     * 
     * @param size 
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    /**
     * 
     * @return 
     */
    public boolean estaVacia(){
        return this.first == null;
    }
    
    /**
     * Agrega un nuevo elemento al final de la lista.
     * @param data El dato a agregar.
     */
    public void aggFinal(Object data){
        Nodo newNodo = new Nodo(data);
        if(estaVacia()){
            first = newNodo;
        }else{
            Nodo tmp = first;
            while(tmp.getNext() != null){
                tmp = tmp.getNext();
            } 
            tmp.setNext(newNodo);
        }
        size++;
    }
    
    /**
     * 
     */
    public void eliminarFinal(){
        if(!this.estaVacia()){
            this.setFirst(first);
        }else{
            Nodo tmp = this.first;
            while(tmp.getNext().getNext()!= null){
                tmp = tmp.getNext();
            }
            tmp.setNext(null);
        }
        size--;
    }
    
    /**
     * 
     * @param dato
     * @return 
     */
    public boolean buscar(Object dato){
        if(!this.estaVacia()){
            if(this.size == 1){
                return this.first.getDato() == dato;
        }else{
            Nodo tmp = this.first;
            while (tmp != null){
                if(tmp.getDato() == dato){
                    return true;
                }
                tmp = tmp.getNext();
            }
            return false;
        }
    }
    return false;
}
    
    /**
     * 
     */
    public void destruir(){
        this.first = null;
        this.size = 0;
    }
   
    
    
}
