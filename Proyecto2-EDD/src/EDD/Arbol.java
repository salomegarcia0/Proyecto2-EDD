/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EDD;

import Clases.Persona;
/**
 * La clase Arbol se utiliza para manejar una estructura de datos de tipo árbol.
 * Cada nodo del árbol es de tipo NodoArbol y contiene información asociada
 * a una Persona. Esta clase incluye métodos para realizar operaciones como 
 * insertar, buscar y mostrar nodos.
 *
 * @author Alejandra Oporto
 */
public class Arbol {

    /**
     * Nodo raíz del árbol.
     */
    private NodoArbol root;

    /**
     * Inicializa el árbol con un nodo raíz vacío.
     */
    public Arbol() {
        this.root = null;
    }

    /**
     * Obtiene el nodo raíz del árbol.
     * 
     * @return Nodo raíz del árbol.
     */
    public NodoArbol getRoot() {
        return root;
    }

    /**
     * Establece el nodo raíz del árbol.
     * 
     * @param root Nodo que será establecido como raíz.
     */
    public void setRoot(NodoArbol root) {
        this.root = root;
    }

    /**
     * Verifica si el árbol está vacío.
     * 
     * @return true si el árbol está vacío, false en caso contrario.
     */
    public boolean isEmpty() {
        return this.root == null;
    }

    /**
     * Inserta un nuevo nodo en el árbol, asociando una Persona a un nodo padre existente.
     * 
     * @param nombrePadre Nombre del nodo padre donde se insertará la nueva Persona.
     * @param persona Objeto Persona que se añadirá al árbol.
     */
    public void insertar(String nombrePadre, Persona persona) {
        if (this.buscar(nombrePadre) != null) {
            this.buscar(nombrePadre).agregarHijo(persona);
            System.out.println("Nodo agregado");
        } else {
            System.out.println("Padre No existes");
        }
    }

    /**
     * Busca un nodo en el árbol a partir del nombre de una Persona.
     * 
     * @param nombre Nombre o mote de la Persona que se desea buscar.
     * @return Nodo encontrado o null si no existe.
     */
    public NodoArbol buscar(String nombre) {
        if (!this.isEmpty()) {
            Cola cola = new Cola();
            cola.enColar(this.root);
            while (!cola.colaVacia()) {
                NodoArbol nodoActual = (NodoArbol) cola.desEnColar();
                Persona personaActual = (Persona) nodoActual.getDato();

                // Comparar por mote o por nombre completo
                if (personaActual.getMote() != null) {
                    if (personaActual.getMote().equalsIgnoreCase(nombre)) {
                        return nodoActual;
                    }
                } else {
                    String nombreComparar = personaActual.getNombre() + " " + personaActual.getNumeral();
                    if (nombreComparar.equalsIgnoreCase(nombre)) {
                        return nodoActual;
                    }
                }

                // Recorrer hijos
                Nodo aux = nodoActual.getHijos().getFirst();
                while (aux != null) {
                    NodoArbol hijoActual = (NodoArbol) aux.getData();
                    cola.enColar(hijoActual);
                    aux = aux.getnext();
                }
            }
            return null;
        }
        return null;
    }

    /**
     * Muestra el contenido del árbol en un recorrido por niveles.
     * Imprime los datos de cada nodo en la consola.
     */
    public void mostrar() {
        if (!this.isEmpty()) {
            String arbol = "";
            Cola cola = new Cola();
            cola.enColar(this.root);
            while (!cola.colaVacia()) {
                NodoArbol nodoActual = (NodoArbol) cola.desEnColar();
                Persona personaActual = (Persona) nodoActual.getDato();
                
                arbol += personaActual + "\n";
                
                Nodo aux = nodoActual.getHijos().getFirst();
                while (aux != null) {
                    NodoArbol hijoActual = (NodoArbol) aux.getData();
                    cola.enColar(hijoActual);
                    aux = aux.getnext();
                }
            }
            
            System.out.println(arbol);
        } else {
            System.out.println("Arbol Vacio");
        }
    }
}
