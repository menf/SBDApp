package POJO;
// Generated 2016-12-07 00:35:26 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Rezyser generated by hbm2java
 */
public class Rezyser  implements java.io.Serializable {


     private int idRezysera;
     private String imie;
     private String nazwisko;
     private Date dataUrodzenia;
     private Date dataZgonu;
     private String pochodzenie;

    public Rezyser() {
    }

	
    public Rezyser(int idRezysera, String nazwisko) {
        this.idRezysera = idRezysera;
        this.nazwisko = nazwisko;
    }
    public Rezyser(int idRezysera, String imie, String nazwisko, Date dataUrodzenia, Date dataZgonu, String pochodzenie) {
       this.idRezysera = idRezysera;
       this.imie = imie;
       this.nazwisko = nazwisko;
       this.dataUrodzenia = dataUrodzenia;
       this.dataZgonu = dataZgonu;
       this.pochodzenie = pochodzenie;
    }
   
    public int getIdRezysera() {
        return this.idRezysera;
    }
    
    public void setIdRezysera(int idRezysera) {
        this.idRezysera = idRezysera;
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
    public Date getDataUrodzenia() {
        return this.dataUrodzenia;
    }
    
    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }
    public Date getDataZgonu() {
        return this.dataZgonu;
    }
    
    public void setDataZgonu(Date dataZgonu) {
        this.dataZgonu = dataZgonu;
    }
    public String getPochodzenie() {
        return this.pochodzenie;
    }
    
    public void setPochodzenie(String pochodzenie) {
        this.pochodzenie = pochodzenie;
    }




}

