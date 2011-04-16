package faktury.core.dao;

import faktury.core.beans.*;

/**
 * Created by IntelliJ IDEA.
 * User: slavo
 * Date: 19.03.11
 * Time: 16:00
 */
public interface IFakturyDao {
    public Firma getFirma(long id);
    public void saveFirma(Firma firma);
    public StawkaVat getStawkaVat(long id);
    public void saveStawkaVat(StawkaVat stawka_vat);
    public Faktura getFaktura(long id);
    public void saveFaktura(Faktura faktura);
    public Pozycja getPozycja(long id);
    public void savePozycja(Pozycja pozycja);
    public Wplata getWplata(long id);
    public void saveWplata(Wplata wplata);
}
