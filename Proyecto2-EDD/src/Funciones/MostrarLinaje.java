/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import EDD.ListaSimple;
import EDD.Nodo;
import Interfaces.Menu;
import Clases.Persona;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.swing_viewer.ViewPanel;
import org.graphstream.ui.view.Viewer;

/**
 * 
 * @author Alejandra Oporto
 */
public class MostrarLinaje extends JFrame {

    private ListaSimple linaje;
    private Viewer visor;
    private ViewPanel panelVista;

    public MostrarLinaje(ListaSimple antepasados) {
        this.linaje = antepasados;
        configurarInterfaz();
        inicializarVisor();
        agregarBotonCerrar();
    }

    private void configurarInterfaz() {
        setTitle("Visualizador de Antepasados");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
    }

    private void inicializarVisor() {
        Graph grafo = new MultiGraph("Antepasados");
        construirGrafo(grafo);

    
        visor = grafo.display(false);
        visor.enableAutoLayout();
        if (panelVista == null) {
            panelVista = (ViewPanel) visor.getDefaultView();
            add(panelVista, BorderLayout.CENTER);
        }
    }

    private void construirGrafo(Graph grafo) {
        if (linaje == null || linaje.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay linaje para mostrar.", "la informacion", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Nodo aux = linaje.getFirst();
        Node nodoAnterior = null;

        while (aux != null) {
            Persona persona = (Persona) aux.getData();
            String id = persona.getNombreUnico();
            Node nodoActual = grafo.addNode(id);
            nodoActual.setAttribute("ui.label", persona.getNombreUnico());
            nodoActual.setAttribute("ui.style", "fill-color: yellow; size: 25px; text-alignment: center;");
            if (nodoAnterior != null) {
                String edgeId = nodoAnterior.getId() + "-" + nodoActual.getId();
                grafo.addEdge(edgeId, nodoAnterior.getId(), nodoActual.getId());
            }
            nodoAnterior = nodoActual;
            aux = aux.getnext();
        }
        grafo.setAttribute("ui.stylesheet",
                "node { text-size: 16px; }" +
                        "edge { size: 2px; }");
    }
    
    private void agregarBotonCerrar() {
        JButton botonCerrar = new JButton("Cerrar");
        botonCerrar.addActionListener(e -> cerrarVentana());
        add(botonCerrar, BorderLayout.SOUTH);
    }

    private void cerrarVentana() {
        if (visor != null) {
            visor.disableAutoLayout();
            visor.close();
        }
        if (panelVista != null) {
            remove(panelVista);
            panelVista = null;
        }
        dispose();
        Menu menu = new Menu(); 
        menu.setVisible(true);
    }
}

