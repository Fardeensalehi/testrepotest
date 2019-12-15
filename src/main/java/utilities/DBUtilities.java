package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtilities {
	
	// Create private static obj of connection class
		// it is used to create a connection with database
		private static Connection conn;
		// Creating private static obj of statment class
		// it is used to create Statement to execute the query
		private static Statement stmt;
		// Creating private static obj of ResultSet class
		// It is used to create a result to store query result.
		private static ResultSet resultSet;
		// create db url
		// syntex for db url conection or url string
		// jdbc:typeofdatabase://host:port//databasename
		private static String dbURL = "jdbc:postgresql://localhost:5432/dvdrental";
		// database user useName
		private static String dbUserName = "postgres";
		// database user password
		private static String dbPassword = "root";
		
		
		try {
			conn = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
