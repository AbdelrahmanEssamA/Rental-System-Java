package testing;

import database.DB;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import SystemClasses.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmi.AdvertiserControllerInterface;

public class TestJunit {
   static DB db = new DB();
   @Test
   public void testAddPropertyDB() {
        Property p = new Property(1,"title","description","ownerName", new Location(), 4.5, PropertyStatus.Rent , PropertyType.Duplex ,  false, false,4, new ArrayList<>() , true, new ArrayList<>() , 3);
        db.addDocument("Property", p);
        ArrayList <Property> properties = db.getAllProperties("Property");
        int Result = properties.size();
        assertNotEquals(0, Result);
   }
   
   @Test
   public void testUpdatePropertyDB() {
        Property p = db.getPropertyById("Property", 1);
        p.setPrice(100.0);
        db.updateDocumentById("Property", 1, p);
        Property newProperty = db.getPropertyById("Property", 1);
        double Result = newProperty.getPrice();
        double Expected = 100.0;
        assertEquals(Expected, Result, 0.0001);
   }
   
   @Test
   public void testDeletePropertyDB() {
        boolean Result = db.deleteDocumentById("Property", 1);
        boolean Expected = true;
        assertEquals(Expected, Result);
   }
   
   @Test
   public void testAdditionRMI() {
        int Result = 0;
        int Expected = 7;
        try {
            // Connecting to the RMI Registry created on the server
            Registry registry = LocateRegistry.getRegistry(20);

            // Search for the stub "Advertiser Controller"
            AdvertiserControllerInterface advertiser_controller = (AdvertiserControllerInterface) registry.lookup("Advertiser_Controller");

            // Invoke the remote methods on the remote object
            Result = advertiser_controller.testAddition(3, 4);
        } catch (Exception ex) {
            System.out.println("Exception occured");
        }
        assertEquals(Expected, Result);
   }
   
   
   @Test
   public void testAddPropertyRMI() {
        Property p = new Property();
        p.setOwnerName("Halim");
        boolean Result = false;
        boolean Expected = true;
        try {
            // Connecting to the RMI Registry created on the server
            Registry registry = LocateRegistry.getRegistry(20);

            // Search for the stub "Advertiser Controller"
            AdvertiserControllerInterface advertiser_controller = (AdvertiserControllerInterface) registry.lookup("Advertiser_Controller");

            // Invoke the remote methods on the remote object
            advertiser_controller.addProperty(p);
            Result = true;
        } catch (Exception ex) {
            Result = false;
        }
        assertEquals(Expected, Result);
   }
           

}