package faktury.core.managers;

import faktury.core.beans.StawkaVat;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: wieslaw
 * Date: 23.03.11
 * Time: 09:20
 * To change this template use File | Settings | File Templates.
 */
public class StawkaVatManager {
    private String getFakturaSqlQuery;
    private String insertFakturaSqlQuery;
    private SimpleJdbcTemplate db;

    public StawkaVat saveStawkaVat(StawkaVat stawka_vat) {

        db.update(insertFakturaSqlQuery,
                stawka_vat.getStawkaVat(),
                stawka_vat.getWartoscVat());
        return null;
    }

    public StawkaVat getStawkaVat(long id) {
        RowMapper<StawkaVat> mapper = new RowMapper<StawkaVat>() {
            public StawkaVat mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                StawkaVat stawka_vat = new StawkaVat();
                stawka_vat.setId(resultSet.getLong("id"));
                stawka_vat.setStawkaVat(resultSet.getString("stawka_vat"));
                stawka_vat.setWartoscVat(resultSet.getInt("wartosc_vat"));
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
