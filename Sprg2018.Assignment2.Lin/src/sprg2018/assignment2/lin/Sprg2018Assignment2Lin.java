/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprg2018.assignment2.lin;

/**
 * This is the main class
 * @author Lu Lin
 */
public class Sprg2018Assignment2Lin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Monitor simple = new SimpleMonitor();
        Monitor medium = new MediumMonitor();
        Monitor advanced = new AdvancedMonitor();
        
        VendingMachine v1 = new VendingMachine();
        VendingMachine v2 = new VendingMachine();
        VendingMachine v3 = new VendingMachine();
        VendingMachine v4 = new VendingMachine();
        
        // Simple
        simple.monitorMachine(v1);
        v1.setState(State.MAJOR_REPAIR_NEEDED);
        
        // Medium
        medium.monitorMachine(v1);
        v1.setState(State.MAJOR_REPAIR_NEEDED);
        
        // Advanced
        advanced.monitorMachine(v1);
        advanced.monitorMachine(v2);
        advanced.monitorMachine(v3);
        advanced.monitorMachine(v4);
        
        v1.setState(State.MAJOR_REPAIR_NEEDED);
        v2.setState(State.MINOR_REPAIR_NEEDED);
        v3.setState(State.TOTALLY_BROKEN);
        v4.setState(State.HARD_TO_BE_FIXED);
    }
    
}
