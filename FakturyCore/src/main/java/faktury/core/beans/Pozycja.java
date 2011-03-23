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

    public Double getCena_netto() {
        return cena_netto;
    }

    public void setCena_netto(Double cena_netto) {
        this.cena_netto = cena_netto;
    }

    public Long getVat() {
        return vat;
    }

    public void setVat(Long vat) {
        this.vat = vat;
    }

    public Double getCena_brutto() {
        return cena_brutto;
    }

    public void setCena_brutto(Double cena_brutto) {
        this.cena_brutto = cena_brutto;
    }

    public Double getIlosc() {
        return ilosc;
    }

    public void setIlosc(Double ilosc) {
        this.ilosc = ilosc;
    }

    public Double getWartosc_netto() {
        return wartosc_netto;
    }

    public void setWartosc_netto(Double wartosc_netto) {
        this.wartosc_netto = wartosc_netto;
    }

    public Double getWartosc_brutto() {
        return wartosc_brutto;
    }

    public void setWartosc_brutto(Double wartosc_brutto) {
        this.wartosc_brutto = wartosc_brutto;
    }

    public Long getFaktura() {
        return faktura;
    }

    public void setFaktura(Long faktura) {
        this.faktura = faktura;
    }

    private long id;
    private String nazwa;
    private String pkwiu;
    private String jednm;
    private Double cena_netto;
    private Long vat;
    private double cena_brutto;
    private double ilosc;
    private double wartosc_netto;
    private double wartosc_brutto;
    private long faktura;
}
