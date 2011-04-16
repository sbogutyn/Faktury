package faktury.core.beans;

/**
 * Created by IntelliJ IDEA.
 * User: Mariusz
 * Date: 21.03.11
 * Time: 21:28
 * To change this template use File | Settings | File Templates.
 */
public class Jednostka {

    @Override
    public String toString() {
        return "Jednostka{" +
                "id=" + id +
                ", jednostka_m='" + jednostka_m + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getJednostka_m() {
        return jednostka_m;
    }

    public void setJednostka_m(String jednostka_m) {
        this.jednostka_m = jednostka_m;
    }

    public void setId(long id) {
        this.id = id;
    }

    private long id;
    private String jednostka_m;
}
