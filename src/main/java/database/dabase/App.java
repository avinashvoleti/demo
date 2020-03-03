package database.dabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws SQLException
    {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","avirajanu");
        Statement stmt = con.createStatement();
        String s = "update city set District = 'srinath' where name = 'kabul';";
        stmt.executeUpdate(s);
        con.close();
        System.out.println("hi");
    }
}
