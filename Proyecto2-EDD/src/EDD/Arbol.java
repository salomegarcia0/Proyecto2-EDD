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
    
    public void destruir(){
        this.root = null;
    }
    
    public void crearRaiz(Persona persona){
        NodoArbol raizNueva = new NodoArbol(persona);
        this.setRoot(raizNueva);
    }

    /**
     * Inserta un nuevo nodo en el árbol, asociando una Persona a un nodo padre existente.
     * 
     * @param nombrePadre Nombre del nodo padre donde se insertará la nueva Persona.
     * @param persona Objeto Persona que se añadirá al árbol.
     * 
     * @return boolean true si se inserta la persona o false si no existe el padre.
     */
    public boolean insertar(String nombrePadre, Persona persona) {
        if (this.buscar(nombrePadre) != null) {
            this.buscar(nombrePadre).agregarHijo(persona);
            return true;
        }
        
        return false;
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
                }
                String nombreComparar = personaActual.getNombre() + " " + personaActual.getNumeral();
                if (nombreComparar.equalsIgnoreCase(nombre)) {
                    return nodoActual;

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
    
    public NodoArbol buscarNombre(String nombre) {
        if (this.isEmpty()) {
            return null;
        }

        Cola cola = new Cola();
        cola.enColar(root);

        while (!cola.colaVacia()) {
            NodoArbol nodoActual = (NodoArbol) cola.desEnColar();
            Persona persona = (Persona) nodoActual.getDato();
            if (persona.getNombre().equalsIgnoreCase(nombre)) {
                return nodoActual;
            }

            Nodo hijoNodo = nodoActual.getHijos().getFirst();
            while (hijoNodo != null) {
                NodoArbol hijo = (NodoArbol) hijoNodo.getData();
                cola.enColar(hijo);
                hijoNodo = hijoNodo.getnext();
            }
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
            System.out.println("Este arbol esta vacio.");
        }
    }

    public int maximoNivel() {
        if (this.isEmpty()) {
            return 0; // 
        }
        int maxNivel = 0;
        Cola cola = new Cola();
        cola.enColar(new NodoJerarquia(root, 1));

        while (!cola.colaVacia()) {
            NodoJerarquia nodoActual = (NodoJerarquia) cola.desEnColar();
            maxNivel = Math.max(maxNivel, nodoActual.getNivel());
            Nodo hijoNodo = nodoActual.getNodo().getHijos().getFirst();
            while (hijoNodo != null) {
                NodoArbol hijo = (NodoArbol) hijoNodo.getData();
                cola.enColar(new NodoJerarquia(hijo, nodoActual.getNivel() + 1));
                hijoNodo = hijoNodo.getnext();
            }
        }

        return maxNivel;
    }

    public ListaSimple obtenerNodosEnNivel(int nivelBuscado) {
        ListaSimple nodosEnNivel = new ListaSimple();
        if (this.isEmpty()) {
            return nodosEnNivel; 
        }
        Cola cola = new Cola();
        cola.enColar(new NodoJerarquia(root, 1));
        while (!cola.colaVacia()) {
            NodoJerarquia nodoActual = (NodoJerarquia) cola.desEnColar();           
            if (nodoActual.getNivel() == nivelBuscado) {
                nodosEnNivel.aggFinal(nodoActual.getNodo().getDato());
            }
            Nodo hijoNodo = nodoActual.getNodo().getHijos().getFirst();
            while (hijoNodo != null) {
                NodoArbol hijo = (NodoArbol) hijoNodo.getData();
                cola.enColar(new NodoJerarquia(hijo, nodoActual.getNivel() + 1));
                hijoNodo = hijoNodo.getnext();
            }
        }

        return nodosEnNivel;
    }
    
    public ListaSimple buscarAncestros(NodoArbol nodoA){
        if(nodoA == null){
            return null;
        }
        
        ListaSimple ancestros = new ListaSimple();
        NodoArbol actual = nodoA.getPadre();
        
        while(actual != null){
            Persona personaActual = (Persona) actual.getDato();
            ancestros.aggFinal(personaActual);
            actual = actual.getPadre();
        }
        
        return ancestros;   
    } 
}
