/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

import Model.Orphan.Orphan;
import Model.UserAccount.UserAccount;
/**
 *
 * @author hp
 */
public class AdoptionRequest extends WorkRequest {
    private UserAccount adoptor;
//    private Orphan selectedOrphan;

    
    public UserAccount getAdoptor() {
        return adoptor;
    }

    public void setAdoptor(UserAccount adoptor) {
        this.adoptor = adoptor;
    }

//    public Orphan getSelectedOrphan() {
//        return selectedOrphan;
//    }
//
//    public void setSelectedOrphan(Orphan selectedOrphan) {
//        this.selectedOrphan = selectedOrphan;
//    }
    
    
    
}
