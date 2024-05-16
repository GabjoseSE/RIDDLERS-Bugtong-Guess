package com.mycompany.riddlersgame;


public class SurpassedEasyLevel extends javax.swing.JFrame {
    private RiddlersGame riddlersGame;
    
    public SurpassedEasyLevel(RiddlersGame riddlersGame) {
        this.riddlersGame = riddlersGame;
        initComponents();
        riddlersGame.stopTimer();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NoButton = new javax.swing.JButton();
        YesButton = new javax.swing.JButton();
        surpassedEasyBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(678, 470));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(678, 470));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(678, 470));
        jPanel1.setPreferredSize(new java.awt.Dimension(678, 477));
        jPanel1.setLayout(null);

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

        YesButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel Esperanza\\OneDrive - DEPED REGION 1\\Documents\\NetBeansProjects\\RiddlersGame\\src\\main\\java\\images\\checkbutton.png")); // NOI18N
        YesButton.setBorder(null);
        YesButton.setBorderPainted(false);
        YesButton.setContentAreaFilled(false);
        YesButton.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel Esperanza\\OneDrive - DEPED REGION 1\\Documents\\NetBeansProjects\\RiddlersGame\\src\\main\\java\\images\\DarkCheckButton.png")); // NOI18N
        YesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesButtonActionPerformed(evt);
            }
        });
        jPanel1.add(YesButton);
        YesButton.setBounds(490, 290, 130, 110);

        surpassedEasyBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel Esperanza\\OneDrive - DEPED REGION 1\\Documents\\NetBeansProjects\\RiddlersGame\\src\\main\\java\\images\\SurpasssedEasyLevel.jpg")); // NOI18N
        jPanel1.add(surpassedEasyBackground);
        surpassedEasyBackground.setBounds(0, 0, 710, 477);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 678, 477);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void YesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesButtonActionPerformed
        riddlersGame.resetTimer();
        riddlersGame.resumeTimer();
        dispose(); 
    }//GEN-LAST:event_YesButtonActionPerformed

    private void NoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoButtonActionPerformed
        HomePage homePage = new HomePage();
        homePage.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_NoButtonActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RiddlersGame riddlersGame = new RiddlersGame();
                riddlersGame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NoButton;
    private javax.swing.JButton YesButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel surpassedEasyBackground;
    // End of variables declaration//GEN-END:variables
}
