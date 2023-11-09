package Model.Role;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Enterprise.OrphanShelterEnterprise;
import Model.Organization.Organization;
import Model.Organization.OrphanManagementOrganization;
import Model.UserAccount.UserAccount;
import UI.OrphanManagement.OrphanManagerJFrame;
import javax.swing.JFrame;
import javax.swing.JPanel;
import UI.Adopter.AdopterWorkAreaJFrame;

/**
 *
 * @author Ma2017
 */
public class OrphanManagementRole extends Role {

    public OrphanManagementRole() {
        this.type = RoleType.OrphanManager;
    }

    @Override
    public JFrame createWorkArea(EcoSystem ecosys, Network network, Enterprise enterprise, Organization org, UserAccount useraccount) {
        return new OrphanManagerJFrame(ecosys, network, (OrphanShelterEnterprise) enterprise, (OrphanManagementOrganization) org, useraccount);
    }
}
