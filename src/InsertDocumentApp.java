/**
 * Created by heiko-linke on 09.10.16.
 */



import java.util.HashMap;
import java.util.Map;

import com.mongodb.*;
import com.mongodb.util.JSON;

/**
 * Java MongoDB : Insert a Document
 *
 */
public class InsertDocumentApp {
    public static void main(String[] args) {

        try {

            MongoClient mongo = new MongoClient("localhost", 27017);
            DB db = mongo.getDB("test1");

            DBCollection collection = db.getCollection("dummyColl");

            // 1. BasicDBObject example
            System.out.println("BasicDBObject example...");
            BasicDBObject document = new BasicDBObject();
            document.put("database", "test1");
            document.put("table", "hosting");

            BasicDBObject documentDetail = new BasicDBObject();
            documentDetail.put("records", 99);
            documentDetail.put("index", "vps_index1");
            documentDetail.put("active", "true");
            document.put("detail", documentDetail);

            collection.insert(document);

            DBCursor cursorDoc = collection.find();
            while (cursorDoc.hasNext()) {
                System.out.println(cursorDoc.next());
            }

            collection.remove(new BasicDBObject());

            // 2. BasicDBObjectBuilder example
            System.out.println("BasicDBObjectBuilder example...");
            BasicDBObjectBuilder documentBuilder = BasicDBObjectBuilder.start()
                    .add("database", "test1")
                    .add("table", "hosting");

            BasicDBObjectBuilder documentBuilderDetail = BasicDBObjectBuilder.start()
                    .add("records", "99")
                    .add("index", "vps_index1")
                    .add("active", "true");

            documentBuilder.add("detail", documentBuilderDetail.get());

            collection.insert(documentBuilder.get());

            DBCursor cursorDocBuilder = collection.find();
            while (cursorDocBuilder.hasNext()) {
                System.out.println(cursorDocBuilder.next());
            }

            collection.remove(new BasicDBObject());

            // 3. Map example
            System.out.println("Map example...");
            Map<String, Object> documentMap = new HashMap<String, Object>();
            documentMap.put("database", "test1");
            documentMap.put("table", "hosting");

            Map<String, Object> documentMapDetail = new HashMap<String, Object>();
            documentMapDetail.put("records", "99");
            documentMapDetail.put("index", "vps_index1");
            documentMapDetail.put("active", "true");

            documentMap.put("detail", documentMapDetail);

            collection.insert(new BasicDBObject(documentMap));

            DBCursor cursorDocMap = collection.find();
            while (cursorDocMap.hasNext()) {
                System.out.println(cursorDocMap.next());
            }

            collection.remove(new BasicDBObject());

            // 4. JSON parse example
            System.out.println("JSON parse example...");

            String json = "{'database' : 'mkyongDB','table' : 'hosting'," +
                    "'detail' : {'records' : 99, 'index' : 'vps_index1', 'active' : 'true'}}}";

            DBObject dbObject = (DBObject) JSON.parse(json);

            collection.insert(dbObject);

            DBCursor cursorDocJSON = collection.find();
            while (cursorDocJSON.hasNext()) {
                System.out.println(cursorDocJSON.next());
            }

            collection.remove(new BasicDBObject());

        } catch (Exception e) {
            e.printStackTrace();


        }
    }
}

