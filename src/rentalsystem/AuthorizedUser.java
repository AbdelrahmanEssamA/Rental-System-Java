package rentalsystem;

import database.DB;
import java.util.ArrayList;
import java.util.Objects;
import org.bson.Document;

public abstract class  AuthorizedUser {
    
    private int id;
    private String fullName;
    private String email;
    private String phone;
    private String addres;
    private String profilePicture;
    private String password;
    private boolean status;

    public AuthorizedUser(int id, String fullName, String email, String phone, String addres, String profilePicture, boolean status, String password) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.addres = addres;
        this.profilePicture = profilePicture;
        this.status = status;
        this.password = password;
        
    }

    public AuthorizedUser() {
    }
    
    
    public AuthorizedUser login(String email, String password,String type){
       
        
        if(type == "Buyer"){
            ArrayList<Buyer> buyers = new ArrayList<Buyer>();
            buyers = new DB().getAllBuyers("Buyer");
            for (int i = 0; i < buyers.size(); i++) {
                if(buyers.get(i).getEmail().equals(email) && buyers.get(i).getPassword().equals(password)){
                    return buyers.get(i);
                }
            }
        }
        else if(type == "Advertiser"){
            ArrayList<Advertiser> advertisers = new ArrayList<Advertiser>();
            advertisers = new DB().getAllAdvertisers("Buyer");
            for (int i = 0; i < advertisers.size(); i++) {
                if(advertisers.get(i).getEmail().equals(email) && advertisers.get(i).getPassword().equals(password)){
                    return advertisers.get(i);
                }
            }
        }
        
            return null;
      }
        
    
    public void register(String name, String email, String phone, String address, String profilePictureing ,String password,String type){
        if(type == "Buyer")
            new DB().addDocument("Buyer", new Buyer(0, null, null, new DB().getAllDocuments("Buyer").size()+1, name, email, phone, address, profilePicture, true, password));
        else if(type == "Advertiser")
            new DB().addDocument("Advertiser", new Advertiser(null, null, null, new DB().getAllDocuments("Advertiser").size()+1, name, email, phone, address, profilePicture, true, password));
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddres() {
        return addres;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public boolean isStatus() {
        return status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AuthorizedUser{" + "id=" + id + ", fullName=" + fullName + ", email=" + email + ", phone=" + phone + ", addres=" + addres + ", profilePicture=" + profilePicture + ", status=" + status + '}';
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
        final AuthorizedUser other = (AuthorizedUser) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.fullName, other.fullName)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(this.addres, other.addres)) {
            return false;
        }
        if (!Objects.equals(this.profilePicture, other.profilePicture)) {
            return false;
        }
        return true;
    }
    
    
    
    
            
    
}
