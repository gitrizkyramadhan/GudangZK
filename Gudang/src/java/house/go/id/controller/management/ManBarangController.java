/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package house.go.id.controller.management;

import go.id.house.Gudang;
import go.id.house.GudangClient;
import go.id.house.TdBarang;
import java.util.List;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.ListitemRenderer;

/**
 *
 * @author rama
 */
public class ManBarangController extends GenericForwardComposer {

    GudangClient gc = new GudangClient();
    Gudang g = gc.getGudang();
    private Listbox listBarang;

    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        List<TdBarang> ltb = g.getAllBarang();
        listBarang.setModel(new ListModelList(ltb));
        listBarang.setItemRenderer(new ListitemRenderer() {
        public int count = 1;
            public void render(Listitem lstm, Object o) throws Exception {
                
                
                final TdBarang dat = (TdBarang) o;

                Listcell cell = new Listcell(""+count);
                cell.setParent(lstm);
                count++;

                cell = new Listcell(dat.getNmBarang());
                cell.setParent(lstm);

                cell = new Listcell(""+dat.getStok());
                cell.setParent(lstm);

            }
        });
    }
}
