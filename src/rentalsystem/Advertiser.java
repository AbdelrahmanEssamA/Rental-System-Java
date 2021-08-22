package rentalsystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import database.DB;
import java.util.Collection;
import org.bson.Document;

public class Advertiser extends AuthorizedUser{
    private ArrayList<Property> properties;
    private ArrayList<Contract> contracts;
    private ArrayList<Review> reviews;
    
    

    public Advertiser(ArrayList<Property> propertirs, ArrayList<Contract> contracts, ArrayList<Review> reviews, int id, String fullName, String email, String phone, String addres, String profilePicture, boolean status, String password) {
        super(id, fullName, email, phone, addres, profilePicture, status, password);
        this.properties = propertirs;
        this.contracts = contracts;
        this.reviews = reviews;
        
    }

    public Advertiser() {
        super();
    }
    
    public void addProperty(Property property){
       new DB().addDocument("Property", property);
    }
    
    public boolean editProperty(Property property, int id){
       return new DB().updateDocumentById("Property", id, property);
    }
    
    public boolean removeProperty(Property property, int id){
        return new DB().deleteDocumentById("Property", id);
    }
    
    public Property getPtopertyAdvertismentByID(int id){
        Property d = new DB().getPropertyById("Property", id);
        return d; 
       
    }
     
    
    public void cancelContract(int contractID){
       for (int i = 0; i <this.contracts.size(); i++){
           if( contractID == contracts.get(i).getId()){
               if(contracts.get(i).getPaymentStatus() == PaymentStatus.Paid) {
                   this.makeRefund(contracts.get(i).getBuyerID(), contracts.get(i).getProperty().getPrice());
                   contracts.get(i).setContractStatus(ContractStatus.Canceled);
               } else {
                contracts.get(i).setContractStatus(ContractStatus.Canceled);
               }
               
               new DB().updateDocumentById("Contract", contractID, contracts.get(i));
           }
       }
       
    }
    
    public void sendReview(int id, Review review){
          Buyer b = new DB().getBuyerById("Buyer", id);
          ArrayList<Review> reviews = b.getReviews();
          reviews.add(review);
          b.setReviews(reviews);
          new DB().updateDocumentById("Buyer", id, b);
          
    }
    
    
    public boolean makeRefund(int buyerID, double amount){
       Buyer buyer =  new DB().getBuyerById("Buyer", buyerID);
       double balance = buyer.getBlance();
       balance += amount;
       buyer.setBlance(balance);
      return (boolean) new DB().updateDocumentById("Buyer", buyerID, buyer);
    }
    
    public double calculateAvgRating(){
        Advertiser a = new DB().getAdvertiserById("Advertiser", this.getId());
        ArrayList<Review> reviews = a.getReviews();
        double avg = 0;
        for(int i=0; i < reviews.size(); i++){
            avg+= reviews.get(i).getRating();
        }
        return avg/reviews.size();
    }
      
    public ArrayList<Property> getPropertirs() {
        return properties;
    }

    public ArrayList<Contract> getContracts() {
        return contracts;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setPropertirs(ArrayList<Property> propertirs) {
        this.properties = propertirs;
    }

    public void setContracts(ArrayList<Contract> contracts) {
        this.contracts = contracts;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    
    @Override
    public String toString() {
        return "Advertiser{" + "propertirs=" + properties + ", contracts=" + contracts + ", reviews=" + reviews + '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Advertiser other = (Advertiser) obj;
        if (!Objects.equals(this.properties, other.properties)) {
            return false;
        }
        if (!Objects.equals(this.contracts, other.contracts)) {
            return false;
        }
        if (!Objects.equals(this.reviews, other.reviews)) {
            return false;
        }
        return true;
    }
    
    
    
    
    

 
    
    
    
}
