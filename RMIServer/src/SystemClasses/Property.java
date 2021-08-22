package SystemClasses;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Halim
 */
public class Property implements Serializable {
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

    public Property(int id, String title, String description, String ownerName, Location location, double price, PropertyStatus propertyStatus, PropertyType type, boolean availability, boolean furnitured, int rooms, ArrayList<String> facillities, boolean approved, ArrayList<Appointment> appointments, int ownerID) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.ownerName = ownerName;
        this.location = location;
        this.price = price;
        this.propertyStatus = propertyStatus;
        this.type = type;
        this.availability = availability;
        this.furnitured = furnitured;
        this.rooms = rooms;
        this.facillities = facillities;
        this.approved = approved;
        this.appointments = appointments;
        this.ownerID = ownerID;
    }

    public Property() {
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

    public PropertyStatus getPropertyStatus() {
        return propertyStatus;
    }

    public void setPropertyStatus(PropertyStatus propertyStatus) {
        this.propertyStatus = propertyStatus;
    }

    public PropertyType getType() {
        return type;
    }

    public void setType(PropertyType type) {
        this.type = type;
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
    public boolean equals(Object obj) {
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
        return true;
    }

    
    @Override
    public String toString() {
        return "Property{" + "id=" + id + ", title=" + title + ", description=" + description + ", ownerName=" + ownerName + ", location=" + location + ", price=" + price + ", propertyStatus=" + propertyStatus + ", type=" + type + ", availability=" + availability + ", furnitured=" + furnitured + ", rooms=" + rooms + ", facillities=" + facillities + ", approved=" + approved + ", appointments=" + appointments + ", ownerID=" + ownerID + '}';
    }
    
    
}