package faktury.core.dao;

import faktury.core.beans.*;
import faktury.core.managers.*;

/**
 * Created by IntelliJ IDEA.
 * User: slavo
 * Date: 19.03.11
 * Time: 16:00
 */
public class FakturyDaoImpl implements IFakturyDao {

    //managery dla poszczególnych obiektów
    FirmaManger firmaManager;
    Stawka_vatManager stawka_vatManager;
    FakturaManager fakturaManager;
    PozycjaManager pozycjaManager;
    WplataManager wplataManager;

    //każdy obiekt powinien mieć metodę save i get
    public Firma getFirma(long id) {
        return firmaManager.getFirma(id);
    }
    public void saveFirma(Firma firma) {
        firmaManager.saveFirma(firma);
    }

    public Stawka_vat getStawka_vat(long id) {
        return stawka_vatManager.getStawka_vat(id);
    }
    public void saveStawka_vat(Stawka_vat stawka_vat) {
        stawka_vatManager.saveStawka_vat(stawka_vat);
    }

    public Faktura getFaktura(long id) {
        return fakturaManager.getFaktura(id);
    }
    public void saveFaktura(Faktura faktura) {
        fakturaManager.saveFaktura(faktura);
    }

    public Pozycja getPozycja(long id) {
        return pozycjaManager.getPozycja(id);
    }
    public void savePozycja(Pozycja pozycja) {
        pozycjaManager.savePozycja(pozycja);
    }
    public Wplata getWplata(long id) {
        return wplataManager.getWplata(id);
    }
    public void saveWplata(Wplata wplata) {
        wplataManager.saveWplata(wplata);
    }


    //settery dla managerów
    public void setFirmaManager(FirmaManger firmaManager) {
        this.firmaManager = firmaManager;
    }
    public void setStawka_vat(Stawka_vatManager stawka_vatManager) {
        this.stawka_vatManager = stawka_vatManager;
    }
    public void setFaktura(FakturaManager fakturaManager) {
        this.fakturaManager = fakturaManager;
    }
    public void setPozycja(PozycjaManager pozycjaManager) {
        this.pozycjaManager = pozycjaManager;
    }
    public void setWplata(WplataManager wplataManager) {
        this.wplataManager = wplataManager;
    }
}
