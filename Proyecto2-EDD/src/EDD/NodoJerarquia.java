/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 * La clase NodoJerarquia representa un nodo que contiene un NodoArbol y su nivel jerárquico.
 * Es utilizada para estructurar y gestionar elementos jerárquicos, como árboles organizacionales o estructuras similares.
 * 
 * @author Alejandra Oporto
 */
public class NodoJerarquia {
    private NodoArbol nodo; // Nodo que representa un elemento en la jerarquía.
    private int nivel; // Nivel jerárquico del nodo.

    /**
    * Constructor que inicializa un NodoJerarquia con un nodo y un nivel.
    * 
    * @param nodo El NodoArbol asociado a este NodoJerarquia.
    * @param nivel El nivel jerárquico asociado al nodo.
    */
    public NodoJerarquia(NodoArbol nodo, int nivel) {
        this.nodo = nodo;
        this.nivel = nivel;
    }

    /**
    * Obtiene el NodoArbol asociado a este NodoJerarquia.
    * 
    * @return El NodoArbol almacenado.
    */
    public NodoArbol getNodo() {
        return nodo;
    }

    /**
    * Establece un NodoArbol para este NodoJerarquia.
    * 
    * @param nodo El NodoArbol a asociar.
    */
    public void setNodo(NodoArbol nodo) {
        this.nodo = nodo;
    }

    /**
    * Obtiene el nivel jerárquico asociado a este nodo.
    * 
    * @return El nivel jerárquico.
    */
    public int getNivel() {
        return nivel;
    }

    /**
    * Establece el nivel jerárquico para este nodo.
    * 
    * @param nivel El nivel jerárquico a establecer.
    */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}

