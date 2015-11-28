package dbutilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class ConnectionFactory
{

    private static MysqlDataSource mysqlDS;

    private ConnectionFactory()
    {
    }

    private static void initializeDataSource()
    {
        Properties props = new Properties();
        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream("D:/EclipseProject/PharmacyDemo/WebContent/WEB-INF/config/db.properties");
        	//fis = new FileInputStream("db.properties");
            props.load(fis);
            mysqlDS = new MysqlDataSource();
            mysqlDS.setURL(props.getProperty("DB_URL"));
            mysqlDS.setUser(props.getProperty("DB_USERNAME"));
            mysqlDS.setPassword(props.getProperty("DB_PASSWORD"));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static Connection getConnection()
    {
        Connection con = null;
        try
        {
            if(mysqlDS != null)
            {
                con = mysqlDS.getConnection();
            } else
            {
                initializeDataSource();
                con = mysqlDS.getConnection();
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return con;
    }
}
