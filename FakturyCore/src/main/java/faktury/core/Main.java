package faktury.core;


import faktury.core.beans.*;
import faktury.core.dao.IFakturyDao;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by IntelliJ IDEA.
 * User: Slawek
 * Date: 2011-03-07
 * Time: 22:10:35
 */


public class Main {


    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("db-access.xml");
        context.registerShutdownHook();

        Main main = context.getBean("main", Main.class);
        main.run();

    }


    private void saveFirmaTest() {
        Firma firma = new Firma();
        firma.setEmail("firma@firma.pl");
        firma.setKod("84-200");
        firma.setKonto("123543546497890");
        firma.setMiasto("Wejherowo");
        firma.setNazwa("test");
        firma.setSkrot("test-skrot");
        firma.setOsoba("osoba?");
        firma.setTelefon("58-425-313");
        firma.setNip("345646");
        firma.setUlica("sezamkowa");
        fakturyDao.saveFirma(firma);
    }
    private void getFirmaTest(long id) {
        Firma firma = fakturyDao.getFirma(id);
        System.out.println("Firma: " + firma);
    }


    private void saveStawkaVatTest() {
        StawkaVat stawkaVat = new StawkaVat();
        stawkaVat.setStawkaVat("15%");
        stawkaVat.setWartoscVat(15);
        fakturyDao.saveStawkaVat(stawkaVat);
    }
    private void getStawkaVatTest(long id) {
        StawkaVat stawka_vat = fakturyDao.getStawkaVat(id);
        System.out.println("Stawka vat: " + stawka_vat);
    }


    private void saveFakturaTest() {
        Faktura faktura = new Faktura();
        faktura.setNr("35abc");
        java.sql.Date date1 = java.sql.Date.valueOf( "2011-01-01" );
        faktura.setData_wystawienie(date1);
        java.sql.Date date2 = java.sql.Date.valueOf( "2011-01-01" );
        faktura.setData_sprzedazy(date2);
        faktura.setFirma(2);
        faktura.setKontrahent(3);
        faktura.setForma_platnosci(1);
        java.sql.Date date3 = java.sql.Date.valueOf( "2011-01-01" );
        faktura.setTermin_platnosci(date3);
        faktura.setRabat(1);
        fakturyDao.saveFaktura(faktura);
    }
    private void getFakturaTest(long id) {
        Faktura faktura = fakturyDao.getFaktura(id);
        System.out.println("Faktura: " + faktura);
    }


    private void savePozycjaTest() {
        Pozycja pozycja = new Pozycja();
        pozycja.setNazwa("kielbasa");
        pozycja.setPkwiu("znak15");
        pozycja.setJednm("kilogram");
        pozycja.setCena_netto(32.50);
        pozycja.setVat(40l);
        pozycja.setCena_brutto(40.05);
        pozycja.setIlosc(23.5);
        pozycja.setWartosc_netto(15.60);
        pozycja.setWartosc_brutto(23.25);
        pozycja.setFaktura(200l);
        fakturyDao.savePozycja(pozycja);
    }
    private void getPozycjaTest(long id) {
        Pozycja pozycja = fakturyDao.getPozycja(id);
        System.out.println("Pozycja: " + pozycja);
    }



    private void saveWplataTest() {
        Wplata wplata = new Wplata();
        java.sql.Date date4 = java.sql.Date.valueOf( "2011-01-01" );
        wplata.setDatawplaty(date4);
        wplata.setKwota(231);
        wplata.setFaktura(32);
        fakturyDao.saveWplata(wplata);
    }
    private void getWplataTest(long id) {
        Wplata wplata = fakturyDao.getWplata(id);
        System.out.println("Wplata: " + wplata);
    }



    public void run() {
        saveFirmaTest();
        getFirmaTest(1);
        saveStawkaVatTest();
        getStawkaVatTest(1);
        saveFakturaTest();
        getFakturaTest(1);
        savePozycjaTest();
        getPozycjaTest(1);
        saveWplataTest();
        getWplataTest(1);
    }


    public void setFakturyDao(IFakturyDao fakturyDao) {
        this.fakturyDao = fakturyDao;
    }

    private IFakturyDao fakturyDao;

}
