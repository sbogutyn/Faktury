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

    private void saveJednostkaTest() {
        Jednostka jednostka = new Jednostka();
        jednostka.setJednostka_m("kg");
        fakturyDao.saveJednostka(jednostka);
    }

    private void getJednostkaTest(long id) {
        Jednostka jednostka = fakturyDao.getJednostka(id);
        System.out.println("Jednostka miary: " + jednostka);
    }

    private void saveRabatTest() {
        Rabat rabat = new Rabat();
        rabat.setWartosc_zakupow(5000);
        rabat.setWysokosc_rabatu(5);
        fakturyDao.saveRabat(rabat);
    }

    private void getRabatTest(long id) {
        Rabat rabat = fakturyDao.getRabat(id);
        System.out.println("Stawka VAT: " + rabat);
    }

    private void saveForma_platnosciTest() {
        Forma_platnosci forma_platnosci = new Forma_platnosci();
        forma_platnosci.setOpis("przelew 14 dni");;
        forma_platnosci.setIlosc_dni(14);
        fakturyDao.saveForma_platnosci(forma_platnosci);
    }

    private void getForma_platnosciTest(long id) {
        Forma_platnosci forma_platnosci = fakturyDao.getForma_platnosci(id);
        System.out.println("Forma płatności: " + forma_platnosci);
    }

    private void saveTowarTest() {
        Towar towar = new Towar();
        towar.setSkrot("lcd22");
        towar.setNazwa("Monitor LG LCD 22");
        towar.setPkwiu("15.25.36");
        towar.setJednm(1);
        towar.setCena_netto(1000.00);
        towar.setVat(1);
        towar.setCena_brutto(1230);
        fakturyDao.saveTowar(towar);
    }

    private void getTowarTest(long id) {
        Towar towar = fakturyDao.getTowar(id);
        System.out.println("Towar: " + towar);
    }



    public void run() {
      saveFirmaTest();
      getFirmaTest(1);
      saveJednostkaTest();
      getJednostkaTest(1);
      saveRabatTest();
      getRabatTest(1);
      saveForma_platnosciTest();
      getForma_platnosciTest(1);
      saveTowarTest();     // insert into stawka_vat(stawka_vat, wartosc_vat) values ('23%', 23)
      getTowarTest(1);
    }


    public void setFakturyDao(IFakturyDao fakturyDao) {
        this.fakturyDao = fakturyDao;
    }

    private IFakturyDao fakturyDao;

}
