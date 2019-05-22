/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprg2018.assignment2.lin;

/**
 * This class represents subject
 * @author Lu Lin
 */

enum State {
    WORKING_NORMALLY,
    MINOR_REPAIR_NEEDED,
    MAJOR_REPAIR_NEEDED,
    HARD_TO_BE_FIXED,
    TOTALLY_BROKEN
}

public class VendingMachine {
    private State _state;
    private Monitor _monitor;
    
    public void setMonitor(Monitor monitor) {
        this._monitor = monitor;
    }
    
    public void setState(State state) {
        this._state = state;
        this._monitor.notifyVendingMachine();
    }
    
    public State getState() {
        return this._state;
    }
    
}
