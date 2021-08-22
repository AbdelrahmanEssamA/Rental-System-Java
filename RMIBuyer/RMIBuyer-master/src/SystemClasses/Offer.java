package SystemClasses;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Offer implements Serializable {

    private String promoCode;
    private Date endDate;
    private int salePercentage;
    private ArrayList<Subscriber> subscribers;

    public Offer(String promoCode, Date endDate, int salePercentage, ArrayList<Subscriber> subscribers) {
        this.promoCode = promoCode;
        this.endDate = endDate;
        this.salePercentage = salePercentage;
        this.subscribers = subscribers;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getSalePercentage() {
        return salePercentage;
    }

    public void setSalePercentage(int salePercentage) {
        this.salePercentage = salePercentage;
    }

    public ArrayList<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(ArrayList<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Offer other = (Offer) obj;
        if (!Objects.equals(this.promoCode, other.promoCode)) {
            return false;
        }
        if (!Objects.equals(this.endDate, other.endDate)) {
            return false;
        }
        if (this.salePercentage != other.salePercentage) {
            return false;
        }
        if (!Objects.equals(this.subscribers, other.subscribers)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "Offer{" + "promoCode=" + promoCode + ", endDate=" + endDate + ", salePercentage=" + salePercentage + ", subscribers=" + subscribers + '}';
    }
    
    
}
