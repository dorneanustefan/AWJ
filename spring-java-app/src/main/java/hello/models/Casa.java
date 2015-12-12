package hello;

import java.util.List;
import java.util.ArrayList;

public class Casa {
  private String proprietar;
  private int locuri_parcare;
  private int suprafata;
  private String culoare;
  private int numar_etaje;

  public Casa() {}

  public Casa(int locuri_parcare, String proprietar, int suprafata, String culoare, int numar_etaje) {
      this.locuri_parcare = locuri_parcare;
      this.proprietar = proprietar;
	  this.suprafata = suprafata;
	  this.culoare = culoare;
	  this.numar_etaje = numar_etaje;
  }

  public String getProprietar() {
      return this.proprietar;
  }

  public int getLocuriParcare() {
    return this.locuri_parcare;
  }
  
  public int getSuprafata() {
	  return.this.suprafata;
  }
  
  public String getCuloare() {
	  return.this.culoare;
  }
  
  public int getNumarEtaje() {
	  return.this.numar_etaje;
  }
  
  public String setProprietar(string proprietar) {
	  this.proprietar = proprietar;
  }
  
  public int setLocuriParcare(int locuri_parcare) {
	  this.locuri_parcare = locuri_parcare;
  }
  
  public int setSuprafata() {
	  this.suprafata = suprafata;
  }
  
  public String setCuloare() {
	  this.culoare = culoare;
  }
  
  public int setNumarEtaje() {
	  this.numar_etaje = numar_etaje;
  }
}
