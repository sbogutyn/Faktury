package faktury.core;


import faktury.core.beans.Firma;
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

    public void run() {
        saveFirmaTest();
        getFirmaTest(1);
    }


    public void setFakturyDao(IFakturyDao fakturyDao) {
        this.fakturyDao = fakturyDao;
    }

    private IFakturyDao fakturyDao;

}
