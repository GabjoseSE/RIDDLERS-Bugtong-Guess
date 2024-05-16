package com.mycompany.riddlersgame;

public class SecondPosHint extends javax.swing.JFrame {

    private String hint;
    private String imagePath;
    
    public SecondPosHint(String hint) {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        SecondPosHintLabel.setText(hint);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SecondPosHintLabel = new javax.swing.JLabel();
        Hint2Ok = new javax.swing.JButton();
        Hint2background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(678, 477));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(678, 470));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(720, 530));
        jPanel1.setPreferredSize(new java.awt.Dimension(678, 477));
        jPanel1.setLayout(null);

        SecondPosHintLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        SecondPosHintLabel.setForeground(new java.awt.Color(102, 51, 0));
        SecondPosHintLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SecondPosHintLabel.setText("secondposhint");
        SecondPosHintLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SecondPosHintLabel.setMaximumSize(new java.awt.Dimension(401, 244));
        SecondPosHintLabel.setMinimumSize(new java.awt.Dimension(401, 244));
        SecondPosHintLabel.setPreferredSize(new java.awt.Dimension(401, 244));
        jPanel1.add(SecondPosHintLabel);
        SecondPosHintLabel.setBounds(150, 150, 401, 244);

        Hint2Ok.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel Esperanza\\OneDrive - DEPED REGION 1\\Documents\\NetBeansProjects\\RiddlersGame\\src\\main\\java\\images\\checkbutton.png")); // NOI18N
        Hint2Ok.setBorder(null);
        Hint2Ok.setBorderPainted(false);
        Hint2Ok.setContentAreaFilled(false);
        Hint2Ok.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel Esperanza\\OneDrive - DEPED REGION 1\\Documents\\NetBeansProjects\\RiddlersGame\\src\\main\\java\\images\\DarkCheckButton.png")); // NOI18N
        Hint2Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hint2OkActionPerformed(evt);
            }
        });
        jPanel1.add(Hint2Ok);
        Hint2Ok.setBounds(520, 340, 160, 140);

        Hint2background.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel Esperanza\\OneDrive - DEPED REGION 1\\Documents\\NetBeansProjects\\RiddlersGame\\src\\main\\java\\images\\Hint.jpg")); // NOI18N
        jPanel1.add(Hint2background);
        Hint2background.setBounds(0, -40, 750, 560);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 720, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Hint2OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hint2OkActionPerformed
    dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_Hint2OkActionPerformed

   
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
            java.util.logging.Logger.getLogger(SecondPosHint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecondPosHint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecondPosHint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecondPosHint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecondPosHint("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hint2Ok;
    private javax.swing.JLabel Hint2background;
    private javax.swing.JLabel SecondPosHintLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
