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
    public Stawka_vat getStawka_vat(long id);
    public void saveStawka_vat(Stawka_vat stawka_vat);
    public Faktura getFaktura(long id);
    public void saveFaktura(Faktura faktura);
    public Pozycja getPozycja(long id);
    public void savePozycja(Pozycja pozycja);
    public Wplata getWplata(long id);
    public void saveWplata(Wplata wplata);
}
