package com.mycompany.riddlersgame;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class FinishedGame extends javax.swing.JFrame {

    private RiddlersGame riddlersGame;
    public FinishedGame(RiddlersGame riddlersGame) {
        this.riddlersGame = riddlersGame;
        initComponents();
    }

     private void playSound(String soundFilePath) {
    try {
        // Use getResourceAsStream to load the resource
        InputStream audioStream = getClass().getResourceAsStream(soundFilePath);
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
        okButton = new javax.swing.JButton();
        FinishedGameBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(678, 477));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(678, 470));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(720, 530));
        jPanel1.setPreferredSize(new java.awt.Dimension(678, 477));
        jPanel1.setLayout(null);

        okButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checkbutton.png"))); // NOI18N
        okButton.setBorder(null);
        okButton.setBorderPainted(false);
        okButton.setContentAreaFilled(false);
        okButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DarkCheckButton.png"))); // NOI18N
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        jPanel1.add(okButton);
        okButton.setBounds(490, 290, 130, 110);

        FinishedGameBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/finishedgamebackground.jpg"))); // NOI18N
        FinishedGameBackground.setText("jLabel1");
        FinishedGameBackground.setPreferredSize(new java.awt.Dimension(678, 477));
        jPanel1.add(FinishedGameBackground);
        FinishedGameBackground.setBounds(0, 0, 710, 477);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 720, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        playSound("/sfx/Button sound.wav");
        HomePage homePage = new HomePage();
        setVisible(false); 
        homePage.setVisible(true);
        riddlersGame.stopTimer();
        dispose();
    }//GEN-LAST:event_okButtonActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RiddlersGame riddlersGame = new RiddlersGame();
                riddlersGame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FinishedGameBackground;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables
}
