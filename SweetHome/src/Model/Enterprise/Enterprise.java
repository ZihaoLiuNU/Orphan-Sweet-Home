/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprise;

import Model.Organization.OrganizationDirectory;
import Model.Orphan.OrphanDirectory;
import Model.UserAccount.UserAccount;
import Model.UserAccount.UserAccountDirectory;
import Model.WorkQueue.WorkQueue;

/**
 *
 * @author alilovepeach
 */
public abstract class Enterprise {

    private String name;
    private final Type type;
    private WorkQueue workQueue;
    private OrganizationDirectory organizationDirectory;
    private UserAccountDirectory enterpriseUserAccounts;
    private UserAccount enterpriseAdmin;

    public enum Type {
        Volunteer("VolunteerEnterprise"),
        MedicalCare("MedicalCareEnterprise"),
        OrphanShelter("OrphanShelterEnterprise"),
        Adoption("AdoptionEnterprise");

        private String value;

        private Type(String value) {
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

    public Enterprise(String name, Type type) {
        this.name = name;
        this.type = type;
        organizationDirectory = new OrganizationDirectory();
        this.workQueue = new WorkQueue();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return enterpriseUserAccounts;
    }

    public void setUserAccountDirectory(UserAccountDirectory enterpriseUserAccounts) {
        this.enterpriseUserAccounts = enterpriseUserAccounts;
    }

    public UserAccount getEnterpriseAdmin() {
        return enterpriseAdmin;
    }

    public void setEnterpriseAdmin(UserAccount enterpriseAdmin) {
        this.enterpriseAdmin = enterpriseAdmin;
    }

    @Override
    public String toString() {
        return name;
    }
}