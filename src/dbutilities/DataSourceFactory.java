package dbutilities;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import javax.sql.DataSource;

public class DataSourceFactory
{

    public DataSourceFactory()
    {
    }

    public static DataSource getMySQLDataSource()
    {
        Properties props = new Properties();
        FileInputStream fis = null;
        MysqlDataSource mysqlDS = null;
        try
        {
            fis = new FileInputStream("config/db.properties");
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
        return mysqlDS;
    }
}
