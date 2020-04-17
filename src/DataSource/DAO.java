package DataSource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {

    static private Connection conn = null;

    public Connection getConn() {

        return conn;
    }

    public DAO(){
        try{
            String url = "jdbc:sqlite:fatima";
            conn = DriverManager.getConnection(url);
        }
        catch (Exception e){
            System.out.println("there is a problem with database connection");
        }

    }

    static public Connection getConnection(){
        DAO d = new DAO();
        conn = d.getConn();
        return  conn;
    }


}
