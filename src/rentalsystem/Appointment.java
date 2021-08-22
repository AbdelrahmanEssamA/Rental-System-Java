package rentalsystem;

import java.util.Date;

public class Appointment {
    private int id;
    private int buyerID;
    private Date appointmentDate;

    public Appointment(int id, int buyerID, Date appointmentDate) {
        this.id = id;
        this.buyerID = buyerID;
        this.appointmentDate = appointmentDate;
    }

    public Appointment() {
    }

    public int getId() {
        return id;
    }

    public int getBuyerID() {
        return buyerID;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBuyerID(int buyerID) {
        this.buyerID = buyerID;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
    
    
    
}
