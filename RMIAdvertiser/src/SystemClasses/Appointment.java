package SystemClasses;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Appointment implements Serializable {
    private int id;
    private int buyerID;
    private Date appointmentDate;

    public Appointment(int id, int buyerID, Date appointmentDate) {
        this.id = id;
        this.buyerID = buyerID;
        this.appointmentDate = appointmentDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBuyerID() {
        return buyerID;
    }

    public void setBuyerID(int buyerID) {
        this.buyerID = buyerID;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Appointment other = (Appointment) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.buyerID != other.buyerID) {
            return false;
        }
        if (!Objects.equals(this.appointmentDate, other.appointmentDate)) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        return "Appointment{" + "id=" + id + ", buyerID=" + buyerID + ", appointmentDate=" + appointmentDate + '}';
    }
    
    
}
