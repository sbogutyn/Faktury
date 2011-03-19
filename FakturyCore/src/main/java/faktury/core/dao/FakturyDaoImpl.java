package faktury.core.dao;

import faktury.core.beans.Firma;
import faktury.core.managers.FirmaManger;

/**
 * Created by IntelliJ IDEA.
 * User: slavo
 * Date: 19.03.11
 * Time: 16:00
 */
public class FakturyDaoImpl implements IFakturyDao {

    //managery dla poszczególnych obiektów
    FirmaManger firmaManager;


    //każdy obiekt powinien mieć metodę save i get
    public Firma getFirma(long id) {
        return firmaManager.getFirma(id);
    }

    public void saveFirma(Firma firma) {
        firmaManager.saveFirma(firma);
    }


    //settery dla managerów
    public void setFirmaManager(FirmaManger firmaManager) {
        this.firmaManager = firmaManager;
    }
}
