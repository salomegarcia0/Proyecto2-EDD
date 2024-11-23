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
 *
 * @author salom
 */
public class Cargar {
    private ArbolLinaje arbolLinaje;
    private boolean padreNoEncontrado;
    private boolean personaRepetida;

    public Cargar() {
        this.arbolLinaje = new ArbolLinaje();
        this.padreNoEncontrado = this.personaRepetida = false;
        
    }

    public ArbolLinaje getArbolLinaje() {
        return arbolLinaje;
    }

    public void setArbolLinaje(ArbolLinaje arbolLinaje) {
        this.arbolLinaje = arbolLinaje;
    }

    public boolean isPadreNoEncontrado() {
        return padreNoEncontrado;
    }

    public void setPadreNoEncontrado(boolean padreNoEncontrado) {
        this.padreNoEncontrado = padreNoEncontrado;
    }
    
    public boolean isPersonaRepetida() {
        return personaRepetida;
    }

    public void setPersonaRepetida(boolean personaRepetida) {
        this.personaRepetida = personaRepetida;
    }
    
    public boolean sinError(){
        return !this.padreNoEncontrado && !this.personaRepetida;
    }

    private void agregarArbol(JsonObject personaObj) { //FALTA

    }

    private void agregarHashTable(JsonObject personaObj) {
        String nombreCompleto = personaObj.keySet().iterator().next();
        JsonArray atributos = personaObj.getAsJsonArray(nombreCompleto);

        Persona personaNueva = crearPersona(nombreCompleto, atributos);

        if (personaNueva.getMote() != null) {
            String clave = personaNueva.getMote();
            this.arbolLinaje.getTablaLinaje().insertar(clave, personaNueva);
        } else {
            String clave = personaNueva.getNombre() + " " + personaNueva.getNumeral();
            this.arbolLinaje.getTablaLinaje().insertar(clave, personaNueva);
        }
    }

    private Persona crearPersona(String nombreCompleto, JsonArray atributos) {
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
    
    public void cargar(String rutaArchivo) { //FALTA FUNCION DEL ARBOL
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
}
