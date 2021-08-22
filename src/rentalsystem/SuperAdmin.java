package rentalsystem;

import database.DB;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import org.bson.Document;

public  class  SuperAdmin {
    
    private String email;
    private String password;
    private ArrayList<String> LastChangesLog;
    private static SuperAdmin admin;

    private static SuperAdmin getinstance(){
        if(admin == null){
            admin =  new SuperAdmin("admin","123456");
        }
        return admin;
    }

    private SuperAdmin() {
        
    }
    
    private SuperAdmin(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    public SuperAdmin login(String email, String password){
       
            
        if(admin.getEmail().equals(email) && admin.getPassword().equals(password)){
            return admin;
        }
            
        return null;
    }
    
    public boolean addToChangesLog(String log){
        return LastChangesLog.add(log);
    }
    
    public Report generateReport(Date from, Date to){
        Report r =  new Report();
        r.setDate(from);
        r.setNumberPropertiesAdded(new DB().getAllProperties("Property").size());
        r.setNumberUsersRegistered(new DB().getAllAdvertisers("Advertiser").size()+new DB().getAllBuyers("Buyer").size());
        double revenue =0;
        ArrayList<Property> properties = new DB().getAllProperties("Property");
        for (int i = 0; i < properties.size(); i++) {
            if(properties.get(i).getPropertyStatus().equals("unavailable")){
                revenue+=properties.get(i).getPrice();
            }
            
        }
        r.setRevenue(revenue*.15 );
        r.setTotalPayments(revenue);
        return r;
    }
    

    public void suspendBuyer(int id){
        Buyer b =  new DB().getBuyerById("Buyer", id);
        b.setStatus(false);
        new DB().updateDocumentById("Buyer", id, b);
    }
    public void activateBuyerAccount(int id){
       Buyer b =  new DB().getBuyerById("Buyer", id);
       b.setStatus(true);
       new DB().updateDocumentById("Buyer", id, b); 
    }
    public void suspendAdvertiser(int id){
        Advertiser b =  new DB().getAdvertiserById("Advertiser", id);
        b.setStatus(false);
        new DB().updateDocumentById("Advertiser", id, b);
    }
    public void activateAdvertiserAccount(int id){
        Advertiser b =  new DB().getAdvertiserById("Advertiser", id);
        b.setStatus(true);
        new DB().updateDocumentById("Advertiser", id, b);
    }
 
    public boolean deleteProperty(int PropertyID){
        return (boolean) new DB().deleteDocumentById("Property", PropertyID);
    }
    
    public ArrayList<Buyer> getBuyerssList(){
        
        ArrayList<Buyer> buyers = new DB().getAllBuyers("Buyer");
        return buyers;
    }
    public ArrayList<Advertiser> getAdvertisersList(){
        ArrayList<Advertiser> addvertisers = new DB().getAllAdvertisers("Advertiser");
        return addvertisers;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<String> getLastChangesLog() {
        return LastChangesLog;
    }

   

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLastChangesLog(ArrayList<String> LastChangesLog) {
        this.LastChangesLog = LastChangesLog;
    }

    @Override
    public String toString() {
        return "SuperAdmin{" + "email=" + email + ", password=" + password + ", LastChangesLog=" + LastChangesLog + ", admin=" + admin + '}';
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
        final SuperAdmin other = (SuperAdmin) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.LastChangesLog, other.LastChangesLog)) {
            return false;
        }
        if (!Objects.equals(this.admin, other.admin)) {
            return false;
        }
        return true;
    }
    
    
}
