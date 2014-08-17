/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package id.go;

import id.go.entitiy.tdBarang;
import id.go.util.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rama
 */
public class barang {
    
    private String sql;
    private Connection connection;
    
    public barang(Connection conn){
        this.connection = conn;
    }
    
 public List<tdBarang> getAllDataBarang() throws Exception{
     PreparedStatement ps = null;
     try{
         List<tdBarang> ltb = new ArrayList<tdBarang>();
         sql = "select * from td_barang";
         ps = connection.prepareStatement(sql);
         ResultSet rs = ps.executeQuery();
         System.out.println("sql = " + sql);
         while (rs.next()){
             tdBarang tb = new tdBarang();
             tb.setKdBarang(rs.getString("KD_BARANG"));
             tb.setNmBarang(rs.getString("NAMA_BARANG"));
             tb.setStok(rs.getInt("STOK"));
             ltb.add(tb);
         }
     return ltb; 
     }finally{
         ConnectionUtil.closePreparedStatement(ps);
     }
 }
}
