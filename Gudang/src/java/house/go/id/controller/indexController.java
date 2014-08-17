/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package house.go.id.controller;

import org.zkoss.zk.ui.Page;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.*;

/**
 *
 * @author rama
 */
public class indexController extends GenericForwardComposer{
    
    private West leftPanel;
    private Center mainPanel;
    private East rightPanel;
    private South detailPanel;
    private Include mainInclude;
  
    private void setDefaultPanel() {
        leftPanel.setTitle("Navigasi");
        leftPanel.setOpen(false);
        rightPanel.setTitle("Tools");
        rightPanel.setOpen(false);
        detailPanel.setOpen(false);
    }

    public void onClick$001(Event evt) {
        Page pageSimpeg = evt.getTarget().getDesktop().getPage("modulGudang");
        setDefaultPanel();
        mainPanel.setTitle("Selamat Datang");
        mainInclude.setSrc("form/home.zul");
    }

    public void onClick$011(Event evt) {
        setDefaultPanel();
        mainPanel.setTitle("Form Management Barang");
        mainInclude.setSrc("form/management/ManBarang.zul");
    }
    
    
    
}
