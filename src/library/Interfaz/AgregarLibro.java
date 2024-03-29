/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.Interfaz;

import javax.swing.JOptionPane;
import library.Book;
import library.BookManager;
import library.files.OutputFilesManager;

/**
 *
 * @author erikssonherlo
 */
public class AgregarLibro extends javax.swing.JFrame {
    private BookManager bookManager = new BookManager();
    private OutputFilesManager outputFiles = new OutputFilesManager();
    private Book book;
    /**
     * Creates new form PrestarLibro
     */
    public AgregarLibro() {
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

        Titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        codeText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        autorText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        editorialText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        titleText = new javax.swing.JTextField();
        date = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        Agregar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        quantityText = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(254, 254, 254));
        Titulo.setText("Agregar Libros");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, 53));

        jLabel1.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Codigo del Libro:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 160, 30));

        codeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeTextActionPerformed(evt);
            }
        });
        getContentPane().add(codeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 150, 30));

        jLabel2.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(4, 2, 2));
        jLabel2.setText("Autor:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 60, 30));
        getContentPane().add(autorText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 150, -1));

        jLabel3.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(1, 1, 1));
        jLabel3.setText("Editorial:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 90, 30));
        getContentPane().add(editorialText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 150, -1));

        jLabel5.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Título:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 60, 30));
        getContentPane().add(titleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 150, -1));

        date.setText("yyyy/mm/dd");
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 150, -1));

        jLabel6.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(1, 1, 1));
        jLabel6.setText("Fecha de Publicación:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 210, 30));

        Agregar.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        Agregar.setText("Agregar Libro");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, 160, 40));

        Regresar.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        Regresar.setText("Regresar al Menú Anterior");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, 240, 40));

        jLabel9.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(1, 1, 1));
        jLabel9.setText("Cantidad de Copias:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 190, 30));
        getContentPane().add(quantityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 150, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/Interfaz/libraryvertical.png"))); // NOI18N
        Fondo.setMaximumSize(new java.awt.Dimension(800, 467));
        Fondo.setMinimumSize(new java.awt.Dimension(800, 467));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        LibrosDisponibles VerLibros = new LibrosDisponibles();
        VerLibros.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
        
        //Muestra un mensaje si algun campo se encuentra vacio.
        if(titleText.getText().isEmpty() || autorText.getText().isEmpty()|| codeText.getText().isEmpty() || 
                quantityText.getText().isEmpty() || date.getText().isEmpty() || editorialText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese todos los campos");
        } else {
            /*Metodo encargado de llamar al manejador de libros para crear uno nuevo y al mismo tiempo crear 
            su archivo binario mediante el manejador de archivos de salida.*/
            this.book = bookManager.createNewBook(titleText.getText(), autorText.getText(), codeText.getText(),
                    Integer.valueOf(quantityText.getText()), date.getText(), editorialText.getText());
            Object object = this.book;
            outputFiles.createFiles("Book/", this.book.getCode(), ".book", object);  
        }    
    }//GEN-LAST:event_AgregarActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        // TODO add your handling code here:
        LibrosDisponibles Regresar = new LibrosDisponibles();
        Regresar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegresarActionPerformed

    private void codeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeTextActionPerformed

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
            java.util.logging.Logger.getLogger(PrestarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrestarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrestarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrestarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrestarLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField autorText;
    private javax.swing.JTextField codeText;
    private javax.swing.JFormattedTextField date;
    private javax.swing.JTextField editorialText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField quantityText;
    private javax.swing.JTextField titleText;
    // End of variables declaration//GEN-END:variables
}
