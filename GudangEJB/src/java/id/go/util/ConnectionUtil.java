/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package id.go.util;

import id.go.config.GudangStatus;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author rama
 */
public class ConnectionUtil {
   public static void closePreparedStatement(PreparedStatement ps) {
        try {
            ps.close();
        } catch (Exception e) {
            if (GudangStatus.DEVELOPMENT) {
                e.printStackTrace();
            }
        }
    }

    public static void releaseConnection(Connection con) {
        try {
            con.close();
        } catch (Exception e) {
            if (GudangStatus.DEVELOPMENT) {
                e.printStackTrace();
            }
        }
    }

    public static void releaseConnection(Connection conn, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            } else if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}
