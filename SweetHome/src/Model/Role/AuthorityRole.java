
package Model.Role;


import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.AdoptionEnterprise;
import Model.Enterprise.Enterprise;
import Model.Enterprise.OrphanShelterEnterprise;
import Model.Organization.AuthorityOrganization;
import Model.Organization.Organization;

import Model.UserAccount.UserAccount;
import UI.OrphanManagement.OrphanManagerJFrame;
import javax.swing.JFrame;
import javax.swing.JPanel;
import UI.Authority.AuthorityWorkAreaJFrame;


/**
 *
 * @author Ma2017
 */
public class AuthorityRole extends Role {

    public AuthorityRole() {
        this.type = RoleType.AdoptionManager;
    }


    @Override
    public JFrame createWorkArea(EcoSystem ecosys, Network network, Enterprise enterprise, Organization org, UserAccount useraccount) {
        return new AuthorityWorkAreaJFrame(ecosys, network, (AdoptionEnterprise) enterprise, (AuthorityOrganization) org, useraccount);
    }

}
