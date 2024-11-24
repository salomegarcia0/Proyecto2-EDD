/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 * La clase Persona representa a una persona con información detallada
 * como su nombre, genealogía, características físicas, y comentarios
 * sobre su vida y muerte.
 * 
 * @author salom
 */
public class Persona {
    /**
     * Nombre de la persona.
     */
    String nombre;
    
    /**
     * Identificacion numeral de la persona.
     */
    String numeral;
    
    /**
     * Nombre del padre de la persona.
     */
    String padre;
    
    /**
     * Nombre de la madre de la persona.
     */
    String madre;
    
    /**
     * Apodo o mote de la persona.
     */
    String mote;
    
    /**
     * Título nobiliario de la persona, si corresponde.
     */
    String tituloNobiliario;
    
    /**
     * Nombre de la esposa de la persona, si corresponde.
     */
    String esposa;
    
    /**
     * Color de ojos de la persona.
     */
    String colorOjos;
    
    /**
     * Color de pelo de la persona.
     */
    String colorPelo;
    
    /**
     * Comentarios generales sobre la vida de la persona.
     */
    String comentariosVida;
    
    /**
     * Comentarios generales sobre la muerte de la persona.
     */
    String comentariosMuerte;
    
    /**
    * Constructor de la clase Persona.
    * 
    * Este constructor inicializa todos los atributos de la clase `Persona` con los valores proporcionados.
    * Cada parámetro corresponde a un atributo específico de la persona, como su nombre, numeral, padres, 
    * mote, título nobiliario, esposa, color de ojos, color de pelo, y comentarios sobre su vida y muerte.
    * 
    * @param nombre El nombre de la persona.
    * @param numeral El numeral asociado a la persona.
    * @param padre El nombre del padre de la persona.
    * @param madre El nombre de la madre de la persona.
    * @param mote Un mote o apodo de la persona.
    * @param tituloNobiliario El título nobiliario de la persona (si aplica).
    * @param esposa El nombre de la esposa de la persona (si aplica).
    * @param colorOjos El color de ojos de la persona.
    * @param colorPelo El color de pelo de la persona.
    * @param comentariosVida Comentarios relacionados con la vida de la persona.
    * @param comentariosMuerte Comentarios relacionados con la muerte de la persona.
    */
    public Persona(String nombre, String numeral, String padre, String madre, String mote, String tituloNobiliario, String esposa, String colorOjos, String colorPelo, String comentariosVida, String comentariosMuerte) {
        this.nombre = nombre;
        this.numeral = numeral;
        this.padre = padre;
        this.madre = madre;
        this.mote = mote;
        this.tituloNobiliario = tituloNobiliario;
        this.esposa = esposa;
        this.colorOjos = colorOjos;
        this.colorPelo = colorPelo;
        this.comentariosVida = comentariosVida;
        this.comentariosMuerte = comentariosMuerte;
    }
    
    // Métodos getters y setters
    /**
     * Obtiene el nombre de la persona.
     * 
     * @return el nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     * 
     * @param nombre el nuevo nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el numeral identificador de la persona.
     * 
     * @return el numeral de la persona.
     */
    public String getNumeral() {
        return numeral;
    }

    /**
     * Establece el numeral identificador de la persona.
     * 
     * @param numeral el nuevo numeral de la persona.
     */
    public void setNumeral(String numeral) {
        this.numeral = numeral;
    }

    /**
     * Obtiene el nombre del padre de la persona.
     * 
     * @return el nombre del padre.
     */
    public String getPadre() {
        return padre;
    }

    /**
     * Establece el nombre del padre de la persona.
     * 
     * @param padre el nuevo nombre del padre.
     */
    public void setPadre(String padre) {
        this.padre = padre;
    }

    /**
     * Obtiene el nombre de la madre de la persona.
     * 
     * @return el nombre de la madre.
     */
    public String getMadre() {
        return madre;
    }

    /**
     * Establece el nombre de la madre de la persona.
     * 
     * @param madre el nuevo nombre de la madre.
     */
    public void setMadre(String madre) {
        this.madre = madre;
    }

    /**
     * Obtiene el mote o apodo de la persona.
     * 
     * @return el mote de la persona.
     */
    public String getMote() {
        return mote;
    }

    /**
     * Establece el mote o apodo de la persona.
     * 
     * @param mote el nuevo mote de la persona.
     */
    public void setMote(String mote) {
        this.mote = mote;
    }

    /**
     * Obtiene el título nobiliario de la persona.
     * 
     * @return el título nobiliario.
     */
    public String getTituloMobiliario() {
        return tituloNobiliario;
    }

    /**
     * Establece el título nobiliario de la persona.
     * 
     * @param tituloMobiliario el nuevo título nobiliario.
     */
    public void setTituloMobiliario(String tituloMobiliario) {
        this.tituloNobiliario = tituloMobiliario;
    }

    /**
     * Obtiene el nombre de la esposa de la persona.
     * 
     * @return el nombre de la esposa.
     */
    public String getEsposa() {
        return esposa;
    }

    /**
     * Establece el nombre de la esposa de la persona.
     * 
     * @param esposa el nuevo nombre de la esposa.
     */
    public void setEsposa(String esposa) {
        this.esposa = esposa;
    }

    /**
     * Obtiene el color de ojos de la persona.
     * 
     * @return el color de ojos.
     */
    public String getColorOjos() {
        return colorOjos;
    }

    /**
     * Establece el color de ojos de la persona.
     * 
     * @param colorOjos el nuevo color de ojos.
     */
    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    /**
     * Obtiene el color de pelo de la persona.
     * 
     * @return el color de pelo.
     */
    public String getColorPelo() {
        return colorPelo;
    }

    /**
     * Establece el color de pelo de la persona.
     * 
     * @param colorPelo el nuevo color de pelo.
     */
    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    /**
     * Obtiene los comentarios sobre la vida de la persona.
     * 
     * @return los comentarios de la vida.
     */
    public String getComentariosVida() {
        return comentariosVida;
    }

    /**
     * Establece los comentarios sobre la vida de la persona.
     * 
     * @param comentariosVida los nuevos comentarios de la vida.
     */
    public void setComentariosVida(String comentariosVida) {
        this.comentariosVida = comentariosVida;
    }

    /**
     * Obtiene los comentarios sobre la muerte de la persona.
     * 
     * @return los comentarios de la muerte.
     */
    public String getComentariosMuerte() {
        return comentariosMuerte;
    }

    /**
     * Establece los comentarios sobre la muerte de la persona.
     * 
     * @param comentariosMuerte los nuevos comentarios de la muerte.
     */
    public void setComentariosMuerte(String comentariosMuerte) {
        this.comentariosMuerte = comentariosMuerte;
    }
    
    /**
    * Obtiene un nombre único para identificar al objeto actual.
    * 
    * Si el objeto tiene un mote asignado, se devuelve ese mote. 
    * De lo contrario, se genera un nombre único concatenando el nombre 
    * del objeto con su numeral.
    * 
    * @return un nombre único, ya sea el mote (si está disponible) 
    *         o una combinación del nombre y el numeral.
    */
    public String getNombreUnico(){
        if(this.mote != null){
            return this.mote;
        }
        
        return this.getNombre() + " " + this.getNumeral();
    }

    /**
     * Retorna una representación textual de los datos de la persona.
     * 
     * @return una cadena con los datos de la persona.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nnombre: ").append(nombre);
        sb.append("\nnumeral: ").append(numeral);
        sb.append("\npadre: ").append(padre);
        sb.append("\nmadre: ").append(madre);
        sb.append("\nmote: ").append(mote);
        sb.append("\ntituloNobiliario: ").append(tituloNobiliario);
        sb.append("\nesposa: ").append(esposa);
        sb.append("\ncolor de Ojos: ").append(colorOjos);
        sb.append("\ncolor de Pelo: ").append(colorPelo);
        sb.append("\ncomentarios de su Vida: ").append(comentariosVida);
        sb.append("\nComentarios de su Muerte: ").append(comentariosMuerte);
        return sb.toString();
    }

}
