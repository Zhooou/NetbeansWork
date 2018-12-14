/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author runyangzhou
 */
public class VitalSignsHistory {
    private ArrayList<VitalSigns> vitalSignsHistory;

    public VitalSignsHistory() {
        vitalSignsHistory = new ArrayList<VitalSigns>();
    }
    
    public ArrayList<VitalSigns> getAbnormalList(int max, int min){
        ArrayList<VitalSigns> abnormalList = new ArrayList<>();
        for(VitalSigns vs: vitalSignsHistory){
            if(vs.getBloodPressure() > max || vs.getBloodPressure() < min){
                abnormalList.add(vs);
            }
        }
        return abnormalList;
    }
    
    public ArrayList<VitalSigns> getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignsHistory(ArrayList<VitalSigns> vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }
    
    public VitalSigns addVitalSigns(){
        VitalSigns vs = new VitalSigns();
        vitalSignsHistory.add(vs);
        return vs;
    }
    
    public void deleteVitalSigns(VitalSigns vs){
        vitalSignsHistory.remove(vs);
    }
}
