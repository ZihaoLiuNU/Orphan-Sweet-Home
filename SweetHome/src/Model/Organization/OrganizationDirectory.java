/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author alilovepeach
 */
public class OrganizationDirectory {

    ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        this.organizationList = new ArrayList<Organization>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(String name, Type type) {
        Organization organization = null;

     if (type.getValue().equals(Type.AdopterManagement.getValue())) {
            organization = new AdopterOrganization(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Doctor.getValue())) {
            organization = new DoctorOrganization(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Pharmacy.getValue())) {
            organization = new PharmacyOrganization(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.VolunteerManagement.getValue())) {
            organization = new VolunteerManagementOrganization(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.OrphanManagement.getValue())) {
            organization = new OrphanManagementOrganization(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Authority.getValue())) {
            organization = new AuthorityOrganization(name);
            organizationList.add(organization);
        }

        return organization;

    }

    public Organization getOrganizationByName(String name) {

        for (Organization o : organizationList) {

            if (name.equalsIgnoreCase(o.getName())) {
                return o;
            }
        }
        return null;
    }

    public boolean nameIsUnique(String name) {

        for (Organization organization : organizationList) {

            if (name.equalsIgnoreCase(organization.getName())) {

                return false;
            }
        }
        return true;
    }
    
        public void deleteOrganization(Organization or) {
        organizationList.remove(or);
    }

}
