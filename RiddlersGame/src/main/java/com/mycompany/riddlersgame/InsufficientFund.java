
package com.mycompany.riddlersgame;


public class InsufficientFund extends javax.swing.JFrame {

   
    public InsufficientFund() {
        initComponents();
        
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        OkButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        OkButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checkbutton.png"))); // NOI18N
        OkButton.setBorder(null);
        OkButton.setBorderPainted(false);
        OkButton.setContentAreaFilled(false);
        OkButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DarkCheckButton.png"))); // NOI18N
        OkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonActionPerformed(evt);
            }
        });
        jPanel1.add(OkButton);
        OkButton.setBounds(510, 270, 130, 110);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/insufficientfundbackground.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 680, 480);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 678, 477);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonActionPerformed
        dispose();
    }//GEN-LAST:event_OkButtonActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsufficientFund().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OkButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
