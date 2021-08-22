package testing;

import database.DB;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import rentalsystem.Location;
import rentalsystem.Property;
import rentalsystem.PropertyStatus;
import rentalsystem.PropertyType;

public class TestJunit {
   static DB db = new DB();
   @Test
   public void testAddPropertyDB() {
        Property p = new Property(1,"title","description","ownerName", new Location(), 4.5, PropertyStatus.Rent , PropertyType.Duplex ,  false, false,4, new ArrayList<>() , true, new ArrayList<>() , 3);
        db.addDocument("Property", p);
        ArrayList <Property> properties = db.getAllProperties("Property");
        int Result = properties.size();
        assertNotEquals(0, Result);
   }
   
   @Test
   public void testUpdatePropertyDB() {
        Property p = db.getPropertyById("Property", 1);
        p.setPrice(100.0);
        db.updateDocumentById("Property", 1, p);
        Property newProperty = db.getPropertyById("Property", 1);
        double Result = newProperty.getPrice();
        double Expected = 100.0;
        assertEquals(Expected, Result, 0.0001);
   }
   
   @Test
   public void testDeletePropertyDB() {
        boolean Result = db.deleteDocumentById("Property", 1);
        boolean Expected = true;
        assertEquals(Expected, Result);
   }
}