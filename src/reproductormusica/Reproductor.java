package reproductormusica;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import reproductormusica.Lista.Nodo;

public class Reproductor extends javax.swing.JFrame {

    private Lista lista;
    private int cancionElegida;
    static JFileChooser elegirCancion;
    private Clip clip;
    private String cancionSeleccionada;
    private boolean pausado = false;
            long clipTime = 0;


    public Reproductor(Lista lista) {
        this.lista = lista;
        initComponents();

        setLocationRelativeTo(null);

        CancionesLista.setModel(lista.listar());

        System.out.println("reproductor" + lista.listar());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ProgressBar = new javax.swing.JProgressBar();
        TiempoActual = new javax.swing.JLabel();
        TiempoFinal = new javax.swing.JLabel();
        PauseBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CancionesLista = new javax.swing.JList<>();
        addBTN = new javax.swing.JButton();
        selectBTN = new javax.swing.JButton();
        stopBTN = new javax.swing.JButton();
        playBTN = new javax.swing.JButton();
        Imagen = new javax.swing.JLabel();

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

        PauseBTN.setText("| |");
        PauseBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PauseBTNMouseClicked(evt);
            }
        });

        CancionesLista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        CancionesLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancionesListaMouseClicked(evt);
            }
        });
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
        stopBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopBTNMouseClicked(evt);
            }
        });

        playBTN.setText("PLAY");
        playBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playBTNMouseClicked(evt);
            }
        });

        Imagen.setText("PLACEHOLDER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(10, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TiempoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(295, 295, 295)
                                .addComponent(PauseBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(267, 267, 267)
                                .addComponent(TiempoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(stopBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(playBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(selectBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TiempoActual)
                    .addComponent(TiempoFinal)
                    .addComponent(PauseBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stopBTN)
                    .addComponent(playBTN))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
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
            FileNameExtensionFilter filter = new FileNameExtensionFilter("WAV File", "wav");
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
            AddCancion pasar = new AddCancion(cancionElegida, lista);
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

    private String formatTime(long microseconds) {
        long milliseconds = microseconds / 1000;
        long seconds = milliseconds / 1000;
        long minutes = seconds / 60;
        seconds %= 60;
        return String.format("%02d:%02d", minutes, seconds);
    }

    private void playBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playBTNMouseClicked
        try {
            String selectedFileName = CancionesLista.getSelectedValue();

            if (selectedFileName != null) {
                File selectedFile = new File(selectedFileName);

                if (selectedFile.exists()) {
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(selectedFile);
                    AudioFormat format = audioInputStream.getFormat();
                    DataLine.Info info = new DataLine.Info(Clip.class, format);

                    if (!AudioSystem.isLineSupported(info)) {
                        System.out.println("Audio format not supported: " + format);
                        return;
                    }

                    clip = (Clip) AudioSystem.getLine(info);
                    clip.open(audioInputStream);

                    ProgressBar.setMaximum((int) clip.getMicrosecondLength());
                    TiempoFinal.setText(formatTime(clip.getMicrosecondLength()));

                    clip.start();

                    Icon associatedIcon = null;

                    for (Nodo node : AddCancion.listaCanciones.values()) {
                        if (node.getValor().getName().equals(selectedFileName)) {
                            associatedIcon = (Icon) AddCancion.listaCanciones.get(node);
                            break;
                        }
                    }

                    if (associatedIcon != null) {
                        Imagen.setIcon(associatedIcon);
                    }

                    new Thread(() -> {
                        while (clip.isRunning()) {
                            ProgressBar.setValue((int) clip.getMicrosecondPosition());
                            TiempoActual.setText(formatTime(clip.getMicrosecondPosition()));
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        clip.stop();
                        clip.close();
                    }).start();
                } else {
                    JOptionPane.showMessageDialog(this, "El archivo de audio seleccionado no existe.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se ha seleccionado ninguna canción.");
            }
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_playBTNMouseClicked

    private void PauseBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PauseBTNMouseClicked

        if (clip != null) {
            if (!pausado) {
                PauseBTN.setText("➤");
                clip.stop();
                clipTime = clip.getMicrosecondPosition();
                System.out.println("First click: " + clipTime);
                pausado = true;
            } else {
                PauseBTN.setText(" || ");
                clip.setMicrosecondPosition(clipTime);
                clip.start();
                pausado = false;
            }
        }
    }//GEN-LAST:event_PauseBTNMouseClicked

    private void stopBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopBTNMouseClicked
        if (clip != null)
            clip.stop();
    }//GEN-LAST:event_stopBTNMouseClicked

    private void CancionesListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancionesListaMouseClicked
        String selectedFileName = CancionesLista.getSelectedValue();

        if (selectedFileName != null) {
            Icon associatedIcon = null;

            for (java.util.Map.Entry<Icon, Nodo> entry : AddCancion.listaCanciones.entrySet()) {
                Nodo node = entry.getValue();
                if (node.getValor().toString().equals(selectedFileName)) {
                    associatedIcon = entry.getKey();
                    break;
                }
            }

            if (associatedIcon != null) {
                Imagen.setIcon(associatedIcon);
            }
        }
    }//GEN-LAST:event_CancionesListaMouseClicked

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
            java.util.logging.Logger.getLogger(Reproductor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reproductor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reproductor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reproductor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reproductor(new Lista()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> CancionesLista;
    private javax.swing.JLabel Imagen;
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
