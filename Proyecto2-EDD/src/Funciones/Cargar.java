/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import Clases.ArbolLinaje;
import Clases.Persona;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase encargada de cargar y procesar datos de personas desde un archivo JSON.
 * Esta clase crea un árbol de linaje a partir de la información contenida en el archivo
 * y maneja posibles errores como la repetición de personas o la falta de un padre para algún individuo.
 * 
 * @author salom
 */
public class Cargar {   
 // Atributos
    private ArbolLinaje arbolLinaje; // Árbol de linaje que almacenará la información de las personas.
    private boolean padreNoEncontrado; // Indica si se ha encontrado un padre desconocido para una persona.
    private boolean personaRepetida; // Indica si se ha encontrado una persona repetida.

    /**
     * Constructor de la clase Cargar. Inicializa el árbol de linaje y los estados de errores.
     */
    public Cargar() {
        this.arbolLinaje = new ArbolLinaje();
        this.padreNoEncontrado = this.personaRepetida = false;
        
    }

    /**
    * Obtiene el objeto ArbolLinaje asociado a esta clase.
    * 
    * @return El objeto ArbolLinaje que almacena la información de linaje.
    */
    public ArbolLinaje getArbolLinaje() {
        return arbolLinaje;
    }

    /**
    * Establece el objeto ArbolLinaje para esta clase.
    * 
    * @param arbolLinaje El objeto ArbolLinaje que se asignará a esta clase.
    */

    public void setArbolLinaje(ArbolLinaje arbolLinaje) {
        this.arbolLinaje = arbolLinaje;
    }

    /**
    * Obtiene el estado de la variable que indica si se ha encontrado un padre desconocido
    * para alguna persona al procesar los datos.
    * 
    * @return true si un padre desconocido fue encontrado, false de lo contrario.
    */
    public boolean isPadreNoEncontrado() {
        return padreNoEncontrado;
    }

    /**
    * Establece el estado de la variable que indica si se ha encontrado un padre desconocido
    * para alguna persona al procesar los datos.
    * 
    * @param padreNoEncontrado true si se encontró un padre desconocido, false de lo contrario.
    */
    public void setPadreNoEncontrado(boolean padreNoEncontrado) {
        this.padreNoEncontrado = padreNoEncontrado;
    }
    
    /**
    * Obtiene el estado de la variable que indica si se ha encontrado una persona repetida
    * al procesar los datos.
    * 
    * @return true si se encontró una persona repetida, false de lo contrario.
    */
    public boolean isPersonaRepetida() {
        return personaRepetida;
    }

    /**
    * Establece el estado de la variable que indica si se ha encontrado una persona repetida
    * al procesar los datos.
    * 
    * @param personaRepetida true si se encontró una persona repetida, false de lo contrario.
    */
    public void setPersonaRepetida(boolean personaRepetida) {
        this.personaRepetida = personaRepetida;
    }

    /**
    * Carga los datos de un archivo JSON que contiene información sobre casas y personas.
    * La información se procesa y se agrega tanto a la tabla de linaje como al árbol de linaje.
    * 
    * @param rutaArchivo Ruta del archivo JSON desde donde se leerán los datos.
    */
    public void cargar(String rutaArchivo) {
        this.setPadreNoEncontrado(false);
        this.setPersonaRepetida(false);
        try (FileReader reader = new FileReader(rutaArchivo)) {
            Gson gson = new Gson();
            JsonObject jsonObj = gson.fromJson(reader, JsonObject.class);

            for (String nombreCasa : jsonObj.keySet()) {
                JsonArray miembros = jsonObj.getAsJsonArray(nombreCasa);
                arbolLinaje.setNombreLinaje(nombreCasa);
                for (JsonElement miembro : miembros) {
                    JsonObject personaObj = miembro.getAsJsonObject();
                    this.agregarHashTable(personaObj);
                }
            }

            // Luego, procesamos las personas para el árbol de linaje
            for (String nombreCasa : jsonObj.keySet()) {
                JsonArray miembros = jsonObj.getAsJsonArray(nombreCasa);
                for (JsonElement miembro : miembros) {
                    JsonObject personaObj = miembro.getAsJsonObject();
                    this.agregarArbol(personaObj);
                }
            }
            
           if(!this.sinError()){
               arbolLinaje.destruir();
           }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
   
    /**
    * Verifica si no se han encontrado errores al procesar los datos.
    * Los errores se definen como la ausencia de un padre válido o la duplicación de una persona.
    * 
    * @return true si no se ha encontrado ningún error, false si se ha encontrado un error.
    */
    public boolean sinError(){
        return !this.padreNoEncontrado && !this.personaRepetida; 
    }

    /**
    * Agrega una nueva persona al árbol de linaje basado en los datos proporcionados en el objeto JSON.
    * Si la persona tiene un padre que no se encuentra, marca un error.
    * Si la persona ya existe en el árbol, marca un error por persona repetida.
    * 
    * @param personaObj El objeto JSON que representa la persona a agregar.
    */
    private void agregarArbol(JsonObject personaObj){
        // Obtiene el nombre completo de la persona y sus atributos
        String nombreCompleto = personaObj.keySet().iterator().next();
        JsonArray atributos = personaObj.getAsJsonArray(nombreCompleto);

        // Crea un nuevo objeto Persona con los atributos proporcionados
        Persona personaNueva = crearPersona(nombreCompleto, atributos);

        // Verifica si la persona ya existe en el árbol de linaje
        if (this.arbolLinaje.getArbolL().buscar(personaNueva.getNombreUnico()) == null) {
            // Si el padre es desconocido, crea la raíz del árbol
            if (personaNueva.getPadre().equalsIgnoreCase("[Unknown]")) {
                this.arbolLinaje.getArbolL().crearRaiz(personaNueva);
            } else {
                // Si el padre está en la lista, inserta a la persona en el árbol
                if (personaNueva.getPadre().contains("of his name")) {
                    personaNueva.setPadre(personaNueva.getPadre().replaceAll("of his name", "").replaceAll(",", "").trim());

                    if (!this.arbolLinaje.getArbolL().insertar(personaNueva.getPadre(), personaNueva)) {
                        this.setPadreNoEncontrado(true);

                    }
                } else {

                    if (!this.arbolLinaje.getArbolL().insertar(personaNueva.getPadre(), personaNueva)) {
                        this.setPadreNoEncontrado(true);
                    }
                }
            }
        } else {
            this.setPersonaRepetida(true); // Marca el error si la persona ya existe
        }

    }

    /**
    * Agrega una nueva persona a la tabla hash del linaje, utilizando un mote o una combinación
    * del nombre y numeral como clave para identificar a la persona.
    * 
    * @param personaObj El objeto JSON que representa la persona a agregar.
    */
    private void agregarHashTable(JsonObject personaObj) {
        // Obtiene el nombre completo de la persona y sus atributos
        String nombreCompleto = personaObj.keySet().iterator().next();
        JsonArray atributos = personaObj.getAsJsonArray(nombreCompleto);

        // Crea un nuevo objeto Persona con los atributos proporcionados
        Persona personaNueva = crearPersona(nombreCompleto, atributos);

        // Determina la clave de la persona basada en el mote o nombre + numeral
        if (personaNueva.getMote() != null) {
            String clave = personaNueva.getMote();
            this.arbolLinaje.getTablaLinaje().insertar(clave, personaNueva); // Inserta en la tabla hash
        } else {
            String clave = personaNueva.getNombre() + " " + personaNueva.getNumeral();
            this.arbolLinaje.getTablaLinaje().insertar(clave, personaNueva); // Inserta en la tabla hash
        }
    }

    /**
    * Crea un objeto Persona utilizando el nombre completo y los atributos proporcionados en el objeto JSON.
    * 
    * @param nombreCompleto El nombre completo de la persona.
    * @param atributos El conjunto de atributos que describen a la persona.
    * @return Un objeto Persona creado con los atributos extraídos del JSON.
    */
    private Persona crearPersona(String nombreCompleto, JsonArray atributos) {
        // Inicializa los atributos de la persona con valores predeterminados
        String numeral = null;
        String padre = null;
        String madre = null;
        String mote = null;
        String titulo = null;
        String esposa = null;
        String colorOjos = null;
        String colorCabello = null;
        String comentariosVida = null;
        String comentariosMuerte = null;

        for (JsonElement atributoElem : atributos) {
            JsonObject atributo = atributoElem.getAsJsonObject();
            if (atributo.has("Of his name")) {
                numeral = atributo.get("Of his name").getAsString();
            } else if (atributo.has("Born to")) {
                String parent = atributo.get("Born to").getAsString();
                if (padre == null) {
                    padre = parent;
                } else {
                    madre = parent;
                }
            } else if (atributo.has("Known throughout as")) {
                mote = atributo.get("Known throughout as").getAsString();
            } else if (atributo.has("Held title")) {
                titulo = atributo.get("Held title").getAsString();
            } else if (atributo.has("Wed to")) {
                esposa = atributo.get("Wed to").getAsString();
            } else if (atributo.has("Of eyes")) {
                colorOjos = atributo.get("Of eyes").getAsString();
            } else if (atributo.has("of hair")) {
                colorCabello = atributo.get("of hair").getAsString();
            } else if (atributo.has("of hair")) {
                colorCabello = atributo.get("of hair").getAsString();
            } else if (atributo.has("of hair")) {
                colorCabello = atributo.get("of hair").getAsString();
            } else if (atributo.has("Notes")) {
                comentariosVida = atributo.get("Notes").getAsString();
            } else if (atributo.has("Fate")) {
                comentariosMuerte = atributo.get("Fate").getAsString();
            }
        }
        return new Persona(nombreCompleto, numeral, padre, madre, mote, titulo, esposa, colorOjos, colorCabello, comentariosVida, comentariosMuerte);
    } 

}