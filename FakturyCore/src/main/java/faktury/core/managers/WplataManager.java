package faktury.core.managers;

import faktury.core.beans.Wplata;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: wieslaw
 * Date: 23.03.11
 * Time: 14:44
 * To change this template use File | Settings | File Templates.
 */
public class WplataManager {

    private String getFakturaSqlQuery;
        private String insertFakturaSqlQuery;
        private SimpleJdbcTemplate db;

        public Wplata saveWplata(Wplata wplata) {

            db.update(insertFakturaSqlQuery,
                    wplata.getDatawplaty(),
                    wplata.getKwota(),
                    wplata.getFaktura()
                    );
            return null;
        }

        public Wplata getWplata(long id) {
            RowMapper<Wplata> mapper = new RowMapper<Wplata>() {
                public Wplata mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                    Wplata wplata = new Wplata();
                    wplata.setId(resultSet.getLong("id"));
                    wplata.setDatawplaty(resultSet.getDate("datawplaty"));
                    wplata.setKwota(resultSet.getLong("kwota"));
                    wplata.setFaktura(resultSet.getLong("faktura"));
                    return wplata;
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
