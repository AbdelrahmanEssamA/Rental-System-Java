package rentalsystem;

import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public  abstract class Contract implements PrototypeContract {
    
    
    private int id;
    private Date date;
    private String buyerName;
    private int buyerID;
    private String sellerName;
    private PropertyROI property;
    private PaymentMethod paymentMethod;
    private ContractStatus contractStatus;
    private PaymentStatus paymentStatus;

    public Contract(int id, Date date, String buyerName, int buyerID, String sellerName, PropertyROI property, PaymentMethod paymentMethod, ContractStatus contractStatus, PaymentStatus paymentStatus) {
        this.id = id;
        this.date = date;
        this.buyerName = buyerName;
        this.buyerID = buyerID;
        this.sellerName = sellerName;
        this.property = property;
        this.paymentMethod = paymentMethod;
        this.contractStatus = contractStatus;
        this.paymentStatus = paymentStatus;
    }


    
    

    public Contract() {
    }
    
    //Pattern
    public Contract cloneContract(){
        
        Contract contractCopy = null;
        try {
            contractCopy = (Contract) super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Contract.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        return  contractCopy;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public String getSellerName() {
        return sellerName;
    }

    public PropertyROI getProperty() {
        return property;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public ContractStatus getContractStatus() {
        return contractStatus;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public void setProperty(PropertyROI property) {
        this.property = property;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setContractStatus(ContractStatus contractStatus) {
        this.contractStatus = contractStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public int getBuyerID() {
        return buyerID;
    }

    public void setBuyerID(int buyerID) {
        this.buyerID = buyerID;
    }
    

    @Override
    public String toString() {
        return "Contract{" + "id=" + id + ", date=" + date + ", buyerName=" + buyerName + ", sellerName=" + sellerName + ", property=" + property + ", paymentMethod=" + paymentMethod + ", contractStatus=" + contractStatus + ", paymentStatus=" + paymentStatus + '}';
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
        final Contract other = (Contract) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.buyerName, other.buyerName)) {
            return false;
        }
        if (!Objects.equals(this.sellerName, other.sellerName)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.property, other.property)) {
            return false;
        }
        if (!Objects.equals(this.paymentMethod, other.paymentMethod)) {
            return false;
        }
        if (this.contractStatus != other.contractStatus) {
            return false;
        }
        if (this.paymentStatus != other.paymentStatus) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
