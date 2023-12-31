/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Pharmacist;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.Orphan.Orphan;
import Model.Orphan.OrphanDirectory;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.PharmacistWorkRequest;
import UI.Basic.LoginJFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author alilovepeach
 */
public class PharmacistProcessRequestJFrame extends javax.swing.JFrame {

    EcoSystem ecosys;
    Network network;
    Enterprise enterprise;
    Organization org;
    UserAccount useraccount;
    Orphan orphan;
    OrphanDirectory orphanDirectory;
    PharmacistWorkRequest request;
    /**
     * Creates new form PharmacistProcessRequestJFrame
     */
    public PharmacistProcessRequestJFrame() {
        initComponents();
    }
    
    public PharmacistProcessRequestJFrame(EcoSystem ecosys, Enterprise enterprise, Organization org, UserAccount useraccount, PharmacistWorkRequest request, Orphan orphan, OrphanDirectory orphanDirectory) {
        initComponents();
        this.setVisible(true);
        this.request = request;
        
        this.useraccount = useraccount;
        this.enterprise = enterprise;
        
        this.orphan = request.getOrphan();
   
        this.ecosys = ecosys;
        this.org = org;
        
        for (Network net : ecosys.getNetworkList()) {
            
            for (Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()) {
                
                if (ent.equals(enterprise)) {
                    
                    network = net;
                }
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

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        SubmitBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtResults = new javax.swing.JTextField();
        BackBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(172, 182, 229));
        kGradientPanel1.setkStartColor(new java.awt.Color(116, 235, 213));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(800, 520));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SubmitBtn.setBackground(new java.awt.Color(172, 182, 229));
        SubmitBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SubmitBtn.setForeground(new java.awt.Color(255, 255, 255));
        SubmitBtn.setText("Submit Result");
        SubmitBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });
        kGradientPanel1.add(SubmitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 140, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Result Submission");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Result");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 160, -1));

        txtResults.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtResults.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(225, 238, 195)));
        kGradientPanel1.add(txtResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 390, 40));

        BackBtn1.setBackground(new java.awt.Color(172, 182, 229));
        BackBtn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BackBtn1.setForeground(new java.awt.Color(255, 255, 255));
        BackBtn1.setText("Close");
        BackBtn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BackBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtn1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(BackBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 28, 101, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtn1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_BackBtn1ActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        // TODO add your handling code here:
        if (txtResults.getText().isEmpty()) {
           
            JOptionPane.showMessageDialog(this, "You should enter some message please","Warning",
                    JOptionPane.WARNING_MESSAGE);
            
        } else {
            orphan.setPharmacyMessage(txtResults.getText());
            
            request.setStatus("Completed");
            
            request.setResult(txtResults.getText());
            
            JOptionPane.showMessageDialog(this, "Request is completed !", 
                    "Thank you!", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
       }
    }//GEN-LAST:event_SubmitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(PharmacistProcessRequestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PharmacistProcessRequestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PharmacistProcessRequestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PharmacistProcessRequestJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PharmacistProcessRequestJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn1;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField txtResults;
    // End of variables declaration//GEN-END:variables
}
