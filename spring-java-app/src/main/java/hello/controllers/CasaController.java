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


@RestController
public class CasatController {
	private List<Casa> casa = new ArrayList<Casa>();

	CasaController() {
		Casa a1 = new Casa("Andrei", 2, 75, "Alb", 1);
		Casa a2 = new Casa("Stefa", 2, 130, "Maro", 2);
		Casa a3 = new Casa("Marius", 1, 80, "Galben", 1);
		
		casa.add(a1);
		casa.add(a2);	
		casa.add(a3);
	}

	@RequestMapping(value="/casa", method = RequestMethod.GET)
	public List<Casa> index() {
		return this.casa;
	}
  
	@RequestMapping(value="/casa/{proprietar}", method = RequestMethod.GET)
	public ResponseEntity show(@PathVariable("firma") String firma) {
		for(Casa p : this.casa) {
			if(p.getProprietar() == proprietar) {
				return new ResponseEntity<Casa>(p, new HttpHeaders(), HttpStatus.OK);
			}
		}
	return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
	}
  
	@RequestMapping(value="/casa/{proprietar}/{locuri_parcare}/{suprafata}/{culoare}/{numar_etaje}", method = RequestMethod.POST)
	public List<Casa> create(@PathVariable(value="proprietar") String proprietar,@PathVariable(value="locuri_parcare") int locuri_parcare,@PathVariable(value="suprafata") int suprafata,@PathVariable(value="culoare" String culoare,@PathVariable(value="numar_etaje") int numar_etaje) {
		Casa p = new Casa (proprietar, locuri_parcare, suprafata, culoare, numar_etaje );
		casa.add(p);
		return this.casa;
	}
  
	@RequestMapping(value="/casa/{firma}", method = RequestMethod.PUT)
	public ResponseEntity update(@PathVariable("firma") String firma) {
		for(Casa p : this.casa){
			if(p.getProprietar() == proprietar) {				
				p.setProprietar("default proprietar");
				p.setLocuriParcare(2);
				p.setSuprafata(70);
				p.setCuloare("Alb");
				p.setNumarEtaje("default numar_etaje")
				return new ResponseEntity<Angajat>(p, new HttpHeaders(), HttpStatus.OK);
			}
		}
	return new ResponseEntity<String>(null,new HttpHeaders(), HttpStatus.NOT_FOUND);
	}

	@RequestMapping(value="/casa/{id}", method = RequestMethod.DELETE)
	public ResponseEntity remove(@PathVariable("id") int id) {
		for(Casa p : this.angajat) {
			if(p.getProprietar() == proprietar) {
				this.angajat.remove(p);
				return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NO_CONTENT);
			}
		}
		return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
	}


}