/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.AdministrativeRole;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.EmailValidator;
import Model.EcoSystem.Network;
import Model.Enterprise.AdoptionEnterprise;
import Model.Enterprise.Enterprise;
import Model.Organization.AdopterOrganization;
import Model.Organization.Organization;
import Model.Role.AdopterRole;
import Model.Role.Role;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.AdopterAuthorizationRequest;
import static UI.Basic.RegisterJFrame.isValidIncome;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ma2017
 */
public class ManageAdopterJPanel extends javax.swing.JPanel {

    EcoSystem ecosys;
    UserAccount useraccount;

    /**
     * Creates new form ManageAdopterJPane
     */
    public ManageAdopterJPanel() {
        initComponents();
    }

    public ManageAdopterJPanel(EcoSystem ecosys, UserAccount useraccount) {
        initComponents();
        this.ecosys = ecosys;
        this.useraccount = useraccount;
        populateNetworkCombo();
        populateEnterpriseCombo();
        populateOrgCombo();
        populateUserAccountsTable();
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
        lblTitle = new javax.swing.JLabel();
        lblUsersList = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        lblOrganizationPicker = new javax.swing.JLabel();
        cmbNetworkList = new javax.swing.JComboBox();
        lblOrganization = new javax.swing.JLabel();
        cmbEnterprise = new javax.swing.JComboBox();
        lblEmployee = new javax.swing.JLabel();
        cmbOrg = new javax.swing.JComboBox();
        lblRole = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        pwdUser = new javax.swing.JTextField();
        btnCreateUser = new javax.swing.JButton();
        btnUpdateUser = new javax.swing.JButton();
        btnDeleteUser = new javax.swing.JButton();
        Email = new javax.swing.JTextField();
        lblPassword1 = new javax.swing.JLabel();
        incomeFID = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(800, 520));

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 221, 225));
        kGradientPanel1.setkStartColor(new java.awt.Color(238, 156, 167));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Manage Adopter Users");

        lblUsersList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsersList.setForeground(new java.awt.Color(255, 255, 255));
        lblUsersList.setText("Users List:");

        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Email", "Organization", "Enterprise", "Network", "Income"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUsers);

        lblOrganizationPicker.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblOrganizationPicker.setForeground(new java.awt.Color(255, 255, 255));
        lblOrganizationPicker.setText("NetWork");

        cmbNetworkList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbNetworkListItemStateChanged(evt);
            }
        });

        lblOrganization.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblOrganization.setForeground(new java.awt.Color(255, 255, 255));
        lblOrganization.setText("Enterprise:");

        cmbEnterprise.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEnterpriseItemStateChanged(evt);
            }
        });

        lblEmployee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEmployee.setForeground(new java.awt.Color(255, 255, 255));
        lblEmployee.setText("Organization:");

        cmbOrg.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbOrgItemStateChanged(evt);
            }
        });

        lblRole.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRole.setForeground(new java.awt.Color(255, 255, 255));
        lblRole.setText("Email:");

        lblUserName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setText("User Name:");

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password:");

        btnCreateUser.setBackground(new java.awt.Color(238, 156, 167));
        btnCreateUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCreateUser.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateUser.setText("Create User");
        btnCreateUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });

        btnUpdateUser.setBackground(new java.awt.Color(238, 156, 167));
        btnUpdateUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdateUser.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateUser.setText("Update User");
        btnUpdateUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });

        btnDeleteUser.setBackground(new java.awt.Color(238, 156, 167));
        btnDeleteUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeleteUser.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteUser.setText("Delete User");
        btnDeleteUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });

        lblPassword1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPassword1.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword1.setText("Annual Income:");

        incomeFID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incomeFIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(465, 465, 465)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblUsersList)
                        .addGap(382, 382, 382)
                        .addComponent(lblOrganizationPicker)
                        .addGap(50, 50, 50)
                        .addComponent(cmbNetworkList, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(lblOrganization)
                                        .addGap(41, 41, 41)
                                        .addComponent(cmbEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(lblEmployee)
                                        .addGap(21, 21, 21)
                                        .addComponent(cmbOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(lblUserName)
                                        .addGap(37, 37, 37)
                                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(lblPassword)
                                        .addGap(46, 46, 46)
                                        .addComponent(pwdUser, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(lblPassword1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(incomeFID, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUpdateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitle)
                .addGap(27, 27, 27)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsersList)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOrganizationPicker)
                            .addComponent(cmbNetworkList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOrganization)
                            .addComponent(cmbEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmployee)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(cmbOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRole)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserName)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(pwdUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword1)
                            .addComponent(incomeFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btnUpdateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btnDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbNetworkListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbNetworkListItemStateChanged
        populateEnterpriseCombo();
        populateOrgCombo();

        populateUserAccountsTable();
    }//GEN-LAST:event_cmbNetworkListItemStateChanged

    private void cmbEnterpriseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEnterpriseItemStateChanged
        populateOrgCombo();

        populateUserAccountsTable();
    }//GEN-LAST:event_cmbEnterpriseItemStateChanged

    private void cmbOrgItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbOrgItemStateChanged

        populateUserAccountsTable();
    }//GEN-LAST:event_cmbOrgItemStateChanged

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        try {
            String newUsername = txtUserName.getText();
            String newPassword = pwdUser.getText();
            String newEmailId = Email.getText();

            Network selectedNetw = (Network) cmbNetworkList.getSelectedItem();

            String selectedOption = (String) cmbEnterprise.getSelectedItem();
            String enterpriseName = selectedOption.split("\\s\\|\\s")[1];
            Enterprise enterprise = selectedNetw.getEnterpriseDirectory().getEnterpriseByName(enterpriseName);

            String selectedOrgOption = cmbOrg.getSelectedItem().toString();
            String orgName = selectedOrgOption.split("\\s\\|\\s")[1];
            Organization organization = enterprise.getOrganizationDirectory().getOrganizationByName(orgName);

            EmailValidator emailValidator = new EmailValidator();

            if (selectedNetw != null && selectedOption != null && selectedOrgOption != null
                    && !newUsername.isEmpty() && !newPassword.isEmpty() && !newEmailId.isEmpty()) {     //null validation

                if (emailValidator.validate(Email.getText().trim())) {
                    if (isValidIncome(incomeFID)) {
                        if (this.ecosys.getUserAccountDirectory().userNameIsUnique(newUsername)) {
                            UserAccount newUserAccount = this.ecosys.getUserAccountDirectory().createUserAccount(newUsername, newPassword, new AdopterRole(), selectedNetw, enterprise, organization);
                            newUserAccount.setEmailId(newEmailId);
                            JOptionPane.showMessageDialog(this, "Adopter user Account added successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                            txtUserName.setText("");
                            pwdUser.setText("");
                            Email.setText("");

                            AdopterAuthorizationRequest request = new AdopterAuthorizationRequest();
                            request.setMessage("New User");
                            request.setSender(newUserAccount);
                            request.setStatus("Pending");

                            enterprise.getWorkQueue().getWorkRequestList().add(request);
                            newUserAccount.getWorkQueue().getWorkRequestList().add(request);
                            populateUserAccountsTable();
                        } else {
                            JOptionPane.showMessageDialog(this, "Adopter User Account already existed", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, " Invalid income", "Warning", JOptionPane.WARNING_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Invalid Email", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "All fields cannot be blank", "Warning", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Network / Enterprise cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);

        }


    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed
        try {
            String keywordName = txtUserName.getText();
            String keyPass = pwdUser.getText();
            String keyEm = Email.getText();

            int selectedRow = tblUsers.getSelectedRow();
            Network network = (Network) cmbNetworkList.getSelectedItem();

            String selectedOption = (String) cmbEnterprise.getSelectedItem();
            String enterpriseName = selectedOption.split("\\s\\|\\s")[1];
            Enterprise enterprise = network.getEnterpriseDirectory().getEnterpriseByName(enterpriseName);

            String selectedOrgOption = cmbOrg.getSelectedItem().toString();
            String orgName = selectedOrgOption.split("\\s\\|\\s")[1];
            Organization organization = enterprise.getOrganizationDirectory().getOrganizationByName(orgName);

            UserAccount selecteduser = (UserAccount) tblUsers.getValueAt(selectedRow, 0);
            EmailValidator emailValidator = new EmailValidator();

            if (selectedRow >= 0) {
                if ((!keywordName.isEmpty()) && (!keyPass.isEmpty()) && (!keyEm.isEmpty())) {

                    if (emailValidator.validate(Email.getText().trim())) {
                        if (isValidIncome(incomeFID)) {
                            if (this.ecosys.getUserAccountDirectory().userNameIsUnique(keywordName)) {
                                selecteduser.setUsername(keywordName);
                                selecteduser.setPassword(keyPass);
                                selecteduser.setEmailId(keyEm);

                                JOptionPane.showMessageDialog(this, " Adopter UserAcocunt aupdated", "Information", JOptionPane.INFORMATION_MESSAGE);
                                txtUserName.setText("");
                                pwdUser.setText("");
                                Email.setText("");
                                populateUserAccountsTable();
                            } else {
                                JOptionPane.showMessageDialog(this, "user name alreay existed", "Warning", JOptionPane.WARNING_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, " Invalid income! ", "Warning", JOptionPane.WARNING_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "Invalid Email", "Warning", JOptionPane.WARNING_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Email/Name/password cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please choose an Useraccount");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "please choose an useraccount.", "Warning", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_btnUpdateUserActionPerformed

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        try {
            int selectedRow = tblUsers.getSelectedRow();

            Network network = (Network) cmbNetworkList.getSelectedItem();
            String selectedOption = (String) cmbEnterprise.getSelectedItem();
            String enterpriseName = selectedOption.split("\\s\\|\\s")[1];
            Enterprise enterprise = network.getEnterpriseDirectory().getEnterpriseByName(enterpriseName);

            String selectedOrgOption = cmbOrg.getSelectedItem().toString();
            String orgName = selectedOrgOption.split("\\s\\|\\s")[1];
            Organization organization = enterprise.getOrganizationDirectory().getOrganizationByName(orgName);

            UserAccount ua = (UserAccount) tblUsers.getValueAt(selectedRow, 0);

            if (selectedRow >= 0) {

                this.ecosys.getUserAccountDirectory().deleteUserAccount(ua);
                txtUserName.setText("");
                pwdUser.setText("");
                Email.setText("");
                populateUserAccountsTable();
                JOptionPane.showMessageDialog(this, "UserAccount deleted", "Information", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Please choose an UserAccount");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "please choose an useraccount.", "Warning", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void incomeFIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incomeFIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_incomeFIDActionPerformed

    private void populateNetworkCombo() {

        cmbNetworkList.removeAllItems();

        if (!this.ecosys.getNetworkList().isEmpty()) {
            for (Network n : this.ecosys.getNetworkList()) {
                cmbNetworkList.addItem(n);
            }
        }
    }

    private void populateEnterpriseCombo() {

        cmbEnterprise.removeAllItems();

        Network network = (Network) cmbNetworkList.getSelectedItem();

        if (network != null) {
            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.getType().equals(Enterprise.Type.Adoption)) {
                    cmbEnterprise.addItem(e.getType() + " | " + e);
                }

            }
        }
    }

    private void populateOrgCombo() {

        cmbOrg.removeAllItems();

        Network network = (Network) cmbNetworkList.getSelectedItem();

        if (cmbEnterprise.getSelectedItem() != null) {
            String selectedOption = (String) cmbEnterprise.getSelectedItem();
            String enterpriseName = selectedOption.split("\\s\\|\\s")[1];
            Enterprise enterprise = network.getEnterpriseDirectory().getEnterpriseByName(enterpriseName);

            for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (o.getType().equals(Organization.Type.AdopterManagement)) {
                    cmbOrg.addItem(o.getType() + " | " + o);
                }

            }
        }
    }

    public void populateUserAccountsTable() {

        DefaultTableModel model = (DefaultTableModel) tblUsers.getModel();
        model.setRowCount(0);
        Network selectedNetwork = (Network) cmbNetworkList.getSelectedItem();

        for (UserAccount ua : this.ecosys.getUserAccountDirectory().getUserAccountList()) {

            if (ua.getNetwork().equals(selectedNetwork) && (ua.getRole().type.equals(Role.RoleType.Adopter))) {

                Object row[] = new Object[6];
                row[0] = ua;
                row[1] = ua.getEmailId();
                row[2] = ua.getOrgainization();
                row[3] = ua.getEnterprise();
                row[4] = ua.getNetwork();
                row[5] = ua.getIncome();
                model.addRow(row);
            }

        }

    }

    public static boolean isValidIncome(JTextField textField) {
        String input = textField.getText();
        try {
            float number = Float.parseFloat(input);
            if (number >= 0) {
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JComboBox cmbEnterprise;
    private javax.swing.JComboBox cmbNetworkList;
    private javax.swing.JComboBox cmbOrg;
    private javax.swing.JTextField incomeFID;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblOrganization;
    private javax.swing.JLabel lblOrganizationPicker;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUsersList;
    private javax.swing.JTextField pwdUser;
    private javax.swing.JTable tblUsers;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}