/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Role.Role;
import Model.Role.VolunteerManagerRole;
import Model.Role.VolunteerRole;
import java.util.ArrayList;

/**
 *
 * @author alilovepeach
 */

public class VolunteerManagementOrganization extends Organization{

    public VolunteerManagementOrganization(String name) {
        super(name, Organization.Type.VolunteerManagement);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        
        ArrayList<Role> roles = new ArrayList<>();
        
        roles.add(new VolunteerManagerRole());
        roles.add(new VolunteerRole());
        return roles;
    }
    
}
