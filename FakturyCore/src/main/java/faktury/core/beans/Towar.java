package faktury.core.beans;

/**
 * Created by IntelliJ IDEA.
 * User: Mariusz
 * Date: 23.03.11
 * Time: 20:18
 * To change this template use File | Settings | File Templates.
 */
public class Towar {

    public String toString() {
        return "Towar{" +
                "id=" + id +
                ", skrot='" + skrot + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", pkwiu='" + pkwiu + '\'' +
                ", jednm='" + jednm + '\'' +
                ", cena_netto='" + cena_netto + '\'' +
                ", vat='" + vat + '\'' +
                ", cena_brutto='" + cena_brutto + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSkrot() {
        return skrot;
    }

    public void setSkrot(String skrot) {
        this.skrot = skrot;
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

    public long getJednm() {
        return jednm;
    }

    public void setJednm(long jednm) {
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

    private long id;
    private String skrot;
    private String nazwa;
    private String pkwiu;
    private long jednm;
    private double cena_netto;
    private long vat;
    private double cena_brutto;
}
