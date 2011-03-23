package faktury.core.managers;

import faktury.core.beans.Stawka_vat;
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
 * Time: 09:20
 * To change this template use File | Settings | File Templates.
 */
public class Stawka_vatManager {
    private String getFakturaSqlQuery;
    private String insertFakturaSqlQuery;
    private SimpleJdbcTemplate db;

    public Stawka_vat saveStawka_vat(Stawka_vat stawka_vat) {

        db.update(insertFakturaSqlQuery,
                stawka_vat.getStawka_vat(),
                stawka_vat.getWartosc_vat());
        return null;
    }

    public Stawka_vat getStawka_vat(long id) {
        RowMapper<Stawka_vat> mapper = new RowMapper<Stawka_vat>() {
            public Stawka_vat mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                Stawka_vat stawka_vat = new Stawka_vat();
                stawka_vat.setId(resultSet.getLong("id"));
                stawka_vat.setStawka_vat(resultSet.getDouble("stawkavat"));
                stawka_vat.setWartosc_vat(resultSet.getDouble("wartosc_vat"));
                return stawka_vat;
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
