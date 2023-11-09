/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprise;

import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise.Type;
import Model.Role.EnterpriseAdminRole;
import Model.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author alilovepeach
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    //Create enterprise
    public Enterprise createAndAddEnterprise(String name, Type type) {

        Enterprise enterprise = null;

        if (type.getValue().equals(Type.OrphanShelter.getValue())) {
            enterprise = new OrphanShelterEnterprise(name);
            enterpriseList.add(enterprise);
          
        } else if (type.getValue().equals(Type.Volunteer.getValue())) {
            enterprise = new VolunteerEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type.getValue().equals(Type.MedicalCare.getValue())) {
            enterprise = new MedicalCareEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type.getValue().equals(Type.Adoption.getValue())) {
            enterprise = new AdoptionEnterprise(name);
            enterpriseList.add(enterprise);
        }

        
        return enterprise;
    }
   
        //Create enterprise with admin
    public Enterprise createAndAddEnterprise(String name, Type type,String adminName, String adminPw,Network nw) {

        Enterprise enterprise = null;

        if (type.getValue().equals(Type.OrphanShelter.getValue())) {
            enterprise = new OrphanShelterEnterprise(name);
            enterpriseList.add(enterprise);
          
        } else if (type.getValue().equals(Type.Volunteer.getValue())) {
            enterprise = new VolunteerEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type.getValue().equals(Type.MedicalCare.getValue())) {
            enterprise = new MedicalCareEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type.getValue().equals(Type.Adoption.getValue())) {
            enterprise = new AdoptionEnterprise(name);
            enterpriseList.add(enterprise);
        }

        UserAccount enterpriseAdmin = new UserAccount();
        enterpriseAdmin.setUsername(adminName);
        enterpriseAdmin.setPassword(adminPw);
        enterpriseAdmin.setRole(new EnterpriseAdminRole());
        enterpriseAdmin.setNetwork(nw);
       
        return enterprise;
    }

    public boolean nameIsUnique(String name) {
        for (Enterprise enterprise : enterpriseList) {
            if (name.equalsIgnoreCase(enterprise.getName())) {
                return false;
            }
        }
        return true;
    }

    public Enterprise getEnterpriseByName(String name) {
        for (Enterprise e : enterpriseList) {
            if (name.equalsIgnoreCase(e.getName())) {
                return e;
            }
        }
        return null;
    }

    public void deleteEnterprise(Enterprise ent) {
        enterpriseList.remove(ent);
    }
}
