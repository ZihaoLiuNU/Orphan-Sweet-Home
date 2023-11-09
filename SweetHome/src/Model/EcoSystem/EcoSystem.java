package Model.EcoSystem;

import Model.Enterprise.EnterpriseDirectory;
import Model.UserAccount.UserAccount;
import Model.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author alilovepeach
 */
public class EcoSystem {

    ArrayList<Network> networkList;
    UserAccountDirectory userAccountDirectory;
    UserAccount systemAdmin;
  

    public EcoSystem() {
        this.networkList = new ArrayList<Network>();
        this.userAccountDirectory = new UserAccountDirectory();
       

    }

    public static EcoSystem getInstance() {

        return new EcoSystem();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public UserAccount getSystemAdmin() {
        return systemAdmin;
    }

    public void setSystemAdmin(UserAccount systemAdmin) {
        this.systemAdmin = systemAdmin;
    }

    public boolean nameIsUnique(String name) {
        for (Network n : networkList) {
            if (name.equalsIgnoreCase(n.getName())) {
                return false;
            }
        }
        return true;
    }
    
    public Network createNetwork(String name){
        Network network = new Network(name,this);
        networkList.add(network);
        return network;
    }
    
    public Network findNetworkByName(String name){
        for(Network nw : networkList){
            if(name.equalsIgnoreCase(nw.getName())){
                return nw;
            }
        }
        return null;
    }
    
  

    
    public void deleteNetwork(Network nw) {
       
            networkList.remove(nw);
        
    }

}
