package SystemClasses;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Abdo
 */
public interface PropertyROI {
    
    public int getId();

    public String getTitle();

    public String getDescription();

    public String getOwnerName();

    public Location getLocation();

    public double getPrice();
 
    public String getPropertyStatus();

    public PropertyType getTypr();

    public boolean isAvailability();

    public boolean isFurnitured();

    public int getRooms();
    
    public int getOwnerID();

    public ArrayList<String> getFacillities();

    public ArrayList<Appointment> getAppointments();

    public String toString();

    public boolean equals(Object obj);
}
