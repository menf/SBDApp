package POJO;
// Generated 2016-12-06 23:33:50 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Pracownik generated by hbm2java
 */
public class Pracownik  implements java.io.Serializable {


     private int idPracownika;
     private String imie;
     private String nazwisko;
     private Date dataZatrudnienia;
     private Integer idStanowiska;
     private Integer idOddzialu;

    public Pracownik() {
    }

	
    public Pracownik(int idPracownika) {
        this.idPracownika = idPracownika;
    }
    public Pracownik(int idPracownika, String imie, String nazwisko, Date dataZatrudnienia, Integer idStanowiska, Integer idOddzialu) {
       this.idPracownika = idPracownika;
       this.imie = imie;
       this.nazwisko = nazwisko;
       this.dataZatrudnienia = dataZatrudnienia;
       this.idStanowiska = idStanowiska;
       this.idOddzialu = idOddzialu;
    }
   
    public int getIdPracownika() {
        return this.idPracownika;
    }
    
    public void setIdPracownika(int idPracownika) {
        this.idPracownika = idPracownika;
    }
    public String getImie() {
        return this.imie;
    }
    
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return this.nazwisko;
    }
    
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public Date getDataZatrudnienia() {
        return this.dataZatrudnienia;
    }
    
    public void setDataZatrudnienia(Date dataZatrudnienia) {
        this.dataZatrudnienia = dataZatrudnienia;
    }
    public Integer getIdStanowiska() {
        return this.idStanowiska;
    }
    
    public void setIdStanowiska(Integer idStanowiska) {
        this.idStanowiska = idStanowiska;
    }
    public Integer getIdOddzialu() {
        return this.idOddzialu;
    }
    
    public void setIdOddzialu(Integer idOddzialu) {
        this.idOddzialu = idOddzialu;
    }




}


