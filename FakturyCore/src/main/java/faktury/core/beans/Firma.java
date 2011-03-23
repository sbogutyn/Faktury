package faktury.core.beans;

/**
 * Created by IntelliJ IDEA.
 * User: slavo
 * Date: 19.03.11
 * Time: 15:57
 */

public class Firma {

    @Override
    public String toString() {
        return "Firma{" +
                "id=" + id +
                ", skrot='" + skrot + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", ulica='" + ulica + '\'' +
                ", kod='" + kod + '\'' +
                ", miasto='" + miasto + '\'' +
                ", nip='" + nip + '\'' +
                ", konto='" + konto + '\'' +
                ", osoba='" + osoba + '\'' +
                ", telefon='" + telefon + '\'' +
                ", email='" + email + '\'' +
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

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getKonto() {
        return konto;
    }

    public void setKonto(String konto) {
        this.konto = konto;
    }

    public String getOsoba() {
        return osoba;
    }

    public void setOsoba(String osoba) {
        this.osoba = osoba;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private long id;
    private String skrot;
    private String nazwa;
    private String ulica;
    private String kod;
    private String miasto;
    private String nip;
    private String konto;
    private String osoba;
    private String telefon;
    private String email;
}
