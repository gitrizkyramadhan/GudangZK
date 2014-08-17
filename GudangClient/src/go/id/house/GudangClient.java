/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package go.id.house;

import java.net.URL;

/**
 *
 * @author rama
 */
public class GudangClient {
    private Gudang gudang;
    
    public GudangClient(){
        try{
            this.gudang = new GudangService(new URL("http://localhost:8080/gudangService/gudang?wsdl")).getGudangPort();
        }catch(Exception e){
            this.gudang = new GudangService().getGudangPort();
        }
    }
    
    public Gudang getGudang(){
        return gudang;
    }
}
