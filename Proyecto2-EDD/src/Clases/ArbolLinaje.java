/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import EDD.Arbol;
import EDD.HashTable;
import EDD.ListaSimple;

/**
 * La clase ArbolLinaje representa una estructura que combina un árbol
 * y una tabla hash para gestionar información de linajes. 
 * 
 * Esta clase incluye métodos para obtener y modificar estas estructuras.
 * 
 * @author Alejandra Oporto
 */
public class ArbolLinaje {
    /**
     * Estructura de tabla hash para almacenar datos relacionados con el linaje.
     */
    private HashTable tablaLinaje;

    /**
     * Árbol para representar la jerarquía del linaje.
     */
    private Arbol arbolL;

    /**
     * Constructor de la clase ArbolLinaje.
     * 
     * Inicializa la tabla hash con un tamaño predeterminado de 100 y crea una instancia de un árbol vacío.
     */
    private String nombreLinaje;
    
    /**
    * Constructor de la clase ArbolLinaje.
    * 
    * Este constructor inicializa las estructuras internas necesarias para gestionar el linaje:
    * - Establece el nombre del linaje como null, indicando que aún no ha sido asignado.
    */
    public ArbolLinaje() {
        this.tablaLinaje = new HashTable(100);
        this.arbolL = new Arbol();
        this.nombreLinaje = null;
    }


    /**
     * Obtiene la tabla hash utilizada para el almacenamiento de datos del linaje.
     * 
     * @return la tabla hash de linaje.
     */
    public HashTable getTablaLinaje() {
        return tablaLinaje;
    }

    /**
     * Establece una nueva tabla hash para almacenar los datos del linaje.
     * 
     * @param tablaLinaje la nueva tabla hash a asignar.
     */
    public void setTablaLinaje(HashTable tablaLinaje) {
        this.tablaLinaje = tablaLinaje;
    }

    /**
     * Obtiene el árbol utilizado para representar la jerarquía del linaje.
     * 
     * @return el árbol del linaje.
     */
    public Arbol getArbolL() {
        return arbolL;
    }

    /**
     * Establece un nuevo árbol para la jerarquía del linaje.
     * 
     * @param arbolLinaje el nuevo árbol a asignar.
     */
    public void setArbolL(Arbol arbolLinaje) {
        this.arbolL = arbolL;
    }
    
    /**
    * Obtiene el nombre del linaje.
    * 
    * @return el nombre del linaje como una cadena.
    */
    public String getNombreLinaje() {
    return nombreLinaje;
    }

    /**
     * Establece el nombre del linaje.
    *   
    * @param nombreLinaje el nuevo nombre del linaje a asignar.
    */
    public void setNombreLinaje(String nombreLinaje) {
        this.nombreLinaje = nombreLinaje;
    }

    /**
    * Destruye las estructuras de datos internas asociadas al linaje.
    * 
    * Este método elimina el contenido del árbol y vacía la tabla hash 
    * para liberar los recursos asociados.
    */
    public void destruir() {
        this.arbolL.destruir();
        this.tablaLinaje.vaciar();
    }

    /**
    * Busca personas por nombre en la tabla hash del linaje.
    * 
    * @param nombre el nombre de la persona a buscar.
    * @return un arreglo de objetos Persona que coinciden con el nombre
    *         buscado, o null si no se encuentran coincidencias.
    */
    public Persona[] buscarNombre(String nombre) {
        ListaSimple resultados = this.tablaLinaje.buscarNombre(nombre);

        if (!resultados.isEmpty()) {
            Persona[] arregloPersona = new Persona[resultados.getSize()];
            for (int i = 0; i < resultados.getSize(); i++) {
                Persona persona = (Persona) resultados.getValor(i);
                arregloPersona[i] = persona;
            }

            return arregloPersona;
        }

        return null;
    }

    /**
    * Busca personas por título de mobiliario en la tabla hash del linaje.
    * 
    * @param titulo el título de mobiliario a buscar.
    * @return un arreglo de objetos Persona que coinciden con el título
    *         buscado, o null si no se encuentran coincidencias.
    */
    public Persona[] buscarTitulo(String titulo) {
        ListaSimple resultados = this.tablaLinaje.buscarTituloMobiliario(titulo);

        if (!resultados.isEmpty()) {
            Persona[] arregloPersona = new Persona[resultados.getSize()];
            for (int i = 0; i < resultados.getSize(); i++) {
                Persona persona = (Persona) resultados.getValor(i);
                arregloPersona[i] = persona;
            }
            
            return arregloPersona;
        }
        
        return null;
    }
}
