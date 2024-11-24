/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

/**
 * La clase Validar proporciona métodos para la validación de datos de entrada,
 * incluyendo la validación de números y el control de índices dentro de un rango
 * especificado. Se utiliza para asegurar que los valores proporcionados cumplan 
 * con los criterios esperados.
 * 
 * @author salom
 */
public class Validar {
    
    /**
     * Valida si una cadena representa un número entero positivo o negativo.
     * 
     * @param num La cadena que se desea validar.
     * @return true si la cadena contiene solo dígitos (0-9).
     */
    private boolean validarnumeros(String num){
        return num.matches("[0-9]*");
    }
    
    /**
     * Valida si una cadena que representa un número entero es válida y la convierte
     * en un valor numérico. Si la cadena no es un número válido, retorna -1.
     * 
     * @param numero La cadena que representa el número a validar.
     * @return El número entero si la cadena es válida.
     */
    public int validarNumeros(String numero){
        if(validarnumeros(numero) == true){
            int num = Integer.parseInt(numero);
            return num;
        }else{
            return -1; // Retorna -1 si la cadena no es un número válido.
        }
    }
    
    /**
     * Verifica si un índice está dentro de un rango específico.
     * 
     * @param max El valor máximo permitido para el índice.
     * @param min El valor mínimo permitido para el índice.
     * @param indice El índice a verificar.
     * @return true si el índice está dentro del rango [min, max], false en caso contrario.
     */
    public boolean validarIndice(int max, int min, int indice){
        return indice >= min && indice <= max;
    }
}
