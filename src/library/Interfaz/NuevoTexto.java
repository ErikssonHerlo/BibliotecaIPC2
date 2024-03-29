/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.Interfaz;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import library.files.InputFilesManager;

/**
 *
 * @author erikssonherlo
 */
public class NuevoTexto extends javax.swing.JFrame {
       InputFilesManager file = new InputFilesManager();
    /**
     * Creates new form LibrosDisponibles
     */
    public NuevoTexto() {
        initComponents();
    }
       String path;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AgregarTexto = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AgregarTexto.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        AgregarTexto.setText("Agregar");
        AgregarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarTextoActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 160, 40));

        Regresar.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        Regresar.setText("Regresar al Menú Anterior");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 250, 40));

        Titulo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(1, 1, 1));
        Titulo.setText("Agregar Archivo");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 53));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 350, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/Interfaz/library.jpeg"))); // NOI18N
        Fondo.setMaximumSize(new java.awt.Dimension(940, 526));
        Fondo.setMinimumSize(new java.awt.Dimension(940, 526));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarTextoActionPerformed
                   JFileChooser selectorArchivos = new JFileChooser();
        selectorArchivos.setFileSelectionMode(
                JFileChooser.FILES_ONLY);
      
        FileFilter filter = new FileNameExtensionFilter("Archivo de Texto (.txt)",".txt");

        selectorArchivos.addChoosableFileFilter(filter);

         if(selectorArchivos.showDialog(null, "Open") == JFileChooser.APPROVE_OPTION) { //Sofia
            file.getPath(selectorArchivos.getSelectedFile()); //Sofia
            file.readInputFile(file.getPath(selectorArchivos.getSelectedFile())); //Sofia
            
            path = selectorArchivos.getSelectedFile().getName();
            jTextField1.setText(path);
        
            
    }//GEN-LAST:event_AgregarTextoActionPerformed
    }
    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        Inicio Iniciar = new Inicio();
        Iniciar.setVisible(true);
        this.setVisible(false);     
    }//GEN-LAST:event_RegresarActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarTexto;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
