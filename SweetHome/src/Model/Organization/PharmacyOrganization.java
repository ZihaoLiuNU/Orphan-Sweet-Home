/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Role.PharmacistRole;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author alilovepeach
 */

public class PharmacyOrganization extends Organization{

    public PharmacyOrganization(String name) {
        super(name, Organization.Type.Pharmacy);
       
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        
        roles.add(new PharmacistRole());
        return roles;
    }

    
}