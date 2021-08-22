package SystemClasses;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Collection;

public class Advertiser extends AuthorizedUser implements Serializable {
    private ArrayList<Property> properties;
    private ArrayList<Contract> contracts;
    private ArrayList<Review> reviews;

    public Advertiser(ArrayList<Property> properties, ArrayList<Contract> contracts, ArrayList<Review> reviews, int id, String fullName, String email, String phone, String addres, String profilePicture, String password, boolean status) {
        super(id, fullName, email, phone, addres, profilePicture, password, status);
        this.properties = properties;
        this.contracts = contracts;
        this.reviews = reviews;
    }
    
    public Advertiser(){
        super();
    }


    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }

    public ArrayList<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(ArrayList<Contract> contracts) {
        this.contracts = contracts;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public boolean equals(Object obj) {
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

    
    
    @Override
    public String toString() {
        return "Advertiser{" + "properties=" + properties + ", contracts=" + contracts + ", reviews=" + reviews + '}';
    }
    
    
}
