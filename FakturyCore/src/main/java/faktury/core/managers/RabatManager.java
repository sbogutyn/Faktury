package faktury.core.managers;

import faktury.core.beans.Rabat;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: Mariusz
 * Date: 23.03.11
 * Time: 19:22
 * To change this template use File | Settings | File Templates.
 */
public class RabatManager {
    private String getRabatSqlQuery;
    private String insertRabatSqlQuery;
    private SimpleJdbcTemplate db;

    public Rabat saveRabat(Rabat rabat) {

        db.update(insertRabatSqlQuery,
                rabat.getWartosc_zakupow(),
                rabat.getWysokosc_rabatu());
        return null;
    }

    public Rabat getRabat(long id) {
        RowMapper<Rabat> mapper = new RowMapper<Rabat>() {
            public Rabat mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                Rabat rabat = new Rabat();
                rabat.setId(resultSet.getLong("id"));
                rabat.setWartosc_zakupow(resultSet.getInt("wartosc_zakupow"));
                rabat.setWysokosc_rabatu(resultSet.getInt("wysokosc_rabatu"));
                return rabat;
            }
        };

        return this.db.queryForObject(getRabatSqlQuery, mapper, id);

    }


    public void setGetRabatSqlQuery(String getRabatSqlQuery) {
        this.getRabatSqlQuery = getRabatSqlQuery;
    }

    public void setInsertRabatSqlQuery(String insertRabatSqlQuery) {
        this.insertRabatSqlQuery = insertRabatSqlQuery;
    }

    public void setDb(SimpleJdbcTemplate db) {
        this.db = db;
    }
}
