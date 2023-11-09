/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

import Model.UserAccount.UserAccount;

/**
 *
 * @author hp
 */
public class VolunteerRequest extends WorkRequest {
    
    private UserAccount assignedVolunteer;

    public UserAccount getAssignedVolunteer() {
        return assignedVolunteer;
    }

    public void setAssignedVolunteer(UserAccount assignedVolunteer) {
        this.assignedVolunteer = assignedVolunteer;
    }
    
}
