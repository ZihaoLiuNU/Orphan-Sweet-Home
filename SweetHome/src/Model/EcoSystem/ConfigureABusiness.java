/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.EcoSystem;

import Model.Enterprise.Enterprise;
import Model.Enterprise.OrphanShelterEnterprise;
import Model.Organization.Organization;
import Model.Orphan.Orphan;
import Model.Role.AdopterRole;
import Model.Role.AuthorityRole;
import Model.Role.DoctorRole;
import Model.Role.EnterpriseAdminRole;
import Model.Role.OrphanManagementRole;
import Model.Role.OrphanRegisterRole;
import Model.Role.PharmacistRole;
import Model.Role.Role;
import Model.Role.SystemAdminRole;
import Model.Role.VolunteerManagerRole;
import Model.Role.VolunteerRole;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.AdopterAuthorizationRequest;
import Model.WorkQueue.OrphanManagerRequest;

/**
 *
 * @author alilovepeach
 */
public class ConfigureABusiness {

    public ConfigureABusiness() {

    }

    public static EcoSystem configure() {

        EcoSystem ecoSystem = new EcoSystem();
        //create a default sysdem admin 
        UserAccount account = new UserAccount();
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRole(new SystemAdminRole());
        ecoSystem.getUserAccountDirectory().getUserAccountList().add(account);

        ecoSystem.setSystemAdmin(account);

        //create some default network
        Network newNetwork2 = ecoSystem.createNetwork("Boston");
        Network newNetwork3 = ecoSystem.createNetwork("Malden");
        Network newNetwork4 = ecoSystem.createNetwork("Cambridge");

        //create some default enterprise------------------------------------------------------------------------------------------------------------------
        //boston------------------------------------------------------------------------------------------------------------------
        //OrphanShelter type
        Enterprise boston1 = newNetwork2.getEnterpriseDirectory().createAndAddEnterprise("Bos_OrphanShelter", Enterprise.Type.OrphanShelter);
        UserAccount eadmin1 = new UserAccount();
        eadmin1.setUsername("EnAdmin01");
        eadmin1.setPassword("EnAdmin01");
        eadmin1.setRole(new EnterpriseAdminRole());
        eadmin1.setNetwork(newNetwork2);
        eadmin1.setEnterprise(boston1);
        boston1.setEnterpriseAdmin(eadmin1);
        ecoSystem.getUserAccountDirectory().getUserAccountList().add(eadmin1);

        Enterprise boston11 = newNetwork2.getEnterpriseDirectory().createAndAddEnterprise("Bos_1OrShelter", Enterprise.Type.OrphanShelter);
        UserAccount eadmin2 = new UserAccount();
        eadmin2.setUsername("EnAdmin02");
        eadmin2.setPassword("EnAdmin02");
        eadmin2.setRole(new EnterpriseAdminRole());
        eadmin2.setNetwork(newNetwork2);
        eadmin2.setEnterprise(boston11);
        boston11.setEnterpriseAdmin(eadmin2);
        ecoSystem.getUserAccountDirectory().getUserAccountList().add(eadmin2);

        // MedicalCare Type
        Enterprise boston2 = newNetwork2.getEnterpriseDirectory().createAndAddEnterprise("Bos_MedicalCareCenter", Enterprise.Type.MedicalCare);
        UserAccount eadmin3 = new UserAccount();
        eadmin3.setUsername("EnAdmin03");
        eadmin3.setPassword("EnAdmin03");
        eadmin3.setRole(new EnterpriseAdminRole());
        eadmin3.setNetwork(newNetwork2);
        eadmin3.setEnterprise(boston2);
        boston2.setEnterpriseAdmin(eadmin3);
        ecoSystem.getUserAccountDirectory().getUserAccountList().add(eadmin3);

        Enterprise boston21 = newNetwork2.getEnterpriseDirectory().createAndAddEnterprise("Bos_1MedicalCareCenter", Enterprise.Type.MedicalCare);
        UserAccount eadmin4 = new UserAccount();
        eadmin4.setUsername("EnAdmin04");
        eadmin4.setPassword("EnAdmin04");
        eadmin4.setRole(new EnterpriseAdminRole());
        eadmin4.setNetwork(newNetwork2);
        eadmin4.setEnterprise(boston21);
        boston21.setEnterpriseAdmin(eadmin4);
        ecoSystem.getUserAccountDirectory().getUserAccountList().add(eadmin4);

        //VolunteerType
        Enterprise boston3 = newNetwork2.getEnterpriseDirectory().createAndAddEnterprise("Bos_VolunteerCenter", Enterprise.Type.Volunteer);
        UserAccount eadmin5 = new UserAccount();
        eadmin5.setUsername("EnAdmin05");
        eadmin5.setPassword("EnAdmin05");
        eadmin5.setRole(new EnterpriseAdminRole());
        eadmin5.setNetwork(newNetwork2);
        eadmin5.setEnterprise(boston3);
        boston3.setEnterpriseAdmin(eadmin5);
        ecoSystem.getUserAccountDirectory().getUserAccountList().add(eadmin5);

        Enterprise boston31 = newNetwork2.getEnterpriseDirectory().createAndAddEnterprise("Bos_1VolunteerCenter", Enterprise.Type.Volunteer);
        UserAccount eadmin6 = new UserAccount();
        eadmin6.setUsername("EnAdmin06");
        eadmin6.setPassword("EnAdmin06");
        eadmin6.setRole(new EnterpriseAdminRole());
        eadmin6.setNetwork(newNetwork2);
        eadmin6.setEnterprise(boston31);
        boston31.setEnterpriseAdmin(eadmin6);
        ecoSystem.getUserAccountDirectory().getUserAccountList().add(eadmin6);

        //Adoption Role
        Enterprise boston4 = newNetwork2.getEnterpriseDirectory().createAndAddEnterprise("Bos_Adoption", Enterprise.Type.Adoption);
        UserAccount eadmin7 = new UserAccount();
        eadmin7.setUsername("EnAdmin07");
        eadmin7.setPassword("EnAdmin07");
        eadmin7.setRole(new EnterpriseAdminRole());
        eadmin7.setNetwork(newNetwork2);
        eadmin7.setEnterprise(boston4);
        boston4.setEnterpriseAdmin(eadmin7);
        ecoSystem.getUserAccountDirectory().getUserAccountList().add(eadmin7);

        Enterprise boston41 = newNetwork2.getEnterpriseDirectory().createAndAddEnterprise("Bos_1Adoption", Enterprise.Type.Adoption);
        UserAccount eadmin8 = new UserAccount();
        eadmin8.setUsername("EnAdmin08");
        eadmin8.setPassword("EnAdmin08");
        eadmin8.setRole(new EnterpriseAdminRole());
        eadmin8.setNetwork(newNetwork2);
        eadmin8.setEnterprise(boston41);
        boston41.setEnterpriseAdmin(eadmin8);
        ecoSystem.getUserAccountDirectory().getUserAccountList().add(eadmin8);

        //Malden enterprise------------------------------------------------------------------------------------------------------------------
        Enterprise mal1 = newNetwork3.getEnterpriseDirectory().createAndAddEnterprise("Mal_OrphanShelter", Enterprise.Type.OrphanShelter);
        UserAccount eadmin9 = new UserAccount();
        eadmin9.setUsername("EnAdmin09");
        eadmin9.setPassword("EnAdmin09");
        eadmin9.setRole(new EnterpriseAdminRole());
        eadmin9.setNetwork(newNetwork3);
        eadmin9.setEnterprise(mal1);
        mal1.setEnterpriseAdmin(eadmin9);
        ecoSystem.getUserAccountDirectory().getUserAccountList().add(eadmin9);

        Enterprise mal2 = newNetwork3.getEnterpriseDirectory().createAndAddEnterprise("Mal_MedicalCareCenter", Enterprise.Type.MedicalCare);
        UserAccount eadmin10 = new UserAccount();
        eadmin10.setUsername("EnAdmin10");
        eadmin10.setPassword("EnAdmin10");
        eadmin10.setRole(new EnterpriseAdminRole());
        eadmin10.setNetwork(newNetwork3);
        eadmin10.setEnterprise(mal2);
        mal2.setEnterpriseAdmin(eadmin10);
        ecoSystem.getUserAccountDirectory().getUserAccountList().add(eadmin10);

        Enterprise mal3 = newNetwork3.getEnterpriseDirectory().createAndAddEnterprise("Mal_VolunteerCenter", Enterprise.Type.Volunteer);
        UserAccount eadmin11 = new UserAccount();
        eadmin11.setUsername("EnAdmin11");
        eadmin11.setPassword("EnAdmin11");
        eadmin11.setRole(new EnterpriseAdminRole());
        eadmin11.setNetwork(newNetwork3);
        eadmin11.setEnterprise(mal3);
        mal3.setEnterpriseAdmin(eadmin11);
        ecoSystem.getUserAccountDirectory().getUserAccountList().add(eadmin11);

        Enterprise mal4 = newNetwork3.getEnterpriseDirectory().createAndAddEnterprise("Mal_Adoption", Enterprise.Type.Adoption);
        UserAccount eadmin12 = new UserAccount();
        eadmin12.setUsername("EnAdmin12");
        eadmin12.setPassword("EnAdmin12");
        eadmin12.setRole(new EnterpriseAdminRole());
        eadmin12.setNetwork(newNetwork3);
        eadmin12.setEnterprise(mal4);
        mal4.setEnterpriseAdmin(eadmin12);
        ecoSystem.getUserAccountDirectory().getUserAccountList().add(eadmin12);

        //Cambridge------------------------------------------------------------------------------------------------------------------
        Enterprise cam1 = newNetwork4.getEnterpriseDirectory().createAndAddEnterprise("Cam_OrphanShelter", Enterprise.Type.OrphanShelter);
        UserAccount eadmin13 = new UserAccount();
        eadmin13.setUsername("EnAdmin13");
        eadmin13.setPassword("EnAdmin13");
        eadmin13.setRole(new EnterpriseAdminRole());
        eadmin13.setNetwork(newNetwork4);
        eadmin13.setEnterprise(cam1);
        cam1.setEnterpriseAdmin(eadmin13);
        ecoSystem.getUserAccountDirectory().getUserAccountList().add(eadmin13);

        Enterprise cam2 = newNetwork4.getEnterpriseDirectory().createAndAddEnterprise("Cam_MedicalCareCenter", Enterprise.Type.MedicalCare);
        UserAccount eadmin14 = new UserAccount();
        eadmin14.setUsername("EnAdmin14");
        eadmin14.setPassword("EnAdmin14");
        eadmin14.setRole(new EnterpriseAdminRole());
        eadmin14.setNetwork(newNetwork4);
        eadmin14.setEnterprise(cam2);
        cam2.setEnterpriseAdmin(eadmin14);
        ecoSystem.getUserAccountDirectory().getUserAccountList().add(eadmin14);

        Enterprise cam3 = newNetwork4.getEnterpriseDirectory().createAndAddEnterprise("Cam_VolunteerCenter", Enterprise.Type.Volunteer);
        UserAccount eadmin15 = new UserAccount();
        eadmin15.setUsername("EnAdmin15");
        eadmin15.setPassword("EnAdmin15");
        eadmin15.setRole(new EnterpriseAdminRole());
        eadmin15.setNetwork(newNetwork4);
        eadmin15.setEnterprise(cam3);
        cam3.setEnterpriseAdmin(eadmin15);
        ecoSystem.getUserAccountDirectory().getUserAccountList().add(eadmin15);

        Enterprise cam4 = newNetwork4.getEnterpriseDirectory().createAndAddEnterprise("Cam_Adoption", Enterprise.Type.Adoption);
        UserAccount eadmin16 = new UserAccount();
        eadmin16.setUsername("EnAdmin16");
        eadmin16.setPassword("EnAdmin16");
        eadmin16.setRole(new EnterpriseAdminRole());
        eadmin16.setNetwork(newNetwork4);
        eadmin16.setEnterprise(cam4);
        cam4.setEnterpriseAdmin(eadmin16);
        ecoSystem.getUserAccountDirectory().getUserAccountList().add(eadmin16);

        //create some default organization------------------------------------------------------------------------------------------------------------------
        //boston------------------------------------------------------------------------------------------------------------------
        Organization b1 = boston1.getOrganizationDirectory().createOrganization("Bos_orphanManagement", Organization.Type.OrphanManagement);
        Organization b11 = boston1.getOrganizationDirectory().createOrganization("Bos_1orphanManagement", Organization.Type.OrphanManagement);
        Organization b2 = boston2.getOrganizationDirectory().createOrganization("Bos_doctor", Organization.Type.Doctor);
        Organization b21 = boston2.getOrganizationDirectory().createOrganization("Bos_1doctor", Organization.Type.Doctor);
        Organization b3 = boston2.getOrganizationDirectory().createOrganization("Bos_pharmacy", Organization.Type.Pharmacy);
        Organization b31 = boston2.getOrganizationDirectory().createOrganization("Bos_1pharmacy", Organization.Type.Pharmacy);

        Organization b4 = boston3.getOrganizationDirectory().createOrganization("Bos_volunteerManagement", Organization.Type.VolunteerManagement);
        Organization b41 = boston3.getOrganizationDirectory().createOrganization("Bos_1volunteerManagement", Organization.Type.VolunteerManagement);

        Organization b5 = boston4.getOrganizationDirectory().createOrganization("Bos_Adoption", Organization.Type.AdopterManagement);
        Organization b6 = boston4.getOrganizationDirectory().createOrganization("Bos_athority", Organization.Type.Authority);
        Organization b51 = boston4.getOrganizationDirectory().createOrganization("Bos_1Adoption", Organization.Type.AdopterManagement);
        Organization b61 = boston4.getOrganizationDirectory().createOrganization("Bos_1athority", Organization.Type.Authority);

        //Malden------------------------------------------------------------------------------------------------------------------
        Organization m1 = mal1.getOrganizationDirectory().createOrganization("Mal_orphanManagement", Organization.Type.OrphanManagement);

        Organization m2 = mal2.getOrganizationDirectory().createOrganization("Mal_doctor", Organization.Type.Doctor);
        Organization m3 = mal2.getOrganizationDirectory().createOrganization("Mal_pharmacy", Organization.Type.Pharmacy);

        Organization m4 = mal3.getOrganizationDirectory().createOrganization("Mal_volunteerManagement", Organization.Type.VolunteerManagement);

        Organization m5 = mal4.getOrganizationDirectory().createOrganization("Mal_Adoption", Organization.Type.AdopterManagement);
        Organization m6 = mal4.getOrganizationDirectory().createOrganization("Mal_athority", Organization.Type.Authority);

        //cambridge------------------------------------------------------------------------------------------------------------------
        Organization c1 = cam1.getOrganizationDirectory().createOrganization("Cam_orphanManagement", Organization.Type.OrphanManagement);

        Organization c2 = cam2.getOrganizationDirectory().createOrganization("Cam_doctor", Organization.Type.Doctor);
        Organization c3 = cam2.getOrganizationDirectory().createOrganization("Cam_pharmacy", Organization.Type.Pharmacy);

        Organization c4 = cam3.getOrganizationDirectory().createOrganization("Cam_volunteerManagement", Organization.Type.VolunteerManagement);

        Organization c5 = cam4.getOrganizationDirectory().createOrganization("Cam_Adoption", Organization.Type.AdopterManagement);
        Organization c6 = cam4.getOrganizationDirectory().createOrganization("Cam_athority", Organization.Type.Authority);

        //create default user role(except adopters)------------------------------------------------------------------------------------------------------------------
        //for boston------------------------------------------------------------------------------------------------------------------
        //orphanManagementOrganization(orphanManagement & orphanRegister)
        UserAccount ub1 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_OM", "Bos_OM", new OrphanManagementRole(), newNetwork2, boston1, b1);
        UserAccount ub11 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_OM1", "Bos_OM1", new OrphanManagementRole(), newNetwork2, boston1, b1);
        UserAccount ub2 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_OR", "Bos_OR", new OrphanRegisterRole(), newNetwork2, boston1, b1);
        UserAccount ub21 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_OR1", "Bos_OR1", new OrphanRegisterRole(), newNetwork2, boston1, b1);
        //AdopterManagementOrganization(Adopter)
        UserAccount ub3 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_AD", "Bos_AD", new AdopterRole(), newNetwork2, boston4, b5);
        ub3.setEmailId("ub3@sweethome.com");
        ub3.setIncome(Float.valueOf(65000));

        AdopterAuthorizationRequest request = new AdopterAuthorizationRequest();
        request.setMessage("New User");
        request.setSender(ub3);
        request.setStatus("Pending");

        boston4.getWorkQueue().getWorkRequestList().add(request);
        ub3.getWorkQueue().getWorkRequestList().add(request);
        //AuthorityOrg(Authrity)
        UserAccount ub4 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_AU", "Bos_AU", new AuthorityRole(), newNetwork2, boston4, b6);
        UserAccount ub41 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_AU1", "Bos_AU1", new AuthorityRole(), newNetwork2, boston4, b6);
        //DoctorOrg(Doector)
        UserAccount ub5 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_DOC", "Bos_DOC", new DoctorRole(), newNetwork2, boston2, b2);
        UserAccount ub51 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_DOC", "Bos_DOC1", new DoctorRole(), newNetwork2, boston2, b2);
        //PharmacyOrg(Pharmacy)
        UserAccount ub6 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_Phar", "Bos_Phar", new PharmacistRole(), newNetwork2, boston2, b3);
        UserAccount ub61 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_Phar1", "Bos_Phar1", new PharmacistRole(), newNetwork2, boston2, b3);
        //volunteerOrg(volunteerManagemer&volunteer)

        UserAccount ub701 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_V1", "Bos_V1", new VolunteerRole(), newNetwork2, boston3, b4);
        UserAccount ub702 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_V2", "Bos_V2", new VolunteerRole(), newNetwork2, boston3, b4);
        UserAccount ub703 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_V3", "Bos_V3", new VolunteerRole(), newNetwork2, boston3, b4);
        UserAccount ub704 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_V4", "Bos_V4", new VolunteerRole(), newNetwork2, boston3, b4);

        UserAccount ub8 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_VM", "Bos_VM", new VolunteerManagerRole(), newNetwork2, boston3, b4);
        UserAccount ub81 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_VM1", "Bos_VM1", new VolunteerManagerRole(), newNetwork2, boston3, b4);

        //for malden------------------------------------------------------------------------------------------------------------------
        //orphanManagementOrganization(orphanManagement & orphanRegister)
        UserAccount um1 = ecoSystem.getUserAccountDirectory().createUserAccount("Mal_OM", "Mal_OM", new OrphanManagementRole(), newNetwork3, mal1, m1);
        UserAccount um2 = ecoSystem.getUserAccountDirectory().createUserAccount("Mal_OR", "Mal_OR", new OrphanRegisterRole(), newNetwork3, mal1, m1);
        //AdopterManagementOrganization(Adopter)
        UserAccount um3 = ecoSystem.getUserAccountDirectory().createUserAccount("Mal_AD", "Mal_AD", new AdopterRole(), newNetwork3, mal4, m5);
        um3.setEmailId("um3@sweethome.com");
        um3.setIncome(Float.valueOf(125000));

        AdopterAuthorizationRequest request2 = new AdopterAuthorizationRequest();
        request2.setMessage("New User");
        request2.setSender(um3);
        request2.setStatus("Pending");

        mal4.getWorkQueue().getWorkRequestList().add(request2);
        um3.getWorkQueue().getWorkRequestList().add(request2);
//AuthorityOrg(Authrity)
        UserAccount um4 = ecoSystem.getUserAccountDirectory().createUserAccount("Mal_AU", "Mal_AU", new AuthorityRole(), newNetwork3, mal4, m6);

        //DoctorOrg(Doector)
        UserAccount um5 = ecoSystem.getUserAccountDirectory().createUserAccount("Mal_DOC", "Mal_DOC", new DoctorRole(), newNetwork3, mal2, m2);
        //PharmacyOrg(Pharmacy)
        UserAccount um6 = ecoSystem.getUserAccountDirectory().createUserAccount("Mal_Phar", "Mal_Phar", new PharmacistRole(), newNetwork3, mal2, m3);
        //volunteerOrg(volunteerManagemer&volunteer)
        UserAccount um7 = ecoSystem.getUserAccountDirectory().createUserAccount("Mal_V", "Mal_V", new VolunteerRole(), newNetwork3, mal3, m4);
        UserAccount um8 = ecoSystem.getUserAccountDirectory().createUserAccount("Mal_VM", "Mal_VM", new VolunteerManagerRole(), newNetwork3, mal3, m4);

        //for cambridge------------------------------------------------------------------------------------------------------------------
        //orphanManagementOrganization(orphanManagement & orphanRegister)
        UserAccount uc1 = ecoSystem.getUserAccountDirectory().createUserAccount("Cam_OM", "Cam_OM", new OrphanManagementRole(), newNetwork4, cam1, c1);
        UserAccount uc2 = ecoSystem.getUserAccountDirectory().createUserAccount("Cam_OR", "Cam_OR", new OrphanRegisterRole(), newNetwork4, cam1, c1);
        //AdopterManagementOrganization(Adopter)
        UserAccount uc3 = ecoSystem.getUserAccountDirectory().createUserAccount("Cam_AD", "Cam_AD", new AdopterRole(), newNetwork4, cam4, c5);
        uc3.setEmailId("uc3@sweethome.com");
        uc3.setIncome(Float.valueOf(37000));

        AdopterAuthorizationRequest request3 = new AdopterAuthorizationRequest();
        request3.setMessage("New User");
        request3.setSender(uc3);
        request3.setStatus("Pending");

        cam4.getWorkQueue().getWorkRequestList().add(request3);
        uc3.getWorkQueue().getWorkRequestList().add(request3);

//AuthorityOrg(Authrity)
        UserAccount uc4 = ecoSystem.getUserAccountDirectory().createUserAccount("Cam_AU", "Cam_AU", new AuthorityRole(), newNetwork4, cam4, c6);
        //DoctorOrg(Doector)
        UserAccount uc5 = ecoSystem.getUserAccountDirectory().createUserAccount("Cam_DOC", "Cam_DOC", new DoctorRole(), newNetwork4, cam2, c2);
        //PharmacyOrg(Pharmacy)
        UserAccount uc6 = ecoSystem.getUserAccountDirectory().createUserAccount("Cam_Phar", "Cam_Phar", new PharmacistRole(), newNetwork4, cam2, c3);
        //volunteerOrg(volunteerManagemer&volunteer)
        UserAccount uc7 = ecoSystem.getUserAccountDirectory().createUserAccount("Cam_V", "Cam_V", new VolunteerRole(), newNetwork4, cam3, c4);
        UserAccount uc8 = ecoSystem.getUserAccountDirectory().createUserAccount("Cam_VM", "Cam_VM", new VolunteerManagerRole(), newNetwork4, cam3, c4);

        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //create orphan1 for boston network 
        Orphan orphan1 = ((OrphanShelterEnterprise) boston1).getOrphanDirectory().createOrphan("Lili");
        orphan1.setAge(2);
        orphan1.setSex("female");
        orphan1.setRace("Black or African American");
        orphan1.setPhoto("a");

        OrphanManagerRequest requestOr1 = new OrphanManagerRequest();
        requestOr1.setMessage("New Orphan");
        requestOr1.setSender(ub2);
        requestOr1.setStatus("Waiting for Manager");
        requestOr1.setOrphan(orphan1);
        ub2.getWorkQueue().getWorkRequestList().add(requestOr1);
        boston1.getWorkQueue().getWorkRequestList().add(requestOr1);

        //create orphan2 for boston network 
        Orphan orphan2 = ((OrphanShelterEnterprise) boston1).getOrphanDirectory().createOrphan("David");
        orphan2.setAge(4);
        orphan2.setSex("male");
        orphan2.setRace("White");
        orphan2.setPhoto("a");

        OrphanManagerRequest requestOr2 = new OrphanManagerRequest();
        requestOr2.setMessage("New Orphan");
        requestOr2.setSender(ub2);
        requestOr2.setStatus("Waiting for Manager");
        requestOr2.setOrphan(orphan2);
        ub2.getWorkQueue().getWorkRequestList().add(requestOr2);
        boston1.getWorkQueue().getWorkRequestList().add(requestOr2);

        //create orphan2 for boston network 
        Orphan orphan3 = ((OrphanShelterEnterprise) boston1).getOrphanDirectory().createOrphan("Emma");
        orphan3.setAge(3);
        orphan3.setSex("female");
        orphan3.setRace("White");
        orphan3.setPhoto("a");

        OrphanManagerRequest requestOr3 = new OrphanManagerRequest();
        requestOr3.setMessage("New Orphan");
        requestOr3.setSender(ub2);
        requestOr3.setStatus("Waiting for Manager");
        requestOr3.setOrphan(orphan3);
        ub2.getWorkQueue().getWorkRequestList().add(requestOr3);
        boston1.getWorkQueue().getWorkRequestList().add(requestOr3);

        return ecoSystem;
    }

}
