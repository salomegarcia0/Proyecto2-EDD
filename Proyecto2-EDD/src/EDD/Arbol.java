/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import Clases.Persona;

/**
 *
 * @author Alejandra Oporto
 */
public class Arbol {

    private NodoArbol root;

    public Arbol() {
        this.root = null;
    }

    public NodoArbol getRoot() {
        return root;
    }

    public void setRoot(NodoArbol root) {
        this.root = root;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public void insertar(String nombrePadre, Persona persona) {
        if (this.buscar(nombrePadre) != null) {
            this.buscar(nombrePadre).agregarHijo(persona);
            System.out.println("Nodo agregado");
        } else {
            System.out.println("Padre No existes");
        }
    }

    public NodoArbol buscar(String nombre) {
        if (!this.isEmpty()) {
            Cola cola = new Cola();
            cola.enColar(this.root);
            while (!cola.colaVacia()) {
                NodoArbol nodoActual = (NodoArbol) cola.desEnColar();
                Persona personaActual = (Persona) nodoActual.getDato();

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
