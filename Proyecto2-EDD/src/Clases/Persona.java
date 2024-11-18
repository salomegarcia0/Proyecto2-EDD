/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author salom
 */
public class Persona {
    String nombre;
    String numeral;
    String padre;
    String madre;
    String mote;
    String tituloNobiliario;
    String esposa;
    String colorOjos;
    String colorPelo;
    String comentariosVida;
    String comentariosMuerte;
    
    /**
     * 
     */
    public Persona() {
        this.nombre = null;
        this.numeral = null;
        this.padre = null;
        this.madre = null;
        this.mote = null;
        this.tituloNobiliario = null;
        this.esposa = null;
        this.colorOjos = null;
        this.colorPelo = null;
        this.comentariosVida = null;
        this.comentariosMuerte = null;
    }
 
    //getters y setters
    /**
     * 
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * 
     * @return 
     */
    public String getNumeral() {
        return numeral;
    }
    
    /**
     * 
     * @param numeral 
     */
    public void setNumeral(String numeral) {
        this.numeral = numeral;
    }
    
    /**
     * 
     * @return 
     */
    public String getPadre() {
        return padre;
    }
    
    /**
     * 
     * @param padre 
     */
    public void setPadre(String padre) {
        this.padre = padre;
    }

    /**
     * 
     * @return 
     */
    public String getMadre() {
        return madre;
    }
    
    /**
     * 
     * @param madre 
     */
    public void setMadre(String madre) {
        this.madre = madre;
    }

    /**
     * 
     * @return 
     */
    public String getMote() {
        return mote;
    }

    /**
     * 
     * @param mote 
     */
    public void setMote(String mote) {
        this.mote = mote;
    }

    /**
     * 
     * @return 
     */
    public String getTituloMobiliario() {
        return tituloNobiliario;
    }

    /**
     * 
     * @param tituloMobiliario 
     */
    public void setTituloMobiliario(String tituloMobiliario) {
        this.tituloNobiliario = tituloMobiliario;
    }

    /**
     * 
     * @return 
     */
    public String getEsposa() {
        return esposa;
    }
    
    /**
     * 
     * @param esposa 
     */
    public void setEsposa(String esposa) {
        this.esposa = esposa;
    }
    
    /**
     * 
     * @return 
     */
    public String getColorOjos() {
        return colorOjos;
    }

    /**
     * 
     * @param colorOjos 
     */
    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    /**
     * 
     * @return 
     */
    public String getColorPelo() {
        return colorPelo;
    }

    /**
     * 
     * @param colorPelo 
     */
    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    /**
     * 
     * @return 
     */
    public String getComentariosVida() {
        return comentariosVida;
    }

    /**
     * 
     * @param comentariosVida 
     */
    public void setComentariosVida(String comentariosVida) {
        this.comentariosVida = comentariosVida;
    }

    /**
     * 
     * @return 
     */
    public String getComentariosMuerte() {
        return comentariosMuerte;
    }

    /**
     * 
     * @param comentariosMuerte 
     */
    public void setComentariosMuerte(String comentariosMuerte) {
        this.comentariosMuerte = comentariosMuerte;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nnombre: ").append(nombre);
        sb.append("\nnumeral: ").append(numeral);
        sb.append("\npadre: ").append(padre);
        sb.append("\nmadre: ").append(madre);
        sb.append("\nmote: ").append(mote);
        sb.append("\ntituloNobiliario: ").append(tituloNobiliario);
        sb.append("\nesposa: ").append(esposa);
        sb.append("\ncolor de Ojos: ").append(colorOjos);
        sb.append("\ncolor dePelo: ").append(colorPelo);
        sb.append("\ncomentarios de su Vida: ").append(comentariosVida);
        sb.append("\nComentarios de su Muerte:  ").append(comentariosMuerte);
        return sb.toString();
    }
    
}
