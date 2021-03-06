package forms;

import beans.*;
import java.awt.Frame;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainWindow.java
 *
 * Created on 2011-04-07, 19:08:30
 */
/**
 *
 * @author Mariusz
 */
public class MainWindow extends javax.swing.JFrame {

    private Frame okno;

    /** Creates new form MainWindow */
    public MainWindow() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuDokumenty = new javax.swing.JMenu();
        jMenuItemFaktura = new javax.swing.JMenuItem();
        jMenuItemModyfikacjaFaktury = new javax.swing.JMenuItem();
        jMenuZestawienia = new javax.swing.JMenu();
        jMenuItemZestawienieSprz = new javax.swing.JMenuItem();
        jMenuItemRejestrVat = new javax.swing.JMenuItem();
        jMenuRozliczenia = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuUstawienia = new javax.swing.JMenu();
        jMenuItemDaneFirmy = new javax.swing.JMenuItem();
        jMenuItemKontrahenci = new javax.swing.JMenuItem();
        jMenuItemTowary = new javax.swing.JMenuItem();
        jMenuKoniec = new javax.swing.JMenu();
        jMenuItemZamknij = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Faktury");

        jMenuDokumenty.setText("Dokumenty");

        jMenuItemFaktura.setText("Faktura VAT");
        jMenuDokumenty.add(jMenuItemFaktura);

        jMenuItemModyfikacjaFaktury.setText("Modyfikacja Faktury VAT");
        jMenuDokumenty.add(jMenuItemModyfikacjaFaktury);

        jMenuBar1.add(jMenuDokumenty);

        jMenuZestawienia.setText("Zestawienia");

        jMenuItemZestawienieSprz.setText("Zestawienie sprzedaży");
        jMenuZestawienia.add(jMenuItemZestawienieSprz);

        jMenuItemRejestrVat.setText("Rejestr sprzedaży VAT");
        jMenuZestawienia.add(jMenuItemRejestrVat);

        jMenuBar1.add(jMenuZestawienia);

        jMenuRozliczenia.setText("Rozliczenia");

        jMenuItem6.setText("Rozliczenia");
        jMenuRozliczenia.add(jMenuItem6);

        jMenuBar1.add(jMenuRozliczenia);

        jMenuUstawienia.setText("Ustawienia");

        jMenuItemDaneFirmy.setText("Dane firmy");
        jMenuItemDaneFirmy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDaneFirmyActionPerformed(evt);
            }
        });
        jMenuUstawienia.add(jMenuItemDaneFirmy);

        jMenuItemKontrahenci.setText("Kontrahenci");
        jMenuItemKontrahenci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemKontrahenciActionPerformed(evt);
            }
        });
        jMenuUstawienia.add(jMenuItemKontrahenci);

        jMenuItemTowary.setText("Towary i Usługi");
        jMenuItemTowary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTowaryActionPerformed(evt);
            }
        });
        jMenuUstawienia.add(jMenuItemTowary);

        jMenuBar1.add(jMenuUstawienia);

        jMenuKoniec.setText("Koniec");

        jMenuItemZamknij.setText("Zakończ program");
        jMenuItemZamknij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemZamknijActionPerformed(evt);
            }
        });
        jMenuKoniec.add(jMenuItemZamknij);

        jMenuBar1.add(jMenuKoniec);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemKontrahenciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemKontrahenciActionPerformed
        KontrahentGui oknoKontrahent = new KontrahentGui(okno, true);
        oknoKontrahent.setVisible(true);
    }//GEN-LAST:event_jMenuItemKontrahenciActionPerformed

    private void jMenuItemZamknijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemZamknijActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemZamknijActionPerformed

    private void jMenuItemTowaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTowaryActionPerformed
    }//GEN-LAST:event_jMenuItemTowaryActionPerformed

    private void jMenuItemDaneFirmyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDaneFirmyActionPerformed
    }//GEN-LAST:event_jMenuItemDaneFirmyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuDokumenty;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItemDaneFirmy;
    private javax.swing.JMenuItem jMenuItemFaktura;
    private javax.swing.JMenuItem jMenuItemKontrahenci;
    private javax.swing.JMenuItem jMenuItemModyfikacjaFaktury;
    private javax.swing.JMenuItem jMenuItemRejestrVat;
    private javax.swing.JMenuItem jMenuItemTowary;
    private javax.swing.JMenuItem jMenuItemZamknij;
    private javax.swing.JMenuItem jMenuItemZestawienieSprz;
    private javax.swing.JMenu jMenuKoniec;
    private javax.swing.JMenu jMenuRozliczenia;
    private javax.swing.JMenu jMenuUstawienia;
    private javax.swing.JMenu jMenuZestawienia;
    // End of variables declaration//GEN-END:variables
}
