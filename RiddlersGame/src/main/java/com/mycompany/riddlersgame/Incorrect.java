package com.mycompany.riddlersgame;
public class Incorrect extends javax.swing.JFrame {
    
private RiddlersGame riddlersGame;
private int lives;
private static Incorrect incorrectFrame;

    public Incorrect(RiddlersGame riddlersGame, int lives) {
    this.riddlersGame = riddlersGame;
    this.lives = lives;
    initComponents();
    incorrectFrame = this;
}
    public static Incorrect getIncorrectFrame() {
        return incorrectFrame;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        OkButtonincorrect = new javax.swing.JButton();
        IncorrectBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(680, 420));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(678, 470));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(678, 470));
        jPanel1.setPreferredSize(new java.awt.Dimension(678, 477));
        jPanel1.setLayout(null);

        OkButtonincorrect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checkbutton.png"))); // NOI18N
        OkButtonincorrect.setBorder(null);
        OkButtonincorrect.setBorderPainted(false);
        OkButtonincorrect.setContentAreaFilled(false);
        OkButtonincorrect.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/darkcheckbutton.png"))); // NOI18N
        OkButtonincorrect.setVerifyInputWhenFocusTarget(false);
        OkButtonincorrect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonincorrectActionPerformed(evt);
            }
        });
        jPanel1.add(OkButtonincorrect);
        OkButtonincorrect.setBounds(520, 270, 113, 110);

        IncorrectBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/incorrectbackground.jpg"))); // NOI18N
        IncorrectBackground.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(IncorrectBackground);
        IncorrectBackground.setBounds(0, 0, 710, 480);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 678, 477);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OkButtonincorrectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonincorrectActionPerformed
    riddlersGame.playSound("/sfx/Button sound.wav");
    riddlersGame.decrementLives();
    riddlersGame.moveToNextQuestion();
    riddlersGame.setEnabled(true);
    riddlersGame.resumeTimer();
    dispose();
    }//GEN-LAST:event_OkButtonincorrectActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Incorrect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Incorrect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Incorrect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Incorrect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            RiddlersGame riddlersGame = new RiddlersGame();
            riddlersGame.setVisible(true);

            
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IncorrectBackground;
    private javax.swing.JButton OkButtonincorrect;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
