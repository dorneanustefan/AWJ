package hello;

import java.util.List;
import java.util.ArrayList;

public class Angajat {
  private String firma;
  private String nume;
  private String pozitie;
  private int salariu;
  private int vechime;
  private String departament

  public Angajat() {}

  public Angajat(String firma, String nume, String pozitie, int salariu, int vechime, String departament) {
      this.firma = firma;
	  this.nume = nume;
      this.pozitie = pozitie;
	  this.salariu = salariu;
	  this.vechime = vechime;
	  this.departament = departament;
  }

  public String getFrima() {
      return this.firma;
  }
  
  public String getNume() {
	  return this.nume;
  }

  public int getPozitie() {
    return this.pozitie;
  }
  
  public String getSalariu() {
	  return.this.salariu;
  }
  
  public String getVechime() {
	  return.this.vechime;
  }
  
  public int getDepartament() {
	  return.this.departament;
  }
  
  public String setFrima(string firma) {
	  this.firma = firma;
  }
  
  public String setNume(string nume) {
	  this.nume = nume;
  }
  
  public String setPozitie(String pozitie) {
	  this.pozitie = pozitie;
  }
  
  public int setSalariu() {
	  this.salariu = salariu;
  }
  
  public int setVechime() {
	  this.vechime = vechime;
  }
  
  public String setDepartament() {
	  this.departament = departament;
  }
}
