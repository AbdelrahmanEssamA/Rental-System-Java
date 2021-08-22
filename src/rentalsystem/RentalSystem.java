package rentalsystem;

import database.DB;
import java.util.ArrayList;

public class RentalSystem {
    //test
    public static void main(String[] args) {
        //DB db = new DB();
        Property p = new Property(1, "sha2a lo2ta f shobra" , "description", "7amada", new Location(0, 0, 0, "33 shar3", "Shobra", "cairo", "Egyot"), 2, PropertyStatus.Rent, PropertyType.Flat, true, true, 0, null, true, null, 4);
        new DB().addDocument("Property", p);
        p = new Property(3, "Appartment for sale" , "description", "Nada", new Location(2, 32, 4, "shar3", "Shobra", "cairo", "Egyot"), 4, PropertyStatus.Sale, PropertyType.Flat, true, true, 0, null, true, null, 4);
        new DB().addDocument("Property", p);
    }
   
   
}
