/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Doctor;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.Orphan.Orphan;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.MedCareRequest;
import Model.WorkQueue.WorkRequest;
import java.awt.Image;
import java.nio.file.Paths;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author alilovepeach
 */
public class ViewOrphanDetailJFrame extends javax.swing.JFrame {
    EcoSystem ecosys;
    Network network;
    Enterprise enterprise;
    Organization org;
    UserAccount useraccount;
    Orphan orphan;
    MedCareRequest request;
    /**
     * Creates new form ViewOrphanDetailJFrame
     */
    public ViewOrphanDetailJFrame(){
        initComponents();
    }
    
    public ViewOrphanDetailJFrame(EcoSystem ecosys, Network network, Enterprise enterprise, Organization org, UserAccount useraccount, Orphan orphan, MedCareRequest request) {
        initComponents();
        this.ecosys=ecosys;
        this.network=network;
        this.enterprise=enterprise;
        this.org=org;
        this.useraccount=useraccount;
        this.request= request;
        this.orphan=request.getOrphan();
        
        
        for (Network net : ecosys.getNetworkList()) {
            
            for (Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()) {
                
                if (ent.equals(enterprise)) {
                    
                    network = net;
                }
            }
        }

        displayOrphanDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        submitRBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        lblIcon = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fieldName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fieldShelter = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fieldSex = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fieldRace = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fieldDoc = new javax.swing.JTextField();
        fieldPhar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        DoctorMessFID = new javax.swing.JTextField();
        requestBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        fieldAge = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel2.setkEndColor(new java.awt.Color(240, 80, 83));
        kGradientPanel2.setkStartColor(new java.awt.Color(225, 238, 195));
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(800, 600));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitRBtn.setBackground(new java.awt.Color(195, 55, 100));
        submitRBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submitRBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitRBtn.setText("Submit Result");
        submitRBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submitRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitRBtnActionPerformed(evt);
            }
        });
        kGradientPanel2.add(submitRBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 194, 40));

        backBtn.setBackground(new java.awt.Color(195, 55, 100));
        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Close");
        backBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        kGradientPanel2.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 160, 30));
        kGradientPanel2.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 200, 190));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Name");
        kGradientPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 160, -1));

        fieldName.setEditable(false);
        fieldName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fieldName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(225, 238, 195)));
        kGradientPanel2.add(fieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 210, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Orphan Shelter");
        kGradientPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 160, -1));

        fieldShelter.setEditable(false);
        fieldShelter.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fieldShelter.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(225, 238, 195)));
        kGradientPanel2.add(fieldShelter, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 210, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Sex");
        kGradientPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 160, -1));

        fieldSex.setEditable(false);
        fieldSex.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fieldSex.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(225, 238, 195)));
        kGradientPanel2.add(fieldSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 210, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Race");
        kGradientPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 160, -1));

        fieldRace.setEditable(false);
        fieldRace.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fieldRace.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(225, 238, 195)));
        kGradientPanel2.add(fieldRace, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 210, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Doctor Message");
        kGradientPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 160, -1));

        fieldDoc.setEditable(false);
        fieldDoc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fieldDoc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(225, 238, 195)));
        kGradientPanel2.add(fieldDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 210, -1));

        fieldPhar.setEditable(false);
        fieldPhar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fieldPhar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(225, 238, 195)));
        kGradientPanel2.add(fieldPhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 210, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Pharmacy Feedback");
        kGradientPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 160, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Doctor Message");
        kGradientPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 160, -1));

        DoctorMessFID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DoctorMessFID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(225, 238, 195)));
        kGradientPanel2.add(DoctorMessFID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 460, 40));

        requestBtn.setBackground(new java.awt.Color(195, 55, 100));
        requestBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        requestBtn.setForeground(new java.awt.Color(255, 255, 255));
        requestBtn.setText("Request Pharmaceutical");
        requestBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        requestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestBtnActionPerformed(evt);
            }
        });
        kGradientPanel2.add(requestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 210, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Orphan Detail");
        kGradientPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Age");
        kGradientPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 160, -1));

        fieldAge.setEditable(false);
        fieldAge.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fieldAge.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(225, 238, 195)));
        kGradientPanel2.add(fieldAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitRBtnActionPerformed
        // TODO add your handling code here:
        
        //if message is empty
        if (DoctorMessFID.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "Please send message.", 
                    "Information", JOptionPane.WARNING_MESSAGE);
            
        } else if (fieldPhar.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Pharmaceutical Request is incompleted.", 
                    "Information", JOptionPane.WARNING_MESSAGE);
        } else {
            
            orphan.setDoctorMessage(DoctorMessFID.getText());
            
            request.setStatus("Completed");
            
            request.setDoctorResult(DoctorMessFID.getText());
            
            fieldDoc.setText(DoctorMessFID.getText());
            
            JOptionPane.showMessageDialog(this, "Doctor Request has been completed! You may now close this window",
                    
                    "Thank you!", JOptionPane.INFORMATION_MESSAGE);
            
        }

    }//GEN-LAST:event_submitRBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void requestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestBtnActionPerformed
        // TODO add your handling code here:
        RequestPharmacistJFrame rpjf = new RequestPharmacistJFrame(this.ecosys, this.network, this.enterprise, this.org, this.useraccount, this.orphan, this.request);
        rpjf.setVisible(true);
    }//GEN-LAST:event_requestBtnActionPerformed

    private void displayOrphanDetails() {    
        fieldSex.setText(orphan.getSex());
        fieldName.setText(orphan.getName());
        fieldAge.setText(String.valueOf(orphan.getAge()));
        fieldRace.setText(orphan.getRace());
        fieldShelter.setText(orphan.getEnterprise().getName());
        fieldPhar.setText(orphan.getPharmacyMessage());

        if (orphan.getPhoto()!=null){
            
            String path = Paths.get(orphan.getPhoto()).toAbsolutePath().toString();
            
            ImageIcon icon = seticon(path, null);
            
            lblIcon.setIcon(icon);
        }
    }
    
    public ImageIcon seticon(String m, byte[] image){
        
        ImageIcon i = null;
        
        if (m != null) {
    
            i = new ImageIcon(m);
            
        } else {
            
            i = new ImageIcon(image);
            
        }

        Image img1 = i.getImage();
        
        Image img2 = img1.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        
        ImageIcon img = new ImageIcon(img2);
        
        
        return img;
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
            java.util.logging.Logger.getLogger(ViewOrphanDetailJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewOrphanDetailJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewOrphanDetailJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewOrphanDetailJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewOrphanDetailJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DoctorMessFID;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField fieldAge;
    private javax.swing.JTextField fieldDoc;
    private javax.swing.JTextField fieldName;
    private javax.swing.JTextField fieldPhar;
    private javax.swing.JTextField fieldRace;
    private javax.swing.JTextField fieldSex;
    private javax.swing.JTextField fieldShelter;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JButton requestBtn;
    private javax.swing.JButton submitRBtn;
    // End of variables declaration//GEN-END:variables
}
