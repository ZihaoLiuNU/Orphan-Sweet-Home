
package Model.Role;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author Ma2017
 */
public abstract class Role {
    
    //define different roles
        public enum RoleType {
            
        OrphanRegister("Orphan Register"),
        OrphanManager("Orphan Manager"),
        Doctor("Doctor"),
        Pharmacist("Pharmacist"),
        Adopter("Adopter"),
        AdoptionManager("Adoption Manager"), 
        VolunteerManeger("Volunteer Manager"),
        Volunteer("Volunteer"),
        SystemAdmin ("System Admin"),
        EnterpriseAdmin("Enterprise Admin");

        private final String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public RoleType type;
    

//    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem Ecosystem);
//
//    public JPanel createAdminWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
//        this.type = RoleType.SystemAdmin;
//        return new AdminWorkAreaJFrame(userProcessContainer, account, ecosystem);
//    }
    
    public abstract JFrame createWorkArea(EcoSystem ecosys, Network network,Enterprise enterprise, Organization org, UserAccount useraccount);
    
    @Override
    public String toString() {
        return this.type.getValue();
    }    
    
}