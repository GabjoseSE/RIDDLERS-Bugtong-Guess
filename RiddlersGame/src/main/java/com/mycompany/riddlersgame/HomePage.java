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
            File audioFile = new File("D:\\-12372.wav"); 
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            backgroundMusic = AudioSystem.getClip();
            backgroundMusic.open(audioStream);
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
        playButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel Esperanza\\OneDrive - DEPED REGION 1\\Documents\\NetBeansProjects\\RiddlersGame\\src\\main\\java\\images\\playbutton.png")); // NOI18N
        playButton.setBorder(null);
        playButton.setBorderPainted(false);
        playButton.setContentAreaFilled(false);
        playButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        playButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        playButton.setMaximumSize(new java.awt.Dimension(257, 63));
        playButton.setMinimumSize(new java.awt.Dimension(257, 63));
        playButton.setPreferredSize(new java.awt.Dimension(257, 63));
        playButton.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel Esperanza\\OneDrive - DEPED REGION 1\\Documents\\NetBeansProjects\\RiddlersGame\\src\\main\\java\\images\\playbuttondark.png")); // NOI18N
        playButton.setSelectedIcon(new javax.swing.ImageIcon("D:\\homepage buttons\\playbuttondark.png")); // NOI18N
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        jPanel1.add(playButton);
        playButton.setBounds(220, 260, 240, 60);

        aboutButton.setIcon(new javax.swing.ImageIcon("D:\\homepage buttons\\aboutbutton.png")); // NOI18N
        aboutButton.setBorder(null);
        aboutButton.setBorderPainted(false);
        aboutButton.setContentAreaFilled(false);
        aboutButton.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel Esperanza\\OneDrive - DEPED REGION 1\\Documents\\NetBeansProjects\\RiddlersGame\\src\\main\\java\\images\\aboutbutton.png")); // NOI18N
        aboutButton.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel Esperanza\\OneDrive - DEPED REGION 1\\Documents\\NetBeansProjects\\RiddlersGame\\src\\main\\java\\images\\aboutbuttondark.png")); // NOI18N
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(aboutButton);
        aboutButton.setBounds(220, 330, 240, 60);

        quitButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel Esperanza\\OneDrive - DEPED REGION 1\\Documents\\NetBeansProjects\\RiddlersGame\\src\\main\\java\\images\\quitbutton.png")); // NOI18N
        quitButton.setBorder(null);
        quitButton.setBorderPainted(false);
        quitButton.setContentAreaFilled(false);
        quitButton.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel Esperanza\\OneDrive - DEPED REGION 1\\Documents\\NetBeansProjects\\RiddlersGame\\src\\main\\java\\images\\quitbuttondark.png")); // NOI18N
        quitButton.setSelectedIcon(new javax.swing.ImageIcon("D:\\homepage buttons\\quitbuttondark.png")); // NOI18N
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(quitButton);
        quitButton.setBounds(220, 400, 240, 60);

        backgroundHomepage.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel Esperanza\\OneDrive - DEPED REGION 1\\Documents\\NetBeansProjects\\RiddlersGame\\src\\main\\java\\images\\HOMEPAGE (1).jpg")); // NOI18N
        backgroundHomepage.setPreferredSize(new java.awt.Dimension(679, 477));
        jPanel1.add(backgroundHomepage);
        backgroundHomepage.setBounds(0, -10, 680, 500);
        backgroundHomepage.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 720, 530);

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        playSound("D:\\Button sound.wav");
        RiddlersGame riddlersGame = new RiddlersGame();
        setVisible(false);
        riddlersGame.setVisible(true);
    }//GEN-LAST:event_playButtonActionPerformed

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        playSound("D:\\Button sound.wav");
        aboutPage AboutPage = new aboutPage();
        setVisible(false);
        AboutPage.setVisible(true);
    }//GEN-LAST:event_aboutButtonActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        playSound("D:\\Button sound.wav");
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
