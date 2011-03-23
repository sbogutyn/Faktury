package faktury.core.managers;

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
 * User: slavo
 * Date: 19.03.11
 * Time: 16:20
 */
public class FirmaManger {
    private String getFakturaSqlQuery;
    private String insertFakturaSqlQuery;
    private SimpleJdbcTemplate db;

    public Firma saveFirma(Firma firma) {

        db.update(insertFakturaSqlQuery,
                firma.getSkrot(),
                firma.getNazwa(),
                firma.getUlica(),
                firma.getKod(),
                firma.getMiasto(),
                firma.getNip(),
                firma.getKonto(),
                firma.getOsoba(),
                firma.getTelefon(),
                firma.getEmail());
        return null;
    }

    public Firma getFirma(long id) {
        RowMapper<Firma> mapper = new RowMapper<Firma>() {
            public Firma mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                Firma firma = new Firma();
                firma.setId(resultSet.getLong("id"));
                firma.setEmail(resultSet.getString("email"));
                firma.setKod(resultSet.getString("kod"));
                firma.setKonto(resultSet.getString("konto"));
                firma.setMiasto(resultSet.getString("miasto"));
                firma.setNazwa(resultSet.getString("nazwa"));
                firma.setNip(resultSet.getString("nip"));
                firma.setOsoba(resultSet.getString("osoba"));
                firma.setSkrot(resultSet.getString("skrot"));
                firma.setTelefon(resultSet.getString("telefon"));
                firma.setUlica(resultSet.getString("ulica"));
                return firma;
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
