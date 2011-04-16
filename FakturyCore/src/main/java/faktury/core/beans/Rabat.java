package faktury.core.beans;

/**
 * Created by IntelliJ IDEA.
 * User: Mariusz
 * Date: 23.03.11
 * Time: 20:15
 * To change this template use File | Settings | File Templates.
 */
public class Rabat {

    public String toString() {
        return "Rabat{" +
                "id=" + id +
                ", wartosc_zakupow='" + wartosc_zakupow + '\'' +
                ", wysokosc_rabatu='" + wysokosc_rabatu + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getWartosc_zakupow() {
        return wartosc_zakupow;
    }

    public void setWartosc_zakupow(int wartosc_zakupow) {
        this.wartosc_zakupow = wartosc_zakupow;
    }

    public int getWysokosc_rabatu() {
        return wysokosc_rabatu;
    }

    public void setWysokosc_rabatu(int wysokosc_rabatu) {
        this.wysokosc_rabatu = wysokosc_rabatu;
    }

    private long id;
    private int wartosc_zakupow;
    private int wysokosc_rabatu;

}
