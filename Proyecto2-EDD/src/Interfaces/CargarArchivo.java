/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Clases.ArbolLinaje;
import Funciones.Cargar;
import Funciones.MostrarArbol;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author salom
 */
public class CargarArchivo extends javax.swing.JFrame {
    private Cargar cargarJSON = new Cargar();
    public static ArbolLinaje arbolApp = new ArbolLinaje();
    /**
     * Creates new form CargarArchivo
     */
    public CargarArchivo() {
        initComponents();
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
        cargarArchivo = new javax.swing.JPanel();
        cargarArchivoBtn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrarArchivo = new javax.swing.JTextField();
        ruta = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        buscarBtn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cargarArchivo.setBackground(new java.awt.Color(0, 51, 0));

        cargarArchivoBtn.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        cargarArchivoBtn.setForeground(new java.awt.Color(255, 255, 255));
        cargarArchivoBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cargarArchivoBtn.setText("CARGAR ARCHIVO");
        cargarArchivoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cargarArchivoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cargarArchivoBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cargarArchivoLayout = new javax.swing.GroupLayout(cargarArchivo);
        cargarArchivo.setLayout(cargarArchivoLayout);
        cargarArchivoLayout.setHorizontalGroup(
            cargarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cargarArchivoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        cargarArchivoLayout.setVerticalGroup(
            cargarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cargarArchivoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(cargarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 300, 50));

        mostrarArchivo.setEditable(false);
        mostrarArchivo.setBackground(new java.awt.Color(255, 255, 255));
        mostrarArchivo.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(mostrarArchivo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 430, 240));

        ruta.setEditable(false);
        ruta.setBackground(new java.awt.Color(255, 255, 255));
        ruta.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        ruta.setForeground(new java.awt.Color(0, 0, 0));
        ruta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(ruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 300, 50));

        jPanel2.setBackground(new java.awt.Color(0, 51, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        buscarBtn.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
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
            .addComponent(buscarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, 50));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CARGAR ARCHIVO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 290, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/3.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBtnMouseClicked
        JFileChooser file = new JFileChooser();
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos JSON (*.json", "json");
        file.setFileFilter(filtro);
        int seleccion = file.showOpenDialog(this);
        if(seleccion == JFileChooser.APPROVE_OPTION){
            File fichero = file.getSelectedFile();
            
            ruta.setText(fichero.getAbsolutePath());
            try (FileReader fr = new FileReader(fichero)){
                StringBuilder cadena = new StringBuilder();
                int valor = fr.read();
                
                while(valor != -1){
                    cadena.append((char)valor);
                    valor = fr.read();
                }
                mostrarArchivo.setText(cadena.toString());
                JOptionPane.showMessageDialog(null,"Archivo guardado correctamente");
                
            } catch (IOException error){
                error.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al leer el archivo");
            }
        }else if (seleccion == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null,"No se ha seleccionado ningún archivo.");
        }else{
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo.");
        }
    }//GEN-LAST:event_buscarBtnMouseClicked

    private void cargarArchivoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargarArchivoBtnMouseClicked
        cargarJSON.cargar(ruta.getText());
        
        if(cargarJSON.sinError()){
            
            arbolApp = cargarJSON.getArbolLinaje();
            
            System.setProperty("org.graphstream.ui", "swing");
            MostrarArbol mostarArbol = new MostrarArbol(arbolApp.getArbolL());
            mostarArbol.setVisible(true);
            
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Hay errores en el JSON");
        }
        
    }//GEN-LAST:event_cargarArchivoBtnMouseClicked

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
            java.util.logging.Logger.getLogger(CargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargarArchivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscarBtn;
    private javax.swing.JPanel cargarArchivo;
    private javax.swing.JLabel cargarArchivoBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mostrarArchivo;
    private javax.swing.JTextField ruta;
    // End of variables declaration//GEN-END:variables
}
