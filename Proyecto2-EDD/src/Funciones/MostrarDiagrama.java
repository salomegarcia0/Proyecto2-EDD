/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import Interfaces.Menu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author salom
 */

public class MostrarDiagrama extends JFrame {

    private JLabel labelImagen;
    private JButton botonRegresar;

   
    public MostrarDiagrama(String diagrama) {
        inicializarVentana();
        mostrarImagen(diagrama);
        crearBotonMenu();
    }

    private void inicializarVentana() {
        setTitle("Mostrar Diagrama");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
    }

    
    private void mostrarImagen(String nombreImagen) {
        labelImagen = new JLabel();
        labelImagen.setHorizontalAlignment(JLabel.CENTER);
        labelImagen.setVerticalAlignment(JLabel.CENTER);

        ImageIcon imagenOriginal = new ImageIcon(getClass().getResource("/Imagenes/" + nombreImagen));
        ajustarTamanoVentana(imagenOriginal);

        Image imagenEscalada = imagenOriginal.getImage().getScaledInstance(
                getWidth(), getHeight() - 50, Image.SCALE_SMOOTH);
        labelImagen.setIcon(new ImageIcon(imagenEscalada));
        add(labelImagen, BorderLayout.CENTER);
    }

    
    private void ajustarTamanoVentana(ImageIcon imagenOriginal) {
        int anchoVentana = Math.min(imagenOriginal.getIconWidth(), 800);
        int altoVentana = Math.min(imagenOriginal.getIconHeight(), 600);
        setSize(anchoVentana, altoVentana + 50); // +50 para el botón
    }

    
    private void crearBotonMenu() {
        botonRegresar = new JButton("Regresar al Menú");
        botonRegresar.addActionListener(e -> regresarAlMenu());
        add(botonRegresar, BorderLayout.SOUTH);
    }

    
    private void regresarAlMenu() {
        dispose(); // Cerrar la ventana actual
        new Menu().setVisible(true); // Mostrar el menú principal
    }
}