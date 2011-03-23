package faktury.core.beans;

import java.sql.Date;

/**
 * Created by IntelliJ IDEA.
 * User: wieslaw
 * Date: 23.03.11
 * Time: 10:43
 * To change this template use File | Settings | File Templates.
 */
public class Faktura {

    @Override
    public String toString() {
        return "Faktura{" +
                "id=" + id +
                ", nr=" + nr +
                ", data_wystawienie=" + data_wystawienie +
                ", data_sprzedazy=" + data_sprzedazy +
                ", termin_platnosci=" + termin_platnosci +
                ", firma=" + firma +
                ", kontrahent=" + kontrahent +
                ", forma_platnosci=" + forma_platnosci +
                ", rabat=" + rabat +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public Date getData_wystawienie() {
        return data_wystawienie;
    }

    public void setData_wystawienie(Date data_wystawienie) {
        this.data_wystawienie = data_wystawienie;
    }

    public Date getData_sprzedazy() {
        return data_sprzedazy;
    }

    public void setData_sprzedazy(Date data_sprzedazy) {
        this.data_sprzedazy = data_sprzedazy;
    }

    public Date getTermin_platnosci() {
        return termin_platnosci;
    }

    public void setTermin_platnosci(Date termin_platnosci) {
        this.termin_platnosci = termin_platnosci;
    }

    public long getFirma() {
        return firma;
    }

    public void setFirma(long firma) {
        this.firma = firma;
    }

    public long getKontrahent() {
        return kontrahent;
    }

    public void setKontrahent(long kontrahent) {
        this.kontrahent = kontrahent;
    }

    public long getForma_platnosci() {
        return forma_platnosci;
    }

    public void setForma_platnosci(long forma_platnosci) {
        this.forma_platnosci = forma_platnosci;
    }

    public long getRabat() {
        return rabat;
    }

    public void setRabat(long rabat) {
        this.rabat = rabat;
    }

    private long id;
    private String nr;
    private Date data_wystawienie;
    private Date data_sprzedazy;
    private Date termin_platnosci;
    private long firma;
    private long kontrahent;
    private long forma_platnosci;
    private long rabat;
}
