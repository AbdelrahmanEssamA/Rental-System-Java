
package rentalsystem;
public class Fawry implements PaymentMethod{
    private int paymentNumber ;

    public Fawry(int paymentNumber) {
        this.paymentNumber = paymentNumber;
    }
    
    public void pay(double ammount){
        System.out.println("Paid by fawry");
    }

    public int getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(int paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    @Override
    public String toString() {
        return "Fawry{" + "paymentNumber=" + paymentNumber + '}';
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
        final Fawry other = (Fawry) obj;
        if (this.paymentNumber != other.paymentNumber) {
            return false;
        }
        return true;
    }
    
    
}
