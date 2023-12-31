/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Basic;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.EmailValidator;
import Model.EcoSystem.Network;
import Model.Enterprise.AdoptionEnterprise;
import Model.Enterprise.Enterprise;
import Model.Organization.AdopterOrganization;
import Model.Organization.Organization;
import Model.Role.AdopterRole;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.AdopterAuthorizationRequest;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Ma2017
 */
public class RegisterJFrame extends javax.swing.JFrame {

    EcoSystem sys;
    UserAccount useraccount;

    /**
     * Creates new form RegisterJFrame
     */
    public RegisterJFrame() {
        initComponents();
    }

    public RegisterJFrame(EcoSystem sys, UserAccount useraccount) {
        initComponents();
        this.sys = sys;
        this.useraccount = useraccount;

        populateNetworkCombo();
        populateEnterpriseCombo();
        populateOrgCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        userNameFID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PasswordFID = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        EmailFID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        EnterpriseCB = new javax.swing.JComboBox();
        NetworkCB = new javax.swing.JComboBox();
        OrganizationCB = new javax.swing.JComboBox();
        backBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        IncomeFID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(238, 156, 167));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 221, 225));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 550));

        userNameFID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userNameFID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(238, 156, 167)));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 156, 167));
        jLabel5.setText("UserName");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 156, 167));
        jLabel2.setText("Sign Up");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 156, 167));
        jLabel4.setText("Password");

        PasswordFID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PasswordFID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(238, 156, 167)));

        registerBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(238, 156, 167));
        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 156, 167));
        jLabel6.setText("Email");

        EmailFID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EmailFID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(238, 156, 167)));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 156, 167));
        jLabel7.setText("NetWork");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(238, 156, 167));
        jLabel8.setText("Enterprise");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(238, 156, 167));
        jLabel9.setText("Organization");

        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(238, 156, 167));
        backBtn.setText("<<BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(238, 156, 167));
        jLabel10.setText("Annual Income ($)");

        IncomeFID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IncomeFID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(238, 156, 167)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(IncomeFID)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordFID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(userNameFID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailFID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EnterpriseCB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NetworkCB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OrganizationCB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userNameFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PasswordFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EmailFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IncomeFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(NetworkCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addGap(11, 11, 11)
                .addComponent(EnterpriseCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OrganizationCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn)
                    .addComponent(backBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        try {
            String newUsername = userNameFID.getText();
            String newPassword = PasswordFID.getText();
            String newEmailId = EmailFID.getText();
            String newIncome = IncomeFID.getText();
            Network selectedNetw = (Network) NetworkCB.getSelectedItem();

            String selectedOption = (String) EnterpriseCB.getSelectedItem();
            String enterpriseName = selectedOption.split("\\s\\|\\s")[1];
            Enterprise enterprise = selectedNetw.getEnterpriseDirectory().getEnterpriseByName(enterpriseName);

            String selectedOrgOption = OrganizationCB.getSelectedItem().toString();
            String orgName = selectedOrgOption.split("\\s\\|\\s")[1];
            Organization organization = enterprise.getOrganizationDirectory().getOrganizationByName(orgName);

            EmailValidator emailValidator = new EmailValidator();

            if (selectedNetw != null && selectedOption != null && selectedOrgOption != null
                    && !newUsername.isEmpty() && !newPassword.isEmpty() && !newEmailId.isEmpty() && !newIncome.isEmpty()) {     //null validation

                if (emailValidator.validate(EmailFID.getText().trim())) {
                    if (isValidIncome(IncomeFID)) {
                        if (this.sys.getUserAccountDirectory().userNameIsUnique(newUsername)) {
                            UserAccount newUserAccount = this.sys.getUserAccountDirectory().createUserAccount(newUsername, newPassword, new AdopterRole(), selectedNetw, enterprise, organization);
                            newUserAccount.setEmailId(newEmailId);
                            newUserAccount.setIncome(Float.valueOf(IncomeFID.getText()));
                            JOptionPane.showMessageDialog(this, "Adopter user Account added successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                            userNameFID.setText("");
                            PasswordFID.setText("");
                            EmailFID.setText("");
                            IncomeFID.setText("");

                            AdopterAuthorizationRequest request = new AdopterAuthorizationRequest();
                            request.setMessage("New User");
                            request.setSender(newUserAccount);
                            request.setStatus("Pending");

                            enterprise.getWorkQueue().getWorkRequestList().add(request);
                            newUserAccount.getWorkQueue().getWorkRequestList().add(request);

                        } else {
                            JOptionPane.showMessageDialog(this, " User Account already existed", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Please type income with correct format!", "Warning", JOptionPane.WARNING_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Invalid Email", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "All fields cannot be blank", "Warning", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Network / Enterprise / organization cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);

        }


    }//GEN-LAST:event_registerBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void populateNetworkCombo() {

        NetworkCB.removeAllItems();

        if (!this.sys.getNetworkList().isEmpty()) {
            for (Network n : this.sys.getNetworkList()) {
                NetworkCB.addItem(n);
            }
        }
    }

    private void populateEnterpriseCombo() {

        EnterpriseCB.removeAllItems();

        Network network = (Network) NetworkCB.getSelectedItem();

        if (network != null) {
            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.getType().equals(Enterprise.Type.Adoption)) {
                    EnterpriseCB.addItem(e.getType() + " | " + e);
                }

            }
        }
    }

    private void populateOrgCombo() {

        OrganizationCB.removeAllItems();

        Network network = (Network) NetworkCB.getSelectedItem();

        if (EnterpriseCB.getSelectedItem() != null) {
            String selectedOption = (String) EnterpriseCB.getSelectedItem();
            String enterpriseName = selectedOption.split("\\s\\|\\s")[1];
            Enterprise enterprise = network.getEnterpriseDirectory().getEnterpriseByName(enterpriseName);

            for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (o.getType().equals(Organization.Type.AdopterManagement)) {
                    OrganizationCB.addItem(o.getType() + " | " + o);
                }

            }
        }
    }

    public static boolean isValidIncome(JTextField textField) {
        String input = textField.getText();
        try {
            float number = Float.parseFloat(input);
            if (number > 0) {
                // Input is valid, between 1 and 10
                return true;
            } else {
                // Input is not between 1 and 10
                return false;
            }
        } catch (NumberFormatException e) {
            // Input is not a valid double
            return false;
        }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailFID;
    private javax.swing.JComboBox EnterpriseCB;
    private javax.swing.JTextField IncomeFID;
    private javax.swing.JComboBox NetworkCB;
    private javax.swing.JComboBox OrganizationCB;
    private javax.swing.JTextField PasswordFID;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField userNameFID;
    // End of variables declaration//GEN-END:variables
}
