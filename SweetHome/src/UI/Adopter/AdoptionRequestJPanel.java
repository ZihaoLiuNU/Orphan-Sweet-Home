package UI.Adopter;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.AdoptionEnterprise;
import Model.Enterprise.Enterprise;
import Model.Enterprise.OrphanShelterEnterprise;
import Model.Organization.AdopterOrganization;
import Model.Orphan.Orphan;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.AdoptionRequest;
import Model.WorkQueue.MedCareRequest;
import Model.WorkQueue.PharmacistWorkRequest;
import Model.WorkQueue.WorkRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
/**
 *
 * @author hp
 */
public class AdoptionRequestJPanel extends javax.swing.JPanel {

    EcoSystem ecosys;
    Network network;
    AdoptionEnterprise enterprise;
    AdopterOrganization org;
    UserAccount useraccount;
    Orphan orphan;

    /**
     * Creates new form AdopterWorkAreaJPanel
     */
    public AdoptionRequestJPanel() {
        initComponents();
    }

    public AdoptionRequestJPanel(EcoSystem ecosys, Network network, AdoptionEnterprise enterprise, AdopterOrganization org, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        this.ecosys = ecosys;
        this.network = network;
        this.enterprise = enterprise;
        this.org = org;
        this.useraccount = useraccount;

        String getStatus = this.useraccount.getWorkQueue().findWorkRequestByMessage("New User").getStatus();

        if (getStatus.equalsIgnoreCase("Pending")) {
            statusLabel.setText("Your adopter status is waiting for precess......you are not allowed to find details about Orphans");
            lblOrphanSelection.setVisible(false);
            tbOrphanList.setVisible(false);
            btnViewDetails.setVisible(false);
            btnSendRequest.setVisible(false);
            lblAdoptionRequest.setVisible(false);
            tbAdoptionRequests.setVisible(false);

        } else if (getStatus.equalsIgnoreCase("Accepted")) {
            statusLabel.setText("Your adoptive identity has been accepted, now you can make adoption request~");
            lblOrphanSelection.setVisible(true);
            tbOrphanList.setVisible(true);
            btnViewDetails.setVisible(true);
            btnSendRequest.setVisible(true);
            lblAdoptionRequest.setVisible(true);
            tbAdoptionRequests.setVisible(true);
//            show orphan details and adoper applications
            populateOrphanTable();
            populateRequestTable();

        } else if (getStatus.equalsIgnoreCase("Processed")) {
            statusLabel.setText("Your adopter status is under reviewing by Authority: " + this.useraccount.getWorkQueue().findWorkRequestByMessage("New User").getReceiver());
            lblOrphanSelection.setVisible(false);
            tbOrphanList.setVisible(false);
            btnViewDetails.setVisible(false);
            btnSendRequest.setVisible(false);
            lblAdoptionRequest.setVisible(false);
            tbAdoptionRequests.setVisible(false);

        } else if (getStatus.equalsIgnoreCase("Rejected")) {
            statusLabel.setText("Sorry,You don't meet the standards of an adopter......");
            lblOrphanSelection.setVisible(false);
            tbOrphanList.setVisible(false);
            btnViewDetails.setVisible(false);
            btnSendRequest.setVisible(false);
            lblAdoptionRequest.setVisible(false);
            tbAdoptionRequests.setVisible(false);

        }

    }

    private void populateOrphanTable() {

        DefaultTableModel model = (DefaultTableModel) tbOrphanList.getModel();
        model.setRowCount(0);

        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (e instanceof OrphanShelterEnterprise) {
                for (Orphan o : ((OrphanShelterEnterprise) e).getOrphanDirectory().getOrphanList()) {
                    if (o.getAdoptor() == null && o.getManager() != null) {
                        ArrayList<WorkRequest> list = new ArrayList<WorkRequest>();
                        for (WorkRequest beg : o.getWorkQueue().getWorkRequestList()) {
                            //request
                            if ((beg instanceof MedCareRequest && beg.getStatus().equalsIgnoreCase("Completed"))) {
                                list.add(beg);
                            }
                        }
                        if (!list.isEmpty()) {
                            //create new row
                            Object[] table = new Object[5];

                            table[0] = o;
                            table[1] = o.getSex();
                            table[2] = o.getAge();
                            table[3] = o.getManager();
                            table[4] = o.getManager().getEnterprise();

                            model.addRow(table);

                        }

                    }
                }
            }
        }
    }

    private void populateRequestTable() {

        DefaultTableModel model = (DefaultTableModel) tbAdoptionRequests.getModel();
        model.setRowCount(0);

        for (WorkRequest request : this.useraccount.getWorkQueue().getWorkRequestList()) {
            if (request instanceof AdoptionRequest) {

                Object[] table = new Object[5];
                table[0] = request.getOrphan().getId();
                table[1] = request.getOrphan().getName();
                table[2] = request.getOrphan().getManager();
                table[3] = request.getOrphan().getManager().getEnterprise();
                table[4] = request.getStatus();

                model.addRow(table);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel3 = new keeptoo.KGradientPanel();
        lblOrphanSelection = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbOrphanList = new javax.swing.JTable();
        btnViewDetails = new javax.swing.JButton();
        btnSendRequest = new javax.swing.JButton();
        lblAdoptionRequest = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbAdoptionRequests = new javax.swing.JTable();
        statusLabel = new javax.swing.JLabel();
        btnDonate = new javax.swing.JButton();

        setBackground(new java.awt.Color(252, 74, 26));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.BorderLayout());

        kGradientPanel3.setkEndColor(new java.awt.Color(247, 183, 51));
        kGradientPanel3.setkStartColor(new java.awt.Color(252, 74, 26));
        kGradientPanel3.setPreferredSize(new java.awt.Dimension(800, 520));
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOrphanSelection.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblOrphanSelection.setForeground(new java.awt.Color(255, 255, 255));
        lblOrphanSelection.setText("Orphans who are waiting for a sweet home");
        kGradientPanel3.add(lblOrphanSelection, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 365, -1));

        tbOrphanList.setBackground(new java.awt.Color(204, 204, 204));
        tbOrphanList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Sex", "Age", "Manager", "OrphanShelterEnterprise"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbOrphanList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbOrphanListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbOrphanList);

        kGradientPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 790, 137));

        btnViewDetails.setBackground(new java.awt.Color(252, 74, 26));
        btnViewDetails.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnViewDetails.setText("View orphan detail");
        btnViewDetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });
        kGradientPanel3.add(btnViewDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 200, -1));

        btnSendRequest.setBackground(new java.awt.Color(252, 74, 26));
        btnSendRequest.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSendRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnSendRequest.setText("Request Application");
        btnSendRequest.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSendRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendRequestActionPerformed(evt);
            }
        });
        kGradientPanel3.add(btnSendRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 200, -1));

        lblAdoptionRequest.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAdoptionRequest.setForeground(new java.awt.Color(255, 255, 255));
        lblAdoptionRequest.setText("Your Adoption Application");
        kGradientPanel3.add(lblAdoptionRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 367, 224, -1));

        tbAdoptionRequests.setBackground(new java.awt.Color(204, 204, 204));
        tbAdoptionRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Manager", "Enterprise", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbAdoptionRequests);

        kGradientPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 790, 147));

        statusLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(255, 255, 255));
        statusLabel.setText("Your adopter status is under review......you are not allowed to find details about Orphans");
        kGradientPanel3.add(statusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 54, 739, -1));

        btnDonate.setBackground(new java.awt.Color(252, 74, 26));
        btnDonate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDonate.setForeground(new java.awt.Color(255, 255, 255));
        btnDonate.setText("Donate US");
        btnDonate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDonate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonateActionPerformed(evt);
            }
        });
        kGradientPanel3.add(btnDonate, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 200, -1));

        add(kGradientPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDonateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonateActionPerformed
        DonateFrame newJFrame = new DonateFrame(this.ecosys, this.network, this.enterprise, this.org, this.useraccount);
        newJFrame.setLocationRelativeTo(null);
        newJFrame.setVisible(true);
    }//GEN-LAST:event_btnDonateActionPerformed

    private void btnSendRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendRequestActionPerformed
        int selectedRow = tbOrphanList.getSelectedRow();

        if (selectedRow >= 0) {

            Orphan selectedOr = (Orphan) tbOrphanList.getValueAt(selectedRow, 0);

            for (WorkRequest request : this.useraccount.getWorkQueue().getWorkRequestList()) {
                if (request.getOrphan() == selectedOr) {
                    JOptionPane.showMessageDialog(this, "Your have already sent Application for this kid.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }

            AdoptionRequest request = new AdoptionRequest();
            request.setMessage("New Adoption Request");
            request.setOrphan(selectedOr);
            request.setSender(this.useraccount);
            request.setStatus("Pending Review");

            network.getWorkQueue().getWorkRequestList().add(request);
            this.useraccount.getWorkQueue().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(this, "Adoption application has been sent.", "Information", JOptionPane.INFORMATION_MESSAGE);
            populateRequestTable();

        } else {
            JOptionPane.showMessageDialog(this, "Please choose first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnSendRequestActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        try {
            int selectedRow = tbOrphanList.getSelectedRow();
            Orphan or = (Orphan) tbOrphanList.getValueAt(selectedRow, 0);

            ViewOrphanDetailJFrame newJFrame = new ViewOrphanDetailJFrame(this.ecosys, this.network, this.enterprise, this.org, this.useraccount, or);
            newJFrame.setLocationRelativeTo(null);
            newJFrame.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please choose first", "Warning", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void tbOrphanListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbOrphanListMouseClicked

    }//GEN-LAST:event_tbOrphanListMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDonate;
    private javax.swing.JButton btnSendRequest;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private javax.swing.JLabel lblAdoptionRequest;
    private javax.swing.JLabel lblOrphanSelection;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTable tbAdoptionRequests;
    private javax.swing.JTable tbOrphanList;
    // End of variables declaration//GEN-END:variables

}
