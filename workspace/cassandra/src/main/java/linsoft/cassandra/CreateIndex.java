package linsoft.cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class CreateIndex {

	public static void main(String[] args) {
		//Query
		//https://www.tutorialspoint.com/cassandra/cassandra_create_index.htm
		
		
	      String query = "CREATE INDEX name ON emp (emp_name);";
	      Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
	       
	      //Creating Session object
	      Session session = cluster.connect("tp");
	 
	      //Executing the query
	      session.execute(query);
	      System.out.println("Index created");
	      
	      
	}

}
