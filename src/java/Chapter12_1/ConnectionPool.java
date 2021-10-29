/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12_1;

/**
 *
 * @author An Le
 */
import Chapter12_2.data.*;
import Chapter12_2.*;
import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class ConnectionPool {
    private static ConnectionPool pool = null;
    private static DataSource datasource = null;
    private ConnectionPool() {
        try {
            InitialContext ic = new InitialContext();
            datasource = (DataSource) ic.lookup("java:/comp/env/jdbc/murach");
        } catch (NamingException e) {
// TODO Auto-generated catch block
            System.out.println(e);
        }
    }
    public static synchronized ConnectionPool
            getInstance() {
        if (pool == null) {
            pool = new ConnectionPool();
        }
        return pool;
    }
    public Connection getConnection() {
        try {
            return datasource.getConnection();
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }
    public void freeConnection(Connection c) {
        try {
            c.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
