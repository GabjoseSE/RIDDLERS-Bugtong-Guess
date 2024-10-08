package com.mycompany.riddlersgame;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class aboutPage extends javax.swing.JFrame {

    public aboutPage() {
        initComponents();
        setLocationRelativeTo(null);
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
        homeButton = new javax.swing.JButton();
        aboutPage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(678, 470));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(678, 470));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homebuttonwhite.png"))); // NOI18N
        homeButton.setBorder(null);
        homeButton.setBorderPainted(false);
        homeButton.setContentAreaFilled(false);
        homeButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homebuttonbaleg.png"))); // NOI18N
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(homeButton);
        homeButton.setBounds(610, 10, 60, 60);

        aboutPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aboutpagebackground.jpg"))); // NOI18N
        jPanel1.add(aboutPage);
        aboutPage.setBounds(0, 0, 690, 480);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 680, 480);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
    playSound("/sfx/Button sound.wav");
    HomePage homepage = new HomePage();
    homepage.show(); 
    dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aboutPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutPage;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
