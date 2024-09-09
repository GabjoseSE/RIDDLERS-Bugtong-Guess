package com.mycompany.riddlersgame;
public class TimesUp extends javax.swing.JFrame {

private RiddlersGame riddlersGame;

    public TimesUp(RiddlersGame riddlersGame) {
        this.riddlersGame = riddlersGame;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        timeUpokButton = new javax.swing.JButton();
        timesUpBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(678, 470));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(678, 470));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(678, 470));
        jPanel1.setPreferredSize(new java.awt.Dimension(678, 477));
        jPanel1.setLayout(null);

        timeUpokButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checkbutton.png"))); // NOI18N
        timeUpokButton.setBorder(null);
        timeUpokButton.setBorderPainted(false);
        timeUpokButton.setContentAreaFilled(false);
        timeUpokButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DarkCheckButton.png"))); // NOI18N
        timeUpokButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeUpokButtonActionPerformed(evt);
            }
        });
        jPanel1.add(timeUpokButton);
        timeUpokButton.setBounds(520, 270, 110, 110);

        timesUpBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/timesup.jpg"))); // NOI18N
        timesUpBackground.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(timesUpBackground);
        timesUpBackground.setBounds(0, 0, 710, 480);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 678, 477);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void timeUpokButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeUpokButtonActionPerformed
        riddlersGame.playSound("/sfx/Button sound.wav");
        riddlersGame.setEnabled(true);
        dispose();
        riddlersGame.moveToNextQuestion();
    }//GEN-LAST:event_timeUpokButtonActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RiddlersGame riddlersGame = new RiddlersGame();
                riddlersGame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton timeUpokButton;
    private javax.swing.JLabel timesUpBackground;
    // End of variables declaration//GEN-END:variables
}
