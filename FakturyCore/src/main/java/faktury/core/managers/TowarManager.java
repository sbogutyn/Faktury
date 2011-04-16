package faktury.core.managers;

import faktury.core.beans.Towar;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: Mariusz
 * Date: 23.03.11
 * Time: 21:16
 * To change this template use File | Settings | File Templates.
 */
public class TowarManager {

    private String getTowarSqlQuery;
    private String insertTowarSqlQuery;
    private SimpleJdbcTemplate db;

    public Towar saveTowar(Towar towar) {

        db.update(insertTowarSqlQuery,
                towar.getSkrot(),
                towar.getNazwa(),
                towar.getPkwiu(),
                towar.getJednm(),
                towar.getCena_netto(),
                towar.getVat(),
                towar.getCena_brutto());
        return null;
    }

    public Towar getTowar(long id) {
        RowMapper<Towar> mapper = new RowMapper<Towar>() {
            public Towar mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                Towar towar = new Towar();
                towar.setId(resultSet.getLong("id"));
                towar.setSkrot(resultSet.getString("skrot"));
                towar.setNazwa(resultSet.getString("nazwa"));
                towar.setPkwiu(resultSet.getString("pkwiu"));
                towar.setJednm(resultSet.getLong("jednm"));
                towar.setCena_netto(resultSet.getDouble("cena_netto"));
                towar.setVat(resultSet.getLong("vat"));
                towar.setCena_brutto(resultSet.getDouble("cena_brutto"));
                return towar;
            }
        };

        return this.db.queryForObject(getTowarSqlQuery, mapper, id);

    }


    public void setGetTowarSqlQuery(String getTowarSqlQuery) {
        this.getTowarSqlQuery = getTowarSqlQuery;
    }

    public void setInsertTowarSqlQuery(String insertTowarSqlQuery) {
        this.insertTowarSqlQuery = insertTowarSqlQuery;
    }

    public void setDb(SimpleJdbcTemplate db) {
        this.db = db;
    }
}
