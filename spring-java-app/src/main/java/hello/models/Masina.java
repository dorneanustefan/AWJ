package hello;

import java.util.List;
import java.util.ArrayList;

public class Masina {
  private String model;
  private int numar_usi;
  private String volan;
  private String culoare;
  private int numar;

  public Masina() {}

  public Masina(int numar_usi, String model, String volan, String culoare, int numar) {
      this.name = model;
      this.numar_usi = numar_usi;
	  this.volan = volan;
	  this.culoare = culoare;
	  this. numar = numar;
  }

  public String getModel() {
      return this.model;
  }

  public int getNumar_Usi() {
    return this.numar_usi;
  }
  
  public String getVolan() {
	  return.this.volan;
  }
  
  public String getCuloare() {
	  return.this.culoare;
  }
  
  public int getNumar() {
	  return.this.numar;
  }
  
  public String setModel(string model) {
	  this.model = model;
  }
  
  public int setNumarUsi(int numar_usi) {
	  this.numar_usi = numar_usi;
  }
  
  public String setVolan() {
	  this.volan = volan;
  }
  
  public String setCuloare() {
	  this.culoare = culoare;
  }
  
  public int setNumar() {
	  this.numar = numar;
  }
}
