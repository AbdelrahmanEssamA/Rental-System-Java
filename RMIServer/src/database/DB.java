package database;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;
import SystemClasses.*;

public class DB {
    private MongoClient client;
    private MongoDatabase database;
    private MongoCollection<Document> collection;
    private Gson gson = new Gson();

    public DB() {
        client = new MongoClient();
        database = client.getDatabase("RentalSystem");
    }

    public void addDocument(String collectionName, Object obj) {
        collection = database.getCollection(collectionName); 
        try {
            collection.insertOne(Document.parse(gson.toJson(obj)));
        } catch(Exception e){ }
    }
    
    public Document getDocumentById(String collectionName, int id) {
        collection = database.getCollection(collectionName);
        Document doc = collection.find(Filters.eq("id",id)).first();
        return doc;
    }
    
    public Property getPropertyById(String collectionName, int id) {
        collection = database.getCollection(collectionName);
        Document doc = collection.find(Filters.eq("id",id)).first();
        Property p = gson.fromJson(doc.toJson(),Property.class);
        return p;
    }
    
    public Advertiser getAdvertiserById(String collectionName, int id) {
        collection = database.getCollection(collectionName);
        Document doc = collection.find(Filters.eq("id",id)).first();
        Advertiser a = gson.fromJson(doc.toJson(),Advertiser.class);
        return a;
    }
    
    public Buyer getBuyerById(String collectionName, int id) {
        collection = database.getCollection(collectionName);
        Document doc = collection.find(Filters.eq("id",id)).first();
        Buyer b = gson.fromJson(doc.toJson(),Buyer.class);
        return b;
    }
    
    public Appointment getAppointmentById(String collectionName, int id) {
        collection = database.getCollection(collectionName);
        Document doc = collection.find(Filters.eq("id",id)).first();
        Appointment a = gson.fromJson(doc.toJson(),Appointment.class);
        return a;
    }
    
    public Contract getContractById(String collectionName, int id) {
        collection = database.getCollection(collectionName);
        Document doc = collection.find(Filters.eq("id",id)).first();
        Contract c = gson.fromJson(doc.toJson(),Contract.class);
        return c;
    }
    
    public Report getReportById(String collectionName, int id) {
        collection = database.getCollection(collectionName);
        Document doc = collection.find(Filters.eq("id",id)).first();
        Report r = gson.fromJson(doc.toJson(),Report.class);
        return r;
    }
    

    
    public ArrayList<Document> getAllDocuments(String collectionName) {
        collection = database.getCollection(collectionName);
        ArrayList<Document> docs = collection.find().into(new ArrayList<Document>());
        return docs;
    }
    
        public ArrayList<Property> getAllProperties(String collectionName) {
        collection = database.getCollection(collectionName);
        ArrayList<Document> docs = collection.find().into(new ArrayList<Document>());
        ArrayList <Property> result = new ArrayList<>();
        for (Document doc : docs) {
            Property p = gson.fromJson(doc.toJson(),Property.class);
            result.add(p);
        }
        return result;
    }
    
    public ArrayList<Advertiser> getAllAdvertisers(String collectionName) {
        collection = database.getCollection(collectionName);
        ArrayList<Document> docs = collection.find().into(new ArrayList<Document>());
        ArrayList <Advertiser> result = new ArrayList<>();
        for (Document doc : docs) {
            Advertiser a = gson.fromJson(doc.toJson(),Advertiser.class);
            result.add(a);
        }
        return result;
    }
        
    public ArrayList<Buyer> getAllBuyers(String collectionName) {
        collection = database.getCollection(collectionName);
        ArrayList<Document> docs = collection.find().into(new ArrayList<Document>());
        ArrayList <Buyer> result = new ArrayList<>();
        for (Document doc : docs) {
            Buyer b = gson.fromJson(doc.toJson(),Buyer.class);
            result.add(b);
        }
        return result;
    }
            
    public ArrayList<Appointment> getAllAppointments(String collectionName) {
        collection = database.getCollection(collectionName);
        ArrayList<Document> docs = collection.find().into(new ArrayList<Document>());
        ArrayList <Appointment> result = new ArrayList<>();
        for (Document doc : docs) {
            Appointment a = gson.fromJson(doc.toJson(),Appointment.class);
            result.add(a);
        }
        return result;
    }
                
    public ArrayList<Contract> getAllContracts(String collectionName) {
        collection = database.getCollection(collectionName);
        ArrayList<Document> docs = collection.find().into(new ArrayList<Document>());
        ArrayList <Contract> result = new ArrayList<>();
        for (Document doc : docs) {
            Contract c = gson.fromJson(doc.toJson(),Contract.class);
            result.add(c);
        }
        return result;
    }
                    
    public ArrayList<Report> getAllReports(String collectionName) {
        collection = database.getCollection(collectionName);
        ArrayList<Document> docs = collection.find().into(new ArrayList<Document>());
        ArrayList <Report> result = new ArrayList<>();
        for (Document doc : docs) {
            Report r = gson.fromJson(doc.toJson(),Report.class);
            result.add(r);
        }
        return result;
    }
    
    public boolean deleteDocumentById(String collectionName, int id) {
        collection = database.getCollection(collectionName);
        boolean result = collection.deleteOne(Filters.eq("id",id)).wasAcknowledged();
        return result;
    }
    
    
    public boolean updateDocumentById(String collectionName, int id, Object obj) {
        collection = database.getCollection(collectionName);
        boolean result = collection.replaceOne(Filters.eq("id",id), Document.parse(gson.toJson(obj))).wasAcknowledged();
        return result;
    }

}
