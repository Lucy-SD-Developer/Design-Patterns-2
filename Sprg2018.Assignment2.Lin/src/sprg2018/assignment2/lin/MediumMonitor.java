/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprg2018.assignment2.lin;

/**
 * This class implements interface Monitor
 * @author Lu Lin
 */
public class MediumMonitor implements Monitor {
    private VendingMachine _machine;
    
    public void monitorMachine (VendingMachine machine) {
        this._machine = machine;
        this._machine.setMonitor(this);
    }
    
    public void notifyVendingMachine() {
        State state = this._machine.getState();
        switch (state) {
            case WORKING_NORMALLY:
            case TOTALLY_BROKEN:
                System.out.println("Medium monitor: repair not needed");
                break;
            case MINOR_REPAIR_NEEDED:
                System.out.println("Medium monitor: repair needed - minor");
                break;
            case MAJOR_REPAIR_NEEDED:
                System.out.println("Medium monitor: repair needed - major");
                break;
            case HARD_TO_BE_FIXED:
                System.out.println("Medium monitor: repair needed - hard");
                break;
        }
    }
}
