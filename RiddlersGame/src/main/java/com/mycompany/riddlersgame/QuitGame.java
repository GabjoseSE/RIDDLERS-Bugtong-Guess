package com.mycompany.riddlersgame;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class QuitGame extends javax.swing.JFrame {

    
    public QuitGame() {
        initComponents();
    }
    
    public void playSound(String soundFilePath) {
    try {
        File soundFile = new File(soundFilePath);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
        Clip soundClip = AudioSystem.getClip();
        soundClip.open(audioStream);
        soundClip.start();
    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
        ex.printStackTrace();
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        YesButton = new javax.swing.JButton();
        NoButton = new javax.swing.JButton();
        quitGamebackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(678, 470));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(678, 470));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(678, 470));
        jPanel1.setPreferredSize(new java.awt.Dimension(678, 477));
        jPanel1.setLayout(null);

        YesButton.setIcon(new javax.swing.ImageIcon("D:\\checkbutton.png")); // NOI18N
        YesButton.setBorder(null);
        YesButton.setBorderPainted(false);
        YesButton.setContentAreaFilled(false);
        YesButton.setMaximumSize(new java.awt.Dimension(110, 109));
        YesButton.setMinimumSize(new java.awt.Dimension(110, 109));
        YesButton.setPreferredSize(new java.awt.Dimension(110, 109));
        YesButton.setSelectedIcon(new javax.swing.ImageIcon("D:\\DarkCheckButton.png")); // NOI18N
        YesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesButtonActionPerformed(evt);
            }
        });
        jPanel1.add(YesButton);
        YesButton.setBounds(490, 290, 130, 110);

        NoButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel Esperanza\\OneDrive - DEPED REGION 1\\Documents\\NetBeansProjects\\RiddlersGame\\src\\main\\java\\images\\Xbutton.png")); // NOI18N
        NoButton.setBorder(null);
        NoButton.setBorderPainted(false);
        NoButton.setContentAreaFilled(false);
        NoButton.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel Esperanza\\OneDrive - DEPED REGION 1\\Documents\\NetBeansProjects\\RiddlersGame\\src\\main\\java\\images\\DarkXbutton.png")); // NOI18N
        NoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoButtonActionPerformed(evt);
            }
        });
        jPanel1.add(NoButton);
        NoButton.setBounds(50, 280, 140, 130);

        quitGamebackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel Esperanza\\OneDrive - DEPED REGION 1\\Documents\\NetBeansProjects\\RiddlersGame\\src\\main\\java\\images\\quitGameBackground.jpg")); // NOI18N
        quitGamebackground.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(quitGamebackground);
        quitGamebackground.setBounds(0, 0, 710, 477);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 678, 477);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void YesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesButtonActionPerformed
        playSound("D:\\Button sound.wav");
        System.exit(0);
    }//GEN-LAST:event_YesButtonActionPerformed

    private void NoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoButtonActionPerformed
        playSound("D:\\Button sound.wav");
        HomePage homePage = new HomePage();
        homePage.setVisible(true);
        dispose();
    }//GEN-LAST:event_NoButtonActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuitGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NoButton;
    private javax.swing.JButton YesButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel quitGamebackground;
    // End of variables declaration//GEN-END:variables
}
