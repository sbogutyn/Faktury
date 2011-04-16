package faktury.core.managers;

import faktury.core.beans.Forma_platnosci;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: Mariusz
 * Date: 23.03.11
 * Time: 20:25
 * To change this template use File | Settings | File Templates.
 */
public class Forma_platnosciManager {
    private String getForma_platnosciSqlQuery;
    private String insertForma_platnosciSqlQuery;
    private SimpleJdbcTemplate db;

    public Forma_platnosci saveForma_platnosci(Forma_platnosci forma_platnosci) {

        db.update(insertForma_platnosciSqlQuery,
                forma_platnosci.getOpis(),
                forma_platnosci.getIlosc_dni());
        return null;
    }

    public Forma_platnosci getForma_platnosci(long id) {
        RowMapper<Forma_platnosci> mapper = new RowMapper<Forma_platnosci>() {
            public Forma_platnosci mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                Forma_platnosci forma_platnosci = new Forma_platnosci();
                forma_platnosci.setId(resultSet.getLong("id"));
                forma_platnosci.setOpis(resultSet.getString("opis"));
                forma_platnosci.setIlosc_dni(resultSet.getInt("ilosc_dni"));
                return forma_platnosci;
            }
        };

        return this.db.queryForObject(getForma_platnosciSqlQuery, mapper, id);

    }


    public void setGetForma_platnosciSqlQuery(String getForma_platnosciSqlQuery) {
        this.getForma_platnosciSqlQuery = getForma_platnosciSqlQuery;
    }

    public void setInsertForma_platnosciSqlQuery(String insertForma_platnosciSqlQuery) {
        this.insertForma_platnosciSqlQuery = insertForma_platnosciSqlQuery;
    }

    public void setDb(SimpleJdbcTemplate db) {
        this.db = db;
    }



}
