/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Role.AdopterRole;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author alilovepeach
 */
public class AdopterOrganization extends Organization{
    public AdopterOrganization(String nameAdopter) {
        super(nameAdopter, Organization.Type.AdopterManagement);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> supportRoles = new ArrayList<>();
        supportRoles.add(new AdopterRole());
      
        return supportRoles;
    }
    
}
