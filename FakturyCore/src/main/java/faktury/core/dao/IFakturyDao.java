package faktury.core.dao;

import faktury.core.beans.Firma;

/**
 * Created by IntelliJ IDEA.
 * User: slavo
 * Date: 19.03.11
 * Time: 16:00
 */
public interface IFakturyDao {
    public Firma getFirma(long id);
    public void saveFirma(Firma firma);
}
