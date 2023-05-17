
public class Osoba {
    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefon;


    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public int getVek() {
        return vek;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString () {
        return String.format(("%s %s (%d let) (tel: %s)"),jmeno,prijmeni,vek,telefon);
    }


}
