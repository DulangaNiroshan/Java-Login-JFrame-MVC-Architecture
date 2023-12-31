package View;

import Controller.LoginController;

public class Login extends javax.swing.JFrame {

    private LoginController controller;
    
    public void setController(LoginController controller) {
        this.controller = controller;
    }

    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHPanel = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        pnlBPanel = new javax.swing.JPanel();
        lblUName = new javax.swing.JLabel();
        lblPword = new javax.swing.JLabel();
        lblAType = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        txtUName = new javax.swing.JTextField();
        pwdPwd = new javax.swing.JPasswordField();
        cmbAType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlHPanel.setBackground(new java.awt.Color(51, 153, 255));

        lblHeader.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setText("iStore User Login");

        javax.swing.GroupLayout pnlHPanelLayout = new javax.swing.GroupLayout(pnlHPanel);
        pnlHPanel.setLayout(pnlHPanelLayout);
        pnlHPanelLayout.setHorizontalGroup(
            pnlHPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHeader)
                .addGap(134, 134, 134))
        );
        pnlHPanelLayout.setVerticalGroup(
            pnlHPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblHeader)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pnlBPanel.setBackground(new java.awt.Color(50, 110, 175));

        lblUName.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblUName.setForeground(new java.awt.Color(255, 255, 255));
        lblUName.setText("User Name :");

        lblPword.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblPword.setForeground(new java.awt.Color(255, 255, 255));
        lblPword.setText("Password :");

        lblAType.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblAType.setForeground(new java.awt.Color(255, 255, 255));
        lblAType.setText("Account Type :");

        btnExit.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        cmbAType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Account Type", "Manager", "Cashier" }));

        javax.swing.GroupLayout pnlBPanelLayout = new javax.swing.GroupLayout(pnlBPanel);
        pnlBPanel.setLayout(pnlBPanelLayout);
        pnlBPanelLayout.setHorizontalGroup(
            pnlBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBPanelLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(pnlBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBPanelLayout.createSequentialGroup()
                        .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBPanelLayout.createSequentialGroup()
                        .addGroup(pnlBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUName)
                            .addComponent(lblPword)
                            .addComponent(lblAType))
                        .addGap(21, 21, 21)
                        .addGroup(pnlBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbAType, 0, 151, Short.MAX_VALUE)
                            .addComponent(pwdPwd)
                            .addComponent(txtUName))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        pnlBPanelLayout.setVerticalGroup(
            pnlBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pnlBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUName)
                    .addComponent(txtUName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPword)
                    .addComponent(pwdPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAType)
                    .addComponent(cmbAType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(pnlBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnClear)
                    .addComponent(btnLogin))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlHPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlHPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtUName.setText("");
        pwdPwd.setText("");
        cmbAType.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        controller.handleLogin();
    }//GEN-LAST:event_btnLoginActionPerformed

    public String getUsername() {
        return txtUName.getText();
    }
    
    public char[] getPassword() {
        return pwdPwd.getPassword();
    }
    
    public String getAccType() {
        return cmbAType.getSelectedItem().toString();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> cmbAType;
    private javax.swing.JLabel lblAType;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblPword;
    private javax.swing.JLabel lblUName;
    private javax.swing.JPanel pnlBPanel;
    private javax.swing.JPanel pnlHPanel;
    private javax.swing.JPasswordField pwdPwd;
    private javax.swing.JTextField txtUName;

    // End of variables declaration//GEN-END:variables
}
