
package Model.Role;
import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.AdoptionEnterprise;
import Model.Enterprise.Enterprise;
import Model.Organization.AdopterOrganization;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import UI.Adopter.AdopterWorkAreaJFrame;
import javax.swing.JFrame;
import javax.swing.JPanel;





/**
 *
 * @author Ma2017
 */
public class AdopterRole extends Role {

    public AdopterRole() {
        this.type = RoleType.Adopter;
    }

    

    @Override
    public JFrame createWorkArea(EcoSystem ecosys, Network network,Enterprise enterprise, Organization org, UserAccount useraccount) {
      
  
        return new AdopterWorkAreaJFrame(ecosys,  network, (AdoptionEnterprise)enterprise, (AdopterOrganization)org,  useraccount);
        
    }

}
