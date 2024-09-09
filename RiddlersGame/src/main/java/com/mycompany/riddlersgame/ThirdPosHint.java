package com.mycompany.riddlersgame;

import javax.swing.ImageIcon;

public class ThirdPosHint extends javax.swing.JFrame {
    private String hint;
    private String imagePath;

    public ThirdPosHint(String hint, String imagePath) {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        this.hint = hint;
        this.imagePath = imagePath;
        setImageHint(imagePath);
        
    }

    private void setImageHint(String imagePath) {
    ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));
    // Resize the image to fit the label
    icon = new ImageIcon(icon.getImage().getScaledInstance(ThirdPosHintLabel.getWidth(), ThirdPosHintLabel.getHeight(), java.awt.Image.SCALE_SMOOTH));
    ThirdPosHintLabel.setIcon(icon);
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ThirdPosHintLabel = new javax.swing.JLabel();
        Hint3Ok = new javax.swing.JButton();
        Hint3background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(678, 477));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(720, 530));
        jPanel1.setPreferredSize(new java.awt.Dimension(678, 477));
        jPanel1.setLayout(null);

        ThirdPosHintLabel.setBackground(new java.awt.Color(0, 0, 0));
        ThirdPosHintLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ThirdPosHintLabel.setForeground(new java.awt.Color(102, 51, 0));
        ThirdPosHintLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ThirdPosHintLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ThirdPosHintLabel.setMaximumSize(new java.awt.Dimension(401, 244));
        ThirdPosHintLabel.setMinimumSize(new java.awt.Dimension(401, 244));
        ThirdPosHintLabel.setPreferredSize(new java.awt.Dimension(401, 244));
        jPanel1.add(ThirdPosHintLabel);
        ThirdPosHintLabel.setBounds(140, 150, 400, 243);

        Hint3Ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checkbutton.png"))); // NOI18N
        Hint3Ok.setBorder(null);
        Hint3Ok.setBorderPainted(false);
        Hint3Ok.setContentAreaFilled(false);
        Hint3Ok.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/darkcheckbutton.png"))); // NOI18N
        Hint3Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hint3OkActionPerformed(evt);
            }
        });
        jPanel1.add(Hint3Ok);
        Hint3Ok.setBounds(520, 340, 160, 140);

        Hint3background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hintbackground.jpg"))); // NOI18N
        Hint3background.setText("jLabel1");
        jPanel1.add(Hint3background);
        Hint3background.setBounds(0, -10, 680, 490);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 720, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Hint3OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hint3OkActionPerformed
        dispose();
    }//GEN-LAST:event_Hint3OkActionPerformed

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
            java.util.logging.Logger.getLogger(ThirdPosHint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThirdPosHint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThirdPosHint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThirdPosHint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThirdPosHint thirdPosHint = new ThirdPosHint("", "");
                thirdPosHint.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hint3Ok;
    private javax.swing.JLabel Hint3background;
    private javax.swing.JLabel ThirdPosHintLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
