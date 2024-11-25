/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import Clases.ArbolLinaje;
import EDD.Arbol;
import EDD.NodoArbol;
import Interfaces.Menu;
import Clases.Persona;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.swing_viewer.ViewPanel;
import org.graphstream.ui.view.Viewer;

/**
 *
 * @author Alejandra Oporto
 */


public class MostrarArbol extends JFrame{
    private Arbol arbol;
    private Viewer visor;
    private ViewPanel panelVista;
    
    public MostrarArbol(Arbol arbol) {
        this.arbol = arbol;
        setearInterfaz();
        iniciarInterfaz();
        volverMenu();
    }

    private void setearInterfaz() {
        setTitle("Visualizador de Árbol");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
    }

    private void iniciarInterfaz() {
        Graph arbolVisual = new SingleGraph("Árbol");
        generarArbol(arbolVisual);


        visor = arbolVisual.display(false);
        visor.enableAutoLayout();

        if (panelVista == null) {
            panelVista = (ViewPanel) visor.getDefaultView();
            add(panelVista, BorderLayout.CENTER);
        }

       
    }

    private void generarArbol(Graph arbolVisual) {
        if (arbol.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Arbol vacío.");
            return;
        }


        insertarNodoYSubarbol(arbol.getRoot(), null, arbolVisual);
        
        arbolVisual.setAttribute("ui.stylesheet",
                "node { text-size: 14px; size: 30px; text-alignment: center; fill-color: yellow; }"
                        + "edge { size: 2px; }");
    }

    private void insertarNodoYSubarbol(NodoArbol nodoActual, String padreId, Graph arbolVisual) {
        Persona persona = (Persona) nodoActual.getDato();
        String nodoId = persona.getNombreUnico();

        // Verificar si el nodo ya existe
        if (arbolVisual.getNode(nodoId) == null) {
            org.graphstream.graph.Node nodoVisual = arbolVisual.addNode(nodoId);
            nodoVisual.setAttribute("ui.label", persona.getNombreUnico());
            nodoVisual.setAttribute("persona", persona); // Guardar información de la persona en el nodo
        }

        // Conectar con el padre si existe
        if (padreId != null && arbolVisual.getEdge(padreId + "-" + nodoId) == null) {
            arbolVisual.addEdge(padreId + "-" + nodoId, padreId, nodoId);
        }

        // Recursivamente añadir los hijos
        for (int i = 0; i < nodoActual.getHijos().getSize(); i++) {
            NodoArbol hijo = (NodoArbol) nodoActual.getHijos().getValor(i);
            insertarNodoYSubarbol(hijo, nodoId, arbolVisual);
        }
    }

    private void mostrarInfoPersona(Persona persona) {
        String info = "Información de la Persona:\n"
                + "Nombre: " + persona.getNombre()+ "\n"
                + "Padre: " + persona.getPadre() + "\n"
                + "Madre: " + persona.getMadre();
        JOptionPane.showMessageDialog(this, info, "Detalles de Persona", JOptionPane.INFORMATION_MESSAGE);
    }

   /**
     * Configura el botón para volver al menú principal.
     */
    private void volverMenu() {
        JButton botonRegresar = new JButton("Volver al Menu");
        botonRegresar.addActionListener(e -> {
            CerrarVentana();
            this.dispose();
            Menu menu = new Menu();
            menu.setVisible(true);
            menu.setLocationRelativeTo(null);
            menu.setResizable(false);
        });
        add(botonRegresar, BorderLayout.SOUTH);
    }

     /**
     * Cierra la ventana del visor.
     */
    private void CerrarVentana() {
        if (visor != null) {
            visor.disableAutoLayout();
            visor.close();
        }
        if (panelVista != null) {
            remove(panelVista);
            panelVista = null;
        }
    }
}
