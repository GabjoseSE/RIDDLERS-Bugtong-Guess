package com.mycompany.riddlersgame;
public class SurpassedAverageLevel extends javax.swing.JFrame {

    private RiddlersGame riddlersGame;
    
    public SurpassedAverageLevel(RiddlersGame riddlersGame) {
        this.riddlersGame = riddlersGame;
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        YesButton = new javax.swing.JButton();
        Nobutton = new javax.swing.JButton();
        surpassedAveBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(678, 420));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(678, 470));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(678, 470));
        jPanel1.setPreferredSize(new java.awt.Dimension(678, 477));
        jPanel1.setLayout(null);

        YesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checkbutton.png"))); // NOI18N
        YesButton.setBorder(null);
        YesButton.setBorderPainted(false);
        YesButton.setContentAreaFilled(false);
        YesButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DarkCheckButton.png"))); // NOI18N
        YesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesButtonActionPerformed(evt);
            }
        });
        jPanel1.add(YesButton);
        YesButton.setBounds(490, 280, 130, 130);

        Nobutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Xbutton.png"))); // NOI18N
        Nobutton.setBorder(null);
        Nobutton.setBorderPainted(false);
        Nobutton.setContentAreaFilled(false);
        Nobutton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DarkXbutton.png"))); // NOI18N
        Nobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NobuttonActionPerformed(evt);
            }
        });
        jPanel1.add(Nobutton);
        Nobutton.setBounds(60, 280, 120, 130);

        surpassedAveBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/surpasssedaveragelevelbackground.jpg"))); // NOI18N
        surpassedAveBackground.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(surpassedAveBackground);
        surpassedAveBackground.setBounds(0, 0, 710, 480);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 678, 477);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NobuttonActionPerformed
        HomePage homePage = new HomePage();
        homePage.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_NobuttonActionPerformed

    private void YesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesButtonActionPerformed
        riddlersGame.resetTimer();
        riddlersGame.resumeTimer();
    dispose(); 
    }//GEN-LAST:event_YesButtonActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RiddlersGame riddlersGame = new RiddlersGame();
                riddlersGame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Nobutton;
    private javax.swing.JButton YesButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel surpassedAveBackground;
    // End of variables declaration//GEN-END:variables
}
