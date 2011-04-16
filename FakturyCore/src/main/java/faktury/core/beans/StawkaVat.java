package faktury.core.beans;

/**
 * Created by IntelliJ IDEA.
 * User: wieslaw
 * Date: 23.03.11
 * Time: 09:05
 * To change this template use File | Settings | File Templates.
 */
public class StawkaVat {


    @Override
    public String toString() {
        return "StawkaVat{" +
                "id=" + id +
                ", stawka_vat='" + stawkaVat + '\'' +
                ", wartosc_vat='" + wartoscVat + '\'' +
                '}';
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStawkaVat() {
        return stawkaVat;
    }

    public void setStawkaVat(String stawkaVat) {
        this.stawkaVat = stawkaVat;
    }

    public Integer getWartoscVat() {
        return wartoscVat;
    }

    public void setWartoscVat(Integer wartoscVat) {
        this.wartoscVat = wartoscVat;
    }

    private long id;
    private String stawkaVat;
    private Integer wartoscVat;
}
