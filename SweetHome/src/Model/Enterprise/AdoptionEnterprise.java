/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprise;

/**
 *
 * @author alilovepeach
 */
public class AdoptionEnterprise extends Enterprise{
  private float donation;
  
  public void addDonation(Float amount){
        this.donation+=amount;
        
    }

    public float getDonation() {
        return donation;
    }

    public void setDonation(float donation) {
        this.donation = donation;
    }
    
    public AdoptionEnterprise(String adoptname) {
        super(adoptname, Enterprise.Type.Adoption);
        this.donation=0;
    }

}

