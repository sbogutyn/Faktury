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

    public Double getStawka_vat() {
        return stawka_vat;
    }

    public void setStawka_vat(Double stawka_vat) {
        this.stawka_vat = stawka_vat;
    }

    public Double getWartosc_vat() {
        return wartosc_vat;
    }

    public void setWartosc_vat(Double wartosc_vat) {
        this.wartosc_vat = wartosc_vat;
    }

    private long id;
    private Double stawka_vat;
    private Double wartosc_vat;
}
