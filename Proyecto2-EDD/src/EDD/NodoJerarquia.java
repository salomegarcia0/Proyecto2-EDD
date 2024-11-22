/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Alejandra Oporto
 */
public class NodoJerarquia {
    private NodoArbol nodo;
    private int nivel;

    public NodoJerarquia(NodoArbol nodo, int nivel) {
        this.nodo = nodo;
        this.nivel = nivel;
    }

    public NodoArbol getNodo() {
        return nodo;
    }

    public void setNodo(NodoArbol nodo) {
        this.nodo = nodo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
