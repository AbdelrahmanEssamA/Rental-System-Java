package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Halim
 */
//RMI Server
public class RMIServer {

    public static void main(String[] args) {
         try {
            // My remote object [Skeleton]
            AdvertiserControllerInterface advertiser_controller = new AdvertiserController();
            BuyerControllerInterface buyer_controller = new BuyerController();
            
            // My RMI Registry
            Registry registry = LocateRegistry.createRegistry(20);
            
            //Add my object to the RMI Registry
            registry.bind("Advertiser_Controller", advertiser_controller);
            registry.bind("Buyer_Controller", buyer_controller);
            
            System.out.println("Server is ready ...");   
        } catch (Exception ex) {
           System.out.println("Exception occured");
        }   
    }
    
}
