
package Model.Role;


import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Enterprise.MedicalCareEnterprise;
import Model.Enterprise.OrphanShelterEnterprise;
import Model.Organization.Organization;
import Model.Organization.OrphanManagementOrganization;
import Model.Organization.PharmacyOrganization;
import Model.UserAccount.UserAccount;
import UI.OrphanManagement.OrphanManagerJFrame;
import UI.Pharmacist.PharmacistWorkAreaJFrame;
import javax.swing.JFrame;
import javax.swing.JPanel;



/**
 *
 * @author Ma2017
 */
public class PharmacistRole extends Role{

    public PharmacistRole() {
        
        this.type = RoleType.Pharmacist;
    }

    @Override
    public JFrame createWorkArea(EcoSystem ecosys, Network network, Enterprise enterprise, Organization org, UserAccount useraccount) {
        return new PharmacistWorkAreaJFrame(ecosys, network, (MedicalCareEnterprise) enterprise, (PharmacyOrganization) org, useraccount);
    }

}