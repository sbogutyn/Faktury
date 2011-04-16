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
    StawkaVatManager stawkaVatManager;
    FakturaManager fakturaManager;
    PozycjaManager pozycjaManager;
    WplataManager wplataManager;
    JednostkaManager jednostkaManager;
    RabatManager rabatManager;
    Forma_platnosciManager forma_platnosciManager;
    TowarManager towarManager;


    //każdy obiekt powinien mieć metodę save i get
    public Firma getFirma(long id) {
        return firmaManager.getFirma(id);
    }
    public void saveFirma(Firma firma) {
        firmaManager.saveFirma(firma);
    }

    public StawkaVat getStawkaVat(long id) {
        return stawkaVatManager.getStawkaVat(id);
    }
    public void saveStawkaVat(StawkaVat stawka_vat) {
        stawkaVatManager.saveStawkaVat(stawka_vat);
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

    public Jednostka getJednostka(long id) {
        return jednostkaManager.getJednostka(id);
    }

    public void saveJednostka(Jednostka jednostka) {
        jednostkaManager.saveJednostka(jednostka);
    }

    public Rabat getRabat(long id) {
        return rabatManager.getRabat(id);
    }

    public void saveRabat(Rabat rabat) {
        rabatManager.saveRabat(rabat);
    }

    public Forma_platnosci getForma_platnosci(long id) {
        return forma_platnosciManager.getForma_platnosci(id);
    }

    public void saveForma_platnosci(Forma_platnosci forma_platnosci) {
        forma_platnosciManager.saveForma_platnosci(forma_platnosci);
    }

    public Towar getTowar(long id) {
        return towarManager.getTowar(id);
    }

    public void saveTowar(Towar towar) {
        towarManager.saveTowar(towar);
    }



    //settery dla managerów
    public void setFirmaManager(FirmaManger firmaManager) {
        this.firmaManager = firmaManager;
    }

    public void setStawkaVatManager(StawkaVatManager stawkaVatManager) {
        this.stawkaVatManager = stawkaVatManager;
    }

    public void setFakturaManager(FakturaManager fakturaManager) {
        this.fakturaManager = fakturaManager;
    }

    public void setPozycjaManager(PozycjaManager pozycjaManager) {
        this.pozycjaManager = pozycjaManager;
    }

    public void setWplataManager(WplataManager wplataManager) {
        this.wplataManager = wplataManager;
    }
    public void setJednostkaManager(JednostkaManager jednostkaManager) {
        this.jednostkaManager = jednostkaManager;
    }

    public void setRabatManager(RabatManager rabatManager) {
        this.rabatManager = rabatManager;
    }

    public void setForma_platnosciManager(Forma_platnosciManager forma_platnosciManager) {
        this.forma_platnosciManager = forma_platnosciManager;
    }

    public void setTowarManager(TowarManager towarManager) {
        this.towarManager = towarManager;
    }
}

