/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.EcoSystem;

import Model.Enterprise.EnterpriseDirectory;
import Model.WorkQueue.WorkQueue;

/**
 *
 * @author alilovepeach
 */
public class Network {
  
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private EcoSystem ecosystem;
    private WorkQueue workQueue;

    //create network
    public Network(String s, EcoSystem system) {
        this.name = s;
        this.ecosystem = system;
        this.workQueue = new WorkQueue();
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public EcoSystem getEcosystem() {
        return ecosystem;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }    
  
}
