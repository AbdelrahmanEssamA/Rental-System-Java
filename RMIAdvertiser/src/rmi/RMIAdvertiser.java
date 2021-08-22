package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RMIAdvertiser {

    public static void main(String[] args) {
        
//        try {
//            // Connecting to the RMI Registry created on the server
//            Registry registry = LocateRegistry.getRegistry(20);
//
//            // Search for the stub "Advertiser Controller"
//            AdvertiserControllerInterface advertiser_controller = (AdvertiserControllerInterface) registry.lookup("Advertiser_Controller");
//
//            // Invoke the remote methods on the remote object
//            advertiser_controller.register("Ahmed", "Ahmed@gmail.com", "01209948470", "Daher", "", "assdfg");
//        } catch (Exception ex) {
//            System.out.println("Exception occured");
//        }
    }
}
