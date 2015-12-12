package hello;

import java.util.List;
import java.util.ArrayList;

public class Telefon {
  private String firma;
  private String model;
  private int dimensiune;
  private String culoare;
  private String an;

  public Telefon() {}

  public Telefon(String firma, String model, int dimensiune, String culoare, String an) {
      this.firma = firma;
      this.model = model;
	  this.dimensiune = dimensiune;
	  this.culoare = culoare;
	  this.an = an;
  }

  public String getFirma() {
      return this.firma;
  }

  public int getModel() {
    return this.model;
  }
  
  public String getDimensiune() {
	  return.this.dimensiune;
	  //dimensiune ecran in inch;
  }
  
  public String getCuloare() {
	  return.this.culoare;
  }
  
  public int getAn() {
	  return.this.an;
	  //anul de fabricatie;
  }
  
  public String setFirma(string firma) {
	  this.firma = firma;
  }
  
  public int setModel(int Model) {
	  this.model = model;
  }
  
  public int setDimensiune(int dimensiune) {
	  this.dimensiune = dimensiune;
  }
  
  public String setCuloare() {
	  this.culoare = culoare;
  }
  
  public int setAn() {
	  this.an = an;
  }
}
