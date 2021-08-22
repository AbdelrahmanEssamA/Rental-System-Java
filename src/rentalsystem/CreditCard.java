
package rentalsystem;

import java.util.Date;
import java.util.Objects;


public class CreditCard implements PaymentMethod{
    private int cardNumber; 
    private Date expirationDate;
    private int cvv;

    public CreditCard(int cardNumber, Date expirationDate, int cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }
    
    public void pay(double ammount){
        System.out.println("Paid by credit card");
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "CreditCard{" + "cardNumber=" + cardNumber + ", expirationDate=" + expirationDate + ", cvv=" + cvv + '}';
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
        final CreditCard other = (CreditCard) obj;
        if (this.cardNumber != other.cardNumber) {
            return false;
        }
        if (this.cvv != other.cvv) {
            return false;
        }
        if (!Objects.equals(this.expirationDate, other.expirationDate)) {
            return false;
        }
        return true;
    }
    
}
