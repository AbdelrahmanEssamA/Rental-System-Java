package SystemClasses;   

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Abdo
 */
public class Report implements Serializable {
    private Date date;
    private int numberPropertiesAdded;
    private int numberUsersRegistered;
    private double totalPayments;
    private double revenue;

    public Report(Date date, int numberPropertiesAdded, int numberUsersRegistered, double totalPayments, double revenue) {
        this.date = date;
        this.numberPropertiesAdded = numberPropertiesAdded;
        this.numberUsersRegistered = numberUsersRegistered;
        this.totalPayments = totalPayments;
        this.revenue = revenue;
    }

    public Report() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumberPropertiesAdded() {
        return numberPropertiesAdded;
    }

    public void setNumberPropertiesAdded(int numberPropertiesAdded) {
        this.numberPropertiesAdded = numberPropertiesAdded;
    }

    public int getNumberUsersRegistered() {
        return numberUsersRegistered;
    }

    public void setNumberUsersRegistered(int numberUsersRegistered) {
        this.numberUsersRegistered = numberUsersRegistered;
    }

    public double getTotalPayments() {
        return totalPayments;
    }

    public void setTotalPayments(double totalPayments) {
        this.totalPayments = totalPayments;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        return "Report{" + "date=" + date + ", numberPropertiesAdded=" + numberPropertiesAdded + ", numberUsersRegistered=" + numberUsersRegistered + ", totalPayments=" + totalPayments + ", revenue=" + revenue + '}';
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
        final Report other = (Report) obj;
        if (this.numberPropertiesAdded != other.numberPropertiesAdded) {
            return false;
        }
        if (this.numberUsersRegistered != other.numberUsersRegistered) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalPayments) != Double.doubleToLongBits(other.totalPayments)) {
            return false;
        }
        if (Double.doubleToLongBits(this.revenue) != Double.doubleToLongBits(other.revenue)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }
    
    
    
}
