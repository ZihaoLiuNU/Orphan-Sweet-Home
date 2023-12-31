/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.OrphanManagement;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.OrphanManagerRequest;
import Model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alilovepeach
 */
public class OrphanAssignmentJPanel extends javax.swing.JPanel {
    EcoSystem ecosys;
    Network network;
    Enterprise enterprise;
    Organization org;
    UserAccount userAccount;
    /**
     * Creates new form OrphanAssignment
     */
    public OrphanAssignmentJPanel(EcoSystem ecosys, Network network, Enterprise enterprise, Organization org, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        this.ecosys=ecosys;
        this.network=network;
        this.enterprise=enterprise;
        this.org=org;
        this.userAccount=useraccount;
        
        populateAssignOrphanToMeRequestTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrphanManagerWorkArea = new javax.swing.JTable();
        btnAssignOrphanToMe = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnViewDetial = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setMinimumSize(new java.awt.Dimension(800, 520));
        setPreferredSize(new java.awt.Dimension(800, 520));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(101, 78, 163));
        kGradientPanel1.setkStartColor(new java.awt.Color(234, 175, 200));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblOrphanManagerWorkArea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "ID", "Name", "Registor", "Manager", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrphanManagerWorkArea);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 780, 350));

        btnAssignOrphanToMe.setText("Receive the Orphan");
        btnAssignOrphanToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignOrphanToMeActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnAssignOrphanToMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, -1, 40));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Manage Orphan");
        kGradientPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 150, -1));

        btnViewDetial.setText("View Detail");
        btnViewDetial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetialActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnViewDetial, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 110, 40));

        add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 520));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignOrphanToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignOrphanToMeActionPerformed

        int selectedRow = tblOrphanManagerWorkArea.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) tblOrphanManagerWorkArea.getValueAt(selectedRow, 0);
            if (request.getStatus().equalsIgnoreCase("Adopted")) {
                JOptionPane.showMessageDialog(this, "This orphan has been adopted.", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                if (request.getReceiver() != null) {
                    JOptionPane.showMessageDialog(this, "This orphan already has a manager. Please select another one.", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    request.setReceiver(userAccount);
                    request.getOrphan().setManager(userAccount);
                    request.setStatus("Managed");
                    userAccount.getWorkQueue().getWorkRequestList().add(request);
                    populateAssignOrphanToMeRequestTable();
                    JOptionPane.showMessageDialog(this, "Orphan assigned to you.","Information",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row.", "Warning", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btnAssignOrphanToMeActionPerformed

    private void btnViewDetialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetialActionPerformed

        
        int selectedRow = tblOrphanManagerWorkArea.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row first","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        WorkRequest wr = (WorkRequest) tblOrphanManagerWorkArea.getValueAt(selectedRow, 0);
        if (wr.getReceiver() != userAccount) {
            JOptionPane.showMessageDialog(this, "This orphan is not assigned to you.","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (wr.getOrphan().getAdoptor() != null){
            JOptionPane.showMessageDialog(this, "This orphan has been adopted.","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        OrphanManagerRequest request = (OrphanManagerRequest) wr;

//        ViewOrphanJPanel voj = new ViewOrphanJPanel(this.ecosys, this.network, this.enterprise, this.org, this.userAccount, request.getOrphan());
        ViewOrphanJFrame voj = new ViewOrphanJFrame(this.ecosys, this.network, this.enterprise, this.org, this.userAccount, request.getOrphan());

        voj.setVisible(true);
    }//GEN-LAST:event_btnViewDetialActionPerformed

        public void populateAssignOrphanToMeRequestTable(){
        DefaultTableModel model = (DefaultTableModel) tblOrphanManagerWorkArea.getModel();
        
        model.setRowCount(0);
        
        for (WorkRequest request : enterprise.getWorkQueue().getWorkRequestList()){
            if (request instanceof OrphanManagerRequest){
                Object[] row = new Object[6];
                row[0] = request;
                row[1] = request.getOrphan().getId();
                row[2] = request.getOrphan();
                row[3] = request.getSender();
                row[4] = request.getReceiver() == null ? null : request.getReceiver();
                row[5] = request.getStatus();

                model.addRow(row);
            }            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignOrphanToMe;
    private javax.swing.JButton btnViewDetial;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblOrphanManagerWorkArea;
    // End of variables declaration//GEN-END:variables
}
