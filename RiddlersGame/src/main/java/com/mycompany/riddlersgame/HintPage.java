package com.mycompany.riddlersgame;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class HintPage extends javax.swing.JFrame {

    private String[] hints;
    private String imagePath;
    private List<Integer> hintIndexes; // List to shuffle hint indexes
    private List<Integer> shuffledOrder; // Shuffled order of hint buttons

    public HintPage(String[] hints, String imagePath) {
        initComponents();
        this.hints = hints;
        this.imagePath = imagePath;
        setLocationRelativeTo(null);
        setVisible(true);

        // Create a list of hint indexes (0, 1, 2)
        hintIndexes = Arrays.asList(0, 1, 2);

        // Shuffle the order of hint indexes to create a shuffled order
        shuffledOrder = Arrays.asList(0, 1, 2);
        Collections.shuffle(shuffledOrder);

        // Assign the shuffled order to the buttons
        assignHintToButton(hintButton1, shuffledOrder.get(0));
        assignHintToButton(hintButton2, shuffledOrder.get(1));
        assignHintToButton(hintButton3, shuffledOrder.get(2));
    }

    // Assign hint to button based on index
    private void assignHintToButton(JButton button, int index) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (index) {
                    case 0:
                        FirstPosHint firstPosHint = new FirstPosHint(hints[0]);
                        dispose();
                        break;
                    case 1:
                        SecondPosHint secondPosHint = new SecondPosHint(hints[1]);
                        dispose();
                        break;
                    case 2:
                        ThirdPosHint thirdPosHint = new ThirdPosHint(hints[2], imagePath);
                        dispose();
                        break;
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

        hintButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        hintButton3 = new javax.swing.JButton();
        hintButton2 = new javax.swing.JButton();
        hintButton1 = new javax.swing.JButton();
        HintPageBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(680, 420));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(678, 470));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(678, 470));
        jPanel1.setPreferredSize(new java.awt.Dimension(678, 477));
        jPanel1.setLayout(null);

        hintButton3.setBorder(null);
        hintButton3.setBorderPainted(false);
        hintButtonGroup.add(hintButton3);
        hintButton3.setContentAreaFilled(false);
        hintButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hintButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(hintButton3);
        hintButton3.setBounds(440, 190, 130, 130);

        hintButton2.setBorder(null);
        hintButton2.setBorderPainted(false);
        hintButtonGroup.add(hintButton2);
        hintButton2.setContentAreaFilled(false);
        hintButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hintButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(hintButton2);
        hintButton2.setBounds(110, 190, 120, 130);

        hintButton1.setBorder(null);
        hintButton1.setBorderPainted(false);
        hintButtonGroup.add(hintButton1);
        hintButton1.setContentAreaFilled(false);
        hintButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hintButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(hintButton1);
        hintButton1.setBounds(280, 190, 120, 130);

        HintPageBackground.setBackground(new java.awt.Color(0, 0, 0));
        HintPageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pickahintbackground.jpg"))); // NOI18N
        HintPageBackground.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(HintPageBackground);
        HintPageBackground.setBounds(0, 0, 710, 477);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 678, 477);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hintButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hintButton2ActionPerformed
        playSound("/sfx/Button sound.wav");

    }//GEN-LAST:event_hintButton2ActionPerformed

    private void hintButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hintButton1ActionPerformed
        playSound("/sfx/Button sound.wav");

    }//GEN-LAST:event_hintButton1ActionPerformed

    private void hintButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hintButton3ActionPerformed
        playSound("/sfx/Button sound.wav");

    }//GEN-LAST:event_hintButton3ActionPerformed

   
    public void main(String[] hints) {
    java.awt.EventQueue.invokeLater(new Runnable(){
        public void run() {
            new HintPage(hints, imagePath).setVisible(true);
        }
    });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HintPageBackground;
    private javax.swing.JButton hintButton1;
    private javax.swing.JButton hintButton2;
    private javax.swing.JButton hintButton3;
    private javax.swing.ButtonGroup hintButtonGroup;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
