package faktury.core.managers;

import faktury.core.beans.Firma;
import faktury.core.beans.Pozycja;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: wieslaw
 * Date: 23.03.11
 * Time: 13:11
 * To change this template use File | Settings | File Templates.
 */
public class PozycjaManager {

    private String getFakturaSqlQuery;
    private String insertFakturaSqlQuery;
    private SimpleJdbcTemplate db;

    public Pozycja savePozycja(Pozycja pozycja) {

        db.update(insertFakturaSqlQuery,
                pozycja.getNazwa(),
                pozycja.getPkwiu(),
                pozycja.getJednm(),
                pozycja.getCena_netto(),
                pozycja.getVat(),
                pozycja.getCena_brutto(),
                pozycja.getIlosc(),
                pozycja.getWartosc_netto(),
                pozycja.getWartosc_brutto(),
                pozycja.getFaktura());
        return null;
    }

    public Pozycja getPozycja(long id) {
        RowMapper<Pozycja> mapper = new RowMapper<Pozycja>() {
            public Pozycja mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                Pozycja pozycja = new Pozycja();
                pozycja.setId(resultSet.getLong("id"));
                pozycja.setNazwa(resultSet.getString("nazwa"));
                pozycja.setPkwiu(resultSet.getString("pkwiu"));
                pozycja.setJednm(resultSet.getString("jednm"));
                pozycja.setCena_netto(resultSet.getDouble("cena_netto"));
                pozycja.setVat(resultSet.getLong("vat"));
                pozycja.setCena_brutto(resultSet.getDouble("cena_brutto"));
                pozycja.setIlosc(resultSet.getDouble("ilosc"));
                pozycja.setWartosc_netto(resultSet.getDouble("wartosc_netto"));
                pozycja.setWartosc_brutto(resultSet.getDouble("wartosc_brutto"));
                pozycja.setFaktura(resultSet.getLong("faktura"));
                return pozycja;
            }
        };

        return this.db.queryForObject(getFakturaSqlQuery, mapper, id);

    }


    public void setGetFakturaSqlQuery(String getFakturaSqlQuery) {
        this.getFakturaSqlQuery = getFakturaSqlQuery;
    }

    public void setInsertFakturaSqlQuery(String insertFakturaSqlQuery) {
        this.insertFakturaSqlQuery = insertFakturaSqlQuery;
    }

    public void setDb(SimpleJdbcTemplate db) {
        this.db = db;
    }
}
