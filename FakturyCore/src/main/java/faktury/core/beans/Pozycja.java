package faktury.core.beans;

/**
 * Created by IntelliJ IDEA.
 * User: wieslaw
 * Date: 23.03.11
 * Time: 13:04
 * To change this template use File | Settings | File Templates.
 */
public class Pozycja {

    @Override
    public String toString() {
        return "Pozycja{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", pkwiu='" + pkwiu + '\'' +
                ", jednm='" + jednm + '\'' +
                ", cena_netto=" + cena_netto +
                ", vat=" + vat +
                ", cena_brutto=" + cena_brutto +
                ", ilosc=" + ilosc +
                ", wartosc_netto=" + wartosc_netto +
                ", wartosc_brutto=" + wartosc_brutto +
                ", faktura=" + faktura +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getPkwiu() {
        return pkwiu;
    }

    public void setPkwiu(String pkwiu) {
        this.pkwiu = pkwiu;
    }

    public String getJednm() {
        return jednm;
    }

    public void setJednm(String jednm) {
        this.jednm = jednm;
    }

    public double getCena_netto() {
        return cena_netto;
    }

    public void setCena_netto(double cena_netto) {
        this.cena_netto = cena_netto;
    }

    public long getVat() {
        return vat;
    }

    public void setVat(long vat) {
        this.vat = vat;
    }

    public double getCena_brutto() {
        return cena_brutto;
    }

    public void setCena_brutto(double cena_brutto) {
        this.cena_brutto = cena_brutto;
    }

    public double getIlosc() {
        return ilosc;
    }

    public void setIlosc(double ilosc) {
        this.ilosc = ilosc;
    }

    public double getWartosc_netto() {
        return wartosc_netto;
    }

    public void setWartosc_netto(double wartosc_netto) {
        this.wartosc_netto = wartosc_netto;
    }

    public double getWartosc_brutto() {
        return wartosc_brutto;
    }

    public void setWartosc_brutto(double wartosc_brutto) {
        this.wartosc_brutto = wartosc_brutto;
    }

    public long getFaktura() {
        return faktura;
    }

    public void setFaktura(long faktura) {
        this.faktura = faktura;
    }

    private long id;
    private String nazwa;
    private String pkwiu;
    private String jednm;
    private double cena_netto;
    private long vat;
    private double cena_brutto;
    private double ilosc;
    private double wartosc_netto;
    private double wartosc_brutto;
    private long faktura;
}
