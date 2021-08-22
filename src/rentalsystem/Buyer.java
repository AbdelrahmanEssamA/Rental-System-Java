package rentalsystem;

import database.DB;
import java.util.ArrayList;
import java.util.Date;
import org.bson.Document;


public class Buyer extends AuthorizedUser implements Subscriber{
    
    private double blance ;
    private ArrayList<Contract> contracts;
    private ArrayList<Review> reviews;
    private Advertiser advertiser;
    public Buyer() {
        super();
    }

    public Buyer(double blance, ArrayList<Contract> contracts, ArrayList<Review> reviews, int id, String fullName, String email, String phone, String addres, String profilePicture, boolean status, String password) {
        super(id, fullName, email, phone, addres, profilePicture, status, password);
        this.blance = blance;
        this.contracts = contracts;
        this.reviews = reviews;
    }
    
    public ArrayList<Property> browseProperties(){
        return new DB().getAllProperties("Property");
    }
    
    public void makeBook(Property property, Date start, Date end){
        
        Contract c = new ContractFactorty().makeContract(property.getPropertyStatus());
        this.getContracts().add(c);
        Advertiser b = new DB().getAdvertiserById("Advertiser",property.getOwnerID());
        b.getContracts().add(c);
        
        if(property.getPropertyStatus() == "Rent"){
            RentContract rc = (RentContract)c;
            rc.setBuyerID(this.getId());
            rc.setBuyerName(this.getFullName());
            rc.setContractStatus(ContractStatus.Pending);
            rc.setCheckIn(start);
            rc.setCheckOut(end);
            rc.setSellerName(property.getOwnerName());
            rc.setPaymentStatus(PaymentStatus.NotPaid);
           
        }
        else if(property.getPropertyStatus() == "Sharing"){
            ShairingContract sc = (ShairingContract)c;
            sc.setBuyerID(this.getId());
            sc.setBuyerName(this.getFullName());
            sc.setContractStatus(ContractStatus.Pending);
            sc.setCheckIn(start);
            sc.setCheckOut(end);
            sc.setSellerName(property.getOwnerName());
            sc.setPaymentStatus(PaymentStatus.NotPaid);
        }
        else if(property.getPropertyStatus() == "Sale"){
            SaleContract sc = (SaleContract)c;
            sc.setBuyerID(this.getId());
            sc.setBuyerName(this.getFullName());
            sc.setContractStatus(ContractStatus.Pending);
            sc.setSellerName(property.getOwnerName());
            
            sc.setPaymentStatus(PaymentStatus.NotPaid);
            
        }
        
        new DB().addDocument("Contract", c);
        new DB().updateDocumentById("Buyer", this.getId(), this);
        new DB().updateDocumentById("Advertiser", b.getId(), b);
    }
    
    public void cancelContract(int contractID){
       for (int i = 0; i < this.contracts.size(); i++){
           if( contractID == contracts.get(i).getId()){
               contracts.get(i).setContractStatus(ContractStatus.Canceled);
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
     
    //not done
    public void requestAppointment(int propertyID){
         Document d = new DB().getDocumentById("Property", propertyID); 
         ArrayList<Appointment> appointments = ( ArrayList<Appointment>)d.get("appointments");
         appointments.add(new Appointment(new DB().getAllDocuments("appointments").size()+1, propertyID, null));
    }
    
   
    
    //pattern??
    public String update(){
        return "you have new offer";
    }

    public double getBlance() {
        return blance;
    }

    public ArrayList<Contract> getContracts() {
        return contracts;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setBlance(double blance) {
        this.blance = blance;
    }

    public void setContracts(ArrayList<Contract> contracts) {
        this.contracts = contracts;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }
    
    


    
    
    
    
    
}
