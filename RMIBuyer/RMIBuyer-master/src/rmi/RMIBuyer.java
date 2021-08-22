package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

//RMI Buyer
public class RMIBuyer {

    public static void main(String[] args) {
        try {
            // Connecting to the RMI Registry created on the server
            Registry registry = LocateRegistry.getRegistry(20);

            // Search for the stub "Advertiser Controller"
            BuyerControllerInterface buyer_controller = (BuyerControllerInterface) registry.lookup("Buyer_Controller");

            // Invoke the remote methods on the remote object
            System.out.println(buyer_controller.testAddition(5, 3));
        } catch (Exception ex) {
            System.out.println("Exception occured");
        }
    }
}
