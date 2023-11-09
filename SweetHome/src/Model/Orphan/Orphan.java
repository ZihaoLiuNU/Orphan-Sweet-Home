/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Orphan;

import Model.Enterprise.OrphanShelterEnterprise;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.WorkQueue;
import javax.swing.ImageIcon;

/**
 *
 * @author alilovepeach
 */
public class Orphan {
    
    private OrphanShelterEnterprise enterprise;
    private int id;
    private String name;
    private String sex;
    private String race;
    private String photo;
    private int age;
    private WorkQueue workQueue;
    private ImageIcon photoIcon;
    private String doctorMessage;
    private String pharmacyMessage;
    private UserAccount manager;
    private UserAccount adoptor;
    private boolean adpotionRequested;
    
    public Orphan(String name) {
        this.name = name;
        this.workQueue = new WorkQueue();
    }

    public OrphanShelterEnterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(OrphanShelterEnterprise enterprise) {
        this.enterprise = enterprise;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public ImageIcon getPhotoIcon() {
        return photoIcon;
    }

    public void setPhotoIcon(ImageIcon photoIcon) {
        this.photoIcon = photoIcon;
    }

    public String getDoctorMessage() {
        return doctorMessage;
    }

    public void setDoctorMessage(String doctorMessage) {
        this.doctorMessage = doctorMessage;
    }

    public String getPharmacyMessage() {
        return pharmacyMessage;
    }

    public void setPharmacyMessage(String pharmacyMessage) {
        this.pharmacyMessage = pharmacyMessage;
    }

    public UserAccount getManager() {
        return manager;
    }

    public void setManager(UserAccount manager) {
        this.manager = manager;
    }

    public UserAccount getAdoptor() {
        return adoptor;
    }

    public void setAdoptor(UserAccount adoptor) {
        this.adoptor = adoptor;
    }

    public boolean isAdpotionRequested() {
        return adpotionRequested;
    }

    public void setAdpotionRequested(boolean adpotionRequested) {
        this.adpotionRequested = adpotionRequested;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
