/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package reproductormusica;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import reproductormusica.Lista.Nodo;

public class AddCancion extends javax.swing.JFrame {

    private int cancion;
    private Lista lista;

    //primer file es imagen y el nodo es el file del uhghghuhfudhg de la cancion
    static Hashtable<Icon, Nodo> listaCanciones;

    public AddCancion(int cancion, Lista lista) throws UnsupportedAudioFileException, IOException {
        this.cancion = cancion;
        this.lista = lista;
        listaCanciones = new Hashtable<>();

        initComponents();

        setLocationRelativeTo(null);

        if (Reproductor.elegirCancion.getSelectedFile() != null) {
        NombreText.setText(Reproductor.elegirCancion.getSelectedFile().getName());
        PathText.setText(Reproductor.elegirCancion.getSelectedFile().getAbsolutePath());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ArtistaText = new javax.swing.JTextField();
        PathText = new javax.swing.JTextField();
        NombreText = new javax.swing.JTextField();
        Imagen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AgregarBTN = new javax.swing.JButton();
        CambiarBTN = new javax.swing.JButton();
        TipoText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(180, 150, 220));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Artista:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 80, 30));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Path:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 50, 30));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nombre:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 90, 30));

        ArtistaText.setBackground(new java.awt.Color(255, 255, 255));
        ArtistaText.setForeground(new java.awt.Color(0, 0, 0));
        ArtistaText.setText("Artista");
        ArtistaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArtistaTextActionPerformed(evt);
            }
        });
        jPanel1.add(ArtistaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 321, 47));

        PathText.setEditable(false);
        PathText.setBackground(new java.awt.Color(255, 255, 255));
        PathText.setForeground(new java.awt.Color(0, 0, 0));
        PathText.setText("Path");
        jPanel1.add(PathText, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 321, 47));

        NombreText.setBackground(new java.awt.Color(255, 255, 255));
        NombreText.setForeground(new java.awt.Color(0, 0, 0));
        NombreText.setText("Nombre");
        jPanel1.add(NombreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 321, 47));

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imageDefault.png"))); // NOI18N
        Imagen.setText("jLabel1");
        jPanel1.add(Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 300, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("TIP: Elegir imagenes con las");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("dimensiones de 300 X 240.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        AgregarBTN.setText("Agregar Cancion");
        AgregarBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarBTNMouseClicked(evt);
            }
        });
        jPanel1.add(AgregarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 158, 50));

        CambiarBTN.setText("Cambiar Imagen");
        CambiarBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CambiarBTNMouseClicked(evt);
            }
        });
        jPanel1.add(CambiarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 158, 50));

        TipoText.setBackground(new java.awt.Color(255, 255, 255));
        TipoText.setForeground(new java.awt.Color(0, 0, 0));
        TipoText.setText("Tipo de Musica");
        jPanel1.add(TipoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 321, 47));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Tipo:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 50, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 499));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ArtistaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtistaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArtistaTextActionPerformed

    private void AgregarBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarBTNMouseClicked

        File valor = Reproductor.elegirCancion.getSelectedFile();
        
        if (valor != null) {
            String nombre = NombreText.getText();
            String artista = ArtistaText.getText();
            String tipo = TipoText.getText();

            Nodo nodo = new Nodo(valor, nombre, artista, tipo);
            lista.insertar(nodo);

            System.out.println("Add cancion: " + lista.primero);
            listaCanciones.put(Imagen.getIcon(), lista.ultimo);

            Reproductor pasar = new Reproductor(lista);
            pasar.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "No se seleccionó ningún archivo de canción.");
        }

    }//GEN-LAST:event_AgregarBTNMouseClicked

    private void CambiarBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CambiarBTNMouseClicked
        JFileChooser elegirImagen = new JFileChooser();
        int imagenElegida = elegirImagen.showOpenDialog(this);
        if (imagenElegida == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = elegirImagen.getSelectedFile();

            Imagen.setIcon(new javax.swing.ImageIcon(selectedImageFile.getAbsolutePath()));
        } else {
            JOptionPane.showMessageDialog(null, "No se eligio una imagen.");
        }


    }//GEN-LAST:event_CambiarBTNMouseClicked

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
            java.util.logging.Logger.getLogger(AddCancion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCancion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCancion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCancion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AddCancion(0, new Lista()).setVisible(true);
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(AddCancion.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(AddCancion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarBTN;
    private javax.swing.JTextField ArtistaText;
    private javax.swing.JButton CambiarBTN;
    private javax.swing.JLabel Imagen;
    private javax.swing.JTextField NombreText;
    private javax.swing.JTextField PathText;
    private javax.swing.JTextField TipoText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
