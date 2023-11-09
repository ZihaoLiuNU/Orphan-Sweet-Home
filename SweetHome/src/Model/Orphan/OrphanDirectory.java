package Model.Orphan;


import Model.Enterprise.Enterprise;
import Model.Enterprise.OrphanShelterEnterprise;
import Model.UserAccount.UserAccount;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author alilovepeach
 */
public class OrphanDirectory {

    ArrayList<Orphan> orphanList;
    Enterprise enterprise;

    public OrphanDirectory(Enterprise enterprise) {
        this.orphanList = new ArrayList<Orphan>();
        this.enterprise = enterprise;
    }

    public ArrayList<Orphan> getOrphanList() {
        return orphanList;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public Orphan createOrphan(String name) {
        Orphan orphan = new Orphan(name);
        orphan.setEnterprise((OrphanShelterEnterprise) enterprise);
        orphan.setId(orphanList.size() + 1);
        orphanList.add(orphan);
        return orphan;
    }

    public boolean nameIsUnique(String name) {
        for (Orphan orphan : orphanList) {
            if (name.equalsIgnoreCase(orphan.getName())) {
                return false;
            }
        }
        return true;
    }

    public Orphan getOrphanByName(String name) {
        for (Orphan o : orphanList) {
            if (name.equalsIgnoreCase(o.getName())) {
                return o;
            }
        }
        return null;
    }

    public Orphan getOrphanByManager(UserAccount manager) {
        for (Orphan o : orphanList) {
            if (o.getManager() == manager && o.getAdoptor() == null) {
                return o;
            }
        }
        return null;
    }

    public Orphan getOrphanByAdoptionRequested(Boolean bb) {
        for (Orphan o : orphanList) {
            if (bb == true) {
                return o;
            }
        }
        return null;
    }
}
