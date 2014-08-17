/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package id.go.entitiy;

import java.io.Serializable;

/**
 *
 * @author rama
 */
public class tdBarang implements Serializable{
    
    private String kdBarang;
    private String nmBarang;
    private Integer stok;
    
    
    public tdBarang(){
        
    }
    
    public String getKdBarang(){
        return kdBarang;
    }
    
    public void setKdBarang(String kdBrg){
        this.kdBarang = kdBrg;
    }
    
    public String getNmBarang(){
        return nmBarang;
    }
    
    public void setNmBarang(String nmBrg){
        this.nmBarang = nmBrg;
    }
    
    public int getStok(){
        return stok;
    }
    
    public void setStok(int stok){
        this.stok = stok;
    }
}
