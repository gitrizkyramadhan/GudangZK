/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package id.go.service;

import id.go.barang;
import id.go.entitiy.tdBarang;
import id.go.util.ConnectionUtil;
import java.sql.Connection;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.sql.DataSource;

/**
 *
 * @author rama
 */
@Stateless
@WebService
public class gudang {
    
    @Resource(lookup = "jdbc/dsGudang")
    private DataSource ds;
    
    public <T> T nvl(T a, T b) {
        return (a == null) ? b : a;
    }
    
    @WebMethod
    public List<tdBarang> getAllBarang(){
        Connection conn = null;
        try{
            conn = ds.getConnection();
            barang br = new barang(conn);
            return br.getAllDataBarang();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally{
            ConnectionUtil.releaseConnection(conn);
        }
    }
    
}
