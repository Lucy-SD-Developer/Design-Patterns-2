/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprg2018.assignment2.lin;

/**
 * This interface represents observer
 * @author Lu Lin
 */
public interface Monitor {
    public void monitorMachine(VendingMachine machine);
    public void notifyVendingMachine();    
}
