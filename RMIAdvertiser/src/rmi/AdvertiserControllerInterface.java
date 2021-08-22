package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import SystemClasses.*;

import org.bson.Document;

/**
 *
 * @author Halim
 */
public interface AdvertiserControllerInterface extends Remote {
    
    public int testAddition(int x, int y) throws RemoteException;
    
    public void addProperty(Property property) throws RemoteException;
    
    public boolean editProperty(Property property, int id) throws RemoteException;
    
    public boolean removeProperty(int id) throws RemoteException;
 
    public Property getPtopertyAdvertismentByID(int id) throws RemoteException;
    
    public void cancelContract(int contractID) throws RemoteException;
    
    public void sendReview(int id, Review review) throws RemoteException;
    
    public boolean makeRefund(int buyerID, double amount) throws RemoteException;
    
    public double calculateAvgRating() throws RemoteException;
      
    public ArrayList<Property> getPropertirs() throws RemoteException;
    
    public ArrayList<Contract> getContracts() throws RemoteException;
    
    public ArrayList<Review> getReviews() throws RemoteException;
    
    public void register(String name, String email, String phone, String address, String profilePictureing ,String password) throws RemoteException;

    public Document signin(String email, String password) throws RemoteException;
    
    public ArrayList<Property> showMyProperties() throws RemoteException;
}

