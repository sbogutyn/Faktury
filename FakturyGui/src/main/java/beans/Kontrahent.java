package beans;

import dao.FakturyDao;
import java.sql.ResultSet;
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mariusz
 */
public class Kontrahent {

    private int id;
    private String skrot;
    private String nazwa;
    private String ulica;
    private String kod;
    private String miasto;
    private String nip;
    private String konto;
    private String osoba;
    private String tel;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getKonto() {
        return konto;
    }

    public void setKonto(String konto) {
        this.konto = konto;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getOsoba() {
        return osoba;
    }

    public void setOsoba(String osoba) {
        this.osoba = osoba;
    }

    public String getSkrot() {
        return skrot;
    }

    public void setSkrot(String skrot) {
        this.skrot = skrot;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public ArrayList<Kontrahent> ListaKontrahentów() {

        ArrayList listaKontrahentow = new ArrayList();
        try {
            FakturyDao objFakturyDao = new FakturyDao();
            ResultSet table = objFakturyDao.Lista("select * from kontrahent order by skrot");
            Kontrahent objKontrahent;

            //while(table.next()){
            //   System.out.println(table.getString("nazwa"));
            //}

            while (table.next()) {
                objKontrahent = new Kontrahent();
                objKontrahent.setId(table.getInt("id"));
                objKontrahent.setSkrot(table.getString("skrot"));
                objKontrahent.setNazwa(table.getString("nazwa"));
                objKontrahent.setUlica(table.getString("ulica"));
                objKontrahent.setKod(table.getString("kod"));
                objKontrahent.setMiasto(table.getString("miasto"));
                objKontrahent.setNip(table.getString("nip"));
                objKontrahent.setKonto(table.getString("konto"));
                objKontrahent.setOsoba(table.getString("osoba"));
                objKontrahent.setTel(table.getString("tel"));
                objKontrahent.setEmail(table.getString("email"));
                listaKontrahentow.add(objKontrahent);
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return listaKontrahentow;
    }

    public void znajdzKontrahenta(int fid) {

        try {
            FakturyDao objFakturyDao = new FakturyDao();
            ResultSet table = objFakturyDao.Lista("select * from kontrahent where id=" + fid);

            while (table.next()) {
                this.setId(table.getInt("id"));
                this.setSkrot(table.getString("skrot"));
                this.setNazwa(table.getString("nazwa"));
                this.setUlica(table.getString("ulica"));
                this.setKod(table.getString("kod"));
                this.setMiasto(table.getString("miasto"));
                this.setNip(table.getString("nip"));
                this.setKonto(table.getString("konto"));
                this.setOsoba(table.getString("osoba"));
                this.setTel(table.getString("tel"));
                this.setEmail(table.getString("email"));
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void dodajKontrahenta() {
        try {
            FakturyDao objFakturyDao = new FakturyDao();
            String zapytanie = "insert into kontrahent(skrot, nazwa, ulica, kod, miasto, nip, konto, osoba, tel, email) values('"
                    + this.getSkrot() + "', '"
                    + this.getNazwa() + "', '"
                    + this.getUlica() + "', '"
                    + this.getKod() + "', '"
                    + this.getMiasto() + "', '"
                    + this.getNip() + "', '"
                    + this.getKonto() + "', '"
                    + this.getOsoba() + "', '"
                    + this.getTel() + "', '"
                    + this.getEmail() + "')";
            objFakturyDao.Wykonaj(zapytanie);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void poprawKontrahenta(int pid) {
        try {
            FakturyDao objFakturyDao = new FakturyDao();
            String zapytanie = "update kontrahent set skrot='"
                    + this.getSkrot() + "', nazwa='"
                    + this.getNazwa() + "', ulica='"
                    + this.getUlica() + "', kod='"
                    + this.getKod() + "', miasto='"
                    + this.getMiasto() + "', nip='"
                    + this.getNip() + "', konto='"
                    + this.getKonto() + "', osoba='"
                    + this.getOsoba() + "', tel='"
                    + this.getTel() + "', email='"
                    + this.getEmail() + "' where id=" + pid;
            objFakturyDao.Wykonaj(zapytanie);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void usunKontrahenta() {
        try {
            FakturyDao objFakturyDao = new FakturyDao();
            String zapytanie = "delete from kontrahent where id =" + this.getId();
            objFakturyDao.Wykonaj(zapytanie);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
