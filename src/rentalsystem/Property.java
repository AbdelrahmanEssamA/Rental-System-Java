package rentalsystem;

import java.util.ArrayList;
import java.util.Objects;

public class Property implements PropertyROI{
    private int id;
    private String title;
    private String description;
    private String ownerName;
    private Location location;
    private double price;
    private PropertyStatus propertyStatus;
    private PropertyType type;
    private boolean availability;
    private boolean furnitured ;
    private int rooms;
    private ArrayList<String> facillities;
    private boolean approved;
    private ArrayList<Appointment> appointments;
    private int ownerID;
    
    public Property(int id, String title, String description, String ownerName, Location location, double price, PropertyStatus propertyStatus, PropertyType typr, boolean availability, boolean furnitured, int rooms, ArrayList<String> facillities, boolean approved, ArrayList<Appointment> appointments, int ownerID) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.ownerName = ownerName;
        this.location = location;
        this.price = price;
        this.propertyStatus = propertyStatus;
        this.type = typr;
        this.availability = availability;
        this.furnitured = furnitured;
        this.rooms = rooms;
        this.facillities = facillities;
        this.approved = approved;
        this.appointments = appointments;
        this.ownerID =ownerID;
    }

    public Property() {
    }
    
    public void addFacillity(String f){
        this.facillities.add(f);
    }
    
    public  boolean removeFacillity(String f){
        return (boolean) this.facillities.remove(f);
    }
    
 
    public void removeAppointment(int id){
        for (int i = 0; i < appointments.size(); i++) {
            if(appointments.get(i).getId() == id){
                appointments.remove(i);
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPropertyStatus() {
        return propertyStatus.toString();
    }

    public void setPropertyStatus(PropertyStatus propertyStatus) {
        this.propertyStatus = propertyStatus;
    }

    public PropertyType getTypr() {
        return type;
    }

    public void setTypr(PropertyType typr) {
        this.type = typr;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public boolean isFurnitured() {
        return furnitured;
    }

    public void setFurnitured(boolean furnitured) {
        this.furnitured = furnitured;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public ArrayList<String> getFacillities() {
        return facillities;
    }

    public void setFacillities(ArrayList<String> facillities) {
        this.facillities = facillities;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }
    
    

    @Override
    public String toString() {
        return "Property{" + "id=" + id + ", title=" + title + ", description=" + description + ", ownerName=" + ownerName + ", location=" + location + ", price=" + price + ", propertyStatus=" + propertyStatus + ", typr=" + type + ", availability=" + availability + ", furnitured=" + furnitured + ", rooms=" + rooms + ", facillities=" + facillities + ", approved=" + approved + ", appointments=" + appointments + '}';
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
        final Property other = (Property) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (this.availability != other.availability) {
            return false;
        }
        if (this.furnitured != other.furnitured) {
            return false;
        }
        if (this.rooms != other.rooms) {
            return false;
        }
        if (this.approved != other.approved) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.ownerName, other.ownerName)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (this.propertyStatus != other.propertyStatus) {
            return false;
        }
        if (this.type != other.type) {
            return false;
        }
        if (!Objects.equals(this.facillities, other.facillities)) {
            return false;
        }
        if (!Objects.equals(this.appointments, other.appointments)) {
            return false;
        }
        return true;
    }
    
    
}
