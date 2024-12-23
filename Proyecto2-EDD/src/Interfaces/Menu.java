/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import EDD.Arbol;
import Funciones.MostrarArbol;
import javax.swing.JOptionPane;
import static Interfaces.CargarArchivo.arbolApp;

/**
 *
 * @author salom
 */
public class Menu extends javax.swing.JFrame {
    private Arbol arbol;
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        arbol = new Arbol();
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
        salirPnl = new javax.swing.JPanel();
        salirBtn = new javax.swing.JLabel();
        cargarArchivoPnl = new javax.swing.JPanel();
        cargarArchivoBtn = new javax.swing.JLabel();
        buscarPnl = new javax.swing.JPanel();
        buscarTituloBtn = new javax.swing.JLabel();
        buscarAntepasdosPnl = new javax.swing.JPanel();
        buscarNombresBtn = new javax.swing.JLabel();
        mostrarArbolPnl = new javax.swing.JPanel();
        mostrarArbolBtn = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        mostrarAntepasadosBtn = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        mostrarGeneracionesBtn = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        verDiagramabtn = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salirPnl.setBackground(new java.awt.Color(0, 51, 0));

        salirBtn.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        salirBtn.setForeground(new java.awt.Color(255, 255, 255));
        salirBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salirBtn.setText("SALIR");
        salirBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout salirPnlLayout = new javax.swing.GroupLayout(salirPnl);
        salirPnl.setLayout(salirPnlLayout);
        salirPnlLayout.setHorizontalGroup(
            salirPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salirPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(salirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );
        salirPnlLayout.setVerticalGroup(
            salirPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salirPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(salirPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 340, 50));

        cargarArchivoPnl.setBackground(new java.awt.Color(0, 51, 0));

        cargarArchivoBtn.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        cargarArchivoBtn.setForeground(new java.awt.Color(255, 255, 255));
        cargarArchivoBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cargarArchivoBtn.setText("CARGAR ARCHIVO");
        cargarArchivoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cargarArchivoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cargarArchivoBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cargarArchivoPnlLayout = new javax.swing.GroupLayout(cargarArchivoPnl);
        cargarArchivoPnl.setLayout(cargarArchivoPnlLayout);
        cargarArchivoPnlLayout.setHorizontalGroup(
            cargarArchivoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cargarArchivoBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );
        cargarArchivoPnlLayout.setVerticalGroup(
            cargarArchivoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cargarArchivoPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cargarArchivoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
        );

        jPanel1.add(cargarArchivoPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 340, 50));

        buscarPnl.setBackground(new java.awt.Color(0, 51, 0));

        buscarTituloBtn.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        buscarTituloBtn.setForeground(new java.awt.Color(255, 255, 255));
        buscarTituloBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarTituloBtn.setText("BÚSQUEDA POR TITULO");
        buscarTituloBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarTituloBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarTituloBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout buscarPnlLayout = new javax.swing.GroupLayout(buscarPnl);
        buscarPnl.setLayout(buscarPnlLayout);
        buscarPnlLayout.setHorizontalGroup(
            buscarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscarPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buscarTituloBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );
        buscarPnlLayout.setVerticalGroup(
            buscarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscarPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buscarTituloBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(buscarPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 340, 50));

        buscarAntepasdosPnl.setBackground(new java.awt.Color(0, 51, 0));

        buscarNombresBtn.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        buscarNombresBtn.setForeground(new java.awt.Color(255, 255, 255));
        buscarNombresBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarNombresBtn.setText("BÚSQUEDA POR NOMBRE");
        buscarNombresBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarNombresBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarNombresBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout buscarAntepasdosPnlLayout = new javax.swing.GroupLayout(buscarAntepasdosPnl);
        buscarAntepasdosPnl.setLayout(buscarAntepasdosPnlLayout);
        buscarAntepasdosPnlLayout.setHorizontalGroup(
            buscarAntepasdosPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarNombresBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );
        buscarAntepasdosPnlLayout.setVerticalGroup(
            buscarAntepasdosPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarNombresBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(buscarAntepasdosPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 340, 50));

        mostrarArbolPnl.setBackground(new java.awt.Color(0, 51, 0));
        mostrarArbolPnl.setForeground(new java.awt.Color(0, 51, 0));

        mostrarArbolBtn.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        mostrarArbolBtn.setForeground(new java.awt.Color(255, 255, 255));
        mostrarArbolBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostrarArbolBtn.setText("MOSTRAR ÁRBOL");
        mostrarArbolBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrarArbolBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarArbolBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mostrarArbolPnlLayout = new javax.swing.GroupLayout(mostrarArbolPnl);
        mostrarArbolPnl.setLayout(mostrarArbolPnlLayout);
        mostrarArbolPnlLayout.setHorizontalGroup(
            mostrarArbolPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mostrarArbolBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );
        mostrarArbolPnlLayout.setVerticalGroup(
            mostrarArbolPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mostrarArbolBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(mostrarArbolPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 340, 50));

        jPanel2.setBackground(new java.awt.Color(0, 51, 0));

        mostrarAntepasadosBtn.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        mostrarAntepasadosBtn.setForeground(new java.awt.Color(255, 255, 255));
        mostrarAntepasadosBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostrarAntepasadosBtn.setText("MOSTRAR ANTEPASADOS");
        mostrarAntepasadosBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrarAntepasadosBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarAntepasadosBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mostrarAntepasadosBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mostrarAntepasadosBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 340, 50));

        jPanel3.setBackground(new java.awt.Color(0, 51, 0));

        mostrarGeneracionesBtn.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        mostrarGeneracionesBtn.setForeground(new java.awt.Color(255, 255, 255));
        mostrarGeneracionesBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostrarGeneracionesBtn.setText("MOSTRAR GENERACIONES");
        mostrarGeneracionesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrarGeneracionesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarGeneracionesBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mostrarGeneracionesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mostrarGeneracionesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 340, 50));

        jPanel4.setBackground(new java.awt.Color(0, 51, 0));

        verDiagramabtn.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        verDiagramabtn.setForeground(new java.awt.Color(255, 255, 255));
        verDiagramabtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        verDiagramabtn.setText("VER DIAGRAMA DE CLASES");
        verDiagramabtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verDiagramabtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verDiagramabtn, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verDiagramabtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 340, 50));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MENÚ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 270, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/3.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarArchivoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargarArchivoBtnMouseClicked
        CargarArchivo ca = new CargarArchivo();
        ca.setResizable(false);
        ca.setLocationRelativeTo(null);
        ca.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cargarArchivoBtnMouseClicked

    private void buscarTituloBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarTituloBtnMouseClicked
        BusquedaTitulos bu = new BusquedaTitulos();
        bu.setLocationRelativeTo(null);
        bu.setResizable(false);
        bu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buscarTituloBtnMouseClicked

    private void buscarNombresBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarNombresBtnMouseClicked
        BusquedaNombres bu = new BusquedaNombres();
        bu.setLocationRelativeTo(null);
        bu.setResizable(false);
        bu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buscarNombresBtnMouseClicked

    private void mostrarArbolBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarArbolBtnMouseClicked
        System.setProperty("org.graphstream.ui", "swing");
        MostrarArbol mostarArbol = new MostrarArbol(arbolApp.getArbolL());
        mostarArbol.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mostrarArbolBtnMouseClicked

    private void salirBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirBtnMouseClicked
        this.dispose();
        JOptionPane.showMessageDialog(null, "¡Gracias, vuelva pronto!");
    }//GEN-LAST:event_salirBtnMouseClicked

    private void mostrarAntepasadosBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarAntepasadosBtnMouseClicked
        VerAntepasados va = new VerAntepasados();
        va.setLocationRelativeTo(null);
        va.setResizable(false);
        va.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mostrarAntepasadosBtnMouseClicked

    private void mostrarGeneracionesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarGeneracionesBtnMouseClicked
        VerGeneraciones vg = new VerGeneraciones();
        vg.setLocationRelativeTo(null);
        vg.setResizable(false);
        vg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mostrarGeneracionesBtnMouseClicked

    private void verDiagramabtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verDiagramabtnMouseClicked

    }//GEN-LAST:event_verDiagramabtnMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buscarAntepasdosPnl;
    private javax.swing.JLabel buscarNombresBtn;
    private javax.swing.JPanel buscarPnl;
    private javax.swing.JLabel buscarTituloBtn;
    private javax.swing.JLabel cargarArchivoBtn;
    private javax.swing.JPanel cargarArchivoPnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel mostrarAntepasadosBtn;
    private javax.swing.JLabel mostrarArbolBtn;
    private javax.swing.JPanel mostrarArbolPnl;
    private javax.swing.JLabel mostrarGeneracionesBtn;
    private javax.swing.JLabel salirBtn;
    private javax.swing.JPanel salirPnl;
    private javax.swing.JLabel verDiagramabtn;
    // End of variables declaration//GEN-END:variables
}
