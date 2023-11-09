/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprise;

import Model.Orphan.OrphanDirectory;

/**
 *
 * @author alilovepeach
 */
public class OrphanShelterEnterprise extends Enterprise{

    private final OrphanDirectory orphanDirectory;
    
    public OrphanShelterEnterprise(String name) {
        super(name, Enterprise.Type.OrphanShelter);
        orphanDirectory = new OrphanDirectory(this);
    }

    public OrphanDirectory getOrphanDirectory() {
        return orphanDirectory;
    }
    
}