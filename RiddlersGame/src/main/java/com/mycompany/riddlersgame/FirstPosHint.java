package com.mycompany.riddlersgame;

public class FirstPosHint extends javax.swing.JFrame {
    private String hint;
    private String imagePath;
    
    
    public FirstPosHint(String hint) {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        FirstPosHintLabel.setText(hint); 
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        FirstPosHintLabel = new javax.swing.JLabel();
        Hint1Ok = new javax.swing.JButton();
        Hint1background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(678, 468));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(720, 530));
        jPanel1.setPreferredSize(new java.awt.Dimension(678, 477));
        jPanel1.setLayout(null);

        FirstPosHintLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        FirstPosHintLabel.setForeground(new java.awt.Color(102, 51, 0));
        FirstPosHintLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FirstPosHintLabel.setText("firstposhint");
        FirstPosHintLabel.setFocusable(false);
        FirstPosHintLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FirstPosHintLabel.setMaximumSize(new java.awt.Dimension(401, 244));
        FirstPosHintLabel.setMinimumSize(new java.awt.Dimension(401, 244));
        FirstPosHintLabel.setPreferredSize(new java.awt.Dimension(401, 244));
        jPanel1.add(FirstPosHintLabel);
        FirstPosHintLabel.setBounds(150, 150, 401, 244);

        Hint1Ok.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel Esperanza\\OneDrive - DEPED REGION 1\\Documents\\NetBeansProjects\\RiddlersGame\\src\\main\\java\\images\\checkbutton.png")); // NOI18N
        Hint1Ok.setToolTipText("");
        Hint1Ok.setBorder(null);
        Hint1Ok.setBorderPainted(false);
        Hint1Ok.setContentAreaFilled(false);
        Hint1Ok.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel Esperanza\\OneDrive - DEPED REGION 1\\Documents\\NetBeansProjects\\RiddlersGame\\src\\main\\java\\images\\DarkCheckButton.png")); // NOI18N
        Hint1Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hint1OkActionPerformed(evt);
            }
        });
        jPanel1.add(Hint1Ok);
        Hint1Ok.setBounds(520, 340, 160, 140);

        Hint1background.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel Esperanza\\OneDrive - DEPED REGION 1\\Documents\\NetBeansProjects\\RiddlersGame\\src\\main\\java\\images\\Hint.jpg")); // NOI18N
        Hint1background.setText("jLabel1");
        jPanel1.add(Hint1background);
        Hint1background.setBounds(0, -10, 680, 500);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 720, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Hint1OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hint1OkActionPerformed
    dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_Hint1OkActionPerformed

    
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
            java.util.logging.Logger.getLogger(FirstPosHint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstPosHint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstPosHint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstPosHint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstPosHint("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FirstPosHintLabel;
    private javax.swing.JButton Hint1Ok;
    private javax.swing.JLabel Hint1background;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
