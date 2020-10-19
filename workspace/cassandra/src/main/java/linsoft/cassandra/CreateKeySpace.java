package linsoft.cassandra;

/**
 * Hello world!
 *
 */
import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class CreateKeySpace 
{
    public static void main( String[] args )
    {
    	//https://www.tutorialspoint.com/cassandra/cassandra_create_keyspace.htm
    	
    	
    	//Cassandra Version:apache-cassandra-3.11.8
    	//datastax cassandra-driver-core - 3.10.2
        //Query
        String query = "CREATE KEYSPACE tp WITH replication "
           + "= {'class':'SimpleStrategy', 'replication_factor':1};";
                      
        //creating Cluster object
        Cluster cluster = Cluster.builder().addContactPoint("localhost").build();
      
        //Creating Session object
        Session session = cluster.connect();
       
        //Executing the query
        session.execute(query);
       
        //using the KeySpace
        session.execute("USE tp");
        System.out.println("Keyspace created"); 
    }
}
