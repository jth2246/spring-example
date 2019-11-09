package example.sample.db;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class mySqlTest {

	/*  DB Connection Info for AWS RDS
private static final String DRIVER ="com.mysql.cj.jdbc.Driver";
private static final String URL ="jdbc:mysql://mysql-database.czndabjnrcgf.ap-northeast-2.rds.amazonaws.com"
								+ ":3306/testmysql";
private static final String ID ="admin_mysql";
private static final String PW ="admin_mysql";
*/
	// DB Connection Info for local Tomcat
	private static final String DRIVER ="com.mysql.cj.jdbc.Driver";
	private static final String URL ="jdbc:mysql://127.0.0.1:3306/testmysql?serverTimezone=UTC";
	private static final String ID ="jth2246";
	private static final String PW ="dream134679";

	@Test
	public void testConnection() throws Exception{
		Class.forName(DRIVER);
		try{
			Connection conn = DriverManager.getConnection(URL, ID, PW);
			System.out.println(conn);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
