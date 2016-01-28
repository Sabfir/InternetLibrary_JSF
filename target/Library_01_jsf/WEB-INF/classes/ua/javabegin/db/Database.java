package ua.javabegin.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Database {

    private static Connection conn;
    private static InitialContext ic;
    private static DataSource ds;

    public static Connection getConnection() {
        try {
            System.out.println("111");
            ic = new InitialContext();
            System.out.println("112");
            ds = (DataSource) ic.lookup("java:/comp/env/jdbc/Library");
            //ds = (DataSource) ic.lookup("jdbc/Library");
            System.out.println("113");
            if (conn==null) {
                conn = ds.getConnection();
            }
        } catch (SQLException ex) {
            System.out.println("114");
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE,null,ex);
        } catch (NamingException ex) {
            System.out.println("115");
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE,null,ex);
        }

        return conn;
    }
}
