
package Model.Role;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Enterprise.VolunteerEnterprise;
import Model.Organization.Organization;
import Model.Organization.VolunteerManagementOrganization;
import Model.UserAccount.UserAccount;
import UI.Volunteer.VolunteerJFrame;
import javax.swing.JFrame;


/**
 *
 * @author Ma2017
 */
public class VolunteerRole extends Role {

    public VolunteerRole() {
        
        this.type = RoleType.Volunteer;
    }


     @Override
    public JFrame createWorkArea(EcoSystem ecosys, Network network,Enterprise enterprise, Organization org, UserAccount useraccount) {
      
  
        return new VolunteerJFrame(ecosys,network,(VolunteerEnterprise)enterprise, (VolunteerManagementOrganization)org,  useraccount);
        
    }


}
