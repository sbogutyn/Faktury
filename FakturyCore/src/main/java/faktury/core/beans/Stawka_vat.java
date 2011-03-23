package faktury.core.beans;

/**
 * Created by IntelliJ IDEA.
 * User: wieslaw
 * Date: 23.03.11
 * Time: 09:05
 * To change this template use File | Settings | File Templates.
 */
public class Stawka_vat {




    private long id;

    @Override
    public String toString() {
        return "Stawka_vat{" +
                "id=" + id +
                ", stawka_vat=" + stawka_vat +
                ", wartosc_vat=" + wartosc_vat +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getStawka_vat() {
        return stawka_vat;
    }

    public void setStawka_vat(double stawka_vat) {
        this.stawka_vat = stawka_vat;
    }

    public double getWartosc_vat() {
        return wartosc_vat;
    }

    public void setWartosc_vat(double wartosc_vat) {
        this.wartosc_vat = wartosc_vat;
    }

    private double stawka_vat;
    private double wartosc_vat;
}
