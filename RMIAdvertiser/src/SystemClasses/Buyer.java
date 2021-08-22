package SystemClasses;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;


public class Buyer extends AuthorizedUser implements Serializable {
    
    private double blance ;
    private ArrayList<Contract> contracts;
    private ArrayList<Review> reviews;
    private Advertiser advertiser;
    public Buyer() {
        super();
    }

    public Buyer(double blance, ArrayList<Contract> contracts, ArrayList<Review> reviews, int id, String fullName, String email, String phone, String addres, String profilePicture, boolean status, String password) {
        super(id, fullName, email, phone, addres, profilePicture, password, status);
        this.blance = blance;
        this.contracts = contracts;
        this.reviews = reviews;
    }

    public double getBlance() {
        return blance;
    }

    public void setBlance(double blance) {
        this.blance = blance;
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

    public Advertiser getAdvertiser() {
        return advertiser;
    }

    public void setAdvertiser(Advertiser advertiser) {
        this.advertiser = advertiser;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Buyer other = (Buyer) obj;
        if (Double.doubleToLongBits(this.blance) != Double.doubleToLongBits(other.blance)) {
            return false;
        }
        if (!Objects.equals(this.contracts, other.contracts)) {
            return false;
        }
        if (!Objects.equals(this.reviews, other.reviews)) {
            return false;
        }
        if (!Objects.equals(this.advertiser, other.advertiser)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Buyer{" + "blance=" + blance + ", contracts=" + contracts + ", reviews=" + reviews + ", advertiser=" + advertiser + '}';
    }
    
    
}
