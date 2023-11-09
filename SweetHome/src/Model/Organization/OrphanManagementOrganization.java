/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Role.OrphanManagementRole;
import Model.Role.OrphanRegisterRole;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author alilovepeach
 */
public class OrphanManagementOrganization extends Organization{

    public OrphanManagementOrganization(String name) {
        super(name, Organization.Type.OrphanManagement);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new OrphanManagementRole());
        roles.add(new OrphanRegisterRole());
        return roles;
    }
     
}