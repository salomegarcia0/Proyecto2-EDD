/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import Clases.Persona;

/**
 * La clase HashTable implementa una tabla hash para almacenar y gestionar datos
 * de manera eficiente. Utiliza listas simples en cada índice de la tabla
 * para resolver colisiones mediante encadenamiento.
 * 
 * Proporciona métodos para insertar, buscar, mostrar y vaciar la tabla hash.
 * 
 * @author salom
 */
public class HashTable {
    private ListaSimple[] tabla; // Arreglo de listas simples que actúa como la tabla hash.
    private int size; // Tamaño de la tabla hash.

    /**
    * Constructor de la clase HashTable.
    * 
    * Inicializa la tabla hash con el tamaño especificado y crea listas simples
    * vacías en cada posición del arreglo.
    * 
    * @param size Tamaño de la tabla hash.
    */
    public HashTable(int size) {
        this.size = size;
        this.tabla = new ListaSimple[size];
        this.iniciar();
    }
    
    /**
    * Inicializa cada posición de la tabla hash con una nueva lista simple vacía.
    */
    private void iniciar(){
        for (int i = 0; i < size; i++){
            tabla[i] = new ListaSimple();
        }
    }
    
    /**
    * Obtiene el tamaño de la tabla hash.
    * 
    * @return El tamaño de la tabla hash.
    */
    public int getSize() {
        return size;
    }
       
    /**
    * Establece un nuevo tamaño para la tabla hash.
    * 
    * @param size El nuevo tamaño de la tabla hash.
    */
    public void setSize(int size) {
        this.size = size;
    }
    
    /**
    * Genera un índice hash para una clave dada.
    * 
    * @param clave La clave a convertir en índice.
    * @return El índice hash generado.
    */
    private int hash(String clave){
        return Math.abs(clave.hashCode());
    }
    
    /**
    * Calcula el índice correspondiente para una clave en la tabla hash.
    * 
    * @param clave La clave a buscar.
    * @return El índice en la tabla hash.
    */
    public int obtenerIndice(String clave) {
        return this.hash(clave) % size;
    }
    
    /**
    * Busca un objeto en la tabla hash utilizando una clave.
    * 
    * @param clave La clave del objeto a buscar.
    * @return El objeto encontrado o null si no se encuentra.
    */
    public Object buscar(String clave) {
        int index = this.obtenerIndice(clave);
        ListaSimple listaInIndex = tabla[index];

        if (!listaInIndex.isEmpty()) {
            for (int i = 0; i < listaInIndex.getSize(); i++) {
                Persona personaActual = (Persona) listaInIndex.getValor(i);
                if (personaActual.getMote() != null) {
                    if (personaActual.getMote().equalsIgnoreCase(clave)) {
                        return personaActual;
                    }
                } else {
                    String nombreComparar = personaActual.getNombre() + " " + personaActual.getNumeral();
                    if (nombreComparar.equalsIgnoreCase(clave)) {
                        return personaActual;
                    }
                }
            }
        }
        return null;
    }
    
    /**
    * Busca todas las personas cuyo nombre contenga una cadena específica.
    * 
    * @param nombre La cadena de texto a buscar en los nombres.
    * @return Una lista simple con las personas encontradas.
    */
    public ListaSimple buscarNombre(String nombre) {
        ListaSimple resultado = new ListaSimple();

        for (int i = 0; i < this.size; i++) {
            if (!tabla[i].isEmpty()) {
                Nodo temp = tabla[i].getFirst();
                while (temp != null) {
                    Persona personaAct = (Persona) temp.getData();
                    if (personaAct.getMote() != null) {
                        if (personaAct.getMote().toLowerCase().contains(nombre.toLowerCase())) {
                            resultado.aggFinal(personaAct);
                        } else if (personaAct.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                            String nombreUnico = personaAct.getNombre()+ " " + personaAct.getNumeral();
                            resultado.aggFinal(personaAct);
                        }
                    } else {
                        if (personaAct.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                            String nombreUnico = personaAct.getNombre()+ " " + personaAct.getNumeral();
                            resultado.aggFinal(personaAct);
                        }
                    }
                    temp = temp.getnext();
                }
            }
        }

        return resultado;
    }  
    
    /**
    * Busca todas las personas que tengan un título mobiliario específico.
    * 
    * @param titulo El título mobiliario a buscar.
    * @return Una lista simple con las personas encontradas.
    */
    public ListaSimple buscarTituloMobiliario(String titulo) {
        ListaSimple personasFiltradas = new ListaSimple();
        for (int i = 0; i < this.size; i++) {
            if (!tabla[i].isEmpty()) {
                Nodo temp = tabla[i].getFirst();
                while (temp != null) {
                    Persona personaAct = (Persona) temp.getData();
                    if (personaAct.getTituloMobiliario()!= null) {
                        if (personaAct.getTituloMobiliario().toLowerCase().contains(titulo.toLowerCase())) {
                            personasFiltradas.aggFinal(personaAct);
                        }
                    }
                    temp = temp.getnext();
                }

            }
        }

        return personasFiltradas;
    }

    /**
    * Inserta un nuevo dato en la tabla hash si no existe ya.
    * 
    * @param clave La clave asociada al dato.
    * @param dato El dato a insertar.
    */
    public void insertar(String clave, Object dato){
        int index = this.obtenerIndice(clave);
        ListaSimple listaInIndex = tabla[index];
        if(this.buscar(clave) == null){
            listaInIndex.aggFinal(dato);
        }
    }
    
    /**
    * Muestra el contenido de la tabla hash en consola.
    */
    public void mostrar(){
        String hashTableStr = "Tabla Hash: \n";
        for(int i = 0; i< this.size; i++) {
            if(!tabla[i].isEmpty()){
                hashTableStr += "Indice: " + i + ": ";
                for(int j = 0; j < tabla[i].getSize(); j++){
                    Persona personaActual = (Persona) tabla[i].getValor(j);
                    if(personaActual.getMote() != null){
                        hashTableStr += personaActual.getMote() + "-->";
                    } else{
                        hashTableStr += personaActual.getNombre() + " " + personaActual.getNumeral() + "-->";
                    }
                }
                hashTableStr += "null" + "\n";
            }
        }
        System.out.println(hashTableStr);
    }
    
    /**
    * Vacía el contenido de la tabla hash, reiniciándola.
    */
    public void vaciar(){
        this.iniciar();
    }
    
}
