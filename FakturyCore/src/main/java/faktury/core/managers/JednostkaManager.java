package faktury.core.managers;

import faktury.core.beans.Jednostka;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: Mariusz
 * Date: 21.03.11
 * Time: 21:37
 * To change this template use File | Settings | File Templates.
 */
public class JednostkaManager {


    private String getJednostkaSqlQuery;
    private String insertJednostkaSqlQuery;
    private SimpleJdbcTemplate db;

    public Jednostka saveJednostka(Jednostka jednostka) {

        db.update(insertJednostkaSqlQuery,
                jednostka.getJednostka_m());
        return null;
    }

    public Jednostka getJednostka(long id) {
        RowMapper<Jednostka> mapper = new RowMapper<Jednostka>() {
            public Jednostka mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                Jednostka jednostka = new Jednostka();
                jednostka.setId(resultSet.getLong("id"));
                jednostka.setJednostka_m(resultSet.getString("jednostka_m"));
                return jednostka;
            }
        };

        return this.db.queryForObject(getJednostkaSqlQuery, mapper, id);

    }


    public void setGetJednostkaSqlQuery(String getJednostkaSqlQuery) {
        this.getJednostkaSqlQuery = getJednostkaSqlQuery;
    }

    public void setInsertJednostkaSqlQuery(String insertJednostkaSqlQuery) {
        this.insertJednostkaSqlQuery = insertJednostkaSqlQuery;
    }

    public void setDb(SimpleJdbcTemplate db) {
        this.db = db;
    }

}
