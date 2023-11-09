/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Role.AuthorityRole;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author alilovepeach
 */
public class AuthorityOrganization extends Organization{
    public AuthorityOrganization(String nameAdopter) {
        super(nameAdopter, Organization.Type.Authority);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> supportRoles = new ArrayList<>();
        supportRoles.add(new AuthorityRole());
        return supportRoles;
    }
    
}
