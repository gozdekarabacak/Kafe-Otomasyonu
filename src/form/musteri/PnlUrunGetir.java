
package form.musteri;

import form.musteri.FrmMusteriSiparis;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import property.Urun;

/**
 *
 * @author Tugay Demirel
 */
public class PnlUrunGetir extends javax.swing.JPanel {

    /**
     * Creates new form panelDeneme
     */
    public PnlUrunGetir() {
        initComponents();
//        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        urunGetir();
    }
            Panel icPanel = new Panel();

    ArrayList<Urun> urunList = null;
    public PnlUrunGetir(ArrayList<Urun> urunList) {


        this.urunList = (ArrayList<Urun>) urunList.clone();
        initComponents();
//        setLayout(new GridLayout(urunList.size(),1));
//        icPanel.setLayout(new GridLayout(urunList.size(),1));
        urunGetir();
    }

    void urunGetir() {
        
        for (Urun urun : urunList) {
            JButton btn1 = new JButton(urun.getAd());
//            setLayout(new ModifiedFlowLayout(FlowLayout.LEFT));
            btn1.setSize(250, 100);
            btn1.setBackground(Color.BLUE);
            add(btn1);
            
            btn1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    FrmMusteriSiparis.txtUrunAdi.setText(urun.getAd());
                    FrmMusteriSiparis.txtUrunDetay.setText(urun.getDetay());
                    FrmMusteriSiparis.txtUrunFiyat.setText(urun.getFiyat());
                    FrmMusteriSiparis.btnEkle.setEnabled(true);
                    form.musteri.FrmMusteriSiparis.urun = urun;
                }
            });
        }
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
