/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package id.go.customs.mpn.client;

import id.go.customs.mpn.client.background.MPNBackgroundProses;
import id.go.customs.mpn.client.background.MPNBackgroundProsesService;
import id.go.customs.mpn.client.cukai.Cukai;
import id.go.customs.mpn.client.cukai.CukaiService;
import id.go.customs.mpn.client.inhouse.MPNInhouse;
import id.go.customs.mpn.client.inhouse.MPNInhouseService;
import id.go.customs.mpn.client.publik.MPNPublic;
import id.go.customs.mpn.client.publik.MPNPublicService;
import id.go.customs.mpn.client.referensi.MPNReferensi;
import id.go.customs.mpn.client.referensi.MPNReferensiService;
import java.net.URL;

/**
 *
 * @author rama
 */
public class MpnClient {
    private MPNBackgroundProses backgroundProses;
    private MPNInhouse inhouse;
    private MPNPublic mPublic;
    private MPNReferensi nReferensi;
    private Cukai cukai;

    public MpnClient() {
        try {
            this.backgroundProses = new MPNBackgroundProsesService(new URL("http://localhost:8080/ReproImporService/ReproImpor?wsdl")).getMPNBackgroundProsesPort();
            this.inhouse = new MPNInhouseService(new URL("http://localhost:8080/ReproImporService/ReproImpor?wsdl")).getMPNInhousePort();
            this.mPublic = new MPNPublicService(new URL("http://localhost:8080/ReproImporService/ReproImpor?wsdl")).getMPNPublicPort();
            this.nReferensi = new MPNReferensiService(new URL("http://localhost:8080/ReproImporService/ReproImpor?wsdl")).getMPNReferensiPort();
            this.cukai = new CukaiService(new URL("http://localhost:8080/ReproImporService/ReproImpor?wsdl")).getCukaiPort();
        } catch (Exception e) {
            this.backgroundProses = new MPNBackgroundProsesService().getMPNBackgroundProsesPort();
            this.inhouse = new MPNInhouseService().getMPNInhousePort();
            this.mPublic = new MPNPublicService().getMPNPublicPort();
            this.nReferensi = new MPNReferensiService().getMPNReferensiPort();
            this.cukai = new CukaiService().getCukaiPort();
        }
    }

    public MPNBackgroundProses getBackgroundProses() {
        return backgroundProses;
    }

    public MPNInhouse getInhouse() {
        return inhouse;
    }

    public MPNPublic getPublic() {
        return mPublic;
    }
    
    public MPNReferensi getReferensi(){
        return nReferensi;
    }
    
    public Cukai getCukai(){
        return cukai;
    }
}
