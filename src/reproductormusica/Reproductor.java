
package reproductormusica;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Reproductor extends javax.swing.JFrame {

    private Lista lista;
    private int cancionElegida;
    static JFileChooser elegirCancion;
    private Clip clip;
    private String cancionSeleccionada;
    private boolean pausado = false;
    
    
    
    public Reproductor() {
        lista = lista != null ? lista : new Lista(); 
        
        initComponents();
        
        setLocationRelativeTo(null);
        
        CancionesLista.setModel(lista.listar());
        
        System.out.println(lista.listar());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ProgressBar = new javax.swing.JProgressBar();
        TiempoActual = new javax.swing.JLabel();
        TiempoFinal = new javax.swing.JLabel();
        Next = new javax.swing.JButton();
        PauseBTN = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CancionesLista = new javax.swing.JList<>();
        addBTN = new javax.swing.JButton();
        selectBTN = new javax.swing.JButton();
        stopBTN = new javax.swing.JButton();
        playBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(180, 150, 220));

        TiempoActual.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TiempoActual.setForeground(new java.awt.Color(0, 0, 0));
        TiempoActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TiempoActual.setText("0:00");

        TiempoFinal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TiempoFinal.setForeground(new java.awt.Color(0, 0, 0));
        TiempoFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TiempoFinal.setText("0:00");

        Next.setText(">>");

        PauseBTN.setText("| |");
        PauseBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PauseBTNMouseClicked(evt);
            }
        });

        Back.setText("<<");

        CancionesLista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(CancionesLista);

        addBTN.setText("Add");
        addBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBTNMouseClicked(evt);
            }
        });

        selectBTN.setText("Select");
        selectBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBTNActionPerformed(evt);
            }
        });

        stopBTN.setText("STOP");

        playBTN.setText("PLAY");
        playBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playBTNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TiempoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(254, 254, 254)
                        .addComponent(Back)
                        .addGap(18, 18, 18)
                        .addComponent(PauseBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Next)
                        .addGap(232, 232, 232)
                        .addComponent(TiempoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(stopBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(playBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(selectBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TiempoActual)
                        .addComponent(TiempoFinal))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PauseBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stopBTN)
                    .addComponent(playBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBTNMouseClicked
        
        try {
            elegirCancion = new JFileChooser();
            
            /*
            Solo acepta mp3!!!
            */
            FileNameExtensionFilter filter = new FileNameExtensionFilter("MP3 File", "mp3");
            elegirCancion.setFileFilter(filter);

            cancionElegida = elegirCancion.showOpenDialog(this);
            if (cancionElegida == JFileChooser.APPROVE_OPTION) {
                JOptionPane.showMessageDialog(null, "File elegido: " + elegirCancion.getSelectedFile().getName());
            } else {
                JOptionPane.showMessageDialog(null, "No se eligio una cancion.");
            }

            /*
            Pasa al otro JFrame para editar detalles.
             */
            AddCancion pasar = new AddCancion(cancionElegida);
            pasar.setVisible(true);
            this.setVisible(false);

            CancionesLista.setModel(lista.listar());

        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Reproductor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Reproductor.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_addBTNMouseClicked

    private void selectBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBTNActionPerformed
        cancionSeleccionada = CancionesLista.getSelectedValue();
        
    }//GEN-LAST:event_selectBTNActionPerformed

    private void playBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playBTNMouseClicked

        if (cancionSeleccionada != null) {
            try {

                File cancionFile = new File(cancionSeleccionada);

                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(cancionFile);

                Clip clip = AudioSystem.getClip();

                clip.open(audioInputStream);

                clip.start();

                TiempoFinal.setText(String.valueOf(clip.getMicrosecondLength()));

                for (int i = 0; i < clip.getMicrosecondLength(); i++) {

                    ProgressBar.setValue(i);
                    ProgressBar.repaint();

                    try {
                        Thread.sleep(i % 60);
                    } catch (InterruptedException e) {
                        e.printStackTrace();

                    }
                }

            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
                ex.printStackTrace();
        }
            
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna cancion.");
        }
    }//GEN-LAST:event_playBTNMouseClicked

    private void PauseBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PauseBTNMouseClicked

        long clipTime = 0;

        if (clip != null) {
            if (pausado = false) {

                PauseBTN.setText("➤");

                clipTime = clip.getMicrosecondPosition();

                clip.stop();

            } else {

                PauseBTN.setText(" || ");

                clip.setMicrosecondPosition(clipTime);

                clip.start();
            }
        }

    }//GEN-LAST:event_PauseBTNMouseClicked

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
            java.util.logging.Logger.getLogger(Reproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reproductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JList<String> CancionesLista;
    private javax.swing.JButton Next;
    private javax.swing.JButton PauseBTN;
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JLabel TiempoActual;
    private javax.swing.JLabel TiempoFinal;
    private javax.swing.JButton addBTN;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton playBTN;
    private javax.swing.JButton selectBTN;
    private javax.swing.JButton stopBTN;
    // End of variables declaration//GEN-END:variables
}
