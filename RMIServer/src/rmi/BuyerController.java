package rmi;

import SystemClasses.*;
import database.DB;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;
import org.bson.Document;

/**
 *
 * @author Halim
 */
 
public class BuyerController extends UnicastRemoteObject implements BuyerControllerInterface {

    public BuyerController() throws RemoteException {
    }

    @Override
    public int testAddition(int x, int y) throws RemoteException {
        return x+y;
    }
    
    @Override
    public ArrayList<Property> browseProperties() throws RemoteException {
        return new DB().getAllProperties("Property");
    }
    
    @Override
    public void makeBook(Property property, Date start, Date end) throws RemoteException {

    }
    
    @Override
    public void cancelContract(int contractID) throws RemoteException {
    
    }
    
    @Override
    public void sendReview(int id, Review review) throws RemoteException {
    
    }

    @Override
    public void requestAppointment(int propertyID) throws RemoteException {
    
    }
  
    @Override
    public double getBlance()  throws RemoteException {
        return 0.0;
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
    public void setBlance(double blance) throws RemoteException {
    
    }

    @Override
    public void setContracts(ArrayList<Contract> contracts) throws RemoteException {
    
    }

    @Override
    public void setReviews(ArrayList<Review> reviews) throws RemoteException {
    
    }
    public void register(String name, String email, String phone, String address, String profilePicture, String password) throws RemoteException {

        new DB().addDocument("Buyer", new Buyer(0, null, null, new DB().getAllDocuments("Buyer").size()+1, name, email, phone, address, profilePicture, true, password));
    }

    @Override
    public Document signin(String email, String password) throws RemoteException {
        ArrayList<Document> buyers = new ArrayList<Document>();
        buyers = new DB().getAllDocuments("Buyer");
        for (int i = 0; i < buyers.size(); i++) {
            if (buyers.get(i).get("email").equals(email) && buyers.get(i).get("password").equals(password)) {
                return buyers.get(i);
            }

        }
        return null;
    }
    
}

