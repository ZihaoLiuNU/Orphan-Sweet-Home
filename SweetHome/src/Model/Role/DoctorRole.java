
package Model.Role;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Enterprise.MedicalCareEnterprise;
import Model.Enterprise.OrphanShelterEnterprise;
import Model.Organization.DoctorOrganization;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import UI.Doctor.DoctorWorkAreaJFrame;
import UI.OrphanManagement.OrphanManagerJFrame;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Ma2017
 */
public class DoctorRole extends Role {

    public DoctorRole() {
        this.type = RoleType.Doctor;
    }

    @Override
    public JFrame createWorkArea(EcoSystem ecosys, Network network, Enterprise enterprise, Organization org, UserAccount useraccount) {
        return new DoctorWorkAreaJFrame(ecosys, network, (MedicalCareEnterprise) enterprise, (DoctorOrganization) org, useraccount);
    }

}
