package faktury.core.beans;

/**
 * Created by IntelliJ IDEA.
 * User: wieslaw
 * Date: 23.03.11
 * Time: 09:05
 * To change this template use File | Settings | File Templates.
 */
public class Stawka_vat {


    @Override
    public String toString() {
        return "Stawka_vat{" +
                "id=" + id +
                ", stawka_vat='" + stawka_vat + '\'' +
                ", wartosc_vat='" + wartosc_vat + '\'' +
                '}';
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStawka_vat() {
        return stawka_vat;
    }

    public void setStawka_vat(String stawka_vat) {
        this.stawka_vat = stawka_vat;
    }

    public String getWartosc_vat() {
        return wartosc_vat;
    }

    public void setWartosc_vat(String wartosc_vat) {
        this.wartosc_vat = wartosc_vat;
    }

    private long id;
    private String stawka_vat;
    private String wartosc_vat;
}
