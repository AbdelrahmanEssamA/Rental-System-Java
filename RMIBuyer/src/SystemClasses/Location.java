package SystemClasses;

import java.io.Serializable;
import java.util.Objects;

public class Location implements Serializable {
    private int propertyNumber;
    private int floor;
    private int buildingNumber;
    private String streetName;
    private String district;
    private String city;
    private String country;

    public Location(int propertyNumber, int floor, int buildingNumber, String streetName, String district, String city, String country) {
        this.propertyNumber = propertyNumber;
        this.floor = floor;
        this.buildingNumber = buildingNumber;
        this.streetName = streetName;
        this.district = district;
        this.city = city;
        this.country = country;
    }

    public int getPropertyNumber() {
        return propertyNumber;
    }

    public void setPropertyNumber(int propertyNumber) {
        this.propertyNumber = propertyNumber;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.propertyNumber != other.propertyNumber) {
            return false;
        }
        if (this.floor != other.floor) {
            return false;
        }
        if (this.buildingNumber != other.buildingNumber) {
            return false;
        }
        if (!Objects.equals(this.streetName, other.streetName)) {
            return false;
        }
        if (!Objects.equals(this.district, other.district)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.country, other.country)) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        return "Location{" + "propertyNumber=" + propertyNumber + ", floor=" + floor + ", buildingNumber=" + buildingNumber + ", streetName=" + streetName + ", district=" + district + ", city=" + city + ", country=" + country + '}';
    }
    
    
}
