package faktury.core.beans;

/**
 * Created by IntelliJ IDEA.
 * User: Mariusz
 * Date: 23.03.11
 * Time: 20:12
 * To change this template use File | Settings | File Templates.
 */
public class Forma_platnosci {

    public String toString() {
        return "Forma_platnosci{" +
                "id=" + id +
                ", opis='" + opis + '\'' +
                ", ilosc_dni='" + ilosc_dni + '\'' +
                '}';

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getIlosc_dni() {
        return ilosc_dni;
    }

    public void setIlosc_dni(int ilosc_dni) {
        this.ilosc_dni = ilosc_dni;
    }

    private long id;
    private String opis;
    private int ilosc_dni;

}
