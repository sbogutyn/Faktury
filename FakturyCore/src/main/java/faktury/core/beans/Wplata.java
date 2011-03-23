package faktury.core.beans;

import java.sql.Date;

/**
 * Created by IntelliJ IDEA.
 * User: wieslaw
 * Date: 23.03.11
 * Time: 14:34
 * To change this template use File | Settings | File Templates.
 */
public class Wplata {


    @Override
    public String toString() {
        return "Wplata{" +
                "id=" + id +
                ", datawplaty=" + datawplaty +
                ", kwota=" + kwota +
                ", faktura=" + faktura +
                '}';
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDatawplaty() {
        return datawplaty;
    }

    public void setDatawplaty(Date datawplaty) {
        this.datawplaty = datawplaty;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public long getFaktura() {
        return faktura;
    }

    public void setFaktura(long faktura) {
        this.faktura = faktura;
    }

    private long id;
    private Date datawplaty;
    private double kwota;
    private long faktura;
}
