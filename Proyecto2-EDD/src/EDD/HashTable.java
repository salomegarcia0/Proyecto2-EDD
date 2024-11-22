/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import Clases.Persona;

/**
 *
 * @author salom
 */
public class HashTable {
    private ListaSimple[] tabla;
    private int size;
    
    /**
     * 
     * @param size 
     */
    public HashTable(int size) {
        this.size = size;
        this.tabla = new ListaSimple[size];
        this.iniciar();
    }
    
    private void iniciar(){
        for (int i = 0; i < size; i++){
            tabla[i] = new ListaSimple();
        }
    }
    
    //gettet
    public int getSize() {
        return size;
    }
    
    //setter
    public void setSize(int size) {
        this.size = size;
    }
    
    private int hash(String clave){
        return Math.abs(clave.hashCode());
    }
    
    /**
     * 
     * @param clave
     * @return 
     */
    public int obtenerIndice(String clave) {
        return this.hash(clave) % size;
    }
    
    /**
     * 
     * @param clave
     * @return 
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
     * 
     * @param clave
     * @param dato 
     */
    public void insertar(String clave, Object dato){
        int index = this.obtenerIndice(clave);
        ListaSimple listaInIndex = tabla[index];
        if(this.buscar(clave) == null){
            listaInIndex.aggFinal(dato);
        }
    }
    
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
    
    public void vaciar(){
        this.iniciar();
    }
    
}
