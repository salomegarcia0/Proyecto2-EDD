/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Clases.Persona;
import EDD.Arbol;
import Funciones.MostrarArbol;
import Funciones.Validar;
import static Interfaces.CargarArchivo.arbolApp;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author salom
 */
public class BusquedaNombres extends javax.swing.JFrame {

    DefaultComboBoxModel modeloResultado = new DefaultComboBoxModel();
    private Validar validar = new Validar();
    private Persona[] resultado;

    /**
     * Creates new form BusquedaNombres
     */
    public BusquedaNombres() {
        initComponents();
    }

    private void llenarComboBox(Persona[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            int numeroAsociado = i + 1;
            String nombreResultado = numeroAsociado + ". " + arreglo[i].getNombreUnico();
            modeloResultado.addElement(nombreResultado);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        resultadosPersona = new javax.swing.JComboBox<>();
        verInfo = new javax.swing.JPanel();
        infoBtn = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        buscarBtn = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        menuBtn = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 0));
        jLabel2.setText("BÚSQUEDA POR NOMBRE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Por favor, ingrese el nombre del familiar que desea buscar:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 390, -1));

        resultadosPersona.setBackground(new java.awt.Color(255, 255, 255));
        resultadosPersona.setModel(modeloResultado);
        jPanel1.add(resultadosPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 410, 40));

        verInfo.setBackground(new java.awt.Color(0, 51, 0));
        verInfo.setForeground(new java.awt.Color(255, 255, 255));
        verInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        infoBtn.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        infoBtn.setForeground(new java.awt.Color(255, 255, 255));
        infoBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoBtn.setText("VER INFORMACIÓN");
        infoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        infoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout verInfoLayout = new javax.swing.GroupLayout(verInfo);
        verInfo.setLayout(verInfoLayout);
        verInfoLayout.setHorizontalGroup(
            verInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(infoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        verInfoLayout.setVerticalGroup(
            verInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(infoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(verInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 200, 50));

        jPanel2.setBackground(new java.awt.Color(0, 51, 0));

        buscarBtn.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        buscarBtn.setForeground(new java.awt.Color(255, 255, 255));
        buscarBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarBtn.setText("BUSCAR");
        buscarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 110, 50));

        jPanel4.setBackground(new java.awt.Color(0, 51, 0));
        jPanel4.setForeground(new java.awt.Color(0, 51, 0));

        menuBtn.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        menuBtn.setForeground(new java.awt.Color(255, 255, 255));
        menuBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuBtn.setText("MENÚ");
        menuBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 200, 50));

        inputNombre.setBackground(new java.awt.Color(255, 255, 255));
        inputNombre.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        inputNombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(inputNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 280, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/3.png"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBtnMouseClicked
        Menu menu = new Menu();
        menu.setLocationRelativeTo(null);
        menu.setResizable(false);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuBtnMouseClicked

    private void infoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoBtnMouseClicked
        if (resultado != null) {
            String seleccion = (String) resultadosPersona.getSelectedItem();
            //System.out.println(seleccion);
            String[] separarSeleccion = seleccion.split(". ");
            //System.out.println(Arrays.toString(separarSeleccion));
            int numero = validar.validarNumeros(separarSeleccion[0]) - 1;
            

            Arbol descendiente = new Arbol();
            descendiente.setRoot(arbolApp.getArbolL().buscar(resultado[numero].getNombreUnico()));

            System.setProperty("org.graphstream.ui", "swing");
            MostrarArbol mostarArbol = new MostrarArbol(descendiente);
            mostarArbol.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "No hay resultados para ver detalles.");
        }
    }//GEN-LAST:event_infoBtnMouseClicked

    private void buscarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBtnMouseClicked
        if (!inputNombre.getText().isEmpty()) {
            String nombreBuscado = inputNombre.getText();
            if (arbolApp.buscarNombre(nombreBuscado) != null) {
                resultado = arbolApp.buscarNombre(nombreBuscado);
                this.llenarComboBox(arbolApp.buscarNombre(nombreBuscado));
            } else {
                resultado = null;
                JOptionPane.showMessageDialog(null, "No se encontraron resultados de la busqueda.");
            }
            inputNombre.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Debe de ingresar un nombre.");
        }
    }//GEN-LAST:event_buscarBtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BusquedaNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusquedaNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusquedaNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusquedaNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusquedaNombres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscarBtn;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel infoBtn;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel menuBtn;
    private javax.swing.JComboBox<String> resultadosPersona;
    private javax.swing.JPanel verInfo;
    // End of variables declaration//GEN-END:variables
}
