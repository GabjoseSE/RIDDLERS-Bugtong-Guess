package com.mycompany.riddlersgame;
public class Correct extends javax.swing.JFrame {
    
private RiddlersGame riddlersGame;
public int earnedPoints;

    public Correct(RiddlersGame riddlersGame) {
        this.riddlersGame = riddlersGame;
        initComponents();
        
    }
    public void setEarnedPoints(int earnedPoints) {
        this.earnedPoints = earnedPoints; // Set the earnedPoints value in the Correct class
        earnedPointLabel.setText("" + earnedPoints); // Display the earnedPoints value in the earnedPoint JLabel
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        OkButtoncorrect = new javax.swing.JButton();
        earnedPointLabel = new javax.swing.JLabel();
        CorrectBackground = new javax.swing.JLabel();

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

        OkButtoncorrect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checkbutton.png"))); // NOI18N
        OkButtoncorrect.setBorder(null);
        OkButtoncorrect.setBorderPainted(false);
        OkButtoncorrect.setContentAreaFilled(false);
        OkButtoncorrect.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/darkcheckbutton.png"))); // NOI18N
        OkButtoncorrect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtoncorrectActionPerformed(evt);
            }
        });
        jPanel1.add(OkButtoncorrect);
        OkButtoncorrect.setBounds(510, 270, 130, 110);

        earnedPointLabel.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        earnedPointLabel.setForeground(new java.awt.Color(255, 210, 48));
        earnedPointLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        earnedPointLabel.setToolTipText("");
        earnedPointLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(earnedPointLabel);
        earnedPointLabel.setBounds(330, 220, 110, 80);

        CorrectBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/correctbackground.jpg"))); // NOI18N
        CorrectBackground.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(CorrectBackground);
        CorrectBackground.setBounds(0, 0, 710, 480);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 678, 477);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OkButtoncorrectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtoncorrectActionPerformed
    riddlersGame.playSound("/sfx/Button sound.wav");
    riddlersGame.updateScore(earnedPoints); // Update the score in the RiddlersGame class
    riddlersGame.setEnabled(true);
    riddlersGame.moveToNextQuestion();
    riddlersGame.resumeTimer();
    dispose();
    
    }//GEN-LAST:event_OkButtoncorrectActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RiddlersGame riddlersGame = new RiddlersGame();
                riddlersGame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CorrectBackground;
    private javax.swing.JButton OkButtoncorrect;
    private javax.swing.JLabel earnedPointLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
