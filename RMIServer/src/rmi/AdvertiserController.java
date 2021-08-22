package rmi;

import SystemClasses.*;
import database.DB;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author Halim
 */
public class AdvertiserController extends UnicastRemoteObject implements AdvertiserControllerInterface {

    public AdvertiserController() throws RemoteException {
    }

    @Override
    public int testAddition(int x, int y) throws RemoteException {
        return x + y;
    }

    @Override
    public void addProperty(Property property) throws RemoteException {
        System.out.println("Hi");
        property.setId(new DB().getAllDocuments("Property").size()+1);
        System.out.println(new DB().getAllDocuments("Property").size()+1);
        new DB().addDocument("Property", property);
    }

    
    @Override
    public boolean editProperty(Property property, int id) throws RemoteException {
        return true;
    }

    @Override
    public boolean removeProperty(int id) throws RemoteException {
        return true;
    }

    @Override
    public Property getPtopertyAdvertismentByID(int id) throws RemoteException {
        return null;
    }

    @Override
    public void cancelContract(int contractID) throws RemoteException {
        return;
    }

    @Override
    public void sendReview(int id, Review review) throws RemoteException {
        return;
    }

    @Override
    public boolean makeRefund(int buyerID, double amount) throws RemoteException {
        return true;
    }

    @Override
    public double calculateAvgRating() throws RemoteException {
        return 0.0;
    }

    @Override
    public ArrayList<Property> getPropertirs() throws RemoteException {
        return null;
    }

    @Override
    public ArrayList<Contract> getContracts() throws RemoteException {
        return null;
    }

    @Override
    public ArrayList<Review> getReviews() throws RemoteException {
        return null;
    }

    @Override
    public void register(String name, String email, String phone, String address, String profilePicture, String password) throws RemoteException {

        new DB().addDocument("Advertiser", new Advertiser(null, null, null, new DB().getAllDocuments("Advertiser").size() + 1, name, email, phone, address, profilePicture, password, true));
    }

    @Override
    public Document signin(String email, String password) throws RemoteException {
        ArrayList<Document> advertisers = new ArrayList<Document>();
        advertisers = new DB().getAllDocuments("Advertiser");
        for (int i = 0; i < advertisers.size(); i++) {
            if (advertisers.get(i).get("email").toString().equals(email) && advertisers.get(i).get("password").toString().equals(password)) {
                return advertisers.get(i);
            }

        }
        return null;
    }
    @Override
     public ArrayList<Property> showMyProperties() throws RemoteException{
         ArrayList<Property> p =  new DB().getAllProperties("Property");
         return p;
     }
    
    
    
}
