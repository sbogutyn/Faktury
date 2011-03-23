package faktury.core.managers;

import faktury.core.beans.Faktura;
import faktury.core.beans.Firma;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: wieslaw
 * Date: 23.03.11
 * Time: 10:54
 * To change this template use File | Settings | File Templates.
 */
public class FakturaManager {
    private String getFakturaSqlQuery;
    private String insertFakturaSqlQuery;
    private SimpleJdbcTemplate db;

    public Faktura saveFaktura(Faktura faktura) {

        db.update(insertFakturaSqlQuery,
                faktura.getNr(),
                faktura.getData_wystawienie(),
                faktura.getData_sprzedazy(),
                faktura.getTermin_platnosci(),
                faktura.getFirma(),
                faktura.getKontrahent(),
                faktura.getForma_platnosci(),
                faktura.getRabat());
        return null;
    }

    public Faktura getFaktura(long id) {
        RowMapper<Faktura> mapper = new RowMapper<Faktura>() {
            public Faktura mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                Faktura faktura = new Faktura();
                faktura.setNr(resultSet.getString("nr"));
                faktura.setData_wystawienie(resultSet.getDate("data_wystawienie"));
                faktura.setData_sprzedazy(resultSet.getDate("data_sprzedazy"));
                faktura.setTermin_platnosci(resultSet.getDate("termin_platnosci"));
                faktura.setFirma(resultSet.getLong("firma"));
                faktura.setKontrahent(resultSet.getLong("kontrahent"));
                faktura.setForma_platnosci(resultSet.getLong("forma_platnosci"));
                faktura.setRabat(resultSet.getLong("rabat"));
                return faktura;
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
