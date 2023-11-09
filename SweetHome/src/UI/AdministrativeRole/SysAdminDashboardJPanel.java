/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.AdministrativeRole;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.AdoptionEnterprise;
import Model.Enterprise.Enterprise;
import Model.Enterprise.OrphanShelterEnterprise;
import Model.Orphan.Orphan;
import Model.UserAccount.UserAccount;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import Model.Role.Role;

import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.PieDataset;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author hp
 */
public class SysAdminDashboardJPanel extends javax.swing.JPanel {

    EcoSystem ecosys;
    UserAccount useraccount;

    /**
     * Creates new form SysAdminDashboardJPanel
     */
    public SysAdminDashboardJPanel() {
        initComponents();
    }

    public SysAdminDashboardJPanel(EcoSystem ecosys, UserAccount useraccount) {
        initComponents();
        this.ecosys = ecosys;
        this.useraccount = useraccount;
        
        displayDonationChart();
        displayAdoptionStatusChart();
        displayUserRoleDistributionChart();

    }
    
public void displayDonationChart() {
    // Create the dataset
    DefaultCategoryDataset dataset = createDonationDataset();

    // Create the chart
    JFreeChart chart = ChartFactory.createBarChart("Donation by Adoption Enterprises",
            "Enterprises",
            "Amount",
            dataset);

    // Create a chart panel
    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setPreferredSize(new java.awt.Dimension(800, 280));

    // Add the chart to jPanel_ourService
    jPanel_donations.add(chartPanel);

    // Refresh the panel to display the chart
    jPanel_donations.revalidate();
    jPanel_donations.repaint();
}

private DefaultCategoryDataset createDonationDataset() {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

    for (Network network : ecosys.getNetworkList()) {
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise instanceof AdoptionEnterprise) {
                Model.Enterprise.AdoptionEnterprise adoptionEnterprise = (Model.Enterprise.AdoptionEnterprise) enterprise;
                dataset.addValue(adoptionEnterprise.getDonation(), adoptionEnterprise.getName(), "name");
            }
        }
    }

    return dataset;
}
public void displayAdoptionStatusChart() {
    // Create the dataset
    DefaultPieDataset dataset = createAdoptionStatusDataset();

    // Create the chart
    JFreeChart chart = ChartFactory.createPieChart("Adoption Status",
            dataset,
            true, // legend
            true, // tooltips
            false // URLs
    );

    // Create a chart panel
    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));

    // Add the chart to jPanel_orphan
    jPanel_orphan.add(chartPanel);

    // Refresh the panel to display the chart
    jPanel_orphan.revalidate();
    jPanel_orphan.repaint();
}

public void displayUserRoleDistributionChart() {
    PieDataset dataset = createRoleDataset();
    JFreeChart chart = createChart(dataset);
    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setPreferredSize(new java.awt.Dimension(360, 260));

    jPanel_Users.add(chartPanel);
    jPanel_Users.revalidate();
    jPanel_Users.repaint();
}

private DefaultPieDataset createAdoptionStatusDataset() {
    DefaultPieDataset dataset = new DefaultPieDataset();
    int adopted = 0;
    int unadopted = 0;

    for (Network network : ecosys.getNetworkList()) {
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise instanceof OrphanShelterEnterprise) {
                OrphanShelterEnterprise orphanShelterEnterprise = (OrphanShelterEnterprise) enterprise;
                for (Orphan orphan : orphanShelterEnterprise.getOrphanDirectory().getOrphanList()) {
                    if (orphan.getAdoptor() != null) {
                        adopted++;
                    } else {
                        unadopted++;
                    }
                }
            }
        }
    }

    dataset.setValue("Adopted", adopted);
    dataset.setValue("Unadopted", unadopted);

    return dataset;
}
public PieDataset createRoleDataset() {
    DefaultPieDataset dataset = new DefaultPieDataset();
    Map<Role.RoleType, Integer> roleCounts = countRoles();

    for (Map.Entry<Role.RoleType, Integer> entry : roleCounts.entrySet()) {
        dataset.setValue(entry.getKey().toString(), entry.getValue());
    }

    return dataset;
}
public Map<Role.RoleType, Integer> countRoles() {
    Map<Role.RoleType, Integer> roleCounts = new HashMap<>();

    for (UserAccount ua : ecosys.getUserAccountDirectory().getUserAccountList()) {
                Role.RoleType roleType = ua.getRole().type;
                roleCounts.put(roleType, roleCounts.getOrDefault(roleType, 0) + 1);
            }


    return roleCounts;
}

public JFreeChart createChart(PieDataset dataset) {
    JFreeChart chart = ChartFactory.createPieChart(
        "User Role Distribution",
        dataset,
        true,
        true,
        false
    );

    PiePlot plot = (PiePlot) chart.getPlot();
    plot.setNoDataMessage("No data available");
    plot.setCircular(false);
    plot.setLabelGap(0.02);

    return chart;
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
        jPanel_donations = new javax.swing.JPanel();
        jPanel_orphan = new javax.swing.JPanel();
        jPanel_Users = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(800, 520));
        setLayout(new java.awt.BorderLayout());

        kGradientPanel3.setkEndColor(new java.awt.Color(255, 221, 225));
        kGradientPanel3.setkStartColor(new java.awt.Color(238, 156, 167));
        kGradientPanel3.setPreferredSize(new java.awt.Dimension(800, 520));
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_donations.setBackground(new java.awt.Color(238, 156, 167));
        jPanel_donations.setLayout(new java.awt.BorderLayout());
        kGradientPanel3.add(jPanel_donations, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 750, 250));

        jPanel_orphan.setBackground(new java.awt.Color(238, 156, 167));
        jPanel_orphan.setLayout(new java.awt.BorderLayout());
        kGradientPanel3.add(jPanel_orphan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 380, 260));

        jPanel_Users.setBackground(new java.awt.Color(238, 156, 167));
        jPanel_Users.setLayout(new java.awt.BorderLayout());
        kGradientPanel3.add(jPanel_Users, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 370, 260));

        add(kGradientPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel_Users;
    private javax.swing.JPanel jPanel_donations;
    private javax.swing.JPanel jPanel_orphan;
    private keeptoo.KGradientPanel kGradientPanel3;
    // End of variables declaration//GEN-END:variables
}
