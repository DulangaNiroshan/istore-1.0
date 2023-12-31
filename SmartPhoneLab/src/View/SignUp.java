package View;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Samsung
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
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

        btnCreate = new javax.swing.JButton();
        cmbAccType = new javax.swing.JComboBox<>();
        txtUserName = new javax.swing.JTextField();
        lblUserLogin = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        lblAccType = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        pwdPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Smart Phone Lab - Create Account");
        setName("frmSignUp"); // NOI18N
        setResizable(false);

        btnCreate.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnCreate.setText("Create Account");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        cmbAccType.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbAccType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Account Type", "Manager", "Cashier" }));

        txtUserName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        lblUserLogin.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblUserLogin.setText("iStore Account Create");

        lblUserName.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblUserName.setText("User Name :");

        lblPass.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblPass.setText("Password :");

        lblAccType.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblAccType.setText("Account Type :");

        btnBack.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        pwdPass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAccType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbAccType, javax.swing.GroupLayout.Alignment.LEADING, 0, 158, Short.MAX_VALUE)
                            .addComponent(pwdPass, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(lblUserLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbAccType, txtUserName});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAccType, lblPass, lblUserName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblUserLogin)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPass)
                    .addComponent(pwdPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAccType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAccType))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnBack))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbAccType, txtUserName});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAccType, lblPass, lblUserName});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ManagerUI manager = new ManagerUI();
        manager.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        if (txtUserName.getText().isEmpty() || pwdPass.getPassword().length == 0 || cmbAccType.getSelectedItem().equals("Select Account Type")) {
            JOptionPane.showMessageDialog(this, "Some Fields Are Empty!");
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/smart_phone_lab", "root", "");PreparedStatement pst = con.prepareStatement("INSERT INTO accounts (username, password, acctype) VALUES (?, ?, ?)")) {

                    pst.setString(1, txtUserName.getText());

                    char[] password = pwdPass.getPassword();
                    pst.setString(2, new String(password));

                    pst.setString(3, String.valueOf(cmbAccType.getSelectedItem()));

                    int rowsAffected = pst.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(this, "Account Created Successfully!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Error! Try Again!");
                    }
                }
            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                //e.printStackTrace();
                JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCreateActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SignUp().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox<String> cmbAccType;
    private javax.swing.JLabel lblAccType;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUserLogin;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField pwdPass;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
