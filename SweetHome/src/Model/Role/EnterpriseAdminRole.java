/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Role;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import UI.AdministrativeRole.AdminWorkAreaJFrame;
import UI.EnterpriseAdminRole.EnterpriseAdminJFrame;
import javax.swing.JFrame;

/**
 *
 * @author Ma2017
 */
public class EnterpriseAdminRole extends Role{
     public  EnterpriseAdminRole() {
        this.type = RoleType.EnterpriseAdmin;
    }

    
     @Override
    public JFrame createWorkArea(EcoSystem ecosys, Network network,Enterprise enterprise, Organization org, UserAccount useraccount) {
      
  
        return new EnterpriseAdminJFrame(ecosys,useraccount,network,enterprise);
        
    }
}
