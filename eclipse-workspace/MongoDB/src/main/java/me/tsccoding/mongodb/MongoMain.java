package me.tsccoding.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;

public class MongoMain {
    public static void main(String args[]) {
        String uri = "mongodb://Admin:admin@mongodb-shard-00-00-altt9.mongodb.net:27017,mongodb-shard-00-01-altt9.mongodb.net:27017,mongodb-shard-00-02-altt9.mongodb.net:27017/admin?replicaSet=MongoDB-shard-0&ssl=true";
        MongoClientURI clientURI = new MongoClientURI(uri);
        MongoClient mongoClient = new MongoClient(clientURI);

        MongoDatabase mongoDatabase = mongoClient.getDatabase("OCR");
        MongoCollection collection = mongoDatabase.getCollection("OCR_1");

        System.out.println("Database Connected");

        collection.updateOne(Filters.eq("name", 1), Updates.set("text", 150));       
        System.out.println("Document update successfully...");  
        
        // Retrieving the documents after updation 
        // Getting the iterable object
        FindIterable<Document> iterDoc = collection.find(file_name:"id"); 
        int i = 1; 

        // Getting the iterator 
        Iterator it = iterDoc.iterator(file_name); 
        collection.insertOne(it);
        while (it.hasNext()) {  
           System.out.println(it.next());  
           i++; 
        }     
        
        
        
     }  
        }
