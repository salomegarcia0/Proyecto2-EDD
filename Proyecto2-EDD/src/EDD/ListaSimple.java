/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import javax.swing.JOptionPane;

/**
 * La clase ListaSimple implementa una lista enlazada simple.
 * Permite realizar operaciones básicas como agregar elementos, 
 * eliminarlos, buscar datos, y mostrar el contenido de la lista.
 * 
 * @author salom
 */
public class ListaSimple {
    private Nodo first; // Nodo que apunta al primer elemento de la lista.
    private int size; // Tamaño de la lista.

    /**
    * Constructor por defecto que inicializa una lista vacía.
    */
    public ListaSimple() {
        this.first = null;
        this.size = 0;
    }
    
    //getters y setters
    
    /**
    * Obtiene el primer nodo de la lista.
    * 
    * @return El nodo que es el inicio de la lista.
    */
    public Nodo getFirst() {
        return first;
    }

    /**
    * Establece el primer nodo de la lista.
    * 
    * @param first El nuevo nodo a establecer como primero.
    */
    public void setFirst(Nodo first) {
        this.first = first;
    }

    /**
    * Obtiene el tamaño actual de la lista.
    * 
    * @return El número de elementos en la lista.
    */
    public int getSize() {
        return size;
    }

    /**
    * Establece el tamaño de la lista.
    * 
    * @param size El nuevo tamaño de la lista.
    */
    public void setSize(int size) {
        this.size = size;
    }
    
    /**
    * Verifica si la lista está vacía.
    * 
    * @return true si la lista está vacía, false en caso contrario.
    */
    public boolean isEmpty() {
        return this.first == null;
    }
    
    /**
    * Agrega un nuevo elemento al final de la lista.
    * 
    * @param data El dato que se desea agregar.
    */
    public void aggFinal(Object data) {
        Nodo newNodo = new Nodo(data);
        if (isEmpty()) {
            first = newNodo;
        } else {
            Nodo tmp = first;
            while (tmp.getnext() != null) {
                tmp = tmp.getnext();
            }
            tmp.setnext(newNodo);
        }
        size++;
    }
    
    /**
    * Elimina el último elemento de la lista.
    */
    public void eliminarFinal() {
        if (!this.isEmpty()) {
            if (this.first.getnext() == null) {
                this.first = null;
            } else {
                Nodo tmp = this.first;
                while (tmp.getnext().getnext() != null) {
                    tmp = tmp.getnext();
                }
                tmp.setnext(null);
            }
            size--;
        }
    }
    
    /**
    * Busca un objeto en la lista.
    * 
    * @param objetivo El objeto que se desea encontrar.
    * @return true si el objeto está en la lista, false en caso contrario.
    */
    public boolean encontrar(Object objetivo) {
        // Nodo que se utiliza para recorrer la lista
        Nodo nodoActual = this.first; 
        boolean encontrado = false;
        // Itera mientras haya nodos por recorrer y el objeto no haya sido encontrado
        while (nodoActual != null && !encontrado) {
            // Compara el objeto objetivo con el dato del nodo actual
            if (objetivo == nodoActual.getData()) {
                encontrado = true;
            } else {
                nodoActual = nodoActual.getnext();
            }
        }
        // Retorna el resultado de la búsqueda
        return encontrado;
    }
    
    /**
    * Elimina todos los elementos de la lista.
    */
    public void destruir() {
        this.first = null;
        this.size = 0;
    }
    
    /**
    * Transforma la lista en una representación textual.
    * 
    * @return Una cadena que representa los elementos de la lista.
    */
    public String Transformar() {
        if (!isEmpty()) {
            Nodo aux = first;
            StringBuilder expresion = new StringBuilder();
            for (int i = 0; i < size; i++) {
                expresion.append(aux.getData().toString()).append("\n");
                aux = aux.getnext();
            }
            return expresion.toString();
        }
        return "Lista vacía";
    }
    
    /**
    * Obtiene el valor de un nodo en una posición específica.
    * 
    * @param posicion La posición del nodo en la lista.
    * @return El dato del nodo en la posición indicada, o null si la posición es inválida.
    */
    public Object getValor(int posicion) {
        if (posicion >= 0 && posicion < size) {
            if (posicion == 0) {
                return first.getData();
            } else {
                Nodo aux = first;
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getnext();
                }
                return aux.getData();
            }
        }
        return null;
    }
    
    /**
    * Muestra los elementos de la lista en una ventana emergente.
    */
    public void mostrar() {
        if (!this.isEmpty()) {
            String listaString = "";
            
            Nodo temp = this.first;
            while (temp != null) {
                listaString += temp.getData() + "\n";
                temp = temp.getnext();
            }
            
            JOptionPane.showMessageDialog(null, listaString);
        } else {
            JOptionPane.showMessageDialog(null, "La lista está vacía.");
        }
    }
    
}