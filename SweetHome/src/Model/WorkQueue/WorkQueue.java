/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author alilovepeach
 */
public class WorkQueue {
        
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public WorkRequest findWorkRequestByMessage(String me){
        for(WorkRequest wr : this.workRequestList){
            if(wr.getMessage().equalsIgnoreCase(me)){
                return wr;
            }
        }
        return null;
    } 
}
