package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import SystemClasses.*;
import java.util.Date;
import org.bson.Document;

/**
 *
 * @author Halim
 */
public interface BuyerControllerInterface extends Remote {
    
    public int testAddition(int x, int y) throws RemoteException;
    
    public ArrayList<Property> browseProperties() throws RemoteException;
    
    public void makeBook(Property property, Date start, Date end) throws RemoteException;
    
    public void cancelContract(int contractID) throws RemoteException;
    
    public void sendReview(int id, Review review) throws RemoteException;

    public void requestAppointment(int propertyID) throws RemoteException;
  
    public double getBlance()  throws RemoteException;
    
    public ArrayList<Contract> getContracts() throws RemoteException;

    public ArrayList<Review> getReviews() throws RemoteException;

    public void setBlance(double blance) throws RemoteException;

    public void setContracts(ArrayList<Contract> contracts) throws RemoteException;

    public void setReviews(ArrayList<Review> reviews) throws RemoteException;
    
    public void register(String name, String email, String phone, String address, String profilePictureing ,String password) throws RemoteException;

    public Document signin(String email, String password) throws RemoteException;
    
}

