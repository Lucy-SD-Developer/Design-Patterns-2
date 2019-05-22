/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprg2018.assignment2.lin;

import java.util.*;
/**
 * This class implements interface Monitor
 * @author Lu Lin
 */
public class AdvancedMonitor implements Monitor {
    private ArrayList<VendingMachine> _machines
            = new ArrayList<>();
    
    public void monitorMachine (VendingMachine machine) {
        if (_machines.size() < 4) {
            _machines.add(machine);
            machine.setMonitor(this);
        }
    }
    
    public void notifyVendingMachine() {
        for (int i = 0; i < this._machines.size(); i++) {
            State state = this._machines.get(i).getState();
            if (state == null) {
                return;
            }
            switch (state) {
                case WORKING_NORMALLY:
                case TOTALLY_BROKEN:
                    System.out.println("Advanced monitor: repair not needed");
                    break;
                case MINOR_REPAIR_NEEDED:
                    System.out.println("Advanced monitor: repair needed - minor");
                    break;
                case MAJOR_REPAIR_NEEDED:
                    System.out.println("Advanced monitor: repair needed - major");
                    break;
                case HARD_TO_BE_FIXED:
                    System.out.println("Advanced monitor: repair needed - hard");
                    break;
            }   
        }
    }
}
