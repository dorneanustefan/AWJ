package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.ArrayList;

//  public Telefon(String firma, String model, int dimensiune, String culoare, String an)

@RestController
public class TelefonController {
  private List<Telefon> telefon = new ArrayList<Telefon>();

  TelefonController() {
    Telefon p1 = new Telefon("Samsung", "S6 edge+", 5, "Albastru", 2016);
    Telefon p2 = new Telefon("Apple", "6S", 4, "Verde", 2015);
    Telefon p3 = new Telefon("HTC", "M9", 6, "Galben", 2015);

    telefon.add(p1);
    telefon.add(p2);
    telefon.add(p3);
  }

	@RequestMapping(value="/telefon", method = RequestMethod.GET)
	public List<Telefon> index() {
		return this.telefon;
	}
  
	@RequestMapping(value="/telefon/{firma}", method = RequestMethod.GET)
	public ResponseEntity show(@PathVariable("firma") String firma) {
		for(Telefon p : this.telefon) {
			if(p.getFirma() == firma) {
				return new ResponseEntity<Telefon>(p, new HttpHeaders(), HttpStatus.OK);
			}
		}
	return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
	}
  
//  public Telefon(String firma, String model, int dimensiune, String culoare, String an)

	@RequestMapping(value="/telefon/{firma}/{model}/{dimensiune}/{culoare}/{an}", method = RequestMethod.POST)
	public List<Telefon> create(@PathVariable(value="an usi") String firma,@PathVariable(value="model") String model,@PathVariable(value="dimensiune") int dimensiune,@PathVariable(value="culoare" String culoare,@PathVariable(value="an") int an) {
		Telefon p = new Telefon (firma, model, dimensiune, culoare, an );
		telefon.add(p);
		return this.telefon;
	}
  
	@RequestMapping(value="/telefon/{firma}", method = RequestMethod.PUT)
	public ResponseEntity update(@PathVariable("firma") String firma) {
		for(Telefon p : this.telefon){
			if(p.getFirma() == firma) {				
				p.setFirma("Huawei");
				p.setModel("default model");
				p.setDimensiune(7);
				p.setCuloare("default culoare");
				p.setAn(2017);
				return new ResponseEntity<Angajat>(p, new HttpHeaders(), HttpStatus.OK);
			}
		}
	return new ResponseEntity<String>(null,new HttpHeaders(), HttpStatus.NOT_FOUND);
	}

	//  public Telefon(String firma, String model, int dimensiune, String culoare, String an)
	
	@RequestMapping(value="/telefon/{firma}", method = RequestMethod.DELETE)
	public ResponseEntity remove(@PathVariable("firma") String firma) {
		for(Telefon p : this.telefon) {
			if(p.getFirma() == firma) {
				this.telefon.remove(p);
				return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NO_CONTENT);
			}
		}
		return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
	}


}