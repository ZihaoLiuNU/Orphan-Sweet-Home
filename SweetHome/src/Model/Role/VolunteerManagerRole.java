package Model.Role;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.AdoptionEnterprise;
import Model.Enterprise.Enterprise;
import Model.Enterprise.VolunteerEnterprise;
import Model.Organization.AdopterOrganization;
import Model.Organization.Organization;
import Model.Organization.VolunteerManagementOrganization;
import Model.UserAccount.UserAccount;
import UI.VolunteerManagement.VolunteerManagerJFrame;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Ma2017
 */
public class VolunteerManagerRole extends Role {

    public VolunteerManagerRole() {
        this.type = RoleType.VolunteerManeger;
    }

    @Override
    public JFrame createWorkArea(EcoSystem ecosys, Network network,Enterprise enterprise, Organization org, UserAccount useraccount) {
      
  
        return new VolunteerManagerJFrame(ecosys,network,(VolunteerEnterprise)enterprise, (VolunteerManagementOrganization)org,  useraccount);
        
    }

}
