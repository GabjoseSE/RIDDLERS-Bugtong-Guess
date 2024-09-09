package com.mycompany.riddlersgame;

import javax.sound.sampled.*;
import java.io.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HomePage extends javax.swing.JFrame {
    
    
    private static Clip backgroundMusic;
    

    public HomePage() {
    initComponents();
    setLocationRelativeTo(null);

    if (backgroundMusic == null || !backgroundMusic.isRunning()) {
    try {
        // Use getResourceAsStream to load the resource
        InputStream audioStream = new BufferedInputStream(getClass().getResourceAsStream("/sfx/-12372.wav"));
                if (audioStream == null) {
                    System.err.println("Audio file not found!");
                    return;
                }
        
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioStream);
        backgroundMusic = AudioSystem.getClip();
        backgroundMusic.open(audioInputStream);
        backgroundMusic.loop(Clip.LOOP_CONTINUOUSLY); // Loop the music continuously
        backgroundMusic.start();
    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
        ex.printStackTrace();
    }
}

    // Add window listener to stop background music when the window is closed
    addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            if (backgroundMusic != null) {
                backgroundMusic.stop();
                backgroundMusic.close();
            }
        }
    });
}
  
   
    private void playSound(String soundFilePath) {
    try {
        // Use getResourceAsStream to load the resource
        InputStream audioStream = new BufferedInputStream(getClass().getResourceAsStream(soundFilePath));
        if (audioStream == null) {
            System.err.println("Sound file not found: " + soundFilePath);
            return;
        }

        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioStream);
        Clip soundClip = AudioSystem.getClip();
        soundClip.open(audioInputStream);
        soundClip.start();
    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
        ex.printStackTrace();
    }
}

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        playButton = new javax.swing.JButton();
        aboutButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        backgroundHomepage = new javax.swing.JLabel();

        setTitle("Riddlers: Bugtong Guess");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(678, 477));
        setPreferredSize(new java.awt.Dimension(693, 518));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(678, 477));
        jPanel1.setLayout(null);

        playButton.setBackground(new java.awt.Color(0, 0, 0));
        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/playbutton.png"))); // NOI18N
        playButton.setBorder(null);
        playButton.setBorderPainted(false);
        playButton.setContentAreaFilled(false);
        playButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        playButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        playButton.setMaximumSize(new java.awt.Dimension(257, 63));
        playButton.setMinimumSize(new java.awt.Dimension(257, 63));
        playButton.setPreferredSize(new java.awt.Dimension(257, 63));
        playButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/playbuttondark.png"))); // NOI18N
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        jPanel1.add(playButton);
        playButton.setBounds(220, 260, 240, 60);

        aboutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aboutbutton.png"))); // NOI18N
        aboutButton.setBorder(null);
        aboutButton.setBorderPainted(false);
        aboutButton.setContentAreaFilled(false);
        aboutButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/darkaboutbutton.png"))); // NOI18N
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(aboutButton);
        aboutButton.setBounds(220, 330, 240, 60);

        quitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/quitbutton.png"))); // NOI18N
        quitButton.setBorder(null);
        quitButton.setBorderPainted(false);
        quitButton.setContentAreaFilled(false);
        quitButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/quitbuttondark.png"))); // NOI18N
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(quitButton);
        quitButton.setBounds(220, 400, 240, 60);

        backgroundHomepage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homepagebackground.jpg"))); // NOI18N
        backgroundHomepage.setPreferredSize(new java.awt.Dimension(679, 477));
        jPanel1.add(backgroundHomepage);
        backgroundHomepage.setBounds(0, -10, 680, 500);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 720, 530);

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        playSound("/sfx/Button sound.wav");
        RiddlersGame riddlersGame = new RiddlersGame();
        setVisible(false);
        riddlersGame.setVisible(true);
    }//GEN-LAST:event_playButtonActionPerformed

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        playSound("/sfx/Button sound.wav");
        aboutPage AboutPage = new aboutPage();
        setVisible(false);
        AboutPage.setVisible(true);
    }//GEN-LAST:event_aboutButtonActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        playSound("/sfx/Button sound.wav");
        QuitGame quitGame = new QuitGame();
        quitGame.setVisible(true);
    }//GEN-LAST:event_quitButtonActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutButton;
    private javax.swing.JLabel backgroundHomepage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton playButton;
    private javax.swing.JButton quitButton;
    // End of variables declaration//GEN-END:variables
}
