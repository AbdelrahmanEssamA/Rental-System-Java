package SystemClasses;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


public class SaleContract extends Contract implements Serializable {
    Date dateToRecieve;

    public SaleContract() {
        
    }
    
    public SaleContract(int id, Date date, String buyerName, int buyerID, String sellerName, PropertyROI property, PaymentMethod paymentMethod, ContractStatus contractStatus, PaymentStatus paymentStatus) {
        super(id, date, buyerName, buyerID, sellerName, property, paymentMethod, contractStatus, paymentStatus);
    }

    public SaleContract(Date dateToRecieve, int id, Date date, String buyerName, int buyerID, String sellerName, PropertyROI property, PaymentMethod paymentMethod, ContractStatus contractStatus, PaymentStatus paymentStatus) {
        super(id, date, buyerName, buyerID, sellerName, property, paymentMethod, contractStatus, paymentStatus);
        this.dateToRecieve = dateToRecieve;
    }

    public Date getDateToRecieve() {
        return dateToRecieve;
    }

    public void setDateToRecieve(Date dateToRecieve) {
        this.dateToRecieve = dateToRecieve;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SaleContract other = (SaleContract) obj;
        if (!Objects.equals(this.dateToRecieve, other.dateToRecieve)) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        return "SaleContract{" + "dateToRecieve=" + dateToRecieve + '}';
    }
    
        
}
