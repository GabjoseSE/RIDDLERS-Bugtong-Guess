package com.mycompany.riddlersgame;
public class GameOver extends javax.swing.JFrame {

    private RiddlersGame riddlersGame;
    
    public GameOver(RiddlersGame riddlersGame) {
        this.riddlersGame = riddlersGame;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        yesButton = new javax.swing.JButton();
        noButton = new javax.swing.JButton();
        GameOverBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(678, 477));
        setMinimumSize(new java.awt.Dimension(678, 477));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(678, 477));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(678, 477));
        jPanel1.setMinimumSize(new java.awt.Dimension(678, 477));
        jPanel1.setPreferredSize(new java.awt.Dimension(678, 477));
        jPanel1.setLayout(null);

        yesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checkbutton.png"))); // NOI18N
        yesButton.setBorder(null);
        yesButton.setBorderPainted(false);
        yesButton.setContentAreaFilled(false);
        yesButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/darkcheckbutton.png"))); // NOI18N
        yesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesButtonActionPerformed(evt);
            }
        });
        jPanel1.add(yesButton);
        yesButton.setBounds(490, 290, 130, 110);

        noButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/xbutton.png"))); // NOI18N
        noButton.setBorder(null);
        noButton.setBorderPainted(false);
        noButton.setContentAreaFilled(false);
        noButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/darkxbutton.png"))); // NOI18N
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButtonActionPerformed(evt);
            }
        });
        jPanel1.add(noButton);
        noButton.setBounds(50, 280, 140, 130);

        GameOverBackground.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameOverBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gameoverbackground.jpg"))); // NOI18N
        jPanel1.add(GameOverBackground);
        GameOverBackground.setBounds(0, 0, 680, 480);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 678, 477);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void yesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesButtonActionPerformed
        riddlersGame.playSound("/sfx/Button sound.wav");
        HomePage homePage = new HomePage();
        setVisible(false); 
        homePage.setVisible(true);
        riddlersGame.stopTimer();
        dispose();
    }//GEN-LAST:event_yesButtonActionPerformed

    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
        riddlersGame.playSound("/sfx/Button sound.wav");
        QuitGame quitGame = new QuitGame();
        quitGame.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_noButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RiddlersGame riddlersGame = new RiddlersGame();
                riddlersGame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GameOverBackground;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton noButton;
    private javax.swing.JButton yesButton;
    // End of variables declaration//GEN-END:variables
}
