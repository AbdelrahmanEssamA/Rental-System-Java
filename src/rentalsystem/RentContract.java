package rentalsystem;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Abdo
 */
public class RentContract extends Contract{
    
    private Date checkIn;
    private Date checkOut;
    private int fixedInsurance;

    public RentContract(Date checkIn, Date checkOut, int fixedInsurance, int id, Date date, String buyerName, int buyerID, String sellerName, PropertyROI property, PaymentMethod paymentMethod, ContractStatus contractStatus, PaymentStatus paymentStatus) {
        super(id, date, buyerName, buyerID, sellerName, property, paymentMethod, contractStatus, paymentStatus);
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.fixedInsurance = fixedInsurance;
    }

    public RentContract(Date checkIn, Date checkOut, int fixedInsurance) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.fixedInsurance = fixedInsurance;
    }


    public RentContract() {
        super();
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public int getFixedInsurance() {
        return fixedInsurance;
    }

    public void setFixedInsurance(int fixedInsurance) {
        this.fixedInsurance = fixedInsurance;
    }

    @Override
    public String toString() {
        return "RentContract{" + "checkIn=" + checkIn + ", checkOut=" + checkOut + ", fixedInsurance=" + fixedInsurance + '}';
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
        final RentContract other = (RentContract) obj;
        if (this.fixedInsurance != other.fixedInsurance) {
            return false;
        }
        if (!Objects.equals(this.checkIn, other.checkIn)) {
            return false;
        }
        if (!Objects.equals(this.checkOut, other.checkOut)) {
            return false;
        }
        return true;
    }
    
    
    
            
    
}
